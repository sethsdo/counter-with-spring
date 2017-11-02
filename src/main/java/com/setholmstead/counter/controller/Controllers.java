package com.setholmstead.counter.controller;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("sessionAttribute")
public class Controllers extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int count = 0;

	
	@RequestMapping("/")
    public String setSession(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		session.setAttribute("sessionAttribute", count++);
		System.out.print(session.getAttribute("sessionAttribute"));
        return "index";
    }
	
	@RequestMapping("/counter")
    public String index(Model model) {
		model.addAttribute("sessionAttribute", count);
        return "display";
    }

}

