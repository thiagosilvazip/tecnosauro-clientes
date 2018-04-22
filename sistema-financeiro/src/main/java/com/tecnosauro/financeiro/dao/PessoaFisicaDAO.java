package com.tecnosauro.financeiro.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import com.tecnosauro.financeiro.modelo.PessoaFisica;
import com.tecnosauro.financeiro.util.jpa.JPAUtil;

public class PessoaFisicaDAO implements Serializable {

	private static final long serialVersionUID = 1L;

	public void salvar(PessoaFisica pessoaFisica) {

		EntityManager em = JPAUtil.createEntityManager();

		em.getTransaction().begin();
		em.persist(pessoaFisica);
		em.getTransaction().commit();

		em.close();

	}

	public void atualizar(PessoaFisica pessoaFisica) {

		EntityManager em = JPAUtil.createEntityManager();

		em.getTransaction().begin();
		em.merge(pessoaFisica);
		em.getTransaction().commit();

		em.close();
	}

	public PessoaFisica buscarPeloCodigo(Integer codigo) {

		EntityManager em = JPAUtil.createEntityManager();

		PessoaFisica pessoaFisica = em.find(PessoaFisica.class, codigo);
		em.close();

		return pessoaFisica;

	}

	@SuppressWarnings("unchecked")
	public List<PessoaFisica> buscarTodos() {

		EntityManager em = JPAUtil.createEntityManager();

		List<PessoaFisica> listPessoaFisica = em.createQuery("from PessoaFisica").getResultList();
		em.close();

		return listPessoaFisica;

	}

	public void excluir(PessoaFisica pessoaFisica) throws Exception {

		EntityManager em = JPAUtil.createEntityManager();
		pessoaFisica = em.find(PessoaFisica.class, pessoaFisica.getCodigo());

		
		try {			
			em.getTransaction().begin();
			//em.remove(pessoaFisica.getEndereco().getCidade());
			//em.remove(pessoaFisica.getEndereco().getEstado());

			em.remove(pessoaFisica);
			//em.flush();
			em.getTransaction().commit();
			em.close();			
		} catch (Exception e) {
		}
	}

}
