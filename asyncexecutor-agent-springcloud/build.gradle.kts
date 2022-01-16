plugins {
    java
}

group = "io.asyncexecutor.agent.springcloud"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testCompile("junit", "junit", "4.12")

    implementation(project(":asyncexecutor-context"))
    implementation(project(":asyncexecutor-agent-api"))

}
