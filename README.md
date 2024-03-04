# Ballerina SonarQube Plugin

## Overview
SonarQube is an open-source code quality and security platform. It analyzes code for issues, tracks metrics, and integrates with CI/CD. This helps developers write cleaner, more secure code.
[SonarQube plugins](https://docs.sonarsource.com/sonarqube/latest/extension-guide/developing-a-plugin/supporting-new-languages/) allow developers to extend SonarQube analysis  support for
new languages.The sonar-ballerina plugin extends SonarQube to analyze Ballerina code. It leverages the Ballerina static code analysis tool to identify issues and report them to SonarQube.

## Prerequisites
1. openJDK 17 ([Adopt OpenJDK](https://adoptium.net/temurin/releases/?version=17) or any other OpenJDK distribution)

2. [Ballerina version: 2201.8.5](https://ballerina.io/downloads/)

3. [Ballerina Static Code Analysis Tool](https://github.com/ballerina-platform/static-code-analysis-tool)

4. [SonarQube version: 9.9 (LTS)](https://www.sonarsource.com/products/sonarqube/downloads/lts/9-9-lts/)

5. [Sonar Scanner CLI](https://docs.sonarsource.com/sonarqube/9.9/analyzing-source-code/scanners/sonarscanner/)


## Building from the source
1. To build the plugin:
    ```bash
    ./gradlew clean build
    ```

2. To run the tests:
    ```bash
    ./gradlew clean test
    ```

3. To build the plugin without tests:
    ```bash
    ./gradlew clean build -x test
    ```

## Installation
1. Build the plugin (see above)

2. Find the generated jar file
    ```
    📦sonar-ballerina
    ┣ 📂.github
    ┣ 📂.gradle
    ┗ 📂gradle
    ┗ 📂sonar-ballerina-plugin
        ┣ 📂bin
        ┗📂build
            ┣ 📂classes
            ┣ 📂distributions
            ┣ 📂generated
            ┗ 📂libs
                ┗ **📜sonar-ballerina-1.0-all.jar**
    ```

3. Place the generated jar file in the plugins directory of the SonarQube installation as follows:
    ```
    📦sonarqube-9.9.2.77730
    ┣ 📂bin
    ┣ 📂conf
    ┣ 📂data
    ┣ 📂elasticsearch
    ┣ 📂extensions
    ┃ ┣ 📂downloads
    ┃ ┣ 📂jdbc-driver
    ┃ ┗ 📂plugins
    ┃ ┃ ┣ 📜README.txt
    ┃ ┃ ┗ **📜sonar-ballerina-1.0-all.jar**
    ```

4. Restart SonarQube

## Usage

1. Open a Ballerina project

2. Verify that Ballerina `scan` command is available  by running
    ```bash
    bal tool list
    ```

3. [Configure the project for a sonar scan](https://docs.sonarsource.com/sonarqube/9.9/analyzing-source-code/scanners/sonarscanner/)

4. Trigger an analysis

## Contribute to Ballerina
As an open-source project, Ballerina welcomes contributions from the community.

For more information, go to the [contribution guidelines](https://github.com/ballerina-platform/ballerina-lang/blob/master/CONTRIBUTING.md).

## Code of conduct
All the contributors are encouraged to read the [Ballerina Code of Conduct](https://ballerina.io/code-of-conduct).

## Useful links
* Chat live with us via our [Discord server](https://discord.gg/ballerinalang).
* Post all technical questions on Stack Overflow with the [#ballerina](https://stackoverflow.com/questions/tagged/ballerina) tag.