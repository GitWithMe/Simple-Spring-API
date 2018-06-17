package io.namitproject.springbootquickstart.hello; //Basically used for class Path Scan

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //Indicates that this class deals with HTTP Requests
public class HelloController {

	@RequestMapping("/hello") //Maps to all the HTTP Request
	public String sayHi() {   //This means whenever the URL has /hello, the following function will execute
		return "Hi";
	}
}
