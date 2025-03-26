package com.limulcomp.daybydaycrm_spring.api;

import com.limulcomp.daybydaycrm_spring.model.Offer;
import org.springframework.web.client.RestTemplate;

public class OfferApi {
    RestTemplate restTemplate = new RestTemplate();
    static final String API_URL = "http://localhost:80/api/offers";

    public Offer[] getAll() {
        Offer[] offers = restTemplate.getForObject(API_URL, Offer[].class);
        return offers;
    }

    public Offer getById(int id) {
        return restTemplate.getForObject(API_URL + "/" + id, Offer.class);
    }

    public long count() {
        return restTemplate.getForObject(API_URL + "/count", Long.class);
    }

    public Offer[] getInProgress(){
        Offer[] offers = restTemplate.getForObject(API_URL + "/status/progress", Offer[].class);
        return offers;
    }

    public Offer[] getWon(){
        Offer[] offers = restTemplate.getForObject(API_URL + "/status/won", Offer[].class);
        return offers;
    }

    public Offer[] getLost(){
        Offer[] offers = restTemplate.getForObject(API_URL + "/status/lost", Offer[].class);
        return offers;
    }
}
