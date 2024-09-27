package com.webtask;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebTaskController {
	
	@GetMapping(value="/webtask")
	public String task() {
		return "Vanakkam Chennai";
	}

}
