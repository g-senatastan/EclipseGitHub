package com.senatastan.web.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PagesController {
	
	
	@GetMapping("/")
    public String home(Model model) {
		model.addAttribute("message","Merhaba, Blog Sayfasına Hoş Geldiniz.!");
        return "index"; 
	}    
    @GetMapping("/about")
    public String hakkımda() {
    	return "about";
    }
    @GetMapping("/service")
    public String misyonvizyon() {
    	return "service";
    }
    @GetMapping("/blog")
    public String blog() {
    	return "blog";
    }
    @GetMapping("/contact")
    public String iletisim() {
    	return "contact";
    }
}