package(default_visibility = ["//visibility:public"])

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test", "scala_specs2_junit_test")


filegroup(
    name = "sources",
    srcs = glob(["*.java"]) + glob(["*.scala"]),
)


scala_library(
    name = "lib2",
    srcs = [
        ":sources",
    ]
)
