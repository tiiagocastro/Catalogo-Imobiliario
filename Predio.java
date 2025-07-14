package projeto_imobiliaria;

public class Predio extends Imovel{
	
	private int numeroAndares;
	private double areaPorAndar;
	
	
	public Predio(String endereco, double preco, int numeroAndares, double areaPorAndar ) {
		super(endereco, preco);
		this.areaPorAndar = areaPorAndar;
		this.numeroAndares = numeroAndares;
	}

	@Override
	public double calcularArea() {
		return areaPorAndar * numeroAndares;
	}

	@Override
	public void getDescricao() {
		System.out.printf("Prédio de %d andares localizado em %s,"
				+ " com área total de %.2f metros quadrados e preço de R$ %.2f"
				, numeroAndares, getEndereco(), calcularArea(), getPreco());
		
	}

	public int getNumeroAndares() {
		return numeroAndares;
	}

	public void setNumeroAndares(int numeroAndares) {
		this.numeroAndares = numeroAndares;
	}

	public double getAreaPorAndar() {
		return areaPorAndar;
	}

	public void setAreaPorAndar(double areaPorAndar) {
		this.areaPorAndar = areaPorAndar;
	}

}
