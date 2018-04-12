package com.springtest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class Restcontroller {
	

@RequestMapping(value="/name",method=RequestMethod.GET,produces="application/json")
public List<String> getAllNames(){
	return Arrays.asList("John","Johny","Janardhan");
}

}
