plugins {
    `java-platform`
}

dependencies {
    constraints {
        val jacksonVersion = "2.11.3"

        // Project

        api("${group}:elasticsearch-recipes-mappings:${version}")

        // Jackson

        api("com.fasterxml.jackson.core:jackson-core:$jacksonVersion")
        api("com.fasterxml.jackson.core:jackson-core:$jacksonVersion")
        api("com.fasterxml.jackson.core:jackson-core:$jacksonVersion")
    }
}