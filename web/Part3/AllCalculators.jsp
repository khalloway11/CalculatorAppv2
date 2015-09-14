<%-- 
    Document   : AllCalculators
    Created on : Sep 9, 2015, 2:44:18 PM
    Author     : Keiji
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/hs/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="row">
            <div class="container col-xs-4">
                <form id="rectangleForm" name="rectangleForm" method="POST" action="../AllCalculators?calculation=rectangle">
                    <input type="text" id="recLengthInput" name="recLength" placeholder="Enter the length"><br/>
                    <input type="text" id="recHeightInput" name="recHeight" placeholder="Enter the width"><br/>
                    <input class="btn btn-success" type="submit" value="Submit">
                </form>
            </div>
            <div class="container col-xs-4">
                <form id="circleForm" name="circleForm" method="POST" action="../AllCalculators?calculation=circle">
                    <input type="text" id="radiusInput" name="radius" placeholder="Enter the radius"><br/>
                    <input class="btn btn-success" type="submit" value="Submit">
                </form>
            </div>
            <div class="container col-xs-4">
                <form id="triangleForm" name="triangleForm" method="POST" action="../AllCalculators?calculation=triangle">
                    <input type="text" id="triLengthInput" name="triLength" placeholder="Enter the length"><br/>
                    <input type="text" id="triHeightInput" name="triHeight" placeholder="Enter the width"><br/>
                    <input class="btn btn-success" type="submit" value="Submit">
                </form>
            </div>
        </div>
        <div class="row">
            <div class="container">
                
                <h1>The area of the ${shape} is: ${area}</h1>
            </div>
        </div>

        
        
    </body>
</html>
