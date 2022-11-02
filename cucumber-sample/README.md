# Sample of cucumber-jvm and junit5

surefire plugin
```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>3.0.0-M5</version>
    <configuration>
        <properties>
            <configurationParameters>
                cucumber.junit-platform.naming-strategy=long
            </configurationParameters>
        </properties>
    </configuration>
</plugin>
```
Maven cli to execute tests
1. Use ```mvn clean test``` to execute all ```*Test``` and ```Test*``` files.
2. Execute tests filter by tags ```@Regression```. It integrates with JUnit5 ```groups``` parameter.
```shell
mvn clean test -Dgroups="Regression" -DexcludedGroups="LongPeriod"
```

more cucumber configurations please refer [Cucumber Configuration Options](https://github.com/cucumber/cucumber-jvm/tree/main/cucumber-junit-platform-engine#configuration-options)
