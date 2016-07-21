package test.java.servicestest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.zensar.simplecalculatordevops.services.SimpleCalculatorDevopsServices;
import com.zensar.simplecalculatordevops.services.SimpleCalculatorDevopsServicesImpl;
public class SimpleCalculatorDevopsServicesImplTest {
private SimpleCalculatorDevopsServices services;
	@Before
	public void setUp(){
	 services=new SimpleCalculatorDevopsServicesImpl();
	}
	@Test
	public void addTest(){
		Double expected=3.0;
		Assert.assertEquals(expected, services.add(1.0, 2.0));
	}
	@Test
	public void minusTest(){
		Double expected=2.0;
		Assert.assertEquals(expected, services.minus(2.0, 2.0)) ;
	}
	@Test
	public void multipyTest(){
		Double expected=4.0;
		Assert.assertEquals(expected, services.multiply(2.0, 2.0));
	}
	@Test
	public void divideTest(){
		Double expected=1.0;
		Assert.assertEquals(expected, services.divide(2.0,2.0));
	}
	@Test
	public void percentageTest(){
		Double expected=100.0;
		Assert.assertEquals(expected, services.percentage(100.0,100.0));
	}
	@Test
	public void inverseTest(){
		Double expected=0.5;
		Assert.assertEquals(expected, services.inverse(2.0));
	}
	@Test
	public void squareRootTest(){
		Double expected=2.0;
		Assert.assertEquals(expected, services.squareRoot(4.0));
	}
	@Test
	public void squareTest(){
		Double expected=4.0;
		Assert.assertEquals(expected, services.square(2.0));
	}
}
