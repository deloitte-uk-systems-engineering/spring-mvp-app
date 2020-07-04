# Java Spring Boilerplate

A Java Spring boilerplate reference project with user authentication, and connects to an SQL database

The use case is a skills tracker app for users

## Run/Build Locally

Various options to run/build this app locally:
- With Maven, run `maven clean install` followed by `maven spring-boot:run` or,
- Open `SpringMvpAppApplication.java` on your code editor and run as application

## Database

- App is currently storing data via in-memory database
- This will be replaced by local SQL database such as PostgreSQL or cloud database such as AWS RDS
- Associated configurations will be added in `/resources/application.properties`

## Usage  
 
- Once app is running, to get users make a GET request to `http://localhost:8080/engineer/all`

- To get info on specific user, make a GET request to `http://localhost:8080/engineer/<id>`    

- To add a user, make a POST request to `http://localhost:8080/engineer/create` with the following body:
```bash
{
    "name": "John Dow"
}
```

- To remove a user, make a DELETE request to `http://localhost:8080/engineer/delete/<id>`

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)



