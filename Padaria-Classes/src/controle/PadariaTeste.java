package controle;

import telas.TelaPrincipal;

public class PadariaTeste {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Padaria tremBao = new Padaria();
		
		tremBao.cadastrarClienteRegular("Rafael Junio Xavier", "Rua Recife 540", "136.839.020-00", "(31) 3464-7066");
		
		tremBao.cadastrarClienteRegular("Guilherme Guimarães Rosa", "Rua Cordisburgo 685", "444.163.818-32", "(32) 3333-0001");
		
		tremBao.cadastrarClienteRegular("Cl1", "Rua 1", "136.839.020-00", "(00) 0000-0000");
		
		tremBao.cadastrarFornecedorOcasional("Igor Corporation's", "Rua UFMS 01", "002", "24.587.906/0001-12");
		
		tremBao.cadastrarFornecedorOcasional("fo1", "Rua 2", "000", "24.587.906/0001-12");
		
		tremBao.cadastrarFornecedorRecorrente("Pet-Sistemas S.A Industries", "Av. Costa e silva 500", "003", "38.078.863/0001-54", 0.15f);
		
		tremBao.cadastrarFornecedorRecorrente("fr1", "Rua 3", "001", "38.078.863/0001-54", 0.15f);
		
		tremBao.cadastrarGerente("Malvadino Malvadão", "Rua Guaicurus 6888", "797.674.120-93", "(67) 3122-0201", "0000", 2000.55f);
		
		tremBao.cadastrarGerente("g1", "Rua 4", "797.674.120-93", "(00) 0000-0001", "0000", 2000f);
		
		tremBao.cadastrarVendedor("Vendelino Vendedor", "Rua 5 547", "173.002.900-00", "(11) 3300-0002", "0001", 1500f);
		
		tremBao.cadastrarVendedor("v1", "Rua 5", "173.002.900-00", "(00) 0000-0002", "0001", 1500f);
		
		tremBao.cadastrarPadeiro("Padeiro que faz pão bom", "Rua Filomena", "533.384.960-95", "(33) 4580-0003", "0002", 1000f);
		
		tremBao.cadastrarPadeiro("pdo1", "Rua 6", "533.384.960-95", "(00) 0000-0003", "0002", 1000f);	
		
		String[] apelido = new String[] {"apelido1","apelido2","apelido3","apelido4","apelido5"};
		
		tremBao.getEstoque().cadastrarProdutoNaoPerecivel("PNaoPe", "000000", tremBao.encontraFornecedor("000"), 30f, 100f, apelido, 30);
		
		tremBao.getEstoque().cadastrarProdutoPerecivel("PPer", "000001", tremBao.encontraFornecedor("001"), 20f, 100f, 1, 10, 2019, null, 30);
		
		tremBao.getEstoque().cadastrarProdutoNaoPerecivel("Ventilador", "000002", tremBao.encontraFornecedor("000"), 10f, 15f, null, 30);
		
		tremBao.getEstoque().cadastrarProdutoPerecivel("Ovo Frito", "000003", tremBao.encontraFornecedor("001"), 20f, 30f, 1, 10, 2019, null, 30);
		
		tremBao.adicionarProdutoVenda("000000", 1);
		tremBao.realizarVenda("444.163.818-32", "0001", "Dinheiro", 0, 15, 10, 2018);

		tremBao.cadastrarClienteGold("444.163.818-32");
		
		tremBao.adicionarProdutoVenda("000001", 1);
		tremBao.realizarVenda("444.163.818-32", "0001", "Dinheiro", 0, 15, 10, 2018);
		
		TelaPrincipal p = new TelaPrincipal(tremBao);
		p.main(null);
		
	}
}
