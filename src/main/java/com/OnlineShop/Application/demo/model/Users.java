package com.OnlineShop.Application.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "user")
public class Users {

    @Column(name = "AccountType")
    private String AccountType;

    @Column(name = "Name")
    private  String Name;

    @Column(name = "Email Id")
    private  String EmailId;

    @Column(name = "Password")
    private String Password;

    @Column(name = "Address")
    private  String Address;

    @Column(name = "Mobile Number")
    private  String MobileNo;


    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String emailId) {
        EmailId = emailId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }



}
