/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.suraj.database.dao;

import com.suraj.database.entity.StudentEntity;
import java.sql.SQLException;

/**
 *
 * @author Suraj Sharma Phuyal
 */
public interface StudentDAO {
    int insert(StudentEntity s)throws ClassNotFoundException,SQLException;
}
