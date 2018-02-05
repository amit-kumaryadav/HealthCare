package com.healthCare.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Test")
public class mainChecker {
	@RequestMapping(value="/testSetUp",method = RequestMethod.GET)
	   public String sayHello() {
	      return "Controller Hitting !!";
	   }
}
