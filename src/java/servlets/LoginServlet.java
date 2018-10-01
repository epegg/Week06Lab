/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import domain.User;
import domain.UserService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 *
 * @author 752814
 */
public class LoginServlet extends HttpServlet {

@Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        HttpSession session=request.getSession();
        Cookie[] cookies = request.getCookies();
        for (Cookie c : cookies) {
            if (c.getName().equals("user"))
            {
                session.setAttribute("username", c.getValue());
                session.setAttribute("rememberMe", "checked");
            }
        } 
    
        if(session.getAttribute("username") != null){
            response.sendRedirect("home");
        }else{
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "/WEB-INF/login.jsp";

        String username = "";
        String password = "";

        username = request.getParameter("username");
        password = request.getParameter("password");
        
        request.setAttribute("username", username);
        request.setAttribute("password", password);

        if(username == null || username.equals("")){
            request.setAttribute("message", "Please enter your username");
            request.getRequestDispatcher(url).forward(request, response);
            return;
        }
        if(password == null || password.equals("")){
            request.setAttribute("message", "Please enter your password");
            request.getRequestDispatcher(url).forward(request, response);
            return;
        }
        UserService us = new UserService();
        User user = us.login(username, password);
        HttpSession session=request.getSession();  

        if(user != null){
            session.setAttribute("username",user.getUsername());
            if(request.getParameter("rememberMe")!=null){
                Cookie c = new Cookie("user", username);
                c.setMaxAge(24*60*60);
                response.addCookie(c);
            }
            response.sendRedirect("home");
        }
 
        
    }
}
