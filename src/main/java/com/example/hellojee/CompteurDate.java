package com.example.hellojee;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "compteurDate", value = "/compteur-date")
public class CompteurDate extends HttpServlet {
    private int compteur;
    private Date date;

    public void init() {
        compteur = 0;
        date = new Date();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> La page a été invoker " + compteur+ " fois </h1>");
        out.println("<h1> La date d'aujourd'hui est " + date + " </h1>");
        out.println("</body>" +
                "<script>" +
                "setTimeout(function () { location.reload(1); }, 1000);" +
                "</script>" +
                "</html>");
        date = new Date();
        compteur++;
    }

    public void destroy() {
    }
}
