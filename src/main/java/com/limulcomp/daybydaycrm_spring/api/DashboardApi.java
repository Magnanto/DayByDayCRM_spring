package com.limulcomp.daybydaycrm_spring.api;

import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import java.util.Map;

public class DashboardApi {
    public static final String API_URL = "http://localhost:80/api/dashboard";
    private final RestTemplate restTemplate = new RestTemplate();

    public Map<String, Object> getTotals() {
        String url = API_URL; // Assurez-vous que l'URL correspond à votre route Laravel
        ResponseEntity<Map> response = restTemplate.getForEntity(url, Map.class);
        return response.getBody();
    }
}

