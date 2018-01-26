package com.lahiru.soap.webservices.soapcoursemanagment.soap;


import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.lahiru.courses.CoureseDetails;
import com.lahiru.courses.GetCourseDetailsRequest;
import com.lahiru.courses.GetCourseDetailsResponse;

@Endpoint
public class CoureseDetailsEndpoint {

	// input - GetCourseDetailsRequset
	// output - GetCourseDetailResponse
	
	// http://lahiru.com/course
	
	//GetCourseDetailsRequset
	@PayloadRoot(namespace = "http://lahiru.com/courses", localPart = "GetCourseDetailsRequest")
	@ResponsePayload
	public GetCourseDetailsResponse processCoureDetailRequest(@RequestPayload GetCourseDetailsRequest request ) {
		
		GetCourseDetailsResponse response = new GetCourseDetailsResponse();  
		
		CoureseDetails coureseDetail = new CoureseDetails();
		coureseDetail.setId(request.getId());
		coureseDetail.setName("Spring Boot");
		coureseDetail.setDescription("Best");
		
		response.setCourseDetails(coureseDetail);
		return response;
	}
}
