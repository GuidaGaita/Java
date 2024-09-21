package projetinho;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);

        
        biblioteca.adicionarUsuario("Pedro", "123", "Jardim Botânico");
        biblioteca.adicionarUsuario("Maria", "111", "Guará");
        biblioteca.adicionarLivro("Mistborn", "Brandon Sandersen", "Fantasia Épica", 1);
        biblioteca.adicionarLivro("The Name of the Wind", "Patrick Rothfuss", "Fantasia Épica", 2);

        while (true) {
            System.out.println("\n----- MENU -----");
            System.out.println("1 - Adicionar usuário");
            System.out.println("2 - Adicionar livro");
            System.out.println("3 - Pesquisar livro por título");
            System.out.println("4 - Pesquisar livro por autor");
            System.out.println("5 - Pesquisar livro por categoria");
            System.out.println("6 - Alugar livro");
            System.out.println("7 - Devolver livro");
            System.out.println("8 - Pesquisar usuário");
            System.out.println("9 - Sair");
            System.out.print("Escolha uma opção: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 9) break;

            switch (choice) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();
                    biblioteca.adicionarUsuario(nome, cpf, endereco);
                }
                case 2 -> {
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Categoria: ");
                    String categoria = sc.nextLine();
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    biblioteca.adicionarLivro(titulo, autor, categoria, id);
                }
                case 3 -> {
                    System.out.print("Título do livro: ");
                    String titulo = sc.nextLine();
                    biblioteca.acharLivro(titulo);
                }
                case 4 -> {
                    System.out.print("Nome do autor: ");
                    String autor = sc.nextLine();
                    biblioteca.acharAutor(autor);
                }
                case 5 -> {
                    System.out.print("Categoria: ");
                    String categoria = sc.nextLine();
                    biblioteca.acharCategoria(categoria);
                }
                case 6 -> {
                    System.out.print("Nome do usuário: ");
                    String nome = sc.nextLine();
                    User user = biblioteca.buscarUsuario(nome);
                    if (user != null) {
                        System.out.print("Título do livro para alugar: ");
                        String titulo = sc.nextLine();
                        Livro livro = biblioteca.acharLivro(titulo);
                        if (livro != null) user.alugarLivro(livro);
                    }
                }
                case 7 -> {
                    System.out.print("Nome do usuário: ");
                    String nome = sc.nextLine();
                    User user = biblioteca.buscarUsuario(nome);
                    if (user != null) {
                        user.devolverLivro(user.getLivroAlugado());
                    }
                }
                case 8 -> {
                    System.out.print("Nome do usuário: ");
                    String nome = sc.nextLine();
                    biblioteca.buscarUsuario(nome);
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
        sc.close();
        System.out.println("Programa encerrado.");
    }
}
