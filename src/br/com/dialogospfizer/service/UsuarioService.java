package br.com.dialogospfizer.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dialogospfizer.dao.UsuarioDAO;
import br.com.dialogospfizer.entity.Usuario;
import br.com.dialogospfizer.enumerated.TipoUsuario;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioDAO dao;

	public Usuario adicionar(Usuario usuario, TipoUsuario tipoUsuario) {
		usuario.setDataCadastro(new Date());
		return dao.adicionar(usuario);
	}

	public Usuario carregar(String email) {
		return dao.carregar(email);
	}

	public boolean login(String email, String senha) {		
		return dao.login(email, senha);
	}

}
