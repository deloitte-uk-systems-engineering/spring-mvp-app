# Java Spring Skills Tracker App

A skills trackers app in Java Spring with the following features:
- Users authentications
- Connects to cloud database

Also acts as a boilerplate for future Java Spring projects 

## Run/Build Locally

Various options to run/build this app locally:
- With Maven, run `maven clean install` followed by `maven spring-boot:run` or,
- Open `SpringMvpAppApplication.java` on your code editor and run as application

## Database

- App is currently storing data via in-memory database
- This will be replaced by local SQL database such as PostgreSQL or cloud database such as AWS RDS
- Associated configurations will be added in `/resources/application.properties`

## Usage  

Download Postman collection [here](https://www.getpostman.com/collections/b8d3e24049479e11bdbd) which enables for the following usages: 

- Once app is running, to get users make a GET request to `http://localhost:8080/users`

- To get info on specific user, make a GET request to `http://localhost:8080/users/<id>`    

- To add a user, make a POST request to `http://localhost:8080/users` with the following body:
```bash
{
	"firstName": "John",
	"lastName": "Doe",
}
```

- To remove a user, make a DELETE request to `http://localhost:8080/users/<id>`

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)



