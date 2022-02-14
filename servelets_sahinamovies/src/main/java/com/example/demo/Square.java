package com.example.demo;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.System.out;

public class Square extends HttpServlet {
    final static Logger logger = Logger.getLogger(Square.class);
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{

        int k = (int) req.getAttribute("new");

        PrintWriter pr = res.getWriter();

        pr.println("You have to pay only "+ k +" Rupees!!!!");
        logger.info("The amount is printed");
    }
}
