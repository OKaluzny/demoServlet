package com.example.demo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//kjfcnfjc

@WebServlet("/saveServlet")
public class SaveServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        String dateOfBirth = request.getParameter("birthdate");
        String specialty = request.getParameter("specialty");


        Employee employee = new Employee();

        employee.setName(name);
        employee.setEmail(email);
        employee.setCountry(country);
        employee.setDateOfBirth(dateOfBirth);
        employee.setSpecialty(specialty);


        //out.println(employee.toString());
        //out.println(EmployeeRepository.getConnection());

        int status = EmployeeRepository.save(employee);
        //out.println(status);

        if (status > 0) {
            out.print("Record saved successfully!");
        } else {
            out.println("Sorry! unable to save record");
        }
        out.close();
    }
}

