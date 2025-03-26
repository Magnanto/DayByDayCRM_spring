package com.limulcomp.daybydaycrm_spring.api;

import com.limulcomp.daybydaycrm_spring.model.Client;
import com.limulcomp.daybydaycrm_spring.model.Status;
import org.springframework.web.client.RestTemplate;

public class StatusApi {
    RestTemplate restTemplate = new RestTemplate();
    static final String API_URL = "http://localhost:80/api/status";

    public Status getById(int id) {
        return restTemplate.getForObject(API_URL + "/" + id, Status.class);
    }

}
