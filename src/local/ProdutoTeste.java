package local;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		/*
		 * amortecedor 340.00 30 40030
			alternador  890.00 4  50010
			pneu	    250.00 50 20020
			Bico Injetor 158.90 38 10010
			Coletor Escape 280.00 5 10020
			Radiador	299.98 3 30010
		 */

		Produto p1 = new Produto();
		p1.setNomeProduto("Amortecedor");
		p1.setPreco(340);
		p1.setSaldo(30);
		p1.setId(40030);
		
		Produto p2 = new Produto();
		p2.setNomeProduto("Alternador");
		p2.setPreco(890);
		p2.setSaldo(4);
		p2.setId(50010);
		
		Produto p3 = new Produto("Pneu", 250, 50, 20020); 
		Produto p4 = new Produto("Bico Injetor", 158.90, 38, 10010);
		Produto p5 = new Produto("Coletor Escape", 280.00, 5, 10020);
		Produto p6 = new Produto("Radiador", 299.98, 3, 30010);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		System.out.println(p5.toString());
		System.out.println(p6.toString());
}

	
	
	
	
	
}
