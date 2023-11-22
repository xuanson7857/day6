package com.example.bai1;//package com.example.bai1;
//
//import java.io.*;
//import java.util.Date;
//import javax.servlet.http.*;
//import javax.servlet.annotation.*;
//
//@WebServlet(name = "helloServlet", value = "/hello-servlet")
//public class HelloServlet extends HttpServlet {
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//        writer.println("<h1>Hello world</h1>");
//        Date today = new Date();
//
//        writer.println("<h1>" + today + "</h1>");
//        writer.println("</html>");
//    }
//}

//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//@WebServlet(name = "ConverterServlet", value = "/convert")
//public class HelloServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        float rate = Float.parseFloat(request.getParameter("rate"));
//        float usd = Float.parseFloat(request.getParameter("usd"));
//
//        float vnd = rate * usd;
//
//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//        writer.println("<h1>Rate: " + rate + "</h1>");
//        writer.println("<h1>USD: " + usd + "</h1>");
//        writer.println("<h1>VND: " + vnd + "</h1>");
//        writer.println("</html>");
//    }
//}

//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.HashMap;
//import java.util.Map;
//
//@WebServlet(name = "TranslationServlet", value = "/translate")
//public class HelloServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        Map<String, String> dictionary = new HashMap<>();
//        dictionary.put("hello", "Xin chào");
//        dictionary.put("how", "Thế nào");
//        dictionary.put("book", "Quyển vở");
//        dictionary.put("computer", "Máy tính");
//
//        String search = request.getParameter("txtSearch");
//
//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//
//        String result = dictionary.get(search);
//        if(result != null){
//            writer.println("Word: " + search);
//            writer.println("Result: " + result);
//        } else {
//            writer.println("Not found");
//        }
//
//        writer.println("</html>");
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Map<String, String> dictionary = new HashMap<>();
//        dictionary.put("hello", "Xin chào");
//        dictionary.put("how", "Thế nào");
//        dictionary.put("book", "Quyển vở");
//        dictionary.put("computer", "Máy tính");
//
//        String search = request.getParameter("txtSearch");
//
//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//
//        String result = dictionary.get(search);
//        if(result != null){
//            writer.println("Word: " + search);
//            writer.println("Result: " + result);
//        } else {
//            writer.println("Not found");
//        }
//
//        writer.println("</html>");
//    }
//}

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/many")
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Nhận dữ liệu từ form
        String productDescription = request.getParameter("productDescription");
        double listPrice = Double.parseDouble(request.getParameter("listPrice"));
        double discountPercent = Double.parseDouble(request.getParameter("discountPercent"));

        // Tính toán chiết khấu
        double discountAmount = listPrice * discountPercent * 0.01;
        double discountPrice = listPrice - discountAmount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        // Hiển thị kết quả trên trang /display-discount
        writer.println("Mo ta san pham: " + productDescription);
        writer.println("Gia san pham: " + discountPrice);
        writer.println("Triet khau: " + discountAmount);

    }
}