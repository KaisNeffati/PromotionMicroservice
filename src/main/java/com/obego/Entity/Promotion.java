package com.obego.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Calendar;

/**
 * Created by Kais NEFFATI on 1/27/2017.
 */
@Document
public class Promotion {

    @Id
    private String id;
    private String name;
    private String partner;
    private String status ;
    private String type;
    private String description;
    private Calendar startDate;
    private Calendar endDate;

    public Promotion(){

    }

    public Promotion(String id,String name, String partner, String status, String type, String description, Calendar startDate, Calendar endDate) {
        this.id=id;
        this.name = name;
        this.partner = partner;
        this.status = status;
        this.type = type;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPartner() {
        return partner;
    }

    public String getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public Calendar getEndDate() {
        return endDate;
    }
}
