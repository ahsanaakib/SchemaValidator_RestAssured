package com.restassured.schema.validation;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.module.jsv.JsonSchemaValidator;

public class JsonSchemaValidationTest {

	@Test
	public void validateJsonSchema() {
		given()

		.when()
			.get("https://jsonplaceholder.typicode.com/users/1")
		.then()
			.assertThat()
			.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("user-schema.json"));

	}

}
