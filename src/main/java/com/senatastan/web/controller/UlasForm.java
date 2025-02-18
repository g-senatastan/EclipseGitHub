package com.senatastan.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.senatastan.web.entities.UlasFormEntities;
import com.senatastan.web.service.FormEmailService;
import com.senatastan.web.service.UlasFormService;

@Controller
@RequestMapping("/api/ulasform") 
public class UlasForm {

    private final UlasFormService ulasFormService;
    private final FormEmailService formEmailService;

    @Autowired
    public UlasForm(UlasFormService ulasFormService,FormEmailService formEmailService) {
        this.ulasFormService = ulasFormService;
        this.formEmailService = formEmailService;
    }

    
    @PostMapping
    public String saveMessage(@ModelAttribute UlasFormEntities ulasForm) {
        ulasFormService.saveMessage(ulasForm);
        formEmailService.sendContactFormMail(ulasForm);
        return "redirect:/contact?success=true";  
    }
}