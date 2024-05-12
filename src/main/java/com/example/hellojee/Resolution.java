package com.example.hellojee;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "resolution", value = "/resolution")
public class Resolution extends HttpServlet {

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        try {
            double a = Double.parseDouble(request.getParameter("a"));
            double b = Double.parseDouble(request.getParameter("b"));
            double c = Double.parseDouble(request.getParameter("c"));

            double delta = b * b - 4 * a * c;
            double x1, x2;

            if (delta < 0) {
                out.println("<h1>Pas de Solution</h1>");
            } else if (delta == 0) {
                out.println("<h1>L'equation admet une seul solution</h1>");
                x1 = -b / (2 * a);
                out.println("<h2>X = " + x1 + "</h2>");
            } else {
                out.println("<h1>L'equation admet deux solutions</h1>");
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                out.println("<h2>X' = " + x1 + "</h2>");
                out.println("<h2>X'' = " + x2 + "</h2>");

            }
        } catch (Exception e) {
            out.println("<h1>Verifier les champs</h1>");
        }
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
