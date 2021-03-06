package com.infra.dev.infradevaccess.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class GenericInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(
       HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
          String proxyForwardHostHeader = request.getHeader("X-Forwarded-Host");
         if(!proxyForwardHostHeader.equalsIgnoreCase("localhost:8761")){
             return false;
          }
       
       return true;
    }
    @Override
    public void postHandle(
       HttpServletRequest request, HttpServletResponse response, Object handler, 
       ModelAndView modelAndView) throws Exception {}
    
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, 
       Object handler, Exception exception) throws Exception {}
    
}