package com.limulcomp.daybydaycrm_spring.api;

import com.limulcomp.daybydaycrm_spring.model.Task;
import org.springframework.web.client.RestTemplate;

public class TaskApi {
    RestTemplate restTemplate = new RestTemplate();
    static final String API_URL = "http://localhost:80/api/tasks";

    public Task[] getAll() {
        Task[] tasks = restTemplate.getForObject(API_URL, Task[].class);
        return tasks;
    }

    public Task getById(int id) {
        return restTemplate.getForObject(API_URL + "/" + id, Task.class);
    }

    public long count() {
        return restTemplate.getForObject(API_URL + "/count", Long.class);
    }
}
