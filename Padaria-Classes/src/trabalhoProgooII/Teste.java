package trabalhoProgooII;

public class Teste {

	public static void main(String[] args) {
		
		EstoqueVendas estoque = new EstoqueVendas();
		
		FornecedorRecorrente fornecedor = new FornecedorRecorrente("Rede Globo", "Av. Projac", "3458468745/42", 1f);
		
		String[] apelido = new String[] {"Colherz�o", "Colherzinha", "Colher�o", "Colherzim", "Colherzom"};
		
		estoque.cadastrarProduto("Colher", fornecedor, 12.54f, 15.55f, apelido, 2546, 20);
		
		Vendedor v1 = new Vendedor("Rafael", "Rua Recife", 5642.50f, "25462");
		
		System.out.println(estoque.venderProduto(2546, 10, 12, 2018, v1));
		
		System.out.println(estoque.produtos[0].getQuantidadeEstoque());
		
		System.out.println(estoque.venderProduto(5466, 12, 12, 2018, v1));
		
		estoque.imprimeInformacoesProdutosVendidos();
		

	}

}
