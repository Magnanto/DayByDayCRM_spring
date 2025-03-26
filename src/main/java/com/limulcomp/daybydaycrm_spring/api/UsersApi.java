package com.limulcomp.daybydaycrm_spring.api;

import com.limulcomp.daybydaycrm_spring.model.Task;

import com.limulcomp.daybydaycrm_spring.model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import java.util.HashMap;
import java.util.Map;

@Service
public class UsersApi {

    public static final String API_URL = "http://localhost:80/api/users";
    private final RestTemplate restTemplate = new RestTemplate();

    public User getByEmail(String email) {
        String url = API_URL + "/email/" + email;
        return restTemplate.getForObject(url, User.class);
    }

    public ResponseEntity<String> login(String email, String password) {
        String url = API_URL + "/auth";
        Map<String, String> credentials = new HashMap<>();
        credentials.put("email", email);
        credentials.put("password", password);

        try {
            return restTemplate.postForEntity(url, credentials, String.class);
        } catch (HttpClientErrorException | HttpServerErrorException e) {
            return ResponseEntity.status(e.getStatusCode()).body(e.getResponseBodyAsString());
        }
    }
    public User getById(int id) {
        return restTemplate.getForObject(API_URL + "/" + id, User.class);
    }

}
