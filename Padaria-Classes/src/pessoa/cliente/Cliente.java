/*Alunos:
 * Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * Rafael Junio Xavier - RGA: 2018.1907.050-6
 * Igor José Tamagno - RGA: 2018.1907.034-4
 */

package pessoa.cliente;

import pessoa.PessoaFisica;

public abstract class Cliente extends PessoaFisica {

	protected float valorCompras;

	/**
	 * Método construtor da classe Cliente.java.
	 * Método para a inicialização da classe Cliente.
	 * Pré-condição: recebimento de quatro String como parâmetros: nome, endereço, cpf e telefone. 
	 * Pós-condição: atribução de valores dos atributos nome, endereço, cpf e telefone conforme recebidos pelos parâmetros, sendo que todos esses os atributos são heranças da classe PessoaFisica. Inicialização do atributo valorCompras como zero.
	 */
	public Cliente(String nome, String endereco, String cpf, String telefone) {
		super(nome, endereco, cpf, telefone);
		this.valorCompras = 0f;
	}

	/**
	 * Método getValorCompras.
	 * Método para permitir acesso ao valor do atributo valorCompras.
     * Pré-condição: não há.
     * Pós-condição: retorna um float com o valor do atributo valorCompras. 
	 */
	public float getValorCompras() {
		return valorCompras;
	}

	/**
	 * Método setValorCompras.
	 * Método que permite alteração do valor do atributo valorCompras.
     * Pré-condição: recebimento de um float como parâmetro: valorCompras.
     * Pós-condição: atribuição do novo valor no atributo valorCompras. 
	 */
	public void setValorCompras(float valorCompras) {
		this.valorCompras = valorCompras;
	}
	
	/**
	 * Método atualizaCompraCliente.
	 * Método que atualiza o valor da compras do cliente, ou seja, o valor das compras já realizadas pelo cliente.
	 * Pré-condição: recebimento de um float como parâmetro: valorCompra.
	 * Pós-condição: retorna o valor do atributo valorCompras após o incremento do valor de valorCompra passado como parâmetro.
	 */
	public float atualizaCompraCliente(float valorCompra) {
		return this.valorCompras += valorCompra;
	}
	
	/**
	 * Método toString().
	 * Método que converte o objeto original em formato String por meio do atributo nome;
	 * Pré-condição: não há.
	 * Pós-condição: retorna uma String com o valor do atributo nome;
	 */
	@Override
	public String toString() {
		return super.getNome();
	}
	
	/**
	 * Método ehIgual.
	 * Método que compara se o valor do atributo cpf é igual ao passado como parâmetro.
	 * Pré-condição: recebimento de uma String como parâmetro: cpf.
	 * Pós-condição: retorna true caso o valor do atributo cpf comparado seja igual ao valor do parâmetro cpf passado, caso contrário, retorna false;
	 */
	public boolean ehIgual(String cpf) {
		if(removeCaracteresEspeciais(this.cpf).equals(removeCaracteresEspeciais(cpf)))
			return true;
		else
			return false;
	}
	
	/**
	 * Método exibeInfoVendaCliente.
	 * Método para converter informações dos atributos relacionados à venda do cliente para o formato de String.
	 * Pré-condição: não há.
	 * Pós-condição: retorna uma String com as informações dos atributos relacionados à venda do cliente.
	 */
	public String exibeInfoVendaCliente() {
		String info = String.format("Nome Cliente: %s\nCPF: %s\nValor acumulado de compras: %.2fR$", this.nome, this.cpf, this.valorCompras);
		return info;
	}

	/**
	 * Método imprimeInformacoesCliente.
	 * Método para imprimir em tela as informações referentes ao cliente.
	 * Pré-condição: não há.
	 * Pós-condição: impressão dos valores dos atributos do cliente em tela.
	 */
	public void imprimeInformacoesCliente() {
		System.out.printf("Nome do Cliente: %s.\n", this.nome);
		System.out.printf("Endereço: %s.\n", this.endereco);
		System.out.printf("Telefone: %s.\n", this.telefone);
		System.out.printf("CPF: %s.\n", this.getCpf());
		System.out.printf("Valor total de compras realizadas: %.2fR$.\n", this.valorCompras);
	}
	

}
