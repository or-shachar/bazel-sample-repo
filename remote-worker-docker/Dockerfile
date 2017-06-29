FROM java:8

RUN apt-get update
RUN apt-get install -y wget lxc git build-essential zip unzip

RUN mkdir /tmp/image-making

# install bazel
RUN wget --no-verbose -O /tmp/image-making/bazel-installer.sh https://github.com/bazelbuild/bazel/releases/download/0.5.2/bazel-0.5.2-installer-linux-x86_64.sh

RUN bash /tmp/image-making/bazel-installer.sh

# build latest bazel from sources
RUN wget --no-verbose -O /tmp/image-making/bazel.tar.gz https://github.com/bazelbuild/bazel/archive/d698367067c1ca52c8e23eae58232d0d5a4861cd.tar.gz

WORKDIR /tmp/image-making
RUN tar -xzf bazel.tar.gz
RUN mkdir -p /usr/src

RUN mv bazel-d698367067c1ca52c8e23eae58232d0d5a4861cd /usr/src/io_bazel

# remove temp dir
RUN rm -rf /tmp/image-making

WORKDIR /usr/src/io_bazel

# build bazel
RUN bazel build //src:bazel

# make bazel latest default bazel
RUN cp bazel-bin/src/bazel /usr/local/bin/

# build remote worker
RUN bazel build src/tools/remote_worker:all

RUN mkdir /p /bazel_cache

CMD bazel-bin/src/tools/remote_worker/remote_worker \
      --work_path=/bazel_cache \
      --listen_port=3030 
