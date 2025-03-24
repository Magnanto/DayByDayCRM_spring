package com.limulcomp.daybydaycrm_spring.api;

import com.limulcomp.daybydaycrm_spring.model.Payment;
import org.springframework.web.client.RestTemplate;

public class PaymentApi {
    RestTemplate restTemplate = new RestTemplate();
    static final String API_URL = "http://localhost:80/api/payments";

    public Payment[] getAll() {
        Payment[] payments = restTemplate.getForObject(API_URL, Payment[].class);
        return payments;
    }

    public Payment getById(int id) {
        return restTemplate.getForObject(API_URL + "/" + id, Payment.class);
    }

    public long count() {
        return restTemplate.getForObject(API_URL + "/count", Long.class);
    }
}
