load(
    "@io_bazel_rules_docker//container:container.bzl",
    "container_pull",
)

def external_images():
    container_pull(
        name = "openjdk",
        registry = "index.docker.io",
        repository = "library/openjdk",
        digest = "sha256:838028d0446ea9d57298ff6b785d722c0c30370529897ed68864ebe889c7e307",
    )
