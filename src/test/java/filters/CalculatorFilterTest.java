package test.java.filters;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

import com.zensar.simplecalculatordevops.filters.CalculatorFilter;
public class CalculatorFilterTest {
private CalculatorFilter filter = new CalculatorFilter();
private ServletRequest request;
private ServletResponse response;
private FilterChain chain;
private FilterConfig fConfig;
private Mockery context = new Mockery();
	
@Test
public void testDoFilter()throws IOException, ServletException {
	// Mockito
	 request = context.mock(HttpServletRequest.class);
	 response = context.mock(HttpServletResponse.class);
	 chain=context.mock(FilterChain.class);
	 context.checking(new Expectations() {{
		 oneOf(request).getParameter("firstNo");
		 String firstNo="1.0";
		 will(returnValue(firstNo));
		 oneOf(request).getParameter("secondNo");
		 String secondNo="2.0";
		 will(returnValue(secondNo));
		 oneOf(request).getParameter("opt");
		 String opt="plus";
		 will(returnValue(opt));
		 oneOf(request).setAttribute("firstNo",Double.parseDouble(firstNo));
		 oneOf(request).setAttribute("secondNo",Double.parseDouble(secondNo));
		 oneOf(request).setAttribute("secondNo",Double.parseDouble(secondNo));
		 oneOf(chain).doFilter(request, response);
		
	 }});
	 filter.doFilter(request, response,chain);
}
@Test
	public void testDestroy(){
		filter.destroy();
	}
	@Test
	public void testInit() throws ServletException{
		 fConfig=context.mock(FilterConfig.class);
		 filter.init(fConfig);
	}
	@Test
	public void testLoginFilter(){
		new CalculatorFilter();
	}
	


}
