package com.kenfil.servlets;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws IOException {
    String key1 = request.getParameter("key1");
    response.setContentType("text/html;");
    response.getWriter().println("<h1>Hello world!" + key1 + "</h1>");
  }
}
