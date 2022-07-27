object Dependency {
    object Version {
        const val kotest = "5.3.1"
        const val mockk = "1.12.4"
    }

    const val kotestJunit5 = "io.kotest:kotest-runner-junit5-jvm:${Version.kotest}"
    const val kotestCore = "io.kotest:kotest-assertions-core:${Version.kotest}"
    const val mockk = "io.mockk:mockk:${Version.mockk}"
}