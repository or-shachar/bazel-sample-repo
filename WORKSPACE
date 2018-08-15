
rules_scala_version="e7e7cbcd800c53f92159dbc157ec991ee8e31cfe" # update this as needed

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