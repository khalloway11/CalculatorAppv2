package calculatorController;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Models.CalculatorService;
import Models.TriangleCalcService;
import Models.CircleCalcService;
import Models.RectangleCalcService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Keiji
 */
@WebServlet(name = "AllCalculatorsController", urlPatterns = {"/AllCalculators"})
public class AllCalculatorsController extends HttpServlet {
    private static final String RESULT_PAGE = "/Part3/AllCalculators.jsp";
    private CalculatorService calc;

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
        RequestDispatcher view = request.getRequestDispatcher(RESULT_PAGE);
        double area = 0;
        String shape = "";
        
        try{
            shape = request.getParameter("calculation");
            switch(shape){
                case "rectangle":
                    String lengthStr = request.getParameter("recLength");
                    String heightStr = request.getParameter("recHeight");
                    if(lengthStr != null && heightStr != null){
                        double length = Double.parseDouble(lengthStr);
                        double height = Double.parseDouble(heightStr);
                        calc = new RectangleCalcService(length, height);
                    }
                    break;
                case "circle":
                    String radiusStr = request.getParameter("radius");
                    if(radiusStr != null){
                        double radius = Double.parseDouble(radiusStr);
                        calc = new CircleCalcService(radius);
                    }
                    break;
                case "triangle":
                    String triLengthStr = request.getParameter("triLength");
                    String triHeightStr = request.getParameter("triHeight");
                    if(triLengthStr != null && triHeightStr != null){
                        double length = Double.parseDouble(triLengthStr);
                        double height = Double.parseDouble(triHeightStr);
                        calc = new TriangleCalcService(length, height);
                    }
                    break;
            }
            area = calc.calculateArea();
        } catch(Exception e){
            shape = "";
            area = 0;
        }

        request.setAttribute("shape", shape);
        request.setAttribute("area", area);
        
        view.forward(request, response);
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
