//pluginManagement {
//    repositories {
//        google {
//            content {
//                includeGroupByRegex("com\\.android.*")
//                includeGroupByRegex("com\\.google.*")
//                includeGroupByRegex("androidx.*")
//            }
//        }
//        mavenCentral()
//        gradlePluginPortal()
//    }
//}
//dependencyResolutionManagement {
//    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
//    repositories {
//        google()
//        mavenCentral()
//    }
//}
//
//rootProject.name = "Artifact-Testing-App"
//include(":app")
//
pluginManagement {
    repositories {
        maven {
            url = uri("https://mytrail.jfrog.io/artifactory/test-my-artifacts-libs-release/")
            credentials {
                username = "secsyed83@gmail.com"
                password = "Sec@syed0786"
            }
//            content {
//                includeGroup("retrofit")  // Add only the required dependencies (from toml)
//                includeGroupByRegex("androidx.*")
//                includeGroupByRegex("com\\.google.*")
//                includeGroupByRegex("org\\.jetbrains.*") // Kotlin dependencies
//            }
        }
        google{
            url = uri("https://mytrail.jfrog.io/artifactory/test-my-artifacts-libs-release/")
            credentials {
                username = "secsyed83@gmail.com"
                password = "Sec@syed0786"
            }
//            content {
//                includeGroupByRegex("com\\.android.*")
//                includeGroupByRegex("com\\.google.*")
//                includeGroupByRegex("androidx.*")
//            }
        }
        // Google repo is still needed for Android Gradle Plugin (AGP)
//        google {
//            content {
//                includeGroupByRegex("com\\.android.*")
//                includeGroupByRegex("com\\.google.*")
//                includeGroupByRegex("androidx.*")
//            }
//        }
//        google()
//        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS) // Ensures project-level repos are not allowed
    repositories {
        maven {
            url = uri("https://mytrail.jfrog.io/artifactory/test-my-artifacts-libs-release/")
            credentials {
                username = "secsyed83@gmail.com"
                password = "Sec@syed0786"
            }
//            content {
//                includeGroup("retrofit")  // Add only the required dependencies (from toml)
//                includeGroupByRegex("androidx.*")
//                includeGroupByRegex("com\\.google.*")
//                includeGroupByRegex("org\\.jetbrains.*") // Kotlin dependencies
//            }
        }
        google{
            url = uri("https://mytrail.jfrog.io/artifactory/test-my-artifacts-libs-release/")
            credentials {
                username = "secsyed83@gmail.com"
                password = "Sec@syed0786"
            }
//            content {
//                includeGroupByRegex("com\\.android.*")
//                includeGroupByRegex("com\\.google.*")
//                includeGroupByRegex("androidx.*")
//            }
        }
//        google {
//            content {
//                includeGroupByRegex("com\\.android.*")   // Allow AndroidX, Google libraries
//                includeGroupByRegex("com\\.google.*")
//                includeGroupByRegex("androidx.*")
//            }
//        }
//        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "Artifact-Testing-App"
include(":app")
