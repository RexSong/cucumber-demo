# Sample of cucumber-jvm and junit4

Maven cli to execute tests

1. Use ```mvn clean test``` to execute all ```*Test``` or ```Test*``` files.
2. Execute tests filter by tags
```shell
mvn clean test -Dcucumber.filter.tags="@Regression"
```
3. Execute tests filter by feature files
```shell
mvn clean test -Dcucubmer.features="src\test\resources\features\Demo2.feature""
```

more cucumber configurations please refer [Cucumber Configuration Options](https://github.com/cucumber/cucumber-jvm/tree/main/cucumber-junit-platform-engine#configuration-options)
