package com.chewdisout.portfolio.api.endpoints.route;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouteController {
    @GetMapping("/")
	public String index() {
		return "Greetings from Vladislavs";
	}
}
