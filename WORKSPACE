workspace(name = "my_bazel_example")

# infra setup
load("//setup:external_repos.bzl", "external_repos")
external_repos()

load("//setup:scala_setup.bzl", "scala_setup")
scala_setup()

load("//setup:toolchain_setup.bzl","toolchain_setup")
toolchain_setup()

# external jvm setup
load("//setup:external_jvm.bzl","external_jvm")
external_jvm()
load("@maven//:defs.bzl", "pinned_maven_install")
pinned_maven_install()
