package br.com.dialogospfizer.service;

import org.springframework.stereotype.Service;

import br.com.dialogospfizer.dao.UsuarioDAO;
import br.com.dialogospfizer.entity.Usuario;

@Service
public class UsuarioService {
	
	private UsuarioDAO dao;
	
	public Usuario adicionar (Usuario usuario) {
		return dao.adicionar(usuario);
	}

}
