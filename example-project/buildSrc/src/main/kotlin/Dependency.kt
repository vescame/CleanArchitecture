object Dependency {
    object Version {
        const val kotlin = "1.7.10"
        const val kotlinx = "1.6.4"
        const val kotest = "5.3.1"
        const val mockk = "1.12.4"
    }

    // kotlin core
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Version.kotlin}"
    const val kotlinStdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Version.kotlin}"
    
    // coroutines
    const val kotlinxCoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.kotlinx}"
    const val kotlinxCoroutinesJvm = "org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:${Version.kotlinx}"

    // testing
    const val kotestJunit5 = "io.kotest:kotest-runner-junit5-jvm:${Version.kotest}"
    const val kotestCore = "io.kotest:kotest-assertions-core:${Version.kotest}"
    const val mockk = "io.mockk:mockk:${Version.mockk}"
}