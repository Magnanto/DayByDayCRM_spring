package com.limulcomp.daybydaycrm_spring.controllers;

import com.limulcomp.daybydaycrm_spring.api.DashboardApi;
import com.limulcomp.daybydaycrm_spring.api.LeadApi;
import com.limulcomp.daybydaycrm_spring.api.OfferApi;
import com.limulcomp.daybydaycrm_spring.api.ProjetApi;
import com.limulcomp.daybydaycrm_spring.model.Lead;
import com.limulcomp.daybydaycrm_spring.model.Offer;
import com.limulcomp.daybydaycrm_spring.model.Projet;
import com.limulcomp.daybydaycrm_spring.services.Utilitaires;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Controller
public class DashboardController {
    private final DashboardApi dashboardApi = new DashboardApi();
    private final ProjetApi projetApi = new ProjetApi();
    private final OfferApi offerApi = new OfferApi();
    private final LeadApi leadApi = new LeadApi();
    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        Map<String, Object> totals = dashboardApi.getTotals();
        int inProgess=offerApi.getInProgess().length;
        int lost=offerApi.getLost().length;
        int won=offerApi.getWon().length;

        Lead[] leads=leadApi.getThisMonth();
        List<LocalDate> dates = Utilitaires.getAllDaysOfMonth();
        String mois=Utilitaires.getCurrentMonthInFrench();

        model.addAttribute("mois",mois);
        model.addAttribute("leads", leads);
        model.addAttribute("dates", dates);
        model.addAttribute("inProgress", inProgess);
        model.addAttribute("lost", lost);
        model.addAttribute("won", won);

        model.addAttribute("totals", totals);
        return "dashboard";
    }
}
