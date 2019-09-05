
load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

rules_scala_version="f1e689c2426c1522d7c8ca69ac8cbc1a714b6d02" # update this as needed

http_archive(
             name = "io_bazel_rules_scala",
             url = "https://github.com/bazelbuild/rules_scala/archive/%s.zip"%rules_scala_version,
             type = "zip",
             strip_prefix= "rules_scala-%s" % rules_scala_version
             )

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")
scala_repositories()
load("@io_bazel_rules_scala//specs2:specs2_junit.bzl", "specs2_junit_repositories")
specs2_junit_repositories()
load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains")
scala_register_toolchains()

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")
load("@bazel_tools//tools/build_defs/repo:utils.bzl", "maybe")

maybe(
    http_archive,
    name = "bazel_skylib",
    url = "https://github.com/bazelbuild/bazel-skylib/releases/download/0.9.0/bazel_skylib-0.9.0.tar.gz",
    sha256 = "1dde365491125a3db70731e25658dfdd3bc5dbdfd11b840b3e987ecf043c7ca0",
)

load("@bazel_skylib//:workspace.bzl", "bazel_skylib_workspace")
bazel_skylib_workspace()


protobuf_version="655310ca192a6e3a050e0ca0b7084a2968072260"

http_archive(
    name = "com_google_protobuf",
    url = "https://github.com/protocolbuffers/protobuf/archive/%s.tar.gz" % protobuf_version,
    strip_prefix = "protobuf-%s" % protobuf_version,
    sha256 = protobuf_version_sha256,
)

maven_jar(
    name="junit",
    artifact="junit:junit:jar:4.12"
)

maven_jar(
	name="jetty_server",
	artifact="org.eclipse.jetty:jetty-server:7.2.0.v20101020"
)

maven_jar(
	name="servlet_api",
	artifact="javax.servlet:servlet-api:jar:2.5"
)

maven_jar(
	name="jetty_continuation",
	artifact="org.eclipse.jetty:jetty-continuation:jar:7.2.0.v20101020"
)

maven_jar(
	name="jetty_http",
	artifact="org.eclipse.jetty:jetty-http:jar:7.2.0.v20101020"
)

maven_jar(
	name="jetty_io",
	artifact="org.eclipse.jetty:jetty-io:jar:7.2.0.v20101020"
)

maven_jar(
	name="jetty_util",
	artifact="org.eclipse.jetty:jetty-util:jar:7.2.0.v20101020"
)


maven_jar(
    name="scalaj_http",
    artifact="org.scalaj:scalaj-http_2.12:2.4.1"
)
