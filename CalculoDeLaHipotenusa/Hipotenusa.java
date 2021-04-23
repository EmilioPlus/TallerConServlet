/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.calculodelahipotenusa;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@WebServlet("/hipotenusa")
public class Hipotenusa extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException{
        int Cat1 = Integer.parseInt(peticion.getParameter("Nu1"));
        int Cat2 = Integer.parseInt(peticion.getParameter("Nu2"));
        double Resultado = Math.sqrt((Math.pow(Cat1, 2))+(Math.pow(Cat2, 2)));
        PrintWriter salida = respuesta.getWriter();
        salida.println("<!DOCTYPE html>");
        salida.println("<html lang='es'>");
        salida.println("<head>");
        salida.println("<title>Al Cubo</title>");
        salida.println("</head>");
        salida.println("<body>");
        salida.println("<p>El Calculo de la Hopotenusa es:</p>");
        salida.println(""+Resultado+"");
        salida.println("<h1><strong>Numero al cubo </strong></h1>");
        salida.println("<p><a href=\"index.html\">Indes relativo</a></p>");
        salida.println("</body>");
        salida.println("</html>");
           
    }
}
