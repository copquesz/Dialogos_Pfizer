package br.com.dialogospfizer.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.dialogospfizer.entity.Usuario;

@Repository
public class UsuarioDAO {

	@PersistenceContext
	EntityManager em;

	public Usuario adicionar(Usuario usuario) {
		em.persist(usuario);
		return carregar(usuario.getEmail());

	}

	public Usuario carregar(String email) {
		Query query = em.createQuery("SELECT us FROM Usuario us WHERE us.email = :email", Usuario.class);
		query.setParameter("email", email);
		return (Usuario) query.getSingleResult();
	}

	public boolean login(String email, String senha) {
		Query query = em.createQuery("SELECT us FROM Usuario us WHERE us.email = :email AND us.senha = :senha",
				Usuario.class);
		query.setParameter("email", email);
		query.setParameter("senha", senha);

		if (query.getResultList().isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

}
