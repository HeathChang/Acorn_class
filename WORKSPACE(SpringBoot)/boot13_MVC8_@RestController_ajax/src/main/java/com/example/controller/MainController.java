package com.example.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.dto.Login;

@Controller  // @RestController = @Controller + @ResponseBody
public class MainController {

	@RequestMapping("/")
	public String main() {
		return "main";
	}

}
