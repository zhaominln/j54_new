package org.java.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class RegServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("0000");
        Map<String,Object> map=new HashMap<>();
        map.put(request.getParameter("name"),request.getParameter("password"));
        request.setAttribute("map",map);
        request.getRequestDispatcher("/show.jsp").forward(request,response);
    }
}
