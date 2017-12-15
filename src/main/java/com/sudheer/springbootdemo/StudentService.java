package com.sudheer.springbootdemo;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/student")
public class StudentService {
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	   public HashMap<Long,Student> getAllStudents(){
	      return SpringbootdemoApplication.hmStudent;
	   }

}