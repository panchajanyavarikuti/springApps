Apart from IDE, you can also run this app using following approaches.
java -jar path-to-jar
on Project root , mvn spring-boot:run


url - http://localhost:8080/SpringBootRestApi/api/user/

REST API does:

GET request to /api/user/ returns a list of users
GET request to /api/user/1 returns the user with ID 1
POST request to /api/user/ with a user object as JSON creates a new user
PUT request to /api/user/3 with a user object as JSON updates the user with ID 3
DELETE request to /api/user/4 deletes the user with ID 4
DELETE request to /api/user/ deletes all the users
