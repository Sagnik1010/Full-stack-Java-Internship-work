package com.ecommerce.security.multitenancy;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class TenantFilter implements Filter {
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest r = (HttpServletRequest)req;
        String tenant = r.getHeader("X-Tenant");
        TenantContext.setTenant(tenant==null?"default":tenant);
        chain.doFilter(req,res);
    }
}

