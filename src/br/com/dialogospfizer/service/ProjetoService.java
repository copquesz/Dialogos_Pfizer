package br.com.dialogospfizer.service;

import org.springframework.stereotype.Service;

import br.com.dialogospfizer.dao.ProjetoDAO;
import br.com.dialogospfizer.entity.Projeto;

@Service
public class ProjetoService {
	
	private ProjetoDAO dao;
	
	public Projeto adicionar(Projeto projeto) {
		return dao.adicionar(projeto);
	}

}
