package com.curso.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.curso.modelo.Cliente;

public class SalvandoPrimeiroObjeto {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		//vai gerenciar as entidades 
		EntityManager em = emf.createEntityManager();
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Pedro Roberto");
		cliente.setIdade(43);;
		cliente.setProfissao("Jornalista");
		cliente.setSexo("M");
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		
		System.out.println("Cliente salvo com sucesso!");
		//em.close();
	}

}
