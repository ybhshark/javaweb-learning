/**
 * @description: TODO
 * @author ybh20
 * @date 2024/11/23 14:00
 */

package top.soft.class06filterlistener.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/user/servlet")
public class UserServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("user servlet被访问");
    }
}
