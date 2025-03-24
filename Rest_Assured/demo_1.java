package Rest_Assured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class demo_1 {
	@Test
	public void mm() {
		RestAssured
		.given()
		.when()
		.get("https://reqres.in/api/users?page=2")
		.then().log().all();
		
	}
	
	@Test
	public void get() {
		 RestAssured
		 .given()
		.when()
		.get("https://reqres.in/api/users/2")
		.then().log().status();
		
		
	}
	@Test
	public void delete() {
		RestAssured
		.given()
		.when()
		.delete("https://reqres.in/api/users/2")
		.then().statusCode(207);
		
		
	}

}
