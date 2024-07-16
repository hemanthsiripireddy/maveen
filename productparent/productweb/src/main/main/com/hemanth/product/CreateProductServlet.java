package com.hemanth.product;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.hemanth.product.bo.ProductBOImpl;
import org.hemanth.product.bo.ProductBo;
import org.hemanth.product.dao.ProductDao;
import org.hemanth.product.dao.ProductDaoImpl;
import org.hemanth.product.dto.Product;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CreateProductServlet", value = "/CreateProductServlet")
public class CreateProductServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        int id= Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        String description=request.getParameter("description");
        int price =Integer.parseInt(request.getParameter("price"));
        Product product=new Product(id,name,description,price);
        ProductBo productBo=new ProductBOImpl();
        productBo.create(product);
        PrintWriter printWriter=response.getWriter();
        printWriter.print("Product Created");
    }
}