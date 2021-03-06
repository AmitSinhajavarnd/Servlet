package org.form.login;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.form.login.database;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class Login_Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String url = "/main.jsp";
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        if (user == null || user.length() == 0 ||pass == null || pass.length() == 0) {
            url = "/index.jsp";
            request.setAttribute("error", "Username & Password must not be empty.");
        }else{
            try {
                String fullname = new database().validateUserLogin(user, pass);
                request.setAttribute("fullname", fullname);
                if (fullname != null || fullname.length() != 0){
                    request.setAttribute("sucess", "Sucessfull Connection");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        ServletContext context = getServletContext();
        RequestDispatcher dispatcher = context.getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

    /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }
}