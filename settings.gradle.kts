pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        maven {
            url = uri("https://jitpack.io")
        }
        mavenCentral()
        gradlePluginPortal()
    }

    resolutionStrategy {
        eachPlugin {
            if(requested.id.toString() == "com.github.takahirom.decomposer"){
                useModule("com.github.takahirom:decomposer:main-SNAPSHOT")
            }
        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "compose-internals"
include(":app")
include(":build-logic")
include(":yangsooplus")
include(":audxo112")
include(":ezhoon")
include(":ldh019")
