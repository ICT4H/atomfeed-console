# atomfeed-console

This directory contains resources for building Docker image for atomfeed-console. The atomfeed-console container is used to show the failed events that happened in an atomfeed client.

Atomfeed console is  is useful when you are facing some sync issues with components like OpenMRS, OpenELIS, Odoo, etc. Issues can be like patients not getting created, orders not getting synced, pacs orders not getting synced etc.,

## Building the image locally
1. Checkout the [atomfeed-console](https://github.com/ICT4H/atomfeed-console) repository.
2. Generate the jar file by running `mvn clean install -DskipTests`.
3. Copy the jar file to `package/docker/resources`
4. Build the docker image `docker build -t atomfeed-console:latest .` from the project root.

[application.yml.template](package/docker/resources/application.yml.template) contains list of atom feeds that we want to configure in Atomfeed Console. To add/remove the feed sources, update the [list](package/docker/resources/application.yml.template#L4) accordingly.