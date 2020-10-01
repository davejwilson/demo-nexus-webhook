# Nexus Webhook Spring Boot Example
This a really basic example of a spring boot webhook for nexus.
It is currently only setup for repository component events.

# Building the Image
Run `mvn spring-boot:build-image`

# Running Nexus and the Webhook
Run `docker-compose up -d`

# Setting up the Webhook in Nexus
* Login using `admin`
* Go to `Capabilities`
* Select `Create capability`
* Select `Webhook: Repository`
* For `Repository` select `maven-snapshots`
* Add `Component` to the `Selected Event Types`
* Set the `URL` to `http://webhook:8080/webhook`
* Set the `Secret Key` to some key value

# Testing the Webhook
* Create a maven project with a snapshot version
* Run the `deploy` goal and tail the output of the webhook container to see the event details