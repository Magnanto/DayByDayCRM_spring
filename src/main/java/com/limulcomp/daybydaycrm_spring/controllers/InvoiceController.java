package com.limulcomp.daybydaycrm_spring.controllers;

import com.limulcomp.daybydaycrm_spring.api.InvoiceApi;
import com.limulcomp.daybydaycrm_spring.model.Invoice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class InvoiceController {
    InvoiceApi invoiceApi= new InvoiceApi();

    @GetMapping("/invoices")
    public String invoices(Model model) {
        Invoice[] invoices = invoiceApi.getAll();
        model.addAttribute("invoices", invoices);
        return "invoices";
    }
}
