#Concept Store

ideas:
Create a simple store model with categories and articles. 
Create the REST API, swagger and tests
For the firsts iterations don't create the checkout
Create a frontend layer to show the results in a responsive way. The articles mainly.
Keep in mind the mobile viewport to show in a right way the articles.
Use the flexbox to help in the frontend layer, to differenciate the viewports
Start with the mobile viewport.
The main goal is create a flow to show the articles in a mobile viewport to expand to the other viewports 
and after that grow adding new features.
the frontend layer with vue and the backend with springboot.
The database in h2
study adding cache for hibernate
study how to add a media server and a CDN to handle the images and the image sizes.
In the first iteration the REST API is mainly a monolith
 

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

### known issues: JSON can't serialize lazy proxy entities
to resolve this, add this configuration in the application.yml file
```yaml
  jackson:
    serialization:
      fail-on-empty-beans: false
```

### challenge run the front and the backend at the same time in the same server
To run the vuejs front-layer project we have to run a webpack server, let's say locahost:8080
To run the backend layer is the same, let's say localhost:9090
So when the vuejs project calls to the backend project the url is different so we need to configure CORS
we can configure in both sides, but we can proxify the calls of the vuejs project in order to call to the backend project properly.
https://blog.codecentric.de/en/2018/04/spring-boot-vuejs/
```json
dev: {
    ...
    proxyTable: {
      // proxy all webpack dev-server requests starting with /api to our Spring Boot backend (localhost:8088)
      '/api': {
        target: 'http://localhost:8088',
        changeOrigin: true
      }
    },
```    
With this configuration in place, the webpack-dev-server uses the really 
handy http-proxy-middleware to proxy all frontend requests with a
 preceding /api from http://localhost:8080 to http://localhost:8088 – 
 including changing the Origin HTTP header accordingly. 
 Remember that our Spring Boot REST services are configured to serve 
 those requests to /api on class level:
