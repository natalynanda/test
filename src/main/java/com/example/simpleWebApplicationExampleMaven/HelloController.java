package com.example.simpleWebApplicationExampleMaven;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
<<<<<<< HEAD
<<<<<<< HEAD
=======

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot Third messsage!";
    }

>>>>>>> 956292e... third message
=======

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

>>>>>>> 9b7b52f... html template
}
