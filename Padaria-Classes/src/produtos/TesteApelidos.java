package produtos;

import fornecedores.Fornecedor;
import fornecedores.FornecedorOcasional;
import fornecedores.FornecedorRecorrente;

public class TesteApelidos {
	public static void main(String[] args) {
		Fornecedor f1 = new FornecedorRecorrente("Num sei", "Rua 1", "000", "61.139.683/0001-57", 0.5f),
				   f2 = new FornecedorOcasional("ui", "aa", "wertyui", "61.139.683/0001-57"); 
		
		Produto p1 = new ProdutoNaoPerecivel("arroz", "123456", f2, 100f, 115f, false),
				p2 = new ProdutoPerecivel("batita", "123456", f1, 10f, 11f, 1, 2, 2108, false);
		
		System.out.println();
		p1.imprimeInformacoesProduto();
		System.out.println();
		p2.imprimeInformacoesProduto();
		
		System.out.println("\n"+p1.getFornecedor().getClass());
		System.out.println("\n"+p2.getFornecedor().getClass());
		System.out.println(p1.getQuantidade());
		
		String i = "20";
		
	}
}
