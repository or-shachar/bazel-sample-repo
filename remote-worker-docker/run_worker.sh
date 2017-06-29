docker run \
   --privileged \
   --name bazel \
   -p 3030:3030 \
   -p 3031:3031 \
   bazel-worker
