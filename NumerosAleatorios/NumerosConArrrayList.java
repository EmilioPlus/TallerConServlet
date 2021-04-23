/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.numerosaleatorios;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@WebServlet("/ArrayList")
public class NumerosConArrrayList  extends HttpServlet {
    private  double[] arrayList;
    @Override
    public void init(){
        arrayList = new  double[10];
        arrayList[0] = 2.3;
        arrayList[1] = 3.5;
        arrayList[2] = 20.5;
        arrayList[3] = 2.3;
        arrayList[4]= 55.2;
        arrayList[5]= 2.74;
        arrayList[6]= 2.36;
        arrayList[7]= 2.0;
        arrayList[8]= 2.414;
        arrayList[9]= 2.2358;
        
        
        
    }
     @Override
    public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException{
        PrintWriter salida = respuesta.getWriter();
        salida.println("<!DOCTYPE html>");
        salida.println("<html lang='es'>");
        salida.println("<head>");
        salida.println("<title>Al Cubo</title>");
        salida.println("</head>");
        salida.println("<body>");
        salida.println("<h1><strong>Numero al cubo </strong></h1>");
        salida.println("<p><a href=\"index.html\">Indes relativo</a></p>");
        salida.println("</form>");
        salida.println("</body>");
        salida.println("<p>"+(arrayList[5]+55)+"</p>"); 
        salida.println("<p>"+(arrayList[0]+529.99)+"</p>");  
        salida.println("<p>"+(arrayList[8]+55)+"</p>");  
        salida.println("<p>"+(arrayList[1]+85.6)+"</p>");  
        salida.println("<p>"+(arrayList[9]+58.66)+"</p>");  
        salida.println("<p>"+(arrayList[7]+25.3)+"</p>");  
        salida.println("<p>"+(arrayList[2]+025)+"</p>");  
        salida.println("<p>"+(arrayList[6]+88)+"</p>");  
        salida.println("<p>"+(arrayList[3]+58)+"</p>");  
        salida.println("<p>"+(arrayList[4]+5)+"</p>");  
        
           
    }
}
