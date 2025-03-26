package com.limulcomp.daybydaycrm_spring.controllers;

import com.limulcomp.daybydaycrm_spring.api.ClientApi;
import com.limulcomp.daybydaycrm_spring.model.Client;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {
    ClientApi clientApi=new ClientApi();
    @GetMapping("/clients")
    public String getAll(Model model){
        Client[] clients= clientApi.getAll();
        model.addAttribute("clients", clients);
        return "clients";
    }
}
