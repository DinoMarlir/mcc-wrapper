plugins {
    java
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":api"))
    implementation("net.minestom:minestom-snapshots:3bad93ea50")
}