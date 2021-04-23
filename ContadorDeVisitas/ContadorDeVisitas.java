/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.contadordevisitas;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@WebServlet("/ContodaroVisitas")
public class ContadorDeVisitas extends HttpServlet {
      @Override
    public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException{
        Integer sesion = 0;
        PrintWriter salida = respuesta.getWriter();
        HttpSession miSesion = peticion.getSession();
        
        sesion = (Integer)miSesion.getAttribute("Vista");
        if (sesion == null){
            sesion = 0;
        }
        salida.println("<!DOCTYPE html>");
        salida.println("<html lang='es'>");
        salida.println("<head>");
        salida.println("<title>Al Cubo</title>");
        salida.println("</head>");
        salida.println("<body>");
        salida.println("<h1><strong>Numero al cubo </strong></h1>");
        salida.println("<p>Las vistas de la sesion son:" +sesion+"</p>");
        salida.println("<p><a href=\"index.html\">Indes relativo</a></p>");
        salida.println("</form>");
        salida.println("</body>");
        salida.println("</html>");
        sesion++;
        miSesion.setAttribute("Vista", sesion);
           
    }

}
