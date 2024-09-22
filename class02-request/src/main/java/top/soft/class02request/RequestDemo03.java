package top.soft.class02request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
@WebServlet("/requestDemo03")

public class RequestDemo03 extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        //1获取请求体数据
        BufferedReader reader = req.getReader();
        //2读取数据流
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
