<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html> <h1>
Welcome to our Devops Training !!
</h1>
        <body>
                <form method="post" action="CalculatorController">
                        Number 1 : <input type="text" name="no1"> <br>
                        Number 2 : <input type="text" name="no2"> <br> 
                        Operator : 
                        
                        <select name="opt">
                                <option value="plus"> + </option>
                                <option value="minus"> - </option>
                                <option value="multiply"> * </option>
                                <option value="divide"> / </option>
                                                                                                                                
                        </select>
                                
                        <br>
                        Result : <label>${sessionScope.result}</label> <br>
                        <input type="submit" value="Go">
                </form>
        </body>
</html>