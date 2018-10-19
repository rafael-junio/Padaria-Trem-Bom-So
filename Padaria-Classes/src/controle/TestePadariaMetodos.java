package controle;

public class TestePadariaMetodos{
	
	public static void main(String[] args) throws CloneNotSupportedException {

		Padaria tremBao = new Padaria();
		
		tremBao.cadastrarClienteRegular("Cafael Junio Xavier", "Rua Recife 540", "704.878.040-15", "(31) 3464-7066");
		
		tremBao.cadastrarClienteRegular("Bafael Junio Xavier", "Rua Recife 540", "136.839.020-00", "(31) 3464-7066");
		
		tremBao.cadastrarClienteRegular("Auilherme Guimarães Rosa", "Rua Cordisburgo 685", "444.163.818-32", "(32) 3333-0001");
		
		tremBao.cadastrarFornecedorOcasional("Bgor Corporation's", "Rua UFMS 01", "000", "24.587.906/0001-12");
		
		tremBao.cadastrarFornecedorRecorrente("Aet-Sistemas S.A Industries", "Av. Costa e silva 500", "001", "38.078.863/0001-54", 0.15f);
		
		tremBao.cadastrarGerente("calvadino Malvadão", "Rua Guaicurus 6888", "797.674.120-93", "(67) 3122-0201", "0000", 2000.55f);
		
		tremBao.cadastrarVendedor("bendelino Vendedor", "Rua 5 547", "173.002.900-00", "(11) 3300-0002", "0001", 1500f);

		tremBao.cadastrarPadeiro("adeiro que faz pão bom", "Rua Filomena", "533.384.960-95", "(33) 4580-0003", "0002", 1000f);
		
		tremBao.getEstoque().cadastrarProdutoNaoPerecivel("A", "000000", tremBao.encontraFornecedor("000"), 30f, 100f, null, 30);
		
		tremBao.getEstoque().cadastrarProdutoPerecivel("a", "000001", tremBao.encontraFornecedor("001"), 20f, 100f, 1, 10, 2019, null, 30);

		tremBao.imprimeInfoClientes();
		System.out.println();
		tremBao.imprimeInfoFornecedores();
		System.out.println();
		tremBao.imprimeInfoFuncionarios();
		System.out.println();
		tremBao.imprimeInfoProdutos();
		System.out.println(tremBao.getQntFuncionarios());
		
		
////		tremBao.imprimeInfoClientes("136.839.020-00");
////		System.out.println();
////		tremBao.imprimeInfoFornecedores("000");
////		System.out.println();
////		System.out.println();
////		tremBao.imprimeInfoProdutos("000001");
//
////		tremBao.getEstoque().imprimeInformacoesEstoque();
//		
////		tremBao.adicionarProdutoVenda("000000", 5);
////		tremBao.realizarVenda("136.839.020-00", "0001", "Crédito", 1, 14, 10, 2018);
//		
////		tremBao.imprimeInfoVendas();
////		
////		tremBao.adicionarProdutoVenda("000001", 1);
//		tremBao.adicionarProdutoVenda("000000", 1);
//		tremBao.realizarVenda("444.163.818-32", "0001", "Dinheiro", 0, 15, 10, 2018);
////		
////		tremBao.imprimeInfoVendas();
////		
//		tremBao.cadastrarClienteGold("444.163.818-32");
//		
//		tremBao.adicionarProdutoVenda("000001", 1);
//		tremBao.realizarVenda("444.163.818-32", "0001", "Dinheiro", 0, 15, 10, 2018);
//
////		tremBao.imprimeInfoClientes();
////		System.out.println();
//		tremBao.imprimeInfoFornecedores();
//		System.out.println();
//		tremBao.imprimeInfoFuncionarios();
//		System.out.println();
//		tremBao.imprimeInfoProdutos();
//		
//		
//		System.out.println(tremBao.getClientes()[0].toString());
		
//		TelaPrincipal p = new TelaPrincipal(tremBao);
//		p.main(null);

	}
}


