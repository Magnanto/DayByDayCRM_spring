package com.limulcomp.daybydaycrm_spring.model;

public class User {
    String external_id;
    String name;
    String email;
    String password;
    String address;
    String primary_number;
    String secondary_number;
    String image_path;
    String language;

    public User() {
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrimary_number() {
        return primary_number;
    }

    public void setPrimary_number(String primary_number) {
        this.primary_number = primary_number;
    }

    public String getSecondary_number() {
        return secondary_number;
    }

    public void setSecondary_number(String secondary_number) {
        this.secondary_number = secondary_number;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
