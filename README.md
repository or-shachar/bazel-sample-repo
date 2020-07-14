# Sample repo

This repo is meant to simulate very basic use case of using Bazel + rules_scala + remote execution

To run builds using RBE and Results on this repo please run:
```bash
bazel --bazelrc=.bazelrc.remote test -k //... \
    --config=remote --config=results \
    --remote_instance_name=<your-project> \
    --project_id=gcb-with-custom-workers
```
