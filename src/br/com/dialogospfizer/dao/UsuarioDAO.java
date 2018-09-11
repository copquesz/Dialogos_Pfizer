package br.com.dialogospfizer.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.dialogospfizer.entity.Usuario;

public class UsuarioDAO {
	
	@PersistenceContext
	EntityManager em;
	
	public Usuario adicionar(Usuario usuario) {
		em.persist(usuario);
		return carregar(usuario.getEmail());
		
	}
	
	public Usuario carregar (String email) {
		Query query = em.createQuery("SELECT u FROM Usuario u WHERE u.email : email", Usuario.class);
		query.setParameter("email", email);		
		return (Usuario) query.getSingleResult();
	}

}
