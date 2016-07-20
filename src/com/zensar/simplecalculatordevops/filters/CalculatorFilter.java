package com.zensar.simplecalculatordevops.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class CalculatorFilter
 */
@WebFilter("/CalculatorController")
public class CalculatorFilter implements Filter {
	public void destroy() {}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String firstNo = request.getParameter("firstNo");
        String secondNo = request.getParameter("secondNo");
        String opt = request.getParameter("opt");
        try{
        	if(opt!=null){
        		if(opt.equals("plus")||opt.equals("minus")||opt.equals("divide")||opt.equals("multiply")||opt.equals("percentage")){
            		if(firstNo==""||secondNo==""){
                		request.setAttribute("firstNo", firstNo);
                        request.setAttribute("secondNo",secondNo);
                    	request.setAttribute("errorMessage", "Text box Left Empty");
                    	request.getRequestDispatcher("calculatorPage.jsp").forward(request, response);
                    }else{
                    	request.setAttribute("firstNo",Double.parseDouble(firstNo));
                        request.setAttribute("secondNo", Double.parseDouble(secondNo));
                        chain.doFilter(request, response);            
                    }	
            	}else if(opt.equals("square")||opt.equals("inverse")||opt.equals("squareRoot")){
            		if(firstNo==""){
                		request.setAttribute("firstNo", firstNo);
                        request.setAttribute("errorMessage", "Number 1 field Left Empty");
                    	request.getRequestDispatcher("calculatorPage.jsp").forward(request, response);
                    }else if(secondNo!=""){
                    	request.setAttribute("firstNo", firstNo);
                    	request.setAttribute("errorMessage", "Number 2 Field should be Left Empty for operations==> x*x , 1/x ,_/x");
                    	request.getRequestDispatcher("calculatorPage.jsp").forward(request, response);
                    }else{
                    	request.setAttribute("firstNo",Double.parseDouble(firstNo));
                        chain.doFilter(request, response);            
                    }	
            	}
        	}
        	
        	
        }catch(java.lang.NumberFormatException e){
        	request.setAttribute("firstNo", firstNo);
            request.setAttribute("secondNo",secondNo);
        	request.setAttribute("errorMessage", "Only numeral values allowed");
        	request.getRequestDispatcher("calculatorPage.jsp").forward(request, response);
        }
        
        
		
	}
	public void init(FilterConfig fConfig) throws ServletException {}

}
