package aplicativo;

import dominio.Pessoa;
import dominio.Vendedor;
import dominio.Cliente;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Principal {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula-jpa"); //Instancia o EntityManagerFactory com as configurações de persistencia
		EntityManager em = emf.createEntityManager(); //Intancia o EntityManager
		
		 // Criando as instâncias de Vendedor e Cliente
		 Vendedor vendedor1 = new Vendedor("Maurício", 33, 1);
		 Cliente cliente1 = new Cliente("Rafael", 34, 1);
		 
		 // Iniciar transação com o banco de dados
		 em.getTransaction().begin();
 
		 // Persistir as instâncias de Vendedor e Cliente
		 em.persist(vendedor1);
		 em.persist(cliente1);
		 
		 em.getTransaction().commit();
		 
		 // Fechar o EntityManager e EntityManagerFactory
		 emf.close();
		 em.close();
	 }            
 }