package com.accenture.academy.hello;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@Profile(value = "dev")
public class HelloRestController {
    Cookie cookie = new Cookie("eluwina","ciasteczko");
    @GetMapping(path = "/hello")
    public String getHello(HttpServletRequest request, HttpServletResponse response){
        String apiKey = request.getHeader("apikey");
        String ipAddress = request.getHeader("X-FORWARDED-FOR");
        if(ipAddress == null){
            ipAddress = request.getRemoteAddr();
            log.info(ipAddress);
        }
        Cookie cookie = new Cookie("eluwina","ciasteczko");
        response.addCookie(cookie);
        log.info("ApiKey = " + apiKey);
        return "Hello World from Accenture!";
    }

}
