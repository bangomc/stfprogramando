package com.example;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DemoController {
	@RequestMapping("/")
    public String greet() {
     return "Olha o STF-Programando com Spring boot no Heroku com Docker pq no GAE comecou a cobrar!";
    }
}
