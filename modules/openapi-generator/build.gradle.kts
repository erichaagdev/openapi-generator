plugins {
    id("org.openapitools.java")
}

description = "openapi-generator (core library)"

dependencies {
    implementation("com.atlassian.commonmark:commonmark:0.11.0")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.13.4")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-guava:2.13.4")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-joda:2.13.4")
    implementation("com.github.ben-manes.caffeine:caffeine:2.8.1")
    implementation("com.github.curious-odd-man:rgxgen:1.3")
    implementation("com.github.jknack:handlebars-jackson2:4.2.1")
    implementation("com.github.jknack:handlebars:4.2.1")
    implementation("com.github.joschi.jackson:jackson-datatype-threetenbp:2.10.0")
    implementation("com.github.mifmif:generex:1.0.2")
    implementation("com.google.guava:guava:30.1.1-jre")
    implementation("com.samskivert:jmustache:1.14")
    implementation("commons-cli:commons-cli:1.4")
    implementation("commons-io:commons-io:2.11.0")
    implementation("io.swagger.parser.v3:swagger-parser:2.1.1")
    implementation("net.java.dev.jna:jna:5.5.0")
    implementation("org.apache.commons:commons-lang3:3.12.0")
    implementation("org.apache.commons:commons-text:1.9")
    implementation("org.slf4j:slf4j-api:1.7.36")
    implementation("org.slf4j:slf4j-ext:1.7.36")
    implementation("org.slf4j:slf4j-simple:1.7.36")
    implementation(project(":openapi-generator-core"))
    testImplementation("com.github.javaparser:javaparser-core:3.24.0")
    testImplementation("com.google.guava:guava-testlib:28.2-jre")
    testImplementation("com.googlecode.java-diff-utils:diffutils:1.3.0")
    testImplementation("com.tngtech.archunit:archunit-junit4:0.23.1")
    testImplementation("com.tngtech.archunit:archunit:0.23.1")
    testImplementation("org.assertj:assertj-core:3.19.0")
    testImplementation("org.jetbrains.kotlin:kotlin-compiler-embeddable:1.6.21")
    testImplementation("org.jetbrains.kotlin:kotlin-script-util:1.6.21")
    testImplementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.21")
    testImplementation("org.mockito:mockito-core:4.5.1")
    testImplementation("org.openrewrite:rewrite-maven:7.22.0")
    testImplementation("org.reflections:reflections:0.10")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}
