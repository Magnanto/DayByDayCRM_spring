package com.limulcomp.daybydaycrm_spring.controllers;

import com.limulcomp.daybydaycrm_spring.api.ProjetApi;
import com.limulcomp.daybydaycrm_spring.model.Projet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjetController {
    ProjetApi projetApi = new ProjetApi();

    @GetMapping("/projets")
    public String getAll(Model model) {
        Projet[] projets = projetApi.getAll();
        model.addAttribute("projets", projets);
        return "projets";
    }
}
