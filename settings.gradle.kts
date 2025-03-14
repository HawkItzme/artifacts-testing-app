pluginManagement {
    repositories {
        maven {
            url = uri("https://mytrail.jfrog.io/artifactory/test-my-artifacts-libs-release/")
            credentials {
                username = "secsyed83@gmail.com"
                password = "Sec@syed0786"
            }
        }
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
        }
    }
}

rootProject.name = "Artifact-Testing-App"
include(":app")
