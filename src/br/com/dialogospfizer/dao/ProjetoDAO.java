package br.com.dialogospfizer.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.dialogospfizer.entity.Projeto;

@Repository
public class ProjetoDAO {
	
	@PersistenceContext
	EntityManager em;
	
	public Projeto adicionar (Projeto projeto) {
		em.persist(projeto);
		return carregar(projeto.getNomeProjeto());
	}
	
	public Projeto carregar (String nomeProjeto) {
		Query query = em.createQuery("SELECT p FROM Projeto p WHERE p.nomeProjeto = :nomeProjeto", Projeto.class);
		query.setParameter("nomeProjeto", nomeProjeto);
		return (Projeto) query.getSingleResult();
	}

}
