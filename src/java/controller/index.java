/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.productoDao;
import entity.producto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author FIA-LAB1D6
 */
@WebServlet(name = "index", urlPatterns = {"/control"})
public class index extends HttpServlet {

    productoDao aO = new productoDao();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet index</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet index at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
        PrintWriter out = response.getWriter();
        RequestDispatcher dispatcher;
        String pag;
        HttpSession session = request.getSession(true);
        HttpSession session2 = request.getSession(true);
        producto p;
        List<producto> lista = new ArrayList<>();
        lista = aO.readAll();
        int op = Integer.parseInt(request.getParameter("op"));
        if (op == 1) {
            pag = "/index.jsp";
            session.setAttribute("lista", lista);
            dispatcher = getServletContext().getRequestDispatcher(pag);
            dispatcher.forward(request, response);
        }
        if (op == 2) {
            int id = Integer.parseInt(request.getParameter("id"));
            pag = "/Edit.jsp";
            session.setAttribute("lista2", aO.read(id));
            dispatcher = getServletContext().getRequestDispatcher(pag);
            dispatcher.forward(request, response);
        }
        if (op == 3) {
            String nombre = request.getParameter("nombre");
            String desc = request.getParameter("descripcion");
            int cant = Integer.parseInt(request.getParameter("cantidad"));
            double price = Double.parseDouble(request.getParameter("precio"));
            int id1 = Integer.parseInt(request.getParameter("id"));
            p = new producto(id1, nombre, desc,cant,price);
            int y = aO.update(p);
            pag = "/control?op=1";
            dispatcher = getServletContext().getRequestDispatcher(pag);
            dispatcher.forward(request, response);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
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
