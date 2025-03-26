package com.limulcomp.daybydaycrm_spring.controllers;

import com.limulcomp.daybydaycrm_spring.api.TaskApi;
import com.limulcomp.daybydaycrm_spring.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {
    TaskApi taskApi = new TaskApi();

    @GetMapping("/tasks")
    public String tasks(Model model) {
        Task[] tasks = taskApi.getAll();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }
}
