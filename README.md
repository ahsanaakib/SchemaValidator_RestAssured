# Schema Validation with Rest Assured

This project demonstrates how to validate JSON and XML schemas using Rest Assured in Java. It includes examples of both JSON and XML schema validation for publicly accessible APIs. 

## Project Structure
### Test Classes
- **JsonSchemaValidationTest.java**: Validates the JSON schema of a user resource fetched from a public API (`https://jsonplaceholder.typicode.com/users/1`).
- **XmlSchemaValidationTest.java**: Validates the XML schema of an XML document fetched from a public API (`https://www.w3schools.com/xml/note.xml`).

## Prerequisites

- **Java**: JDK 8 or higher.
- **Maven**: Ensure Maven is installed and configured.
- **TestNG**: Test framework for executing tests.
- **Rest Assured**: For making HTTP requests and validating responses.
