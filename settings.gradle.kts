pluginManagement {
    repositories {
        maven {
            //Hybrid Solution Dev URL
            //  url = uri("https://trialrzp461.jfrog.io/artifactory/hybrid-virtual-repo/")
            //Without Curation Catalog Repo URL
            url = uri("https://trialrzp461.jfrog.io/artifactory/proj1-dev-virtual-repo/")
            credentials {
                username = "musarif@ebay.com"
                password = "Mustafa@1234"
            }
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS) // Ensures project-level repos are not allowed
    repositories {
        maven {
            //Hybrid Solution Dev URL
            //  url = uri("https://trialrzp461.jfrog.io/artifactory/hybrid-virtual-repo/")
            //Without Curation Catalog Repo URL
            url = uri("https://trialrzp461.jfrog.io/artifactory/proj1-dev-virtual-repo/")
            credentials {
                username = "musarif@ebay.com"
                password = "Mustafa@1234"
            }
        }
    }
}

rootProject.name = "Artifact-Testing-App"
include(":app")
