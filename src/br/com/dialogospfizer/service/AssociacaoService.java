package br.com.dialogospfizer.service;

import org.springframework.stereotype.Service;

import br.com.dialogospfizer.dao.AssociacaoDAO;
import br.com.dialogospfizer.entity.Associacao;

@Service
public class AssociacaoService {
	
	private AssociacaoDAO dao;
	
	public Associacao adicionar(Associacao associacao) {
		return dao.adicionar(associacao);
	}
	
	public Associacao carregar(Integer id) {
		return dao.carregar(id);
	}

}
