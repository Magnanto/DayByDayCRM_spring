package com.limulcomp.daybydaycrm_spring.api;

import com.limulcomp.daybydaycrm_spring.model.User;
import org.springframework.web.client.RestTemplate;
import com.limulcomp.daybydaycrm_spring.model.Client;

import java.util.List;
import java.util.Arrays;

public class ClientApi {
    RestTemplate restTemplate = new RestTemplate();
    static final String API_URL = "http://localhost:80/api/clients";

    public Client[] getAll() {
        Client[] clients = restTemplate.getForObject(API_URL, Client[].class);
        for (Client client : clients) {
            User user=new UsersApi().getById(client.getUser_id());
            client.setUser(user);
        }
        return clients;
    }

    public Client getById(int id) {
        return restTemplate.getForObject(API_URL + "/" + id, Client.class);
    }

    public long count() {
        return restTemplate.getForObject(API_URL + "/count", Long.class);
    }
}
