# todoapplication
TODO web application using the newly released Java Spring Boot 3.0.0

Overview
The application consists of:

A TodoItem model class that represents a Todo item with a description and completion status.

A TodoItemService service class that handles CRUD operations for Todo items.

Two controllers:

HomeController - Renders the homepage and retrieves all Todo items from the service.
TodoFormController - Handles CREATE, UPDATE, and DELETE for Todo items.
Key Files
HomeController.java - Home page controller
TodoFormController.java - Todo item CRUD controller
TodoItemService.java - Business logic service class
TodoItem.java - Model class
The frontend uses Thymeleaf templates under resources/templates to render the views.

##Running the App

This is a Maven project. To run locally, execute the mvnw spring-boot:run command from the root folder. The app will start on http://localhost:8080.

The homepage displays all Todo items. New items can be added using the "Create Todo" link.
