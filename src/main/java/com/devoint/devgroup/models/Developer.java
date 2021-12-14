package com.devoint.devgroup.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Developer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String devTitle;
    private String phone;
    private String imgUrl;

    public Developer(String name, String email, String devTitle, String phone, String imgUrl, String devCode) {
        this.name = name;
        email = email;
        this.devTitle = devTitle;
        this.phone = phone;
        this.imgUrl = imgUrl;
        this.devCode = devCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDevTitle() {
        return devTitle;
    }

    public String getPhone() {
        return phone;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getDevCode() {
        return devCode;
    }

    public void setDevTitle(String devTitle) {
        this.devTitle = devTitle;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setDevCode(String devCode) {
        this.devCode = devCode;
    }

    @Column(nullable = false, updatable = false)
    private String devCode;


    @Override
    public String toString(){
       return "Developer{" +
               "id=" + id +", name='" + name + '\'' +
               ", email='" + email + '\'' +
               ", devTitle='" + devTitle + '\'' +
               ", phone='" + phone + '\'' +
               ", imgUrl='" + imgUrl + '\'' + '}';
    }
}

