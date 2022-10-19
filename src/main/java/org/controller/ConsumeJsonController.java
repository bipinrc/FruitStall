package org.controller;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import org.model.SampleModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
@RequestMapping(value = "/json")
public class ConsumeJsonController
{
	@RequestMapping(value = "/getJsonResponse", method = RequestMethod.GET)
	public List<SampleModel> getJsonResponse() throws IOException, InterruptedException
	{
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
				.GET()
				.build();

		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readValue(response.body(),
				objectMapper.getTypeFactory().constructCollectionType(List.class, SampleModel.class));
	}
}
