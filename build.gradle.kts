plugins {
    id("java")
}

group = "io.github.dsheirer"
version = "1.3.2-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.junit.jupiter:junit-jupiter-api:6.0.1")
    implementation("org.junit.jupiter:junit-jupiter-engine:6.0.1")
    implementation("org.junit.jupiter:junit-jupiter-params:6.0.1")
    implementation("org.junit.vintage:junit-vintage-engine:6.0.1")
    implementation("org.apache.commons:commons-lang3:3.19.0")
    implementation("io.github.dsheirer:usb4java-native-libraries:1.3.1") //OSX & Windows aarch64 native libs
    implementation("org.usb4java:libusb4java:1.3.0")
    implementation("org.usb4java:usb4java-javax:1.3.0")}

tasks.withType<Test>() {
    //Disable USB testing
    systemProperty("USB_TESTS", "false")
}
