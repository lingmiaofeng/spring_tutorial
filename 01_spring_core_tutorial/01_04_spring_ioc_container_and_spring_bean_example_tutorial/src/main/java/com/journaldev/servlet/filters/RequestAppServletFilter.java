package com.journaldev.servlet.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


@WebFilter("/RequestAppServletFilter")
public class RequestAppServletFilter implements Filter {

    private ServletContext context;

    public void init(FilterConfig fConfig) throws ServletException {
        this.context = fConfig.getServletContext();
        this.context.log("RequestLoggingFilter initialized");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // pass the request along the filter chain
        this.context.log("RequestLoggingFilter doFilter");
        chain.doFilter(request, response);
    }

    public void destroy() {
        this.context.log("RequestLoggingFilter destroy");
        //we can close resources here
    }
}
