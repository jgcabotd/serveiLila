package com.esliceu.parser.model.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Professor {

    @Id
    @Column(length = 50)
    private String code;

    private String name;
    private String firstSurname;
    private String secondSurname;

    public Professor() {}

    public String getCodi() {
        return code;
    }

    public void setCodi(String code) {
        this.code = code;
    }

    public String getNom() {
        return name;
    }

    public void setNom(String name) {
        this.name = name;
    }

    public String getFirstSurname() {
        return firstSurname;
    }

    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

}