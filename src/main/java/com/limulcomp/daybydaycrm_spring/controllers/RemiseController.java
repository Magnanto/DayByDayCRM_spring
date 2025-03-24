package com.limulcomp.daybydaycrm_spring.controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.limulcomp.daybydaycrm_spring.api.RemiseApi;
import com.limulcomp.daybydaycrm_spring.model.Remise;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RemiseController {
    private final RemiseApi remiseApi=new RemiseApi();

    @GetMapping("/remise")
    public String index(Model model){
        Remise remise=remiseApi.getRemise();
        model.addAttribute("remise", remise);
        return "remise";
    }

    @PostMapping("/remise/update")
    public String update(@RequestParam("discount")double discount,Model model){
//        System.out.println(discount);
        ResponseEntity<String> updateRemise=remiseApi.updateRemise(discount);

        ObjectMapper mapper = new ObjectMapper();
        String message="";
        try{
            JsonNode root = mapper.readTree(updateRemise.getBody());
            message = root.path("message").asText();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        model.addAttribute("message",message);
        Remise remise=remiseApi.getRemise();
        model.addAttribute("remise", remise);
        return "remise";
    }
}
