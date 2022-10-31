package edu.adultproject.student.domain;

import javax.persistence.*;
import java.time.LocalDate;

@MappedSuperclass
public class Person {
//    @Id
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
//    @Column(name="")
//    private Long personId;
    private String surName;
    private String givenName;
    private String patronymic;
    private LocalDate dateOfBirth;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
