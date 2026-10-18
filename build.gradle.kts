plugins {
    `java-library`
    id("io.papermc.paperweight.userdev") version "1.7.4"
}

group = "me.yourname.crystalplugin"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    paperweight.paperDevBundle("1.21.2-R0.1-SNAPSHOT")
}

tasks {
    compileJava {
        options.encoding = Charsets.UTF_8.name()
        options.release.set(21)
    }
    jar {
        archiveBaseName.set("YourPlugin")
        archiveVersion.set("1.0.0")
    }
}
