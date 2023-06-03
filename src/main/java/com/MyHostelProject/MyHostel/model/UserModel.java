package com.MyHostelProject.MyHostel.model;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "UserTable")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;
    @Column(name = "userName")
    @Size(min = 3)
    private String name;

    @NotBlank
    private String gender;

    @Email
    private String email;

    @Past
    private LocalDate dateOfBerth;

    @Size(min = 10 , max = 10)
    private String contact;

    @Transient
    private List<Rating> ratingList = new ArrayList<>();


    public UserModel(){

    }

    public UserModel(String name, String gender, String email, LocalDate dateOfBerth, String contact,List<Rating> ratingList ){
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.dateOfBerth = dateOfBerth;
        this.contact = contact;
        this.ratingList = ratingList;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public LocalDate getDateOfBerth(){
        return dateOfBerth;
    }

    public void setDateOfBerth(LocalDate dateOfBerth){
        this.dateOfBerth = dateOfBerth;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<Rating> getRatingList() {
        return ratingList;
    }

    public void setRatingList(List<Rating> ratingList) {
        this.ratingList = ratingList;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBerth=" + dateOfBerth +
                ", contact='" + contact + '\'' +
                ", ratingList=" + ratingList +
                '}';
    }
}
