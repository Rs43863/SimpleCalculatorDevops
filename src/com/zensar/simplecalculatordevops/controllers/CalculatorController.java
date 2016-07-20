package com.zensar.simplecalculatordevops.controllers;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zensar.simplecalculatordevops.services.SimpleCalculatorDevopsServices;
import com.zensar.simplecalculatordevops.services.SimpleCalculatorDevopsServicesImpl;

/**
 * Servlet implementation class CalculatorController
 */
@WebServlet("/CalculatorController")
public class CalculatorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /*public CalculatorController() { super();  }*/
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SimpleCalculatorDevopsServices services = new SimpleCalculatorDevopsServicesImpl() ;
		 Double firstNo=(Double)request.getAttribute("firstNo");
		 Double secondNo=(Double)request.getAttribute("secondNo");
		 String opt = request.getParameter("opt");
         /*HttpSession session = request.getSession();*/
         if(opt.equals("plus")){
        	 request.setAttribute("result", services.add(firstNo ,secondNo));
         }else if(opt.equals("minus")){
        	 request.setAttribute("result", services.minus(firstNo ,secondNo));
         }else if(opt.equals("multiply")){
        	 request.setAttribute("result", services.multiply(firstNo ,secondNo));
         }else if(opt.equals("divide")){
        	 request.setAttribute("result", services.divide(firstNo ,secondNo));
         }else if(opt.equals("percentage")){
        	 request.setAttribute("result", services.percentage(firstNo ,secondNo));
         }else if(opt.equals("square")){
        	 request.setAttribute("result", services.square(firstNo));
         }else if(opt.equals("inverse")){
        	 request.setAttribute("result", services.inverse(firstNo));
         }else if(opt.equals("squareRoot")){
        	 request.setAttribute("result", services.squareRoot(firstNo));
         }
         request.removeAttribute("firstNo");request.removeAttribute("secondNo");
        
        request.getRequestDispatcher("calculatorPage.jsp").forward(request, response);
	}

}
