/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.organization.naturecitytours.book;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Xavier
 * 
 */
@Entity
@Table(name="pax")
public class Pax implements Serializable {
    @Id
    private String dni;
    @Column(name = "name")
    @NotEmpty
    private String name;
    @Column(name = "surname")
    @NotEmpty
    private String surname;
    @Column(name = "dob")
    @NotEmpty
    private String dob;
    @Column(name = "passport")
    @NotEmpty
    private String passport;
    @Column(name = "passportexpiry")
    @NotEmpty
    private String passportexpiry;
    @OneToMany(fetch = FetchType.LAZY,mappedBy="dnipax",cascade= CascadeType.ALL)
   // @JoinTable(name="transaction")
    private Set<Bookpax> books;
    
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getPassportexpiry() {
        return passportexpiry;
    }

    public void setPassportexpiry(String passportexpiry) {
        this.passportexpiry = passportexpiry;
    }

    
    
    
    
}
