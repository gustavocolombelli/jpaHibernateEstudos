package com.curso.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.curso.modelo.Cliente;

public class ConsultandoPrimeiroObjeto {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		//Long codigo = 1L;
		Cliente cliente = em.find(Cliente.class, 12L);
		
		if(cliente!=null){
		System.out.println("Nome     : " +cliente.getNome());
		System.out.println("Profissao: " +cliente.getProfissao());
		System.out.println("Idade    : " +cliente.getIdade());
		System.out.println("Codigo   : " +cliente.getCodigo());
		System.out.println("Sexo:    :" +cliente.getSexo());
		}
		else{
			System.out.println("Cliente nao encontrado.");
		}
	}
}
