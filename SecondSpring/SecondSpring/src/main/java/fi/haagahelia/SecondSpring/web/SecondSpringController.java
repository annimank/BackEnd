package fi.haagahelia.SecondSpring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class SecondSpringController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(@RequestParam(name="name", required=false, defaultValue="name") String name,
						@RequestParam(name="location", required=false, defaultValue="location") String location) {
		return "Welcome to the " + location + " " + name + "!";
	}

}
