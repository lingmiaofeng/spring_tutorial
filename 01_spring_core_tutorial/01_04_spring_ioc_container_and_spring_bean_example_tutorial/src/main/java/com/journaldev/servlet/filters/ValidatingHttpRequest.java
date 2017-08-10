package com.journaldev.servlet.filters;

import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletRequest;

public class ValidatingHttpRequest extends HttpServletRequestWrapper {

    public ValidatingHttpRequest(HttpServletRequest request) {

        super(request);
    }
}
