/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.suraj.database.entity;

import java.util.Date;

/**
 *
 * @author Suraj Sharma Phuyal
 */
public class StudentEntity {
    private int id;
    private String fname,lname;
    private int dob;
    private Date addedDate,modifiedDate;
    private int studentClass;
    private String fatherName;
    private int contact;
    private boolean status;

    public StudentEntity() {
    }

    public StudentEntity(int id, String fname, String lname, int dob, int studentClass, String fatherName, int contact, boolean status) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.studentClass = studentClass;
        this.fatherName = fatherName;
        this.contact = contact;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public int getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(int studentClass) {
        this.studentClass = studentClass;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
            
            
    
}
