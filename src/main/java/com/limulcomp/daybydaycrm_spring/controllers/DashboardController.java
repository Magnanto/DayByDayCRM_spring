package com.limulcomp.daybydaycrm_spring.controllers;

import com.limulcomp.daybydaycrm_spring.api.*;
import com.limulcomp.daybydaycrm_spring.model.InvoiceData;
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
    private final InvoiceApi invoiceApi = new InvoiceApi();
    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        Map<String, Object> totals = dashboardApi.getTotals();
        int inProgress=offerApi.getInProgress().length;
        int lost=offerApi.getLost().length;
        int won=offerApi.getWon().length;



        Lead[] leads=leadApi.getThisMonth();
        List<LocalDate> dates = Utilitaires.getAllDaysOfMonth();
        String mois=Utilitaires.getCurrentMonthInFrench();
        InvoiceData[] invoicesData=invoiceApi.getInvoicesAnnuelle();

        model.addAttribute("invoicesData",invoicesData);
        model.addAttribute("mois",mois);
        model.addAttribute("leads", leads);
        model.addAttribute("dates", dates);
        model.addAttribute("inProgress", inProgress);
        model.addAttribute("lost", lost);
        model.addAttribute("won", won);

        model.addAttribute("totals", totals);
        return "dashboard";
    }
}
