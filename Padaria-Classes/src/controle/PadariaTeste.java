package controle;

import telas.TelaPrincipal;

public class PadariaTeste {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Padaria tremBao = new Padaria();
		
		tremBao.cadastrarClienteRegular("Cl1", "Rua 1", "136.839.020-00", "(00) 0000-0000");
		
//		tremBao.cadastrarFornecedorOcasional("fo1", "Rua 2", "000", "24.587.906/0001-12");
//		
//		tremBao.cadastrarFornecedorRecorrente("fr1", "Rua 3", "001", "38.078.863/0001-54", 0.15f);
		
		tremBao.cadastrarGerente("g1", "Rua 4", "797.674.120-93", "(00) 0000-0001", "0000", 2000f);
		
		tremBao.cadastrarVendedor("v1", "Rua 5", "173.002.900-00", "(00) 0000-0002", "0001", 1500f);

		tremBao.cadastrarPadeiro("pdo1", "Rua 6", "533.384.960-95", "(00) 0000-0003", "0002", 1000f);
		
		String[] apelido = new String[] {"Ventiladeira", "Furacão", "Ventania"};
		
		tremBao.getEstoque().cadastrarProdutoNaoPerecivel("Ventilador", "000000", tremBao.encontraFornecedor("000"), 10f, 15f, apelido, 30);
		
		tremBao.getEstoque().cadastrarProdutoPerecivel("Ovo Frito", "000001", tremBao.encontraFornecedor("001"), 20f, 30f, 1, 10, 2019, null, 30);
		
		TelaPrincipal p = new TelaPrincipal(tremBao);
		p.main(null);
		
	}
}
