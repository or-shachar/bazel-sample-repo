# Scala set up
load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")
load("@io_bazel_rules_scala//junit:junit.bzl", "junit_repositories")
load("@io_bazel_rules_scala//specs2:specs2_junit.bzl", "specs2_junit_repositories")

def scala_setup():
    scala_register_toolchains()
    scala_repositories()
    junit_repositories()
    specs2_junit_repositories()
