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
public class Education{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_edu;
    private String school;
    private String title;
    private String period;
    @Column(columnDefinition = "MediumBlob")
    private String image;
    //Many EDUCATION To One USER
    //@JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Profile profile;

    public Education() {
    }

    public Education(int id_edu, String school, String title, String period, String image, Profile profile) {
        this.id_edu = id_edu;
        this.school = school;
        this.title = title;
        this.period = period;
        this.image = image;
        this.profile = profile;
    }

   

   
    
    
    
    

    
    
    
    
}
