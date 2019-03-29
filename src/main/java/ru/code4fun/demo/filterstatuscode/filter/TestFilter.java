package ru.code4fun.demo.filterstatuscode.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by: Denis Timofeev
 * Date: 29.03.2019
 */
@Component
public class TestFilter implements Filter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) resp;

        response.setStatus(201);

        chain.doFilter(req, resp);
    }
}
