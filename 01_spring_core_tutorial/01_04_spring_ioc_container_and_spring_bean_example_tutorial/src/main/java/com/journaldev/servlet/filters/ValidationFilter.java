package com.journaldev.servlet.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class ValidationFilter  implements javax.servlet.Filter{

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        filterChain.doFilter(new ValidatingHttpRequest( (HttpServletRequest) servletRequest), servletResponse);
    }

}
