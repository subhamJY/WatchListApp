package com.subham.firstController.web;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@GetMapping
	public String getOnServer() {
		return "hello guys!! first spring project";
	}
	
	@GetMapping("search")
	public String search(@RequestParam(name = "q") String value) {
		return value;
	}
	
	@GetMapping("search/{celibrityname}")
	public String searchpath(@PathVariable(name = "celibrityname") String value) {
		return value;
	}
}
