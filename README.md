🏷️ Inventory Management of Products API
📋 Prerequisites
-Recommended IDE: IntelliJ IDEA
-Testing tools: Swagger UI or Postman
-Environment: JDK 21 and Maven

🚀 Steps for Launching and Testing the API

1. Import the Project

-Open the project folder in IntelliJ IDEA
-Let the IDE configure the dependencies automatically
2-Database creation:

-Create a PostgreSQL database named "Inventaire-DB" via pgAdmin and export the database provided (".backup" is preferable if pgAdmin is used)
-you can also create a database with another name, just modify the information in "application.properties" to adapt it to your own Modify src/main/resources/application.properties :
      spring.datasource.url=jdbc:postgresql://localhost:5432/votre_nom_de_base
      spring.datasource.username=votre_username
      spring.datasource.password=votre_password
3-Compiling and launching :

-Compile the project
Launch the application via the main class (annotated @SpringBootApplication)
4-Access to the Swagger interface :

-Open a web browser
-Go to: http://localhost:8082/swagger-ui/index.html
-You should see the interactive API documentation
5-Testing an endpoint (PUT example): a. In Swagger UI :

-Find the section corresponding to your controller
-Click on "PUT" to expand the section
-Click on "Try it out"
-In the body of the request:
     Replace the example content with your data
     Delete the id (generated automatically)
     Fill in the mandatory fields (name, price, quantity)
-Click on "Execute"
-Check the "new data updated" response if all went well
📤 Via Postman:

-Create a new PUT request to localhost:8080/Gestionutilisateur/update/{nomProduit}
-In the "Body" tab, select "raw" and "JSON"
-Enter your JSON object (without the id)
-Send the request and check the response

💡 Tips

-Check that port 8082 is available
-In the event of an error, check the application logs
-For Postman, you can import the Swagger configuration if available
Example of a JSON request body for adding an item:

{
  "nom": "disque-dur",
  "prix": 18000,
  "quantite": 100
}
