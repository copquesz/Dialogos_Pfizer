package br.com.dialogospfizer.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.dialogospfizer.entity.Associacao;

@Repository
public class AssociacaoDAO {

	@PersistenceContext
	EntityManager em;

	public Associacao adicionar(Associacao associacao) {
		em.persist(associacao);
		return carregar(associacao.getCnpj());

	}

	public Associacao carregar(String cnpj) {
		Query query = em.createQuery("SELECT as FROM Associacao as WHERE as.cnpj = :cnpj", Associacao.class);
		query.setParameter("cnpj", cnpj);
		return (Associacao) query.getSingleResult();
	}
	
	public Associacao carregar(Integer id) {
		Query query = em.createQuery("SELECT as FROM Associacao as WHERE as.id = :id", Associacao.class);
		query.setParameter("id", id);
		return (Associacao) query.getSingleResult();
	}
	
	public Associacao atualizar(Associacao associacao) {
		return em.merge(associacao);
	}

}
