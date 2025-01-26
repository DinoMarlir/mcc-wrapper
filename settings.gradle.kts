pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

rootProject.name = "mcc-wrapper"
include("api")
include("vanilla")
include("paper")
include("mcc-class-generator")
include("minestom")