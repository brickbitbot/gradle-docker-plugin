buildscript {
    repositories {
        gradlePluginPortal()
    }
    dependencies {
        classpath("com.bmuschko:gradle-docker-plugin:{project-version}")
    }
}

apply(plugin = "com.bmuschko.docker-remote-api")