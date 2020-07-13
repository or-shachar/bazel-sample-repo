load("@rules_jvm_external//:defs.bzl", "maven_install")

def external_jvm():
    log4j_version="2.13.3"
    maven_install(
        name = "maven",
        artifacts = [
            "org.apache.logging.log4j:log4j-api:" + log4j_version,
            "org.apache.logging.log4j:log4j-core:" + log4j_version,
        ],
        repositories = [
            "https://repo1.maven.org/maven2",
        ],
        maven_install_json = "//setup:maven_install.json",
    )