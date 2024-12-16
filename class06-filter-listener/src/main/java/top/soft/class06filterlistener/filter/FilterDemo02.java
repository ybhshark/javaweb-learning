/**
 * @description: TODO
 * @author ybh20
 * @date 2024/11/23 14:15
 */

package top.soft.class06filterlistener.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/*")
public class FilterDemo02 implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter02初始化");
    }
    @Override
    public void destroy() {
        System.out.println("filter02过滤器销毁");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("放行资源之前执行");

        //放行资源
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("放行资源之后执行");
    }



}

