package com.hdfc.controller;

import static org.hamcrest.Matchers.equalTo;

import java.util.Map;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;


@QuarkusTest
class StudentControllerTest {
	
	Map<String, Object> requestBody = Map.of(

            "dateOfBirth", "2009-05-25",
            "firstName", "Mohan",
            "gender", "Male",
            "grade", 10,
            "lastName", "Chakkani",
            "rollNo", 1
        );


	@Test
	void testAddStudent() {
		RestAssured.given().contentType(ContentType.JSON)
		.body(requestBody)
		.when()
		.post("/api/student")
		.then()
		.statusCode(200)
		.body("rollNo", equalTo(1));
	}
//
//	@Test
//	void testGetStudentByid() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetAllStudents() {
//		fail("Not yet implemented");
//	}

}
