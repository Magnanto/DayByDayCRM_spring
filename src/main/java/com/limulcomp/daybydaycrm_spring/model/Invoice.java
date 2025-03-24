package com.limulcomp.daybydaycrm_spring.model;

import java.time.LocalDateTime;

public class Invoice {
    int id;
    String external_id;
    String status;
    Integer invoice_number;
    LocalDateTime sent_at;
    LocalDateTime due_at;
    Integer integration_type;
    String source_type;
    Integer source_id;
    Integer client_id;
    Integer offer_id;
    LocalDateTime deleted_at;
    LocalDateTime created_at;
    LocalDateTime updated_at;

    public Invoice() {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getInvoice_number() {
        return invoice_number;
    }

    public void setInvoice_number(Integer invoice_number) {
        this.invoice_number = invoice_number;
    }

    public LocalDateTime getSent_at() {
        return sent_at;
    }

    public void setSent_at(LocalDateTime sent_at) {
        this.sent_at = sent_at;
    }

    public LocalDateTime getDue_at() {
        return due_at;
    }

    public void setDue_at(LocalDateTime due_at) {
        this.due_at = due_at;
    }

    public Integer getIntegration_type() {
        return integration_type;
    }

    public void setIntegration_type(Integer integration_type) {
        this.integration_type = integration_type;
    }

    public String getSource_type() {
        return source_type;
    }

    public void setSource_type(String source_type) {
        this.source_type = source_type;
    }

    public Integer getSource_id() {
        return source_id;
    }

    public void setSource_id(Integer source_id) {
        this.source_id = source_id;
    }

    public Integer getClient_id() {
        return client_id;
    }

    public void setClient_id(Integer client_id) {
        this.client_id = client_id;
    }

    public Integer getOffer_id() {
        return offer_id;
    }

    public void setOffer_id(Integer offer_id) {
        this.offer_id = offer_id;
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
