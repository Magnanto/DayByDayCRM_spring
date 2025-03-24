package com.limulcomp.daybydaycrm_spring.api;

import com.limulcomp.daybydaycrm_spring.model.Projet;
import org.springframework.web.client.RestTemplate;

public class ProjetApi {
    RestTemplate restTemplate = new RestTemplate();
    static final String API_URL = "http://localhost:80/api/projets";

    public Projet[] getAll() {
        Projet[] projets = restTemplate.getForObject(API_URL, Projet[].class);
        return projets;
    }

    public Projet getById(int id) {
        return restTemplate.getForObject(API_URL + "/" + id, Projet.class);
    }

    public long count() {
        return restTemplate.getForObject(API_URL + "/count", Long.class);
    }
}
