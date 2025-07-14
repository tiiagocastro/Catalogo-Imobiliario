package projeto_imobiliaria;

import java.util.Scanner;

public class Menu {
	private Imobiliaria imobiliaria = new Imobiliaria();
	Scanner scan = new Scanner(System.in);
	
	public void exibirMenu() {
		int opcao;
		while(true) {
			String menu = """
					
					Menu de Opções:
					1. Adicionar Imóvel
					2. Remover Imóvel
					3. Listar Construções
					4. Informar Área Total
					5. Sair. 
					
					""";
			System.out.print(menu);
			System.out.print("Escolha uma opção: ");
			opcao = scan.nextInt();
			scan.nextLine();
			
			
			switch(opcao) {
				case 1 -> {
					System.out.println("Selecione o tipo do imóvel:");
					System.out.println("1. Casa");
					System.out.println("2. Loja");
					System.out.println("3. Prédio");
					int tipoImovel = scan.nextInt();
					scan.nextLine(); //Limpar o buffer
					
					switch(tipoImovel) {
					case 1-> adicionarCasa();
					case 2 -> adicionarLoja();
					case 3 -> adicionarPredio();
					}
				}
				case 2 -> removerConstrucao();
				case 3 -> {
					imobiliaria.listarConstrucoes();
				}
				case 4 -> System.out.println("Área total das contruções: " + imobiliaria.informeArea() + "metros quadrados.");
				case 5-> {
					System.out.println("Saindo do programa...");
					scan.close();
					return;
				}
			}
		}		
	}
	
	private void adicionarCasa() {
		System.out.println("Digite o endereço da casa:");
		String endereco = scan.nextLine();
		System.out.println("Digite o preço da casa:");
		double preco = scan.nextDouble();
		System.out.println("Digite a largura da casa:");
		double largura = scan.nextDouble();
		System.out.println("Digite o comprimento da casa:");
		double comprimento = scan.nextDouble();
		scan.nextLine(); // Limpa o buffer
		
		Casa casa = new Casa(endereco, preco, largura, comprimento);
		
		imobiliaria.adicionarConstrucao(casa);
	}
	private void adicionarLoja() {
		System.out.println("Digite o endereço da loja:");
		String endereco = scan.nextLine();
		System.out.println("Digite o preço da loja:");
		double preco = scan.nextDouble();
		System.out.println("Digite a largura da loja:");
		double largura = scan.nextDouble();
		System.out.println("Digite a profundidade da loja:");
		double profundidade = scan.nextDouble();
		scan.nextLine(); // Limpa o buffer
		
		Loja loja = new Loja(endereco, preco, largura, profundidade);
		
		imobiliaria.adicionarConstrucao(loja);
	}
	
	private void adicionarPredio() {
		System.out.println("Digite o endereço do prédio:");
		String endereco = scan.nextLine();
		System.out.println("Digite o preço do prédio:");
		double preco = scan.nextDouble();
		System.out.println("Digite o número de andares do prédio:");
		int numeroDeAndares = scan.nextInt();
		System.out.println("Digite a área por andar do prédio:");
		double areaPorAndar = scan.nextDouble();
		scan.nextLine(); // Limpa o buffer 
		
		Predio predio = new Predio(endereco, preco, numeroDeAndares, areaPorAndar);
		
		imobiliaria.adicionarConstrucao(predio);
	}
	
	private void removerConstrucao() {
		imobiliaria.listarConstrucoes();
		System.out.println("Digite o índice do imóvel a ser removido:");
		int indice = scan.nextInt();
		scan.nextLine(); // Limpa o buffer
		if ((indice - 1) >= 0 && (indice - 1) < imobiliaria.getCatalogo().size()) {
			Construcao construcao = imobiliaria.getCatalogo().get(indice);
			imobiliaria.removerConstrucao(construcao);
			System.out.println("Imóvel removido com sucesso.");
		} else {
			System.out.println("Índice inválido. Nenhum imóvel foi removido.");
		}
	}
}
