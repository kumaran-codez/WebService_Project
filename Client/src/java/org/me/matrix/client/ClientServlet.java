/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.matrix.client;

import Jama.Matrix;
import Jama.Matrix;
import java.io.*;
import javax.annotation.Resource;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.WebServiceRef;
import webservice.MatrixoperationsWS;
import webservice.MatrixoperationsWS_Service;

/**
 *
 * @author kumaranramanujam
 */
@WebServlet(name = "ClientServlet", urlPatterns = {"/ClientServlet"})
public class ClientServlet extends HttpServlet {
   

    @WebServiceRef(wsdlLocation = "http://localhost:8080/MP3Part1/MatrixoperationsWS?wsdl")
    public MatrixoperationsWS_Service service;
    
    @Resource
    protected WebServiceContext context;

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<h2>Servlet ClientServlet at " + request.getContextPath() + "</h2>");

            final int DIMENSION = 4;
            
            webservice.MatrixoperationsWS port = service.getMatrixoperationsWSPort();

            //Matrix template = new Matrix(DIMENSION, DIMENSION);
            Matrix a = Matrix.random(DIMENSION, DIMENSION);
            //a.print(out, 10, 2);
            Matrix b = Matrix.random(DIMENSION, DIMENSION);
            //b.print(out, 10, 2);

            double[][] dArrayA = a.getArrayCopy();
            double[][] dArrayB = b.getArrayCopy();

            StringBuilder sbA = new StringBuilder();

            for (int row = 0; row < DIMENSION; row++) {
                for (int col = 0; col < DIMENSION; col++) {
                    if (col == (DIMENSION - 1) && row == (DIMENSION - 1)) {
                        sbA.append(dArrayA[row][col]);
                    } else {
                        sbA.append(dArrayA[row][col]).append(",");
                    }
                }
            }

            StringBuilder sbB = new StringBuilder();

            for (int row = 0; row < DIMENSION; row++) {
                for (int col = 0; col < DIMENSION; col++) {
                    if (col == (DIMENSION - 1) && row == (DIMENSION - 1)) {
                        sbB.append(dArrayB[row][col]);
                    } else {
                        sbB.append(dArrayB[row][col]).append(",");
                    }
                }
            }

            //out.println("a: " + sbA.toString());
            //out.println("b: " + sbB.toString());
            //out.flush();

            String c = "";
            if (request.getParameter("Operation").equals("add"))  {
                c = port.add(sbA.toString(), sbB.toString());
            } 
            else if (request.getParameter("Operation").equals("subtract"))  {
                c = port.subtract(sbA.toString(), sbB.toString());
            }
            else if (request.getParameter("Operation").equals("multiply"))  {
                c = port.multiply(sbA.toString(), sbB.toString());
            }
             else if (request.getParameter("Operation").equals("divideL"))  {
                c = port.divideL(sbA.toString(), sbB.toString());
            }
            else if (request.getParameter("Operation").equals("divideR"))  {
                c = port.divideR(sbA.toString(), sbB.toString());
            }
            out.println("<br/>");
            out.println("Result:");
            out.println("" + sbA.toString() + " + " + sbB.toString() + " = " + c);
            ((Closeable) port).close();

        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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