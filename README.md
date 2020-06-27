# spring-mvp-app

**Cloning the application**     

Use git to clone the application into your local workspace with below command   
git clone https://github.com/deloitte-uk-systems-engineering/spring-mvp-app.git

Use any IDE of choice like Eclipse, IntelliJ IDEA, Netbeans etc.


**Running locally**

The application can be built using maven and then either run by -
1. jar spring-mvp-app.jar
2. Go to 'SpringMvpAppApplication.java', right click and select 'Run as Application'

**Data Source** is in-memory database which will be replaced by either cloud or locally installed database like MySql, Oracle etc. 
Relevant configuration will be added in "/resources/application.properties"

**Testing Application**     
Run the Application     

Open Browser and fire the below url for getting all the engineers -     
`http://localhost:8080/engineer/all`

For getting specific engineer -     
`http://localhost:8080/engineer/1`






