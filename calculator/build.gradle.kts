plugins {
    application
}

application {
    mainClass.set("calculator.CalculatorAppKt")
}

dependencies {
    // Add any dependencies required by the Calculator application
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "calculator.CalculatorAppKt"
    }
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}
