package com.portfolio.elsio.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author elsio
 */
@Getter @Setter
@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_cont;
    private String name;
    private String icon;
    private String link;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Profile profile;

    public Contact() {
    }
    

    public Contact(int id_cont, String name, String icon, String link, Profile profile) {
        this.id_cont = id_cont;
        this.name = name;
        this.icon = icon;
        this.link = link;
        this.profile = profile;
    }
    
}
