package com.example.Springbootdeployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
 @GetMapping("/get")
 String  getdata(){
	 return "Hello H";
 }
}
