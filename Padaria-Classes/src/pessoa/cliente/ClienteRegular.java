package pessoa.cliente;

/**
 * Alunos:
 * @author Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * @author Rafael Junio Xavier - RGA: 2018.1907.050-6
 * @author Igor José Tamagno - RGA: 2018.1907.034-4
 *
 */
public final class ClienteRegular extends Cliente {

	/**
	 * Método construtor da classe ClienteRegular.
	 * 
	 * Pré-condição: recebimento de quatro String como parâmetros: nome, endereço, cpf e telefone. 
	 * Pós-condição: atribução de valores dos atributos nome, endereço, cpf e telefone conforme recebidos pelos parâmetros, sendo que todos esses os atributos são heranças da classe Cliente.
	 */
	public ClienteRegular(String nome, String endereco, String cpf, String telefone) {
		super(nome, endereco, cpf, telefone);
	}
	
	/**
	 * Método exibeInfoVendaCliente.
	 * 
	 * Pré-condição: não há.
	 * Pós-condição: retorna uma String com as informações dos atributos relacionados à venda do clienteRegular.
	 */
	public String exibeInfoVendaCliente() {
		String info = "Cliente Regular.\n" + super.exibeInfoVendaCliente();
		return info;
	}
	
	/**
	 * Método imprimeInformacoesCliente.
	 * 
	 * Pré-condição: não há.
	 * Pós-condição: impressão dos valores dos atributos do clienteRegular em tela.
	 */
	public void imprimeInformacoesCliente() {
		System.out.println("Cliente Regular.");
		super.imprimeInformacoesCliente();
	}
}
