/**
 * @description: TODO
 * @author ybh20
 * @date 2024/11/9 14:27
 */

package top.soft.class05ajaxaxios;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/check")
public class CheckServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        //1.从请求参数中获取用户名
        String username = request.getParameter("username");
        //2.判断用户名是否存在
        boolean equals = "admin".equals(username);
        //3响应结果
        resp.getWriter().write(String.valueOf(equals));
    }
}
