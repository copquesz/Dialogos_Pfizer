package br.com.dialogospfizer.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Classe responsável por controlar a chamada inicial do projeto.
 * 
 * @author Lucas Copque
 * @category controller
 * @since 08/2018
 *
 */
@Controller
public class MainController {

	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String init(HttpServletRequest request, Model model) {

		// Recebe o contexto da requisição.
		String path = request.getContextPath();
		model.addAttribute("path", path);

		return "index";
	}

}
