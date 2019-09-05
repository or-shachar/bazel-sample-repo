## Issue Overview 

**What happened**:<br/>
Intellij runner is not properly populated with VM options which results in a `Failed to find a deployable jar when building ...` error.<br/>
<br/>
![runner-error](assets/runner-error.png)

**What you expected to happen**:<br/>
Runner should get populated with required deployables and application should run successfully.

**How to reproduce it (as minimally and precisely as possible)**:<br/>
1. Import repo as a Bazel project
2. Setup runner configuration as follows:
<br/>
![intellij-runner-config](assets/intellij-runner-config.png)

**Anything else need to know?**:<br/>
None.

**Environment**:<br/>
- OS: macOS Mojave `10.14.6` 
- Bazel (Wix Fork): `v2191.08.23.0.3.108-WIX`
- Bazel Wixperiments: `v0.1.92`
- Scala version: `2.13.0`

**Logs**:<br/>
None.
