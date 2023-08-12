<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.digit.JavaTraining.Model.Aadhar"
    import="org.hibernate.Session"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your Details</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-image: url("/Aadhar_Hibernate/1.jpg");
      	background-size: cover;
      	background-position: center;
        margin: 0;
        padding: 0;
    }
    .container {
        max-width: 800px;
        margin: 0 auto;
        padding: 20px;
        vertical-align: middle;
        background-color: #fff;
        box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        border-radius: 5px;
    }
    h1 {
        color: #333;
    }
    p {
        color: #555;
    }
    
    @keyframes fadeIn {
        from { opacity: 0; }
        to { opacity: 1; }
    }
    .fade-in {
        animation: fadeIn 1s ease-in-out;
    }
</style>
</head>
<body>
<%
session = request.getSession();

Aadhar a = (Aadhar) session.getAttribute("curuser");
session = request.getSession();

%>
<div class="container fade-in">
    <h1>Your Details:</h1>
    <p>Aadhar Number: <%=a.getAadharNumber()%></p>
    <p>Name: <%=a.getName()%></p>
    <p>Email: <%=a.getEmail()%></p>
    <p>Phone Number: <%=a.getPhone()%></p>
    <p>Address Line: <%=a.getAddress()%></p>
    <p>City: <%=a.getCity()%></p>
    <p>State: <%=a.getState()%></p>
    <p>PinCode: <%=a.getPinCode()%></p>
</div>
</body>
</html>