package testes;

import controle.Padaria;

public class TestePadariaMetodos{
	
	public static void main(String[] args) throws CloneNotSupportedException {

		Padaria tremBao = new Padaria();
		
		
		// Clientes
		tremBao.cadastrarClienteRegular("Rafael Junio Xavier", "Rua Recife 540", "704.878.040-15", "(31) 3464-7066");
		tremBao.cadastrarClienteRegular("Carlos Junino Xavier", "Rua Recife 540", "136.839.020-00", "(31) 3464-7066");		
		tremBao.cadastrarClienteRegular("Gilberto Assis Rosa", "Rua Cordisburgo 685", "853.424.430-83", "(32) 3333-0001");

		
		// Fornecedores
		tremBao.cadastrarFornecedorOcasional("Igor Corporation's", "Rua UFMS 01", "000", "24.587.906/0001-12");
		tremBao.cadastrarFornecedorRecorrente("Nova Safra", "BR-040 KM 688 - Pavilhão A e Pavilhão V", "001", "19.592.641/0001-00", 0.15f);
		
		
		// Funcionários
		tremBao.cadastrarGerente("Murilo Malvino", "Rua Guaicurus 6888", "797.674.120-93", "(67) 3122-0201", "0000", 100f);	
		tremBao.cadastrarVendedor("Jubileu Vicente", "Rua 5 547", "173.002.900-00", "(11) 3300-0002", "0001", 100f, 50f);
		tremBao.cadastrarVendedor("Logaritimo Souza", "Rua 10-1", "067.057.180-64", "(11) 3620-0816", "0002", 100f, 50f);
		tremBao.cadastrarVendedor("Pitolomeu Hernandes", "Rua 5 547", "456.522.360-00", "(11) 3323-9423", "0003", 100f, 50f);
		tremBao.cadastrarPadeiro("Arnaldo Pereira", "Rua Filomena", "533.384.960-95", "(16) 3946-2845", "0004", 100f);
		tremBao.cadastrarPadeiro("Lucas Beneguel", "Rua Filoginia", "923.173.470-90", "(64) 3580-0003", "0005", 100f);
		
		
		// Produtos NÃO Perecíveis
		tremBao.getEstoque().cadastrarProdutoNaoPerecivel("A", "000000", tremBao.encontraFornecedor("000"), 1f, 100f, null, 7);
//		tremBao.getEstoque().cadastrarProdutoNaoPerecivel("Café Bom Jesus", "000000", fornecedor, 0f, 5.97f, null, 29);
//		tremBao.getEstoque().cadastrarProdutoNaoPerecivel("Mucilon", "000001", fornecedor, precoCusto, 5.49f, null, 11);
//		tremBao.getEstoque().cadastrarProdutoNaoPerecivel("Sal Grosso Qualitá", "00002", fornecedor, precoCusto, 1.08f, null, 23);
//		tremBao.getEstoque().cadastrarProdutoNaoPerecivel("Ólea Soja Liza", "00003", fornecedor, precoCusto, 5.80f , null, 22);
//		tremBao.getEstoque().cadastrarProdutoNaoPerecivel("Leiet em pó NINHO Nestlé", "000004", fornecedor, precoCusto, 11.99f, null, 16);
//		tremBao.getEstoque().cadastrarProdutoNaoPerecivel("Açucar Refinado União", "000005", fornecedor, precoCusto, 4.10f, null, 26);
//		tremBao.getEstoque().cadastrarProdutoNaoPerecivel("Polvilho Azedo Yoki", "000006", fornecedor, precoCusto, 11.20f, null, 28);
//		tremBao.getEstoque().cadastrarProdutoNaoPerecivel("Polvilho Doce Yoki", "000007", fornecedor, precoCusto, 44.99f, null, 23);
//		tremBao.getEstoque().cadastrarProdutoNaoPerecivel("Farinha Láctea Nestlé", "000008", fornecedor, precoCusto, 11.19f, null, 17);
//		tremBao.getEstoque().cadastrarProdutoNaoPerecivel("Achocolatado", "000009", fornecedor, precoCusto, 6.85f, null, 18);
		
		
		// Produtos Perecíveis
		tremBao.getEstoque().cadastrarProdutoPerecivel("a", "000001", tremBao.encontraFornecedor("001"), 20f, 100f, 1, 10, 2019, null, 30);


		// Testes
		
		// Impressões
		tremBao.descadastrarFuncionario("0001");
		tremBao.imprimeInfoClientes();
//		System.out.println();
//		tremBao.imprimeInfoFornecedores();
//		System.out.println();
		tremBao.imprimeInfoFuncionarios();
//		System.out.println();
//		tremBao.imprimeInfoEstoque();
//		System.out.println(tremBao.getQntFuncionarios());
//		tremBao.imprimeInfoClientes("136.839.020-00");
//		System.out.println();
//		tremBao.imprimeInfoFornecedores("000");
//		System.out.println();
//		System.out.println();
//		tremBao.imprimeInfoProdutos("000001");

		
		// Vendas
		tremBao.adicionarProdutoVenda("000000", 5);
		tremBao.realizarVenda("44416381832", "0001", "Débito", 3, 14, 10, 2018);
//		System.out.println(tremBao.getComprasRealizadas().length);
//		
//		tremBao.cadastrarClienteGold("44416381832");
		tremBao.imprimeInfoVendas();
		
		
//		tremBao.adicionarProdutoVenda("000001", 5);
//		tremBao.adicionarProdutoVenda("000000", 2);
//		tremBao.realizarVenda("44416381832", "0001", "Dinheiro", 0, 15, 10, 2018);
		
		
//		tremBao.imprimeInfoVendas();
//		tremBao.calcularImpostos();
//		tremBao.imprimeInfoPadaria();
		
//		tremBao.imprimeInfoEstoque();
		
//		System.out.println(tremBao.encontraCliente("44416381832").getValorCompras());
//		tremBao.adicionarProdutoVenda("000001", 1);
//		tremBao.realizarVenda("444.163.818-32", "0001", "Dinheiro", 0, 15, 10, 2018);
//		System.out.println(tremBao.getVendas()[0].getValorFinalCompra());
//		System.out.println(tremBao.getVendas()[1].getValorFinalCompra());
	}
}


