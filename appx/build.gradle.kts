plugins {
    application
}

application {
    mainClass.set("appx.AppXKt")
}

dependencies {
    // Add any dependencies required by the AppX application
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "appx.AppXKt"
    }
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}
