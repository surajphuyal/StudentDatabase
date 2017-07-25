/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.suraj.database.constant;
/**
 *
 * @author Suraj Sharma Phuyal
 */
public class SQLConstant {
    public static final String INSERT_STUDENT=" INSERT INTO"+ TableConstant.STUDENT_TABLE+ "(student_fname, student_lname,dob,student_class,father_name,contact_no,status) VALUES(?,?,?,?,?,?,?)";
}
