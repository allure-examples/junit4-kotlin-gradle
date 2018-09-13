# Allure Gradle JUnit Example
This example demonstrates how to use [Allure JUnit adaptor](https://github.com/allure-framework/allure-core/wiki/JUnit) with [Gradle](http://www.gradle.org/) build tool.

## Usage
To launch this example install Gradle and run the following command from the root directory:
```bash
$ gradle
```
You should see failed tests and generated Allure XML files in **build/allure-results** directory.  

## Report
To generate report [allure-cli](https://github.com/allure-framework/allure-cli) can be used.

Report generation example:
```bash
# Run from the root directory
$ allure generate build/allure-results -v 1.4.11 -o build/reports/allure
```

Open report example:
```bash
$ allure report open -o build/reports/allure
```

## Automate with Gradle

Report generation can be automated with gradle.

Example:
```groovy
task generateAllureReport(type: Exec) {
    commandLine "allure"
    args "generate", "build/allure-results",  "-v", "${allureVersion}", "-o", "build/reports/allure",  "--clean"
}
test.finalizedBy(generateAllureReport)

task openAllureReport(type: Exec) {
    commandLine "allure"
    args "report", "open", "-o", "build/reports/allure"
}
```