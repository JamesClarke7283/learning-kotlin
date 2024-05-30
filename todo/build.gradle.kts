plugins {
    application
}

application {
    mainClass.set("todo.TodoAppKt")
}

dependencies {
    // Add any dependencies required by the To-Do application
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "todo.TodoAppKt"
    }
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}
