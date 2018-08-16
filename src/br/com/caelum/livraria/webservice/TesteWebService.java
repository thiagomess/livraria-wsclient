package br.com.caelum.livraria.webservice;

import java.rmi.RemoteException;

public class TesteWebService {
	
	public static void main(String[] args) throws RemoteException {
		
		LivrariaWS cliente = new LivrariaWSProxy();
		
		Livro[] livros = cliente.getLivrosPeloNome("Arquitetura");
		
		for (Livro livro : livros) {
			System.out.println(livro.getId());
			System.out.println(livro.getAutor().getNome());
			System.out.println(livro.getTitulo());
			
		}
		
		
		
		
	}

}
