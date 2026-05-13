package com.example.hoge.controller;

import java.time.LocalDateTime;
import java.time.Duration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MainController {

	@GetMapping("")
	@ResponseBody
	public String index() {
		return "Hello, MainController! I`m running.";
	}

	@GetMapping("scaling-test")
	@ResponseBody
	public String scalingTest() {
		LocalDateTime start = LocalDateTime.now();
		int hoge = 1;
        while (Duration.between(start, LocalDateTime.now()).getSeconds() < 1) {
            hoge *= 1;
        }
		return "Scaling test completed.\n";
	}

}
