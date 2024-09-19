package org.example.ex4.member.security.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;


import java.io.IOException;
@Component
@RequiredArgsConstructor
@Log4j2
public class JWTCheckFilter extends OncePerRequestFilter {

@Override
    protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
    return false;
}
@Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
log.info("JWT Check Filter");
log.info("requestURI:" + request.getRequestURI());
String headerStr = request.getHeader("Authorization");
log.info("headerStr:" + headerStr);
if(headerStr == null || !headerStr.startsWith("Bearer ")) {
    handleException(response,new Exception("ACCESS TOKEN NOT FOUND"));
    return;}
}


    private void handleException(HttpServletResponse response, Exception e) throws IOExcpetion{
        response.setStatus(HttpServletResponse.SC_FORBIDDEN);
        response.setContentType("application/json");
        response.getWriter().println("{\"error\" : \"" + e.getMessage()+ "\"}" );
    }
}
