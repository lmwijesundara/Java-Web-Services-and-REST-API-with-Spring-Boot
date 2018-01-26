package com.lahiru.soap.webservices.soapcoursemanagment.soap;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

//Enable Spring Web Service
@EnableWs

//Spring Configuration -> tell this is a spring configuration file
@Configuration
public class WebServiceConfig {

	// MessageDispathcerServlet -> Handle all requests and identity end points
	// ApplicationContext
	// url -> /ws/*
	
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context) { //ServletRegistrationBean -> Map servlet to URI
		MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
		
		messageDispatcherServlet.setApplicationContext(context);
		messageDispatcherServlet.setTransformWsdlLocations(true);
		
		return new ServletRegistrationBean(messageDispatcherServlet, "/ws/*");
	}
	
	// /ws/courses.wsdl
	@Bean(name="courses")
	public DefaultWsdl11Definition defaultWsdllDefinition(XsdSchema coursesSchema) {
		DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
		
		// portType - CouresePort
		definition.setPortTypeName("CoursePort");
		// NameSpace - http://lahiru.com/courese
		definition.setTargetNamespace("http://lahiru.com/courses");
		// /ws
		definition.setLocationUri("/ws");
		//schema
		definition.setSchema(coursesSchema);
		return definition;
	}
	@Bean
	public XsdSchema coureseSchema() {
		return new SimpleXsdSchema(new ClassPathResource("course-details.xsd"));
	}

	


}
