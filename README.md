Build Status
----------------------------------------------------------------------------------
[![CircleCI](https://circleci.com/gh/RajAsapu/myStoreManager-service.svg?style=svg)](https://circleci.com/gh/RajAsapu/myStoreManager-service)

Tech Stack
----------------------------------------------------------------------------------
    Junit
    Cucumber-Java
    Rest-Assured
    Jackson Databind
    Cucumber-Junit
    Cucumber-Reporting

Flow of test case
----------------------------------------------------------------------------------

    - Each Scenario(Steps in particular) inside ApiTest feature file will be calling respective step implementation in APITestSteps class.
    - ApiTestSteps class will make a call to the Sandbox end point using Rest Assured.
    - Response from the end point call is captured in the response object.
    - Status code is validated to be 200 , to verify if its successful.
    - Response is converted into Category object using ObjectMapper class from Jackson Api.
    - Getters and Setters are used from the category object to validate the data.

Trigger of the test cases
---------------------------------------------------------------------------------

    - RunTest class would be called on gradle build.
    - It uses Cucumber-Junit library to trigger tests.
    - CucumberOptions annotation provides the required test configuration.
    - generateReport() method generates the report from the json file generated.

Running of the project
----------------------------------------------------------------------------------
    - Gradle wrapper can be used to run the project

        > ./gradlew --debug clean test (On Mac/Linux)

Reports path
----------------------------------------------------------------------------------
    out/cucumber-html-reports/overview-features.html

