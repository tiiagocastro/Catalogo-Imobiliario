package projeto_imobiliaria;

public class Loja extends Imovel{
	
	private double largura;
	private double profundidade;
	
	
	public Loja(String endereco, double preco, double largura, double profundidade) {
		super(endereco, preco);
		this.largura = largura;
		this.profundidade = profundidade;
	}

	@Override
	public double calcularArea() {
		return largura * profundidade;
	}

	@Override
	public void getDescricao() {
		System.out.printf("Loja localizada em %s, com área de %.2f metros quadrados e preço de R$%.2f.",getEndereco(), calcularArea(), getPreco());
		
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}
	

}
