java_library(
    name = "jetty",
    srcs = ["JettyRunner.java"],
    deps = [
    	"@jetty_server//jar",
    	"@servlet_api//jar",
    	"@jetty_continuation//jar",
    	"@jetty_http//jar",
    	"@jetty_io//jar",
    	"@jetty_util//jar",
    	],
    visibility = ["//visibility:public"]
)

java_test(
    name = "jetty_test",
    size = "small",
    test_class = "com.example.JettyRunnerTest",
    srcs = ["JettyRunnerTest.java"],
    deps = [":jetty","@junit//jar"],
)