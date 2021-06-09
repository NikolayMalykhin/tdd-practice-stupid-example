package com.weigandt_consulting;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ContentControllerTest {
	@Autowired
	private MockMvc mvc;

	@Test
	public void create() {
		// TODOD
	}

	@Test
	public void getContent() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/contents/1").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$.id").value("1"))
				.andExpect(jsonPath("$.content").value("content"));
	}

	@Test
	public void update() {
		// TODOD
	}

	@Test
	public void delete() {
		// TODOD
	}
}
