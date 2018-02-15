package com.secureresume_wc.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;



    //Skill --------------------------------------------------
    @NotNull
    @Size(min=3)
    private String singleSkill;

    @NotNull
    @Min(1)
    @Max(5)
    private String level;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSingleSkill() {
        return singleSkill;
    }

    public void setSingleSkill(String singleSkill) {
        this.singleSkill = singleSkill;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
