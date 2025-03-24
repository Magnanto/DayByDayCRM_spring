package com.limulcomp.daybydaycrm_spring.api;

import com.limulcomp.daybydaycrm_spring.model.Client;
import com.limulcomp.daybydaycrm_spring.model.Invoice;
import org.springframework.web.client.RestTemplate;

public class InvoiceApi {
    RestTemplate restTemplate = new RestTemplate();
    static final String API_URL = "http://localhost:80/api/invoices";

    public Invoice[] getAll() {
        Invoice[] invoices = restTemplate.getForObject(API_URL, Invoice[].class);
        return invoices;
    }

    public Invoice getById(int id) {
        return restTemplate.getForObject(API_URL + "/" + id, Invoice.class);
    }

    public long count() {
        return restTemplate.getForObject(API_URL + "/count", Long.class);
    }
}
