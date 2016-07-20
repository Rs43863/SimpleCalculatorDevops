package test.java.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

import com.zensar.simplecalculatordevops.controllers.CalculatorController;


public class CalculatorControllerTest {
	private CalculatorController controller = new CalculatorController();
	private HttpServletRequest request;
	private HttpServletResponse response;
	private Mockery context = new Mockery();
	@Test
	public void doPostTest() throws ServletException, IOException{
		 request = context.mock(HttpServletRequest.class);
		 response = context.mock(HttpServletResponse.class);
		 context.checking(new Expectations() {{
			 oneOf(request).getAttribute("firstNo");
			 Double firstNo=1.0;
			 will(returnValue(firstNo));
			 oneOf(request).getAttribute("secondNo");
			 Double secondNo=2.0;
			 will(returnValue(secondNo));
			 oneOf(request).getParameter("opt");
			 will(returnValue("plus"));
			 Double result=3.0;
			 oneOf(request).setAttribute("result",result);
			 oneOf(request).removeAttribute("firstNo");
			 oneOf(request).removeAttribute("secondNo");
			 oneOf(request).getRequestDispatcher("calculatorPage.jsp").forward(request, response);
			 
		 }});
		 controller.doPost(request, response);
	}
	
}
