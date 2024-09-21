package projetinho;

import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
	
	private List<User> usuarios = new ArrayList<>();

	private List<Livro> livros = new ArrayList<>();
	
	
	
	public void adicionarUsuario(String nome,String cpf, String endereco) {
		usuarios.add(new User(nome,cpf,endereco));
		System.out.println("usuario adicionado");

	}
	
	public void adicionarLivro(String titulo, String autor, String categoria, int id) {
		livros.add(new Livro(titulo,autor,categoria,id));
		System.out.println("usuario adicionado");

	}
	

	public Livro acharLivro(String titulo) {
		for (Livro livro : livros) {
			if (livro.getTitulo().equalsIgnoreCase(titulo)) {
				System.out.println("livro encontrado"+ livro.getTitulo());
				return livro;
			}
		}
		System.out.println("livro nao encontrado");
		 return null;
		}
	
	
	public Livro acharAutor(String autor) {
		for (Livro livro : livros) {
			if (livro.getTitulo().equalsIgnoreCase(autor)) {
				System.out.println("livro encontrado"+ livro.getTitulo());
				return livro;
			}
		}
		System.out.println("livro nao encontrado");
		 return null;
		}
	
	
	public Livro acharCategoria(String categoria) {
		for (Livro livro : livros) {
			if (livro.getTitulo().equalsIgnoreCase(categoria)) {
				System.out.println("livro encontrado"+ livro.getTitulo());
				return livro;
			}
		}
		System.out.println("livro nao encontrado");
		 return null;
		}
	
	public User buscarUsuario(String nome) {
		for (User user : usuarios) {
			if (user.getNome().equalsIgnoreCase(nome)) {
				System.out.println("usuario encontrado"+ user.getNome());
			}
		}
		System.out.println("usuário nao encontrado");
		return null;
	}
	
	

	
	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
