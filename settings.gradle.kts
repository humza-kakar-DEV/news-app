pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "News App"
include(":app")
include(":core:designsystem")
include(":core:navigation")
include(":core:database")
include(":core:network")
include(":core:datastore")
include(":core:common")
include(":feature:home")
include(":feature:detail")
include(":feature:onboarding")
include(":core:di")
include(":core:config")
