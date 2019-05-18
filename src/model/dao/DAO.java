/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author Cheloz
 */
public interface DAO <T> {
    
    public void create(T obj) throws SQLException;
    public List<T> read() throws SQLException;
    public void update(T obj) throws SQLException;
    public void delete(int id) throws SQLException;
    
    public T findById(int id) throws SQLException;
}
