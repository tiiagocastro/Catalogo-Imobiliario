package projeto_imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {
	
	private List <Construcao> catalogo = new ArrayList <> ();
	
	public void adicionarConstrucao(Construcao construcao) {
		catalogo.add(construcao);
	}
	public void removerConstrucao(Construcao construcao) {
		catalogo.remove(construcao);
	}
	public void listarConstrucoes() {
		System.out.println("Listra de construção:");
//		System.out.println(catalogo);
		for (int i = 0; i < catalogo.size(); i++) {
			System.out.println(i + 1 + ". ");
			catalogo.get(i).getDescricao();
			System.out.println();
		}
	}
	public double informeArea() {
		double areaTotal = 0.0;
		for (Construcao construcao : catalogo) {
			areaTotal += construcao.calcularArea();
		}
		return areaTotal;
	}
	public List<Construcao> getCatalogo() {
		return catalogo;
	}

}
