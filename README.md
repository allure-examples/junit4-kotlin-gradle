# Allure Gradle JUnit Example
This example demonstrates how to use Allure [JUnit](http://testng.org/) adapter with [Gradle](http://www.gradle.org/) build tool.

## Usage
To launch this example install Gradle and run the following command from the root directory:
```bash
$ gradle
```
You should see failed tests and generated Allure XML files in **build/allure-results** directory.  

To generate allure report from generated Allure XML files:
```bash
$ gradle generateAllureReport
```

To open allure report:
```bash
$ gradle openAllureReport
```
