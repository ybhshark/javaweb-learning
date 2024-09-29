/**
 * @description: TODO
 * @author ybh20
 * @date 2024/9/28 14:29
 */

package top.soft.class03response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/responseDemo02")
public class ResponseDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //转发
       // req.getRequestDispatcher("/responseDemo01?uername=zhangsan").forward(req,resp);
        //重定向
      //  resp.sendRedirect("/responseDemo01?uername=zhangsan");

      //  resp.sendRedirect("https://www.baidu.com");
    }
}
