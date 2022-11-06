package com.portfolio.elsio.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.CascadeType;
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
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_pro;
    private String name;
    private String summary;
    private String repository;
    private String demo;
    @Column(columnDefinition = "MediumBlob")
    private String image;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Profile profile;

    public Project() {
    }

    public Project(int id_pro, String name, String summary, String repository, String demo, String image, Profile profile) {
        this.id_pro = id_pro;
        this.name = name;
        this.summary = summary;
        this.repository = repository;
        this.demo = demo;
        this.image = image;
        this.profile = profile;
    }
    
    
}
