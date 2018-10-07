### Demo for  automation framework

Introduction: This is UI acceptance automation test using the Selenium, Cucumber, Maven and TestNg .

# Requirements:
In order to run this project you need to have the following installed locally:
- Install JDK 8 [http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html]
- Install Maven [https://maven.apache.org/download.cgi]-
- This project uses Cucumber-JVM 2.0. If using IntelliJ IDEA, please make sure to update to the latest version of the Cucumber for Java plugin
- Firefox execution must be accessible from the system PATH.
- Firefox 47.0 or higher

## Usage
- This project uses Maven. To run tests, simply run "mvn clean test". Build and Run:
    `mvn clean install`

## Reporting
 UI acceptance tests result in a HTML report for each feature in target/ui-acceptance-tests/target/cucumber-parallel/. In the case of test failures, a screen-shot of the UI at the point of failure is embedded into the report.

