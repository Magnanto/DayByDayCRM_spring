package com.limulcomp.daybydaycrm_spring.controllers;

import com.limulcomp.daybydaycrm_spring.api.PaymentApi;
import com.limulcomp.daybydaycrm_spring.model.Payment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("/payment/update")
    public String indexUpdate(@RequestParam("id") int id,Model model){
        Payment payment=paymentApi.getById(id);
        model.addAttribute("payment", payment);
        return "updatePayment";
    }

    @PostMapping("/payment/update")
    public String update(@RequestParam("id") int id,@RequestParam("montant") int montant,Model model){
        ResponseEntity<String> updateResponse =paymentApi.updatePayment(id,montant);
        if(updateResponse.getStatusCode().is2xxSuccessful()){
            model.addAttribute("message", "Payment updated successfully");
        }
        else{
            model.addAttribute("message", "Failed to update payment");
        }
        Payment payment = paymentApi.getById(id);
        model.addAttribute("payment", payment);
        return "updatePayment";
    }

    @GetMapping("/payment/delete")
    public String delete(@RequestParam("id") int id,Model model){
        ResponseEntity<String> updateResponse =paymentApi.deletePayment(id);
        if(updateResponse.getStatusCode().is2xxSuccessful()){
            model.addAttribute("message", "Payment deleted successfully");
        }
        else{
            model.addAttribute("message", "Failed to delete payment");
        }
        Payment[] payments=paymentApi.getAll();
        model.addAttribute("payments", payments);
        return "payments";
    }
}
