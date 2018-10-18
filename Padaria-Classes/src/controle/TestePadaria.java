package controle;

public class TestePadaria{
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws CloneNotSupportedException {

		Padaria tremBao = new Padaria();
		
		tremBao.cadastrarClienteRegular("Rafael Junio Xavier", "Rua Recife 540", "136.839.020-00", "(31) 3464-7066");
		
		tremBao.cadastrarClienteRegular("Guilherme Guimarães Rosa", "Rua Cordisburgo 685", "444.163.818-32", "(32) 3333-0001");
		
		System.out.println(tremBao.getClientes()[1].getValorCompras());
		
		tremBao.cadastrarFornecedorOcasional("Igor Corporation's", "Rua UFMS 01", "000", "24.587.906/0001-12");
		
		tremBao.cadastrarFornecedorRecorrente("Pet-Sistemas S.A Industries", "Av. Costa e silva 500", "001", "38.078.863/0001-54", 0.15f);
		
		tremBao.cadastrarGerente("Malvadino Malvadão", "Rua Guaicurus 6888", "797.674.120-93", "(67) 3122-0201", "0000", 2000.55f);
		
		tremBao.cadastrarVendedor("Vendelino Vendedor", "Rua 5 547", "173.002.900-00", "(11) 3300-0002", "0001", 1500f);

		tremBao.cadastrarPadeiro("Padeiro que faz pão bom", "Rua Filomena", "533.384.960-95", "(33) 4580-0003", "0002", 1000f);
		
		tremBao.getEstoque().cadastrarProdutoNaoPerecivel("PNaoPe", "000000", tremBao.encontraFornecedor("000"), 30f, 100f, null, 30);
		
		tremBao.getEstoque().cadastrarProdutoPerecivel("PPer", "000001", tremBao.encontraFornecedor("001"), 20f, 100f, 1, 10, 2019, null, 30);

//		tremBao.imprimeInfoClientes();
//		tremBao.imprimeInfoFornecedores();
//		tremBao.imprimeInfoFuncionarios();
//		tremBao.imprimeInfoProdutos();
		
		
//		tremBao.imprimeInfoClientes("136.839.020-00");
//		System.out.println();
//		tremBao.imprimeInfoFornecedores("000");
//		System.out.println();
//		System.out.println();
//		tremBao.imprimeInfoProdutos("000001");

		tremBao.getEstoque().imprimeInformacoesEstoque();
		
//		tremBao.adicionarProdutoVenda("000000", 5);
//		tremBao.realizarVenda("136.839.020-00", "0001", "Crédito", 1, 14, 10, 2018);
		
//		tremBao.imprimeInfoVendas();
//		
//		tremBao.adicionarProdutoVenda("000001", 1);
		tremBao.adicionarProdutoVenda("000000", 1);
		tremBao.realizarVenda("444.163.818-32", "0001", "Dinheiro", 0, 15, 10, 2018);
//		
//		tremBao.imprimeInfoVendas();
//		
		tremBao.cadastrarClienteGold("444.163.818-32");
		
		tremBao.adicionarProdutoVenda("000001", 1);
		tremBao.realizarVenda("444.163.818-32", "0001", "Dinheiro", 0, 15, 10, 2018);

		tremBao.imprimeInfoVendas();
		
		
		tremBao.getEstoque().imprimeInformacoesEstoque();
//		
//		TelaPrincipal p = new TelaPrincipal(tremBao);
//		p.main(null);

	}
}
