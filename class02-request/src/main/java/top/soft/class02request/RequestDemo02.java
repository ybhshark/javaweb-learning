package top.soft.class02request;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

public class RequestDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);

        //1遍历所有请求头数据
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            String header = req.getHeader(name);
            System.out.println(name + " : " + header);
        }
        //2根据名称获取请求头的值
        String header = req.getHeader("User-Agent");
        if (header.contains("Edg")) {
            System.out.println("Edg浏览器");
        } else {

            System.out.println("Chrome浏览器");
        }

    }}