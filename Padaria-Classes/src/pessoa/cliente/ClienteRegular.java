package pessoa.cliente;

/**
 * Alunos:
 * @author Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * @author Rafael Junio Xavier - RGA: 2018.1907.050-6
 * @author Igor Jos� Tamagno - RGA: 2018.1907.034-4
 *
 */
public final class ClienteRegular extends Cliente {

	/**
	 * M�todo construtor da classe ClienteRegular.
	 * 
	 * Pr�-condi��o: recebimento de quatro String como par�metros: nome, endere�o, cpf e telefone. 
	 * P�s-condi��o: atribu��o de valores dos atributos nome, endere�o, cpf e telefone conforme recebidos pelos par�metros, sendo que todos esses os atributos s�o heran�as da classe Cliente.
	 */
	public ClienteRegular(String nome, String endereco, String cpf, String telefone) {
		super(nome, endereco, cpf, telefone);
	}
	
	/**
	 * M�todo exibeInfoVendaCliente.
	 * 
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: retorna uma String com as informa��es dos atributos relacionados � venda do clienteRegular.
	 */
	public String exibeInfoVendaCliente() {
		String info = "Cliente Regular.\n" + super.exibeInfoVendaCliente();
		return info;
	}
	
	/**
	 * M�todo imprimeInformacoesCliente.
	 * 
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: impress�o dos valores dos atributos do clienteRegular em tela.
	 */
	public void imprimeInformacoesCliente() {
		System.out.println("Cliente Regular.");
		super.imprimeInformacoesCliente();
	}
}
