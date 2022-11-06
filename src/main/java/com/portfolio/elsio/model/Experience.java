package com.portfolio.elsio.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_exp;
    private String position;
    private String company;
    private String workday;
    private String timeElapsed;
    private String place;
    @Column(columnDefinition = "MediumBlob")
    private String image;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Profile profile;

    public Experience() {
    }

    public Experience(int id_exp, String position, String company, String workday, String timeElapsed, String place, String image, Profile profile) {
        this.id_exp = id_exp;
        this.position = position;
        this.company = company;
        this.workday = workday;
        this.timeElapsed = timeElapsed;
        this.place = place;
        this.image = image;
        this.profile = profile;
    }

   
    
    
}
