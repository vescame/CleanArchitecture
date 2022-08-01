plugins {
    application
}

application {
    mainClass.set("vescame.cleanarchitecture.AppKt")
}

dependencies {
    implementation(project(":entities"))
    implementation(project(":usecases"))
    implementation(project(":integration"))
    implementation(project(":gateway"))
}
