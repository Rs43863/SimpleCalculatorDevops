<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html> <h1 align="center">
Welcome to our Devops Training !!
</h1>
        <body> <div align="center">
                <form  name="calculatorForm" method="post" action="CalculatorController">
                        Number 1 : <input type="text" name="firstNo" value="${result}${firstNo}"> <br>
                        Number 2 : <input type="text" name="secondNo" value="${secondNo}"> <br> 
                        Operator : 
                        
                        <select name="opt" onchange="document.calculatorForm.submit()">
	                        	<option value="">Select Operation</option>	
                                <option value="plus"> + </option>
                                <option value="minus"> - </option>
                                <option value="multiply"> * </option>
                                <option value="divide"> / </option>
                                <option value="percentage"> % </option>
                                <option value="square"> x*x </option>
                                <option value="inverse"> 1/x </option>
								<option value="squareRoot"> _/x </option>                                                                                                                                
                        </select>
                                
                        <br>
                        <c:if test="${not empty result}">
                        Result : <label>${result}</label> <br>
                        </c:if>
                        	<c:if test="${not empty errorMessage}">
                        	 <label>${errorMessage}</label><br>
                        	</c:if>	
                </form>
                </div>
        </body>
</html>