package com.example.demo;

import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServelets extends HttpServlet {
    final static Logger logger = Logger.getLogger(AddServelets.class);
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int i = Integer.parseInt(req.getParameter("num1"));
        if (i >= 1) {
            int k = i * 130;
            logger.info("The Amount is calculated");
            req.setAttribute("new", k);
            RequestDispatcher rd = req.getRequestDispatcher("sq");
            logger.warn("The execution is directed to next servlet");
            rd.forward(req, res);
        } else {
            logger.error("Seat Number Less Than 1");
            //int j=Integer.parseInt(req.getParameter("num2"));

        }
    }
}
