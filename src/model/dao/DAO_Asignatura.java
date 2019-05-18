/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Asignatura;
import model.Conexion;
import model.Nota;

/**
 *
 * @author Cheloz
 */
public class DAO_Asignatura extends Conexion implements DAO <Asignatura>{

    public DAO_Asignatura() throws ClassNotFoundException, SQLException {
        super("simuladorDeNotasBD");
    }

    @Override
    public void create(Asignatura obj) throws SQLException {
       ejecutar("INSERT INTO Asingatura VALUES (NULL, "+obj.getNombre()+");");
       
    }

    @Override
    public List<Asignatura> read() throws SQLException {
        List<Asignatura> lista= new ArrayList<Asignatura>();
        ResultSet rs=ejecutar("SELECT * FROM Asignatura");
        
        Asignatura a=null;
       while(rs.next()){
           a= new Asignatura();
           a.setId(rs.getInt(1));
           a.setNombre(rs.getString(2));
           lista.add(a);
           
       }
        
        close();
        return lista;
    }

    @Override
    public void update(Asignatura obj) throws SQLException {
       ejecutar("UPDATE Asignatura SET nombre="+obj.getNombre()+" id= WHERE id="+obj.getId()+"");
        
    }

    @Override
    public void delete(int id) throws SQLException {
         ejecutar("DELETE * FROM Asignatura WHERE id="+id+"");
    }

    @Override
    public Asignatura findById(int id) throws SQLException {   
        ResultSet rs=ejecutar("SELECT * FROM Asignatura WHERE id="+id+" ");
        
       Asignatura a=null;
       while(rs.next()){
           a= new Asignatura();
           a.setId(rs.getInt(1));
           a.setNombre(rs.getString(2));          
       }     
        close();
        return a;
        
    }

    
    public float getPromedioDeLaAsignatura(int id) throws SQLException{
       ResultSet rs=ejecutar("SELECT valor, porcentaje FROM nota WHERE asignatura_fk="+id+" ");
        
       float promedio=0;
      
       while(rs.next()){
       
           promedio= promedio + ((((rs.getInt(1))*(rs.getInt(2))))/100);
              
       }     
        close();
        return promedio;
        
    }
    

}
