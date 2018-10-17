package controle;

import telas.TelaPrincipal;

public class TestePadaria {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Padaria tremBao = new Padaria();
		
		tremBao.cadastrarClienteRegular("Cl1", "Rua 1", "136.839.020-00", "(00) 0000-0000");
		
		tremBao.cadastrarClienteRegular("Cl2", "Rua 2", "444.163.818-32", "(00) 0000-0001");
		
		tremBao.cadastrarFornecedorOcasional("fo1", "Rua 2", "000", "24.587.906/0001-12");
		
		tremBao.cadastrarFornecedorRecorrente("fr1", "Rua 3", "001", "38.078.863/0001-54", 0.15f);
		
		tremBao.cadastrarGerente("g1", "Rua 4", "797.674.120-93", "(00) 0000-0001", "0000", 2000f);
		
		tremBao.cadastrarVendedor("v1", "Rua 5", "173.002.900-00", "(00) 0000-0002", "0001", 1500f);

		tremBao.cadastrarPadeiro("pdo1", "Rua 6", "533.384.960-95", "(00) 0000-0003", "0002", 1000f);
		
		tremBao.getEstoque().cadastrarProdutoNaoPerecivel("pnp1", "000000", tremBao.encontraFornecedor("000"), 30f, 300f, null, 30);
		
		tremBao.getEstoque().cadastrarProdutoPerecivel("pp1", "000001", tremBao.encontraFornecedor("001"), 20f, 30f, 1, 10, 2019, null, 30);

//		tremBao.imprimeInfoClientes();
//		tremBao.imprimeInfoFornecedores();
//		tremBao.imprimeInfoFuncionarios();
//		tremBao.imprimeInfoProdutos();
		
		System.out.println();
		
//		tremBao.imprimeInfoClientes("136.839.020-00");
//		System.out.println();
//		tremBao.imprimeInfoFornecedores("000");
//		System.out.println();
//		System.out.println();
//		tremBao.imprimeInfoProdutos("000001");

		tremBao.adicionarProdutoVenda("000000", 5);
		tremBao.realizarVenda("136.839.020-00", "0001", "Crédito", 1, 14, 10, 2018);
		
//		tremBao.getEstoque().imprimeInformacoesEstoque();
		
		tremBao.adicionarProdutoVenda("000001", 5);
		tremBao.adicionarProdutoVenda("000000", 2);
		tremBao.realizarVenda("444.163.818-32", "0001", "Crédito", 0, 15, 10, 2018);
		
		tremBao.cadastrarClienteGold("444.163.818-32");
		
		tremBao.adicionarProdutoVenda("000001", 1);
		tremBao.realizarVenda("444.163.818-32", "0001", "Crédito", 0, 15, 10, 2018);
		
		
//		tremBao.imprimeInfoVendas();
		
		System.out.println();
		
//		tremBao.getEstoque().imprimeInformacoesEstoque();
		
		TelaPrincipal p = new TelaPrincipal(tremBao);
		p.main(null);

	}
}
