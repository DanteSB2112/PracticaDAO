/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrysi.selvels;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mrysi.beans.Escuela;


public class ServletEscuelas extends HttpServlet {
    
    Connection connect;
    Statement statement; 
    ResultSet resultSet;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
    try{
        Class.forName("com.mysql.jdbc.Driver");

        String URL="jdbc:mysql://localhost/mrysi?user=root&password=123456";

        connect = DriverManager.getConnection (URL);
        statement = connect.createStatement();

        request.setAttribute("ListaEscuelas", getListaEscuelas ());

        connect.close();

     }catch(SQLException ex) {
         System.out.println(ex);
     } catch(ClassNotFoundException e) {
         System.out.println(e);
     }
    }

    public List<Escuela> getListaEscuelas () throws SQLException{ 
    String query = "SELECT * from Escuelas";
    resultSet = statement.executeQuery (query);

    List<Escuela> Escuelas = new ArrayList<>(); 
    Escuela escuela;
    while (resultSet.next()) { 
        escuela = new Escuela();
        escuela.setClaveEscuela(resultSet.getString(1)); 
        escuela.setNombreEscuela(resultSet.getString(2)); 
        escuela.setDomicilio(resultSet.getString(3)); 
        escuela.setCodigoPostal(resultSet.getInt(4)); 
        escuela.setTurno(resultSet.getString(5)); 
        escuela.setIdLocalidad(resultSet.getInt(6)); 
        Escuelas.add(escuela);
    }
    return Escuelas;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // processRequest(request, response);
    }


    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
