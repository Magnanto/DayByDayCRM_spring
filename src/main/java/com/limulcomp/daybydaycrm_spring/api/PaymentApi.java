package com.limulcomp.daybydaycrm_spring.api;

import com.limulcomp.daybydaycrm_spring.model.Invoice;
import com.limulcomp.daybydaycrm_spring.model.Payment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class PaymentApi {
    RestTemplate restTemplate = new RestTemplate();
    static final String API_URL = "http://localhost:80/api/payments";

    public Payment[] getAll() {
        Payment[] payments = restTemplate.getForObject(API_URL, Payment[].class);
        for(Payment payment : payments) {
            Invoice invoice=this.getPaymentInvoice(payment.getId());
            payment.setInvoice(invoice);
        }
        return payments;
    }

    public Invoice getPaymentInvoice(int id){
        return restTemplate.getForObject(API_URL + "/" + id + "/invoice", Invoice.class);
    }
    public Payment getById(int id) {
        return restTemplate.getForObject(API_URL + "/" + id, Payment.class);
    }

    public long count() {
        return restTemplate.getForObject(API_URL + "/count", Long.class);
    }

    public ResponseEntity<String> updatePayment(int id, int amount) {
        String url = API_URL + "/update/" + id;
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");

        String requestBody = "{\"amount\": " + amount + "}";
        HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);

        return restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
    }

    public ResponseEntity<String> deletePayment(int id) {
        String url = API_URL + "/delete/" + id;
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");

        HttpEntity<String> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
    }


}
