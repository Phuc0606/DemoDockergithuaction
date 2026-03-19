package com.example.HuynhThanhPhuc_2280602431;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("title", "Xin chào, Docker + Spring Boot!");
		model.addAttribute("time", LocalDateTime.now().toString());
		return "index";
	}
}
