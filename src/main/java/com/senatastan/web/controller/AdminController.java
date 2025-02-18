<<<<<<< HEAD
package com.senatastan.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/admin")
    public String adminDashboard(Model model) {
        model.addAttribute("title", "Admin Panel");
        return "indexhome";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}
=======
package com.senatastan.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/admin")
    public String adminDashboard(Model model) {
        model.addAttribute("title", "Admin Panel");
        return "indexhome";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
    @GetMapping("/users")
    public String usersPage() {
        return "form";
    }
    @GetMapping("/blogpanel")
    public String blogPage() {
        return "general_elements";
    }
}
>>>>>>> 0fab9026c02c4bdfc10f513d984f7f0aa41954d2
