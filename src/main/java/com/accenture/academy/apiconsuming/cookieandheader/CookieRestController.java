package com.accenture.academy.apiconsuming.cookieandheader;


import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Enumeration;

@Slf4j
@RestController
@RequestMapping("/cookies")
@Data
public class CookieRestController {

    Cookie cookie = new Cookie("mojeCiasteczko","ciasteczko");
    Cookie cookie2 = new Cookie("mojeCiasteczko2","ciasteczko2");
    @GetMapping()
    public String getCookieAndHeader(HttpServletRequest request, HttpServletResponse response) {

        Enumeration<String> headers = request.getHeaders("nowy");

        String s = headers.nextElement();
        System.out.println(s);


        long timeNow = System.currentTimeMillis() + 1000000;
        String ipAddress = request.getHeader("X-FORWARDED-FOR");
        if(ipAddress == null) {
            ipAddress = request.getRemoteAddr();
            log.info("IP address from request: " + ipAddress);
        }
        response.addCookie(cookie);
        response.addCookie(cookie2);
        response.addHeader("mojheader", "wartoscHeader");
        response.addDateHeader("mojaData",timeNow);


        return "Hello World from Accenture!";
    }
}
