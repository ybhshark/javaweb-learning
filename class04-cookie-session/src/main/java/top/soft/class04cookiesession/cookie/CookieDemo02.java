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

@WebServlet("/cookieDemo02")
public class CookieDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
        Cookie[] cookies = req.getCookies();
        for(Cookie cookie : cookies){
            String name = cookie.getName();
            if(name.equals("username")){
                System.out.println("value的结果"+cookie.getValue());
                break;
            }
        }
    }
}
