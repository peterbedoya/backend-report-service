package com.apps.controllers;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.apps.domain.ServiceReportRequest;
import com.fasterxml.jackson.databind.ObjectMapper;


@SpringBootTest
@AutoConfigureMockMvc
class CalculatorControllerTest {

	 @Autowired
	 private MockMvc mvc;
	


	@Test
	public void shouldSaveServiceReportHours() throws Exception {
		DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
		ServiceReportRequest serviceReportRequest = new ServiceReportRequest();
		serviceReportRequest.setTechnicalId("123456789");
		serviceReportRequest.setServiceId("0001");
		serviceReportRequest.setStartedDate(dtf.parseDateTime("2020-12-13 10:00:00").toDate());
		serviceReportRequest.setEndDate(dtf.parseDateTime("2020-12-13 12:00:00").toDate());

		 
		 this.mvc.perform(post("/api/v1/report-hours")
				 		.contentType(MediaType.APPLICATION_JSON_VALUE)
				 		.content(asJsonString(serviceReportRequest)))
			.andExpect(status().isOk())
			.andDo(print())
			.andExpect(jsonPath("$.errorCode", is("0")));
	}
	
	
	@Test
	public void shouldReturnExceptionServiceReportHours() throws Exception {
		ServiceReportRequest serviceReportRequest = new ServiceReportRequest();
		
		
		 this.mvc.perform(post("/api/v1/report-hours")
			 		.contentType(MediaType.APPLICATION_JSON_VALUE)
			 		.content(asJsonString(serviceReportRequest)))
		.andExpect(status().isOk())
		.andDo(print())
		.andExpect(jsonPath("$.errorCode", is("100")));
		
	}
	
	
	@Test
	public void shouldCalculateServiceReportHours() throws Exception {
		ServiceReportRequest serviceReportRequest = new ServiceReportRequest();
		serviceReportRequest.setTechnicalId("123456789");
		serviceReportRequest.setWeekYear(50); 
		 this.mvc.perform(post("/api/v1/caculator-hours")
				 		.contentType(MediaType.APPLICATION_JSON_VALUE)
				 		.content(asJsonString(serviceReportRequest)))
			.andExpect(status().isOk())
			.andDo(print())
			.andExpect(jsonPath("$.errorCode", is("0")));
	}
	

	
	@Test
	public void shouldReturnEmptyWhenNotExistReports() throws Exception {
		ServiceReportRequest serviceReportRequest = new ServiceReportRequest();

		 this.mvc.perform(post("/api/v1/caculator-hours")
				 		.contentType(MediaType.APPLICATION_JSON_VALUE)
				 		.content(asJsonString(serviceReportRequest)))
			.andExpect(status().isOk())
			.andDo(print())
			.andExpect(jsonPath("$.errorCode", is("100")));
	}
	
	
	
	public static String asJsonString(final Object obj) {
	    try {
	        return new ObjectMapper().writeValueAsString(obj);
	    } catch (Exception e) {
	        throw new RuntimeException(e);
	    }
	}
}
