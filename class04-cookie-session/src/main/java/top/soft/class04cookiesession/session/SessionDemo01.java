package top.soft.class04cookiesession.session;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
/**
 * @description: TODO
 * @author ybh20
 * @date 2024/10/21 19:35
 *
 */
@WebServlet("/sesssionDemo01")
public class SessionDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
        HttpSession session = req.getSession();
        session.setAttribute("username", "kuro");
    }
}
