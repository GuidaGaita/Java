package produto;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int i = 0 ;
		User user1 = null;
		
		while (i != -1) {
			int choice = 0;
			System.out.println("-----MENU-----");
			System.out.println("1 - Adicionar usuário");
			System.out.println("2 - Informações do usuário ");
			System.out.println("3 - Adicionar produto");
			System.out.println("4 - Imprimir produtos");
			System.out.println("5 - Remover usuario");
			System.out.println("--------------");
			System.out.println("-----MENU-----");
			
			System.out.println("6 - Informações do produto");
			System.out.println("7 - Remover produto");
			System.out.println("8 - Sair");
			choice = sc.nextInt();
		
		
		switch (choice) {
		case 1 -> { //add usuario
                    System.out.println("Informe seu nome: ");
                    String name = sc.next();
                    System.out.println("Informe seu endereço: ");
                    String adress = sc.next();
                    System.out.println("Informe seu CPF: ");
                    String cpf = sc.next();
                    System.out.println("Informe seu telefone: ");
                    String phone = sc.next();
                    user1 = new User(name, adress, cpf, phone);
                        }
			
		 case 2 -> { //info usuario
			if (user1 != null) {  // Verifica se user1 foi inicializado
                System.out.println(user1.toString());  // Exibe as informações do usuário
            } else {
                System.out.println("Nenhum usuário foi adicionado.");
            }
                        }
			
		 case 4 -> {//imprimir produtos
                     
					System.out.println(user1.getListaProdutos()); 
                        }
		 case 5 -> {//remover usuario
                     user1 = null;
					 System.out.println("Usuário removido");
                        }
			 
		 case 3 -> { //add produto
					System.out.println("Informe o nome do produto: ");
					String name = sc.next();
					System.out.println("Informe a descrição do produto: ");
					String description = sc.next();
					System.out.println("Informe a categoria do produto: ");
					String category = sc.next();
					System.out.println("Informe o preço do produto:  ");
					double price = sc.nextDouble();
					Product product1 = new Product(name, description, category, price);
					user1.addProduct(product1);
		 				}
		 case 6 -> { //informaçoes do produto
					System.out.println("Digite o nome do produto que deseja obter as informações: ");
					String name = sc.next();
					for(Product elemento:user1.getListaProdutos()){
						if (elemento.getName().equals(name)) {
							System.out.println(elemento.toString()); 
						}
					}
                    
                
                        }
		case 7 -> { //remover produto
			System.out.println("Digite o nome do produto que deseja remover: ");
			String name = sc.next();

			Product produtoParaRemover = null;

			// Itera sobre a lista e encontra o produto para remover
			for (Product elemento : user1.getListaProdutos()) {
				if (elemento.getName().equals(name)) {
					produtoParaRemover = elemento;  
					break;  
				}
			}

			// Se encontrou o produto, remove da lista
			if (produtoParaRemover != null) {
				user1.getListaProdutos().remove(produtoParaRemover);
				System.out.println("Produto " + produtoParaRemover.getName() + " removido.");
			} else {
				System.out.println("Produto não encontrado.");
			}
		}
						
		 
		 case 8 -> {
			 i = -1;
				 }
			 
			 
			 

			}
		
		
		}
		
		
		
	}
}
