package com.pengsoo.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.Data;

@Data
@Controller
public class Homecontroller {

	@RequestMapping("test")
	public String test() {
		return "test";
	}
}
