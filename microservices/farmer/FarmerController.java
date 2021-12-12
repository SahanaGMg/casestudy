package com.cropdeal.farmer.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FarmerController {
	
	@RequestMapping("/farmer")
	public String check()
	{
		return "Hello-World-farmer";
	}

}
