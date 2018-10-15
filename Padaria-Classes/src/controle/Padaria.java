package controle;



public class Padaria {
	public static void main(String[] args) {

		InformacoesPadaria tremBao = new InformacoesPadaria();
		
		tremBao.cadastrarClienteRegular("Cl1", "Rua 1", "136.839.020-00", "(00) 0000-0000");
		
		tremBao.cadastrarFornecedorOcasional("fo1", "Rua 2", "000", "24.587.906/0001-12");
		
		tremBao.cadastrarFornecedorRecorrente("fr1", "Rua 3", "001", "38.078.863/0001-54", 0.15f);
		
		tremBao.cadastrarGerente("g1", "Rua 4", "797.674.120-93", "(00) 0000-0001", "0000", 2000f);
		
		tremBao.cadastrarVendedor("v1", "Rua 5", "173.002.900-00", "(00) 0000-0002", "0001", 1500f);

		tremBao.cadastrarPadeiro("pdo1", "Rua 6", "533.384.960-95", "(00) 0000-0003", "0002", 1000f);
		
		tremBao.getEstoque().cadastrarProdutoNaoPerecivel("pnp1", "000000", tremBao.encontraFornecedor("000"), 10f, 15f, false, 30);
		
		tremBao.getEstoque().cadastrarProdutoPerecivel("pp1", "000001", tremBao.encontraFornecedor("001"), 20f, 30f, 1, 10, 2019, false, 30);

		tremBao.imprimeInfoClientes();
		tremBao.imprimeInfoFornecedores();
		tremBao.imprimeInfoFuncionarios();
		tremBao.imprimeInfoProdutos();
		
		System.out.println();
		
		tremBao.imprimeInfoClientes("136.839.020-00");
		System.out.println();
		tremBao.imprimeInfoFornecedores("000");
		System.out.println();
		tremBao.imprimeInfoFuncionarios("0000");
		System.out.println();
		tremBao.imprimeInfoProdutos("000001");

		tremBao.realizarVendaProdutos("136.839.020-00", "0000", "Crédito", 1, 14, 10, 2018);
		
		
		tremBao.imprimeInfoVendas();
		
		System.out.println();
		
		tremBao.getEstoque().imprimeInformacoesEstoque();

	}
}
