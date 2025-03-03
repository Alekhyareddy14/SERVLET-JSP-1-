package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/aaa") // This defines the URL pattern for accessing this servlet
public class MyServlet extends HttpServlet {

    private static final long serialVersionUID = 1L; // Recommended for serialization

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
       //response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Hello from MyServlet!</h2>");
        HttpSession session =request.getSession();
        session.setAttribute("session_name","smart programming");
    }
}
