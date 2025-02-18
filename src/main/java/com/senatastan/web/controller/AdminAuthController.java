package com.senatastan.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.senatastan.web.entities.AdminLoginEntities;  
import com.senatastan.web.repository.AdminLoginRepository;





import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminAuthController {

    @Autowired
    private AdminLoginRepository adminLoginRepository;  

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";  
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, 
                        @RequestParam("password") String password, 
                        Model model, 
                        HttpSession session) {

        AdminLoginEntities admin = adminLoginRepository.findByUsername(username);  

        if (admin != null && admin.getPassword().equals(password)) {
            session.setAttribute("adminUser", username);  
            return "redirect:/admin";  
        } else {
            model.addAttribute("error", true);  
            return "login";  
        }
    }
    
    @GetMapping("/admin")
    public String adminHome() {
        return "indexhome";  
    }


   
}

