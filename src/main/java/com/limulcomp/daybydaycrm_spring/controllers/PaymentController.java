package com.limulcomp.daybydaycrm_spring.controllers;

import com.limulcomp.daybydaycrm_spring.api.PaymentApi;
import com.limulcomp.daybydaycrm_spring.model.Payment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PaymentController {
    private final PaymentApi paymentApi= new PaymentApi();
    @GetMapping("/payments")
    public String payments(Model model) {
        Payment[] payments=paymentApi.getAll();
        model.addAttribute("payments", payments);
        return "payments";
    }
}
