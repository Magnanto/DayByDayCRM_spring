package com.limulcomp.daybydaycrm_spring.api;

import com.limulcomp.daybydaycrm_spring.model.Client;
import com.limulcomp.daybydaycrm_spring.model.Projet;
import com.limulcomp.daybydaycrm_spring.model.Status;
import org.springframework.web.client.RestTemplate;

public class ProjetApi {
    RestTemplate restTemplate = new RestTemplate();
    static final String API_URL = "http://localhost:80/api/projets";

    public Projet[] getAll() {
        Projet[] projets = restTemplate.getForObject(API_URL, Projet[].class);
        for (Projet projet : projets) {
            Status status=new StatusApi().getById(projet.getStatus_id());
            Client client=new ClientApi().getById(projet.getClient_id());
            projet.setStatus(status.getTitle());
            projet.setClient(client);
        }
        return projets;
    }

    public Projet getById(int id) {
        return restTemplate.getForObject(API_URL + "/" + id, Projet.class);
    }

    public long count() {
        return restTemplate.getForObject(API_URL + "/count", Long.class);
    }
}
