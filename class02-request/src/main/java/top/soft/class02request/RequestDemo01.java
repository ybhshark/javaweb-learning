package top.soft.class02request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;



@WebServlet("/requestDemo01")
public class RequestDemo01 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
      //1获取请求方法
        String method = req.getMethod();
        System.out.println("获取请求方法"+method);

        //2获取Servlet路径
        String servletPath = req.getServletPath();
        System.out.println("获取Servlet"+servletPath);

       //3获取get请求参数
       String queryString = req.getQueryString();
        System.out.println("获取请求参数"+queryString);


        //4获取请求uri和url
        String requestURI = req.getRequestURI();
        System.out.println("请求URI"+requestURI);
        StringBuffer requestURL = req.getRequestURL();
        System.out.println("获取请求URL"+requestURL);

        //5获取版权协议
        String protocol = req.getProtocol();
        System.out.println("版本协议"+protocol);


        //6获取虚拟目录
        String contextPath = req.getContextPath();
        System.out.println("获取虚拟目录"+contextPath);
    }
}
