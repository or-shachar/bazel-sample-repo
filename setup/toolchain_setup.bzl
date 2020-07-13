load("@bazel_toolchains//rules:rbe_repo.bzl", "rbe_autoconfig")

def toolchain_setup():
    rbe_autoconfig(
        name = "rbe_default",
    )