package com.boot.txmanage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
	
	@Id
    @GeneratedValue
    private Long id;
	@Column(name = "name")
    private String name;
    @Column(name = "city")
    private String city;
 
    public Person() {
        super();
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
 
    @Override
    public String toString() {
        return "Person [pid=" + id + ", pName=" + name + ", pCity=" + city
                + "]";
    }

}
