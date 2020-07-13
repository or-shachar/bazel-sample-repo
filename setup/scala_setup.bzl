# Scala set up
load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")

def scala_setup():
    scala_register_toolchains()
    scala_repositories()
