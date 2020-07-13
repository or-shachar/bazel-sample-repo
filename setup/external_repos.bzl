load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

skylib_version = "0.8.0"
skylib_sha256 = "2ef429f5d7ce7111263289644d233707dba35e39696377ebab8b0bc701f7818e"

rules_scala_version = "fb6e0f0c9383816bddccdbb1e04c90f51a8edb89"
rules_scala_version_sha256 = "3bd0152f59c28947020fb9717eb57f8e5093c7abd8da361780752d4088e5ea17"

RULES_JVM_EXTERNAL_TAG = "3.3"
RULES_JVM_EXTERNAL_SHA = "d85951a92c0908c80bd8551002d66cb23c3434409c814179c0ff026b53544dab"

bazel_toolchains_version="3.3.2"
bazel_toolchains_sha256="6d54b26a58457f9fca2e54f053402061ffe73e3b909b8f6bf6dedb2a3db093ea"

def external_repos():
    http_archive(
        name = "bazel_skylib",
        type = "tar.gz",
        url = "https://github.com/bazelbuild/bazel-skylib/releases/download/{}/bazel-skylib.{}.tar.gz".format (skylib_version, skylib_version),
        sha256 = skylib_sha256,
    )
    http_archive(
        name = "io_bazel_rules_scala",
        url = "https://github.com/bazelbuild/rules_scala/archive/%s.zip" % rules_scala_version,
        type = "zip",
        strip_prefix = "rules_scala-%s" % rules_scala_version,
        sha256 = rules_scala_version_sha256,
    )

    http_archive(
        name = "rules_jvm_external",
        strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
        sha256 = RULES_JVM_EXTERNAL_SHA,
        url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
    )

    # Required configuration for remote build execution
    http_archive(
         name = "bazel_toolchains",
         urls = [
             "https://github.com/bazelbuild/bazel-toolchains/releases/download/%s/bazel-toolchains-%s.tar.gz" % (bazel_toolchains_version, bazel_toolchains_version),
             "https://mirror.bazel.build/github.com/bazelbuild/bazel-toolchains/archive/%s.tar.gz" % bazel_toolchains_version,
         ],
         strip_prefix = "bazel-toolchains-%s" % bazel_toolchains_version,
         sha256 = bazel_toolchains_sha256,
    )