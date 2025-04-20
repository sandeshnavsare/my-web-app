package com.example.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class UserController extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String profession = request.getParameter("profession");
        String email = request.getParameter("email");

        request.setAttribute("name", name);
        request.setAttribute("profession", profession);
        request.setAttribute("email", email);

        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }
}

