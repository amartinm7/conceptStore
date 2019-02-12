#Concept Store

testing
https://www.baeldung.com/spring-boot-testing

intellij shortcut
create class
 Alt+Enter for the Intention Actions pop-up, choose Create Class.

rename class
fn + shift + f6

## H2 CONSOLE
http://localhost:8080/console

in the JDBC Url field write the same info that goes in the application yaml file. 
That is: 
```yaml
 datasource:
    url: jdbc:h2:mem:example-app;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE
```

## Lombok
enable annotation processing
@Data is a convenient shortcut annotation that bundles the features of @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor together: In other words, @Data

[lombok](https://projectlombok.org/features/Data)