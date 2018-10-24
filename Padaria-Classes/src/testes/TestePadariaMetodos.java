package testes;

import controle.Padaria;

/**
 * Alunos:
 * @author Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * @author Rafael Junio Xavier - RGA: 2018.1907.050-6
 * @author Igor Jos� Tamagno - RGA: 2018.1907.034-4
 *
 */
public class TestePadariaMetodos{
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws CloneNotSupportedException {

		Padaria tremBao = new Padaria();
		
		
//		// Clientes
//		tremBao.cadastrarClienteRegular("Rafael Junio Xavier", "Rua Recife 540", "366.062.040-89", "(31) 3464-7066");
//		tremBao.cadastrarClienteRegular("Carlos Junino Xavier", "Rua Recife 540", "704.878.040-15", "(31) 3464-7066");		
//		tremBao.cadastrarClienteRegular("Gilberto Assis Rosa", "Rua Cordisburgo 685", "853.424.430-83", "(32) 3333-0001");
//
//		
//		// Fornecedores
//		tremBao.cadastrarFornecedorOcasional("Igor Corporation's", "Rua UFMS 01", "000", "24.587.906/0001-12");
//		tremBao.cadastrarFornecedorRecorrente("Nova Safra", "BR-040 KM 688 - Pavilh�o A e Pavilh�o V", "001", "19.592.641/0001-00", 0.15f);
//		
//		
//		// Funcion�rios
//		tremBao.cadastrarGerente("Murilo Malvino", "Rua Guaicurus 6888", "797.674.120-93", "(67) 3122-0201", "0000", 2000f);
//		tremBao.cadastrarVendedor("Jubileu Vicente", "Rua 5 547", "173.002.900-00", "(11) 3300-0002", "0001", 1500f, 1000f);
//		tremBao.cadastrarVendedor("Logaritimo Souza", "Rua 10-1", "067.057.180-64", "(11) 3620-0816", "0002", 1500f, 1000f);
//		tremBao.cadastrarVendedor("Pitolomeu Hernandes", "Rua 5 547", "456.522.360-00", "(11) 3323-9423", "0003", 1500f, 1000f);
//		tremBao.cadastrarPadeiro("Arnaldo Pereira", "Rua Filomena", "533.384.960-95", "(16) 3946-2845", "0004", 1200f);
//		tremBao.cadastrarPadeiro("Lucas Beneguel", "Rua Filoginia", "923.173.470-90", "(64) 3580-0003", "0004", 1200f);
//		
//		
//		// Produtos N�O Perec�veis
//		tremBao.getEstoque().cadastrarProdutoNaoPerecivel("Caf� Bom Jesus", "000000", tremBao.encontraFornecedor("000"), 3.47f, 100f, null, 30);
//		tremBao.getEstoque().cadastrarProdutoNaoPerecivel("Mucilon", "000001", tremBao.encontraFornecedor("000"), 2.3f, 5.49f, null, 11);
//		System.out.println(tremBao.getEstoque().cadastrarProdutoNaoPerecivel("Sal Grosso Qualit�", "000002", tremBao.encontraFornecedor("000"), 0.78f, 1.08f, null, 0));
//		tremBao.getEstoque().cadastrarProdutoNaoPerecivel("Oleo Soja Liza", "000003", tremBao.encontraFornecedor("000"), 3.2f, 5.80f , null, 22);
//		tremBao.getEstoque().cadastrarProdutoNaoPerecivel("Leite em p� NINHO Nestl�", "000004", tremBao.encontraFornecedor("001"), 7.81f, 11.99f, null, 16);
//		tremBao.getEstoque().cadastrarProdutoNaoPerecivel("A�ucar Refinado Uni�o", "000005", tremBao.encontraFornecedor("001"), 2.1f, 4.10f, null, 26);
//		tremBao.getEstoque().cadastrarProdutoNaoPerecivel("Polvilho Azedo Yoki", "000006", tremBao.encontraFornecedor("001"), 7.8f, 11.20f, null, 28);
//		tremBao.getEstoque().cadastrarProdutoNaoPerecivel("Polvilho Doce Yoki", "000007", tremBao.encontraFornecedor("001"), 35f, 44.99f, null, 23);
//		tremBao.getEstoque().cadastrarProdutoNaoPerecivel("Farinha L�ctea Nestl�", "000008", tremBao.encontraFornecedor("001"), 8.1f, 11.19f, null, 17);
//		tremBao.getEstoque().cadastrarProdutoNaoPerecivel("Achocolatado", "000009", tremBao.encontraFornecedor("001"), 5.1f, 6.85f, null, 18);
//		
//		String[] apelidoPao = new String [] {"cacetinho", "p�o de sal"};
//		// Produtos Perec�veis
//		System.out.println(tremBao.getEstoque().cadastrarProdutoPerecivel("P�o de queijo", "000010", tremBao.encontraFornecedor("001"), 2f, 5f, 1, 10, 2018, null, 0));
//		tremBao.getEstoque().cadastrarProdutoPerecivel("P�o franc�s", "000011", tremBao.encontraFornecedor("001"), 1f, 3f, 5, 11, 2018, apelidoPao, 24);
//		tremBao.getEstoque().cadastrarProdutoPerecivel("Esfiha", "000012", tremBao.encontraFornecedor("001"), 2f, 4f, 5, 12, 2018, null, 16);
//		tremBao.getEstoque().cadastrarProdutoPerecivel("Coca-Cola 2l", "000013", tremBao.encontraFornecedor("001"), 4f, 9.5f, 12, 04, 2019, null, 20);
//		tremBao.getEstoque().cadastrarProdutoPerecivel("Iogurte", "000014", tremBao.encontraFornecedor("001"), 0.5f, 2f, 11, 01, 2019, null, 13);
//		tremBao.getEstoque().cadastrarProdutoPerecivel("Salsicha", "000015", tremBao.encontraFornecedor("000"), 5f, 11f, 11, 06, 2019, null, 8);
//		tremBao.getEstoque().cadastrarProdutoPerecivel("Mortadela", "000016", tremBao.encontraFornecedor("000"), 3f, 5.5f, 05, 12, 2018, null, 28);
//		tremBao.getEstoque().cadastrarProdutoPerecivel("Queijo", "000017", tremBao.encontraFornecedor("000"), 1.5f, 2.5f, 5, 02, 2019, null, 27);
//		tremBao.getEstoque().cadastrarProdutoPerecivel("Margarina", "000018", tremBao.encontraFornecedor("000"), 3f, 7.2f, 5, 07, 2019, null, 10);
//		tremBao.getEstoque().cadastrarProdutoPerecivel("Bolo", "000019", tremBao.encontraFornecedor("000"), 15f, 21f, 14, 12, 2018, null, 5);
		
		// Testes
		
		// Impress�es
//		tremBao.descadastrarFuncionario("0001");
//		tremBao.imprimeInfoClientes();
//		System.out.println();
//		tremBao.imprimeInfoFornecedores();
//		System.out.println();
//		tremBao.imprimeInfoFuncionarios();
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
//		System.out.println(tremBao.adicionarProdutoVenda("000000", 5));
//		System.out.println(tremBao.realizarVenda("366.062.040-89", "0001", "D�bito", 0, 14, 10, 2018));
//		
//		System.out.println(tremBao.cadastrarClienteGold("366.062.040-89"));
//		tremBao.imprimeInfoVendas();
		
		// Vendas
		tremBao.adicionarProdutoVenda("000000", 1);
		System.out.println(tremBao.realizarVenda("704.878.040-15", "0001", "D�bito", 0, 14, 10, 2018));
		
		tremBao.adicionarProdutoVenda("000000", 2);
		System.out.println(tremBao.realizarVenda("704.878.040-15", "0001", "D�bito", 0, 14, 10, 2018));
		
		tremBao.adicionarProdutoVenda("000000", 1);
		System.out.println(tremBao.realizarVenda("704.878.040-15", "0001", "D�bito", 0, 14, 10, 2018));
		
		tremBao.adicionarProdutoVenda("000000", 1);
		System.out.println(tremBao.realizarVenda("704.878.040-15", "0001", "D�bito", 0, 14, 10, 2018));
		
		tremBao.adicionarProdutoVenda("000000", 1);
		System.out.println(tremBao.realizarVenda("704.878.040-15", "0001", "D�bito", 0, 14, 10, 2018));
		
		tremBao.adicionarProdutoVenda("000000", 1);
		System.out.println(tremBao.realizarVenda("704.878.040-15", "0001", "D�bito", 0, 14, 10, 2018));
		
		tremBao.adicionarProdutoVenda("000000", 1);
		System.out.println(tremBao.realizarVenda("704.878.040-15", "0001", "D�bito", 0, 14, 10, 2018));
		
		tremBao.adicionarProdutoVenda("000000", 1);
		System.out.println(tremBao.realizarVenda("704.878.040-15", "0001", "D�bito", 0, 14, 10, 2018));
		
		tremBao.adicionarProdutoVenda("000000", 1);
		System.out.println(tremBao.realizarVenda("704.878.040-15", "0001", "D�bito", 0, 14, 10, 2018));
		
		tremBao.adicionarProdutoVenda("000000", 1);
		System.out.println(tremBao.realizarVenda("704.878.040-15", "0001", "D�bito", 0, 14, 10, 2018));
		
		tremBao.adicionarProdutoVenda("000000", 1);
		System.out.println(tremBao.realizarVenda("704.878.040-15", "0001", "D�bito", 0, 14, 10, 2018));
		
		tremBao.adicionarProdutoVenda("000000", 1);
		System.out.println(tremBao.realizarVenda("704.878.040-15", "0001", "D�bito", 0, 14, 10, 2018));
		
		tremBao.adicionarProdutoVenda("000000", 1);
		System.out.println(tremBao.realizarVenda("704.878.040-15", "0001", "D�bito", 0, 14, 10, 2018));
		
		tremBao.adicionarProdutoVenda("000000", 1);
		System.out.println(tremBao.realizarVenda("704.878.040-15", "0001", "D�bito", 0, 14, 10, 2018));
		
		tremBao.adicionarProdutoVenda("000000", 1);
		System.out.println(tremBao.realizarVenda("704.878.040-15", "0001", "D�bito", 0, 14, 10, 2018));
		
		tremBao.adicionarProdutoVenda("000000", 1);
		System.out.println(tremBao.realizarVenda("704.878.040-15", "0001", "D�bito", 0, 14, 10, 2018));
		
		tremBao.adicionarProdutoVenda("000000", 1);
		System.out.println(tremBao.realizarVenda("704.878.040-15", "0001", "D�bito", 0, 14, 10, 2018));
		
		tremBao.adicionarProdutoVenda("000000", 1);
		System.out.println(tremBao.realizarVenda("704.878.040-15", "0001", "D�bito", 0, 14, 10, 2018));
		
		tremBao.adicionarProdutoVenda("000000", 1);
		System.out.println(tremBao.realizarVenda("704.878.040-15", "0001", "D�bito", 0, 14, 10, 2018));
		
		tremBao.adicionarProdutoVenda("000000", 1);
		System.out.println(tremBao.realizarVenda("704.878.040-15", "0001", "D�bito", 0, 15, 10, 2018));
		
		System.out.println("20 vendas!");
		
		tremBao.adicionarProdutoVenda("000001", 1);
		System.out.println(tremBao.realizarVenda("704.878.040-15", "0001", "D�bito", 0, 15, 10, 2018));
		
//		System.out.println(tremBao.cadastrarClienteGold("366.062.040-89"));
//		System.out.println(tremBao.cadastrarClientePlatinum("366.062.040-89"));
		
		tremBao.imprimeInfoVendas();
//		
		tremBao.imprimeInfoEstoque("000001");
		
		tremBao.imprimeInfoClientes("44416381832");
		
		tremBao.imprimeInfoFornecedores("000");
		
		tremBao.imprimeInfoFuncionarios("0003");
		
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


