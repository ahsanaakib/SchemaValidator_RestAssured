package com.restassured.schema.validation;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.matcher.RestAssuredMatchers;


public class XmlSchemaValidationTest {

	@Test
	public void validateXmlSchema() {
		given()

		.when().get("https://www.w3schools.com/xml/note.xml")
		.then()
			.assertThat()
			.body(RestAssuredMatchers.matchesXsdInClasspath("user-schema.xsd"));

	}
}
