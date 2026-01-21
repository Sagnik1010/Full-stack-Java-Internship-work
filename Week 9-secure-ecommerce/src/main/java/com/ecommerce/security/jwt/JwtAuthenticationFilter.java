package com.ecommerce.security.jwt;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;
import java.io.IOException;

public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final JwtTokenProvider provider;
    public JwtAuthenticationFilter(JwtTokenProvider provider){this.provider=provider;}

    @Override
    protected void doFilterInternal(HttpServletRequest req,HttpServletResponse res,FilterChain chain)
            throws ServletException, IOException {

        String header = req.getHeader("Authorization");
        if(header!=null && header.startsWith("Bearer ")){
            String token = header.substring(7);
            String user = provider.getUsername(token);
            SecurityContextHolder.getContext().setAuthentication(
                    new org.springframework.security.authentication.UsernamePasswordAuthenticationToken(user,null,null)
            );
        }
        chain.doFilter(req,res);
    }
}

