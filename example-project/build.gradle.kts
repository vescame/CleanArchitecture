import org.gradle.api.tasks.testing.logging.TestLogEvent
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
}

repositories {
    mavenCentral()
}

allprojects {
    group = "vescame.cleanarchitecture"
    version = "0.0.1"
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

subprojects {
    apply {
        plugin("kotlin")
    }

    repositories {
        mavenCentral()
    }

    dependencies {
        // kotlin core
        implementation(Dependency.kotlinReflect)
        implementation(Dependency.kotlinStdlibJdk8)

        // kotlinx coroutines core
        implementation(Dependency.kotlinxCoroutinesCore)
        runtimeOnly(Dependency.kotlinxCoroutinesJvm)

        // all modules test framework
        testImplementation(Dependency.kotestCore)
        testImplementation(Dependency.kotestJunit5)
        testImplementation(Dependency.mockk)
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "${JavaVersion.VERSION_17}"
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
        testLogging {
            events(
                TestLogEvent.PASSED,
                TestLogEvent.SKIPPED,
                TestLogEvent.FAILED
            )
        }
    }
}
