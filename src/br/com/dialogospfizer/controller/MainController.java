package br.com.dialogospfizer.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	private String path = "";
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String main(HttpServletRequest request, Model model){
		
		path = request.getContextPath();
		model.addAttribute("path", path);
		
		return "principal/index";
		
	}

}
