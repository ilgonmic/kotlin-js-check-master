plugins {
    kotlin("js") version "1.6.255-SNAPSHOT"
}

group = "me.user"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}



kotlin {
    js(IR) {
        binaries.executable()
        browser {

        }
    }
}