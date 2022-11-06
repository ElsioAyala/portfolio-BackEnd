package com.portfolio.elsio.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter  @Setter
@Entity
public class Profile{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_pro;
    @Basic
    private String name;
    private String apellido;
    private String email;
    private String stack;
    @Column(columnDefinition = "text")
    private String about;
    @Column(columnDefinition = "MediumBlob")
    private String photo;
    @Column(columnDefinition = "MediumBlob")
    private String cover;


    //@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)

    //fetch = FetchType.LAZY,
    //one User To Many Education
    //@JsonIgnore
    @OneToMany( cascade = CascadeType.ALL, mappedBy = "profile")
    private Set<Education> educations = new HashSet<>();
    
    @OneToMany( mappedBy = "profile", cascade = CascadeType.ALL)
    private Set<Experience> experiences = new HashSet();
    
    @OneToMany(mappedBy = "profile", cascade = CascadeType.ALL)
    private Set<Project> projects = new HashSet();
    
    @OneToMany( mappedBy = "profile", cascade = CascadeType.ALL)
    private Set<Skills> skills = new HashSet(); 
    
    @OneToMany( mappedBy = "profile", cascade = CascadeType.ALL)
    private Set<Contact> contacts = new HashSet();
    /*private List<Contact> contacts;*/
    

    public Profile() {
    }

    public Profile(String name, String apellido, String email, String stack, String about, String photo, String cover) {
        this.name = name;
        this.apellido = apellido;
        this.email = email;
        this.stack = stack;
        this.about = about;
        this.photo = photo;
        this.cover = cover;
    }

 
}
