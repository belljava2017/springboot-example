package com.teach.koka.springboot.resource;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.teach.koka.springboot.HelloStudent;


@RestController
@RequestMapping(value="/student-boot")
public class StudentController {
	
	@RequestMapping(method=RequestMethod.GET, consumes=MediaType.APPLICATION_JSON_VALUE)
	public HelloStudent Hello(){
		HelloStudent hs = new HelloStudent();
		hs.setName("Siva");
		hs.setCourse("Java");
		return hs;
	}

}
