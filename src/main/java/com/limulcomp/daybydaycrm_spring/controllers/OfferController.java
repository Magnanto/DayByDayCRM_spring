package com.limulcomp.daybydaycrm_spring.controllers;

import com.limulcomp.daybydaycrm_spring.api.OfferApi;
import com.limulcomp.daybydaycrm_spring.model.Offer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OfferController {
    OfferApi offerApi= new OfferApi();

    @GetMapping("/offers")
    public String offers(Model model) {
        Offer[] offers = offerApi.getAll();
        model.addAttribute("offers", offers);
        return "offers";
    }
}
