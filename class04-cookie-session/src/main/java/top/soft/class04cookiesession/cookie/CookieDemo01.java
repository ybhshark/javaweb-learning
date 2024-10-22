package top.soft.class04cookiesession.cookie;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * @description: TODO
 * @author ybh20
 * @date 2024/10/21 19:35
 *
 */

@WebServlet("/cookieDemo01")
public class CookieDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
        Cookie cookies = new Cookie("username", "tom");
        resp.addCookie(cookies);
        cookies.setMaxAge(60*60*24*7);
    }
}
