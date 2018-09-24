package br.com.dialogospfizer.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.dialogospfizer.entity.Usuario;
import br.com.dialogospfizer.enumerated.TipoUsuario;
import br.com.dialogospfizer.service.UsuarioService;

@Controller
public class LoginController {

	private UsuarioService us;

	@Autowired
	public LoginController(UsuarioService us) {
		this.us = us;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginGet(HttpServletRequest request, Model model) {

		// Recebe o contexto da requisição.
		String path = request.getContextPath();
		model.addAttribute("path", path);

		return "principal/login";

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPost(Usuario usuario, HttpServletRequest request, Model model) {

		System.out.println(usuario);

		// Recebe o contexto da requisição.
		String path = request.getContextPath();
		model.addAttribute("path", path);

		if (us.login(usuario.getEmail(), usuario.getSenha())) {
			usuario = us.carregar(usuario.getEmail());

			if (usuario.getTipoUsuario().equals(TipoUsuario.COMUM)) {
				return "painel-usuario/index";
			} else if (usuario.getTipoUsuario().equals(TipoUsuario.YABA)
					|| usuario.getTipoUsuario().equals(TipoUsuario.PFIZER)) {
				return "painel-restrito/index";
			}
		}

		return "erro/login";

	}

}
