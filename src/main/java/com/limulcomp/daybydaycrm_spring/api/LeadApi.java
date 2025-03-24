package com.limulcomp.daybydaycrm_spring.api;

import com.limulcomp.daybydaycrm_spring.model.Lead;
import com.limulcomp.daybydaycrm_spring.model.Payment;
import org.springframework.web.client.RestTemplate;

public class LeadApi {
    RestTemplate restTemplate = new RestTemplate();
    static final String API_URL = "http://localhost:80/api/leads";

    public Lead[] getThisMonth() {
        Lead[] leads = restTemplate.getForObject(API_URL + "/date/month/now", Lead[].class);
        return leads;
    }
}
