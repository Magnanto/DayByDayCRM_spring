package com.limulcomp.daybydaycrm_spring.api;

import com.limulcomp.daybydaycrm_spring.model.Remise;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RemiseApi {
    RestTemplate restTemplate = new RestTemplate();
    static final String API_URL = "http://localhost:80/api/remises";

    public Remise getRemise(){
        return restTemplate.getForObject(API_URL , Remise.class);
    }

    public ResponseEntity<String> updateRemise(double discount) {
        String url = API_URL + "/update";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");

        // Ensure the request body matches the expected format
        String requestBody = "{\"discount\": " + discount + "}";
        HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);

        return restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
    }
}
