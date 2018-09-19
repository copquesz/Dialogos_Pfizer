package br.com.dialogospfizer.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.dialogospfizer.entity.Associacao;
import br.com.dialogospfizer.service.AssociacaoService;

@Controller
public class AssociacaoController {

	private AssociacaoService as;

	@Autowired
	public AssociacaoController(AssociacaoService as) {
		this.as = as;
	}

	@RequestMapping(value = "/associacao/cadastrar", method = RequestMethod.GET)
	public String cadastrarGet(HttpServletRequest request, Model model) {

		// Recebe o contexto da requisição.
		String path = request.getContextPath();
		model.addAttribute("path", path);

		return "";
	}

	@RequestMapping(value = "/associacao/cadastrar", method = RequestMethod.POST)
	public String cadastrarPost(Associacao associacao, HttpServletRequest request, Model model) {

		// Recebe o contexto da requisição.
		String path = request.getContextPath();
		model.addAttribute("path", path);

		return "";
	}

	@RequestMapping(value = "/associacao/visualizar/{id}", method = RequestMethod.GET)
	public String visualizarGet(@PathVariable Integer id, Associacao associacao, HttpServletRequest request,
			Model model) {

		// Recebe o contexto da requisição.
		String path = request.getContextPath();
		model.addAttribute("path", path);

		associacao = as.carregar(id);
		model.addAttribute("associacao", associacao);

		return "";
	}
	
	@RequestMapping(value = "/associacao/editar/{id}", method = RequestMethod.GET)
	public String editarGet(@PathVariable Integer id, Associacao associacao, HttpServletRequest request,
			Model model) {

		// Recebe o contexto da requisição.
		String path = request.getContextPath();
		model.addAttribute("path", path);

		associacao = as.carregar(id);
		model.addAttribute("associacao", associacao);

		return "";
	}
	
	@RequestMapping(value = "/associacao/editar/{id}", method = RequestMethod.POST)
	public String editarPost(Associacao associacao, HttpServletRequest request,
			Model model) {

		// Recebe o contexto da requisição.
		String path = request.getContextPath();
		model.addAttribute("path", path);

		associacao = as.atualizar(associacao);
		model.addAttribute("associacao", associacao);

		return "";
	}

}
