package com.secureresume_wc.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Summary {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;


    @NotNull
    @Size(min=5)
    private String singleSummary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSingleSummary() {
        return singleSummary;
    }

    public void setSingleSummary(String singleSummary) {
        this.singleSummary = singleSummary;
    }
}
