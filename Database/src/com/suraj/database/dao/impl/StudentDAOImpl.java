/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.suraj.database.dao.impl;

import com.suraj.database.constant.SQLConstant;
import com.suraj.database.dao.StudentDAO;
import com.suraj.database.dbutil.DbConnection;
import com.suraj.database.entity.StudentEntity;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Suraj Sharma Phuyal
 */
public class StudentDAOImpl implements StudentDAO {
    private DbConnection db= new DbConnection();
    @Override
    public int insert(StudentEntity s) throws ClassNotFoundException, SQLException {
       db.open();
        PreparedStatement stmt= db.initStatment(SQLConstant.INSERT_STUDENT);
        stmt.setString(1, s.getFname());
        stmt.setString(2, s.getLname());
        stmt.setInt(3, s.getDob());
        stmt.setInt(4, s.getStudentClass());
        stmt.setString(5, s.getFatherName());
        stmt.setInt(6, s.getContact());
        stmt.setBoolean(7, s.isStatus());
        int result=db.executeUpdate();
        db.close();
        return result;
        
    }
    
}
