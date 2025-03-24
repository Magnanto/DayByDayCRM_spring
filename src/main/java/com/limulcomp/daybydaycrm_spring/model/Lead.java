package com.limulcomp.daybydaycrm_spring.model;

import java.time.LocalDateTime;

public class Lead {
    int id;
    String external_id;
    String title;
    String description;
    Integer status_id;
    Integer user_assigned_id;
    Integer client_id;
    Integer user_created_id;
    Integer qualified;
    String result;
    LocalDateTime deadline;
    LocalDateTime deleted_at;
    LocalDateTime created_at;
    LocalDateTime updated_at;

    public Lead() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus_id() {
        return status_id;
    }

    public void setStatus_id(Integer status_id) {
        this.status_id = status_id;
    }

    public Integer getUser_assigned_id() {
        return user_assigned_id;
    }

    public void setUser_assigned_id(Integer user_assigned_id) {
        this.user_assigned_id = user_assigned_id;
    }

    public Integer getClient_id() {
        return client_id;
    }

    public void setClient_id(Integer client_id) {
        this.client_id = client_id;
    }

    public Integer getUser_created_id() {
        return user_created_id;
    }

    public void setUser_created_id(Integer user_created_id) {
        this.user_created_id = user_created_id;
    }

    public Integer getQualified() {
        return qualified;
    }

    public void setQualified(Integer qualified) {
        this.qualified = qualified;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public LocalDateTime getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(LocalDateTime deleted_at) {
        this.deleted_at = deleted_at;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }
}
