package com.hemanth.product;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.hemanth.product.bo.ProductBOImpl;
import org.hemanth.product.bo.ProductBo;
import org.hemanth.product.dto.Product;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DisplayProductDetailsServlet", value = "/DisplayProductDetailsServlet")
public class DisplayProductDetailsServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        ProductBo productBo=new ProductBOImpl();
        Product product= productBo.read(id);
        PrintWriter printWriter=response.getWriter();
        printWriter.print("Id: "+product.getId());
        printWriter.print("Product Name: "+product.getName());
        printWriter.print("Product Description: "+product.getDescription());
        printWriter.print("Product Price: "+product.getPrice());
    }
}