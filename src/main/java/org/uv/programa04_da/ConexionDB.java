/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa04_da;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emili
 */
public class ConexionDB {

    private static ConexionDB cx = null;
    public static ConexionDB getInstance() {
        if (cx == null) {
            cx = new ConexionDB();
        }
        return cx;
    }

    private Connection con=null;
    private ConexionDB(){
        try {
            String url="jdbc:postgresql://localhost:5432/practica_3";
            con =DriverManager.getConnection(url,"Totita123.","postgres");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     

    public boolean execute(String sql) {
        return true;
    }

    public boolean execute(TransaccionDB tdb) { //Execute metodo sobrecargado.
        return tdb.execute(con); //Desencadena la funcionalidad de execute.
    }

}
