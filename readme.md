Spring Boot App with embedded containers
----- 
This small example demonstrate how to setup a runnable Spring Boot App with the
embedded Servlet container of your choice be it Tomcat, Jetty or Undertow.

This example can be used for quick and easy embedded container  
configurations (hence the suffix `ecc`).

Embedded Tomcat
--
This example shows how to build and package a runnable jar with Tomcat. 
```
mvn clean package -P tomcat 
```

Embedded Jetty
--
This example shows how to build and package a runnable jar with Jetty.
```
mvn clean package -P jetty
```
 
Embedded Undertow
--
This example shows how to build and package a runnable jar with Undertow.
```
mvn clean package -P undertow
```

Run the executable jar via:
--
```
java -jar target/spring-boot-web-ecc-0.0.1-SNAPSHOT.jar
```