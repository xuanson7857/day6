<%--<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>JSP - Hello World</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1><%= "Hello World!" %>--%>
<%--</h1>--%>
<%--<br/>--%>
<%--<a href="hello-servlet">Hello Servlet</a>--%>
<%--</body>--%>
<%--</html>--%>

<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Currency Converter</title>--%>
<%--    <link rel="stylesheet" type="text/css" href="css/style.css">--%>
<%--</head>--%>
<%--<body>--%>
<%--<h2>Currency Converter</h2>--%>
<%--<form action="/convert" method="post">--%>
<%--    <label>Rate: </label><br/>--%>
<%--    <input type="text" name="rate" placeholder="RATE" value="22000"/><br/>--%>
<%--    <label>USD: </label><br/>--%>
<%--    <input type="text" name="usd" placeholder="USD" value="0"/><br/>--%>
<%--    <input type = "submit" id = "submit" value = "Converter"/>--%>
<%--</form>--%>
<%--</body>--%>
<%--</html>--%>

<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />--%>
<%--<head>--%>
<%--    <title>Simple Dictionary</title>--%>
<%--    <link rel="stylesheet" type="text/css" href="css/style.css">--%>
<%--</head>--%>
<%--<body>--%>
<%--<h2>Vietnamese Dictionary</h2>--%>
<%--<form action="/translate" method="get">--%>
<%--    <input type="text" name="txtSearch" placeholder="Enter your word: "/>--%>
<%--    <input type = "submit" id = "submit" value = "Search"/>--%>
<%--</form>--%>
<%--</body>--%>
<%--</html>--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Product Discount Calculator</title>
</head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<body>
<div class="container mt-5 h-50 w-50">
    <form action="/many" method="post">
        <div class="mb-3">
            <label for="productDescription" class="form-label">Mô tả của sản phẩm:</label>
            <input type="text" class="form-control" id="productDescription" placeholder="Mô tả của sản phẩm" name="productDescription" required>
        </div>

        <div class="mb-3">
            <label for="listPrice" class="form-label">Giá niêm yết của sản phẩm:</label>
            <input type="number" class="form-control" id="listPrice" placeholder="Giá niêm yết của sản phẩm" name="listPrice" required>
        </div>

        <div class="mb-3">
            <label for="discountPercent" class="form-label">Tỷ lệ chiết khấu %:</label>
            <input type="text" class="form-control" id="discountPercent" placeholder="Tỷ lệ chiết khấu %" name="discountPercent" required>
        </div>

        <button type="submit" class="btn btn-primary">Calculate Discount</button>
    </form>
</div>
</body>
</html>