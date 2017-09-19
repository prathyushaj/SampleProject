package com.iTrellis.iTrellisProj;

import java.util.Date;
import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=ITrellisProjApplication.class)
@WebMvcTest(value = WebController.class, secure = false)
@SpringBootTest
public class ITrellisProjApplicationTests {
	
	/*@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private TodoManager todoManager;
	
	Todo mockTodo = new Todo("task1","task1",new Date(), false,"task1 item");
	HashMap<String,Todo> todoMockList = new HashMap<String, Todo>();
	

	@Test
	public void getTasks() throws Exception {
		todoMockList.put("task1", mockTodo);
		Mockito.when(todoManager.getTasks()).thenReturn(todoMockList);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/TaskManager/getTasks").accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		System.out.println(result.getResponse());
		String expected = "{id:Course1,name:Spring,description:10 Steps}";
		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
	}
*/
}
