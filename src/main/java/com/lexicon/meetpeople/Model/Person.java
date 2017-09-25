/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lexicon.meetpeople.Model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;



@Entity
public class Person implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    
    private String name;
    private LocalDate birthDate;
    private Gender  gender;
    
    private int lookingForMinAge;
    private int lookingForMaxAge;
   
    
    
    @ManyToMany
    @JoinTable(name = "Perons_Interrests")
    private Set<Interrests> interrests;
    public Set<Interrests> getInterrests()
    {
        return interrests;
    }
    public void setInterrests(Set<Interrests> interrestses)
    {
        this.interrests=interrestses;
    }
    
        
    public Person(String name, LocalDate birthDate, Gender gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lexicon.meetpeople.Model.Person[ id=" + id + " ]";
    }

   

    public int getLookingForMinAge() {
        return lookingForMinAge;
    }

    public void setLookingForMinAge(int lookingForMinAge) {
        this.lookingForMinAge = lookingForMinAge;
    }

    public int getLookingForMaxAge() {
        return lookingForMaxAge;
    }

    public void setLookingForMaxAge(int lookingForMaxAge) {
        this.lookingForMaxAge = lookingForMaxAge;
    }

  
    
}
