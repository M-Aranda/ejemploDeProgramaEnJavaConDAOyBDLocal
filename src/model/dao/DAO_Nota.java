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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Asignatura;
import model.Conexion;
import model.Nota;

/**
 *
 * @author Cheloz
 */
public class DAO_Nota extends Conexion implements DAO <Nota>{

    public DAO_Nota() throws ClassNotFoundException, SQLException {
        super("simuladorDeNotasBD");
    }

    @Override
    public void create(Nota obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Nota> read() throws SQLException {
        List<Nota> notas = new ArrayList<>();
        ResultSet rs =ejecutar("SELECT * FROM Nota;");
        
        Nota n=null;
        while(rs.next()){
            try {
                n= new Nota();
                n.setId(rs.getInt(1));
                n.setValor(rs.getInt(2));
                n.setPorcentaje(rs.getInt(3));
                
                
                DAO_Asignatura da= new DAO_Asignatura();
                Asignatura a= da.findById(rs.getInt(4));
                n.setAsig(a);
                
                notas.add(n);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DAO_Nota.class.getName()).log(Level.SEVERE, null, ex);
            }               
            
        }
    
        close();
        return notas;
        
    }

    @Override
    public void update(Nota obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Nota findById(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

    
}
