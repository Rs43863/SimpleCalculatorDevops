package com.zensar.calculatordevops.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CalculatorController
 */
@WebServlet("/CalculatorController")
public class CalculatorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /*public CalculatorController() { super();  }*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String n1 = request.getParameter("no1");
         String n2 = request.getParameter("no2");
         String opt = request.getParameter("opt");
         HttpSession session = request.getSession();
         if(opt.equals("plus"))
                 session.setAttribute("result", Integer.parseInt(n1) + Integer.parseInt(n2));
         else if(opt.equals("minus"))
        	     session.setAttribute("result", Integer.parseInt(n1) - Integer.parseInt(n2));
         request.getRequestDispatcher("calculatorPage.jsp").forward(request, response);
	}

}
