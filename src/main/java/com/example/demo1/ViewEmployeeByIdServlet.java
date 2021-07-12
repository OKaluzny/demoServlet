package com.example.demo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/viewEmployeeByIdServlet")
public class ViewEmployeeByIdServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String sid = request.getParameter("id");
        int id = Integer.parseInt(sid);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print(EmployeeRepository.getEmployeeById(id));
        out.close();
    }
}
