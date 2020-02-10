package com.gmr;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringGraphqlMongodbRestApplicationTests {

	@LocalServerPort
	private int localPort;

	@Autowired
	TestRestTemplate testRestTemplate;
	
	@Test
	void givenRequestWithAllPersons_whenRequestIsExecuted_then200IsReceived() {
		
		// Given
		HttpHeaders headers = new HttpHeaders();
		
		String URL = "http://localhost:" + localPort + "/graphql";

		final String json = "{ \"query\": \"{ allPersons{ name }}\", \"variables\": null, \"operationName\": null }";
		headers.add("Content-type", "application/json");
		HttpEntity<String> entity = new HttpEntity<String>(json, headers);

		// When
		ResponseEntity<String> response = testRestTemplate.exchange(URL, HttpMethod.POST, entity, String.class);
		System.out.println(response);
		
		// Then
		Assertions.assertEquals(response.getStatusCode(), HttpStatus.OK);
	}

}
