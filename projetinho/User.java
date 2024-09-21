package projetinho;

public class User {
	private String nome;
	private String cpf;
	private String endereco;
	private Livro livroAlugado;
	
	public Livro getLivroAlugado() {
		return livroAlugado;
	}

	public void setLivroAlugado(Livro livroAlugado) {
		this.livroAlugado = livroAlugado;
	}

	public User(String nome,String cpf, String endereco) {
		this.nome = nome;
		this.cpf= cpf;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void alugarLivro(Livro livro) {
		if (livro.isDisponivel()) {
			livroAlugado= livro;
			livro.setDisponivel(false);
			System.out.println(nome+" alugou o título: "+livro.getTitulo());
		} else {
			System.out.println("O livro!"+ livro.getTitulo()+" esta indisponível no momento");

		}
	}
	
	public void devolverLivro(Livro livro) {
		if (livroAlugado != null) {
			livroAlugado.setDisponivel(true);
			System.out.println("voce devolveu o livro:"+livroAlugado.getTitulo());
			livroAlugado=null;

		}else {
			System.out.println("voce nao tem livros para devolver");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
