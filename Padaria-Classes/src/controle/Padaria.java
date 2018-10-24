package controle;

import controle.estoque.Estoque;
import controle.produto.Produto;
import funcionalidades.Ordenacao;
import pessoa.cliente.Cliente;
import pessoa.cliente.ClienteGold;
import pessoa.cliente.ClientePlatinum;
import pessoa.cliente.ClienteRegular;
import pessoa.fornecedor.Fornecedor;
import pessoa.fornecedor.FornecedorOcasional;
import pessoa.fornecedor.FornecedorRecorrente;
import pessoa.funcionario.Funcionario;
import pessoa.funcionario.Gerente;
import pessoa.funcionario.Padeiro;
import pessoa.funcionario.Vendedor;

/**
 * Alunos:
 * @author Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * @author Rafael Junio Xavier - RGA: 2018.1907.050-6
 * @author Igor Jos� Tamagno - RGA: 2018.1907.034-4
 *
 */
public class Padaria {
	private final float PERCENTUALSOBREVENDAS = 0.15f;
	private final float PERCENTUALSOBRESALARIOFUNCIONARIOS = 0.18f;

	private static int contVendas = 0;
	
	private Ordenacao alpha;
	private Fornecedor[] fornecedores;	
	private Estoque estoque;
	private Funcionario[] funcionarios;
	private Cliente[] clientes;
	private Venda[] vendas;
	private Produto[] comprasRealizadas;
	private float montanteVendasGlobal;
	private float impostoVendas;
	private float impostoFuncionarios;	
	private float impostoTotal;
	
	/**
	 * M�todo construtor da classe Padaria.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: inst�ncia todos os atributos da classe.
	 */
	public Padaria() {
		this.fornecedores = new Fornecedor[10];
		this.estoque = new Estoque();
		this.funcionarios = new Funcionario[10];
		this.clientes = new Cliente[50];
		this.vendas = new Venda[20];
		this.comprasRealizadas = new Produto[20];
		this.montanteVendasGlobal = 0f;
		this.impostoFuncionarios = 0f;
		this.impostoTotal = 0;
		this.impostoVendas = 0f;
		this.alpha = new Ordenacao();
	}

	/**
	 * M�todo getFornecedores.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna o vetor de objetos do tipo Fornecedor, contendo os fornecedores cadastrados.
	 */
	public Fornecedor[] getFornecedores() {
		return fornecedores;
	}

	/**
	 * M�todo setFornecedores.
	 *
	 * Pr�-condi��o: recebe como par�metro um vetor de fornecedores.
	 * P�s-condi��o: n�o retorna nada, apenas instancia atributo vetor do tipo Fornecedor.
	 */
	public void setFornecedores(Fornecedor[] fornecedores) {
		this.fornecedores = fornecedores;
	}

	/**
	 * M�todo getEstoque.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o:retorna objeto do tipo Estoque, atributo contendo todos os produtos cadastrados.
	 */
	public Estoque getEstoque() {
		return estoque;
	}

	/**
	 * M�todo setEstoque.
	 *
	 * Pr�-condi��o: recebe objeto da classe Estoque como par�metro.
	 * P�s-condi��o: n�o retorna nada, apenas instancia atributo do tipo Estoque.
	 */
	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	/**
	 * M�todo getFuncionarios.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna vetor do tipo Funcionario, contendo os funcion�rios cadastrados.
	 */
	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}

	/**
	 * M�todo setFuncionarios.
	 *
	 * Pr�-condi��o: recebe vetor de objetos da classe Funcionario como par�metro.
	 * P�s-condi��o: n�o retorna nada, apenas instancia atributo vetor da tipo Funcionario.
	 */
	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}

	/**
	 * M�todo getClientes.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna vetor de objetos do tipo Cliente, contendo clientes cadastrados.
	 */
	public Cliente[] getClientes() {
		return clientes;
	}

	/**
	 * M�todo setClientes.
	 *
	 * Pr�-condi��o: recebe vetor de objetos da classe Cliente como par�metro.
	 * P�s-condi��o: n�o retorna nada, apenas instancia atributo vetor do tipo Cliente.
	 */
	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	/**
	 * M�todo getVendas.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna vetor de objetos do tipo Venda, contendo as vendas realizadas.
	 */
	public Venda[] getVendas() {
		return vendas;
	}

	/**
	 * M�todo setVendas.
	 *
	 * Pr�-condi��o: recebe vetor do tipo Venda como par�metro.
	 * P�s-condi��o: n�o retorna nada, apenas instancia atributo vetor do tipo Venda.
	 */
	public void setVendas(Venda[] vendas) {
		this.vendas = vendas;
	}

	/**
	 * M�todo getMontanteVendasGlobal.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna atributo do tipo float contendo o montante de vendas realizadas.
	 */
	public float getMontanteVendasGlobal() {
		return montanteVendasGlobal;
	}

	/**
	 * M�todo setMontanteVendasGlobal.
	 *
	 * Pr�-condi��o: recebe vari�vel do tipo float como par�metro.
	 * P�s-condi��o: n�o retorna nada, apenas instancia atributo do tipo float montanteVendasGlobal, que cont�m montante de vendas realizadas.
	 */
	public void setMontanteVendasGlobal(float montanteVendasGlobal) {
		this.montanteVendasGlobal = montanteVendasGlobal;
	}
	
	/**
	 * M�todo getComprasRealizadas.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro
	 * P�s-condi��o: retorna vetor do tipo Produto que cont�m as os produtos vendidos.
	 */
	public Produto[] getComprasRealizadas() {
		return comprasRealizadas;
	}

	/**
	 * M�todo setComprasRealizadas.
	 *
	 * Pr�-condi��o: recebe como par�metro vetor do tipo Produto.
	 * P�s-condi��o: n�o retorna nada, apenas instancia atributo vetor do tipo Produto que cont�m os produtos vendidos.
	 */
	public void setComprasRealizadas(Produto[] comprasRealizadas) {
		this.comprasRealizadas = comprasRealizadas;
	}

	/**
	 * M�todo getImpostoVendas.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna valor do tipo float imposto sobre as vendas, impostoVendas.
	 */
	public float getImpostoVendas() {
		return impostoVendas;
	}

	/**
	 * M�todo setImpostoVendas.
	 *
	 * Pr�-condi��o: recebe como par�metro um valor float.
	 * P�s-condi��o: n�o retorna nada, apenas instacia atributo float impostoVendas.
	 */
	public void setImpostoVendas(float impostoVendas) {
		this.impostoVendas = impostoVendas;
	}

	/**
	 * M�todo getImpostoFuncionarios.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna valor do tipo float improsto sobre o sal�rio dos funcion�rios, impostoFuncionarios.
	 */
	public float getImpostoFuncionarios() {
		return impostoFuncionarios;
	}

	/**
	 * M�todo setImpostoFuncionarios.
	 *
	 * Pr�-condi��o: recebe como par�metro um valor do tipo float.
	 * P�s-condi��o: n�o retorna nada, apenas instancia atributo impostoFuncionarios.
	 */
	public void setImpostoFuncionarios(float impostoFuncionarios) {
		this.impostoFuncionarios = impostoFuncionarios;
	}

	/**
	 * M�todo getImpostoTotal.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna valor do tipo float improsto total calculado, impostoTotal.
	 */
	public float getImpostoTotal() {
		return impostoTotal;
	}

	/**
	 * M�todo setImpostoTotal.
	 *
	 * Pr�-condi��o: recebe como par�metro um valor do tipo float.
	 * P�s-condi��o: n�o retorna nada, apenas instancia atributo impostoTotal.
	 */
	public void setImpostoTotal(float impostoTotal) {
		this.impostoTotal = impostoTotal;
	}

	/**
	 * M�todo getImpostosobrevendas.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna valor do atributo final tipo float PERCENTUALSOBREVENDAS.
	 */
	public float getPERCENTUALSOBREVENDAS() {
		return PERCENTUALSOBREVENDAS;
	}

	/**
	 * M�todo getImpostosobresalariofuncionarios.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna valor do atributo final tipo float PERCENTUALSOBRESALARIOFUNCIONARIOS.
	 */
	public float getPERCENTUALSOBRESALARIOFUNCIONARIOS() {
		return PERCENTUALSOBRESALARIOFUNCIONARIOS;
	}

	/**
	 * M�todo cadastrarClienteRegular.
	 *
	 * Pr�-condi��o: recebe como par�metro quatro Strings, o nome, endere�o, CPF e telefone, respectivamente.
	 * P�s-condi��o: retorna um booleano, TRUE, caso cliente seja cadastrado com sucesso e FALSE, caso contr�rio.
	 */
	public boolean cadastrarClienteRegular(String nome, String endereco, String cpf, String telefone) {

		if(!clienteEstaCadastrado(cpf)) {
			ClienteRegular cliente = new ClienteRegular(nome, endereco, cpf, telefone);
			for (int i = 0; i < clientes.length; i++)
				if (clientes[i] == null) {
					clientes[i] = cliente;
					cliente = null;
					return true;
				} 
		}
		return false;
	}
	
	/**
	 * M�todo cadastrarClienteGold.
	 *
	 * Pr�-condi��o: recebe String CPF do cliente regular, caso ele atenda a condi��o estabelecida, cliente � convertido em cliente gold.
	 * P�s-condi��o: retorna um booleano, TRUE, caso cliente seja atualizado com sucesso e FALSE, caso contr�rio.
	 */
	public boolean cadastrarClienteGold(String cpf) {

		for (int i = 0; i < clientes.length; i++)
			if (!((clientes[i] instanceof ClienteGold) || (clientes[i] instanceof ClientePlatinum)) && clientes[i] != null && clientes[i].ehIgual(cpf) && clientes[i].getValorCompras() > 250f) {
				ClienteGold cliente = new ClienteGold(clientes[i].getNome(), clientes[i].getEndereco(), clientes[i].getCpf(), clientes[i].getTelefone(), clientes[i].getValorCompras());
				clientes[i] = null;
				clientes[i] = cliente;
				cliente = null;
				return true;
			}		
		return false;
	}
	
	/**
	 * M�todo cadastrarClientePlatinum.
	 *
	 * Pr�-condi��o: recebe String CPF do cliente regular, caso ele atenda a condi��o estabelecida, cliente � convertido em cliente platinum.
	 * P�s-condi��o: retorna um booleano, TRUE, caso cliente seja atualizado com sucesso e FALSE, caso contr�rio.
	 */
	public boolean cadastrarClientePlatinum(String cpf) {

		for (int i = 0; i < clientes.length; i++)
			if (!(clientes[i] instanceof ClientePlatinum) && clientes[i] != null && clientes[i].getCpf().equals(cpf) && clientes[i].getValorCompras() > 500f){
				ClientePlatinum cliente = new ClientePlatinum(clientes[i].getNome(), clientes[i].getEndereco(), clientes[i].getCpf(), clientes[i].getTelefone(), clientes[i].getValorCompras());
				clientes[i] = null;
				clientes[i] = cliente;
				cliente = null;
				return true;
			}		
		return false;
	}

	/**
	 * M�todo descadastrarCliente.
	 *
	 * Pr�-condi��o: recebe String CPF do cliente e o mesmo � descadastrado, caso ele seja encontrado.
	 * P�s-condi��o: retorna um booleano, TRUE, caso cliente seja descadastrado com sucesso e FALSE, caso contr�rio.
	 */
	public boolean descadastrarCliente(String cpf) {
		for (int i = 0; i < clientes.length && clientes[i] != null; i++) {
			if (clientes[i].ehIgual(cpf)) {
				clientes[i] = null;
				return true;
			}
		}
		return false;
	}

	/**
	 * M�todo encontraCliente.
	 *
	 * Pr�-condi��o: recebe String CPF do cliente e procura por ele no sistema.
	 * P�s-condi��o: caso encontrado, retorna o objeto do tipo Cliente, caso contr�rio retorna null.
	 */
	public Cliente encontraCliente(String cpf) {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null && clientes[i].ehIgual(cpf))
				return clientes[i];
		}
		return null;
	}
	
	/**
	 * M�todo clienteEstaCadastrado.
	 *
	 * Pr�-condi��o: recebe String CPF do cliente e procura por ele no sistema.
	 * P�s-condi��o: retorna um booleano, TRUE, caso cliente � encontrado e FALSE, caso contr�rio.
	 */
	public boolean clienteEstaCadastrado(String cpf) {
		for(int i = 0; i < this.clientes.length; i++)
			if(this.clientes[i] != null && this.clientes[i].ehIgual(cpf))
				return true;
		
		return false;
	}

	/**
	 * M�todo cadastrarFornecedorOcasional.
	 *
	 * Pr�-condi��o: recebe como par�metro quatro Strings, o nome, endere�o, codigo e CNPJ, respectivamente.
	 * P�s-condi��o: retorna um booleano, TRUE, caso fornecedor ocasional seja cadastrado com sucesso e FALSE, caso contr�rio.
	 */
	public boolean cadastrarFornecedorOcasional(String nome, String endereco, String codigo, String cnpj) {

		if(!fornecedorEstaCadastrado(codigo)) {
			FornecedorOcasional fornecedor = new FornecedorOcasional(nome, endereco, codigo, cnpj);			
			for (int i = 0; i < fornecedores.length; i++)
				if (fornecedores[i] == null) {
					fornecedores[i] = fornecedor;
					fornecedor = null;
					return true;
				}
		}
		return false;
	}

	/**
	 * M�todo cadastrarFornecedorRecorrente.
	 *
	 * Pr�-condi��o: recebe como par�metro quatro Strings e um float, o nome, endere�o, codigo, CNPJ e taxa de desconto, respectivamente.
	 * P�s-condi��o: retorna um booleano, TRUE, caso fornecedor recorrente seja cadastrado com sucesso e FALSE, caso contr�rio.
	 */
	public boolean cadastrarFornecedorRecorrente(String nome, String endereco, String codigo, String cnpj,
			float taxaDesconto) {

		if(!fornecedorEstaCadastrado(codigo)) {
			FornecedorRecorrente fornecedor = new FornecedorRecorrente(nome, endereco, codigo, cnpj, taxaDesconto);
			for (int i = 0; i < fornecedores.length; i++)
				if (fornecedores[i] == null) {
					fornecedores[i] = fornecedor;
					fornecedor = null;
					return true;
				}
		}
		return false;
	}

	/**
	 * M�todo descadastrarFornecedor.
	 *
	 * Pr�-condi��o: recebe String codigo do fornecedor e o mesmo � descadastrado, caso ele seja encontrado.
	 * P�s-condi��o: retorna um booleano, TRUE, caso fornecedor seja descadastrado com sucesso e FALSE, caso contr�rio.
	 */
	public boolean descadastrarFornecedor(String codigo) {

		for (int i = 0; i < fornecedores.length && fornecedores[i] != null; i++)
			if (fornecedores[i].ehIgual(codigo)) {
				fornecedores[i] = null;
				return true;
			}
		return false;
	}

	/**
	 * M�todo encontraFornecedor.
	 *
	 * Pr�-condi��o: recebe String codigo do fornecedor e procura por ele no sistema.
	 * P�s-condi��o: caso encontrado, retorna o objeto do tipo Fornecedor, caso contr�rio retorna null.
	 */
	public Fornecedor encontraFornecedor(String codigo) {
		for (int i = 0; i < fornecedores.length; i++) {
			if (fornecedores[i] != null && fornecedores[i].ehIgual(codigo))
				return fornecedores[i];
		}
		return null;
	}
	
	/**
	 * M�todo fornecedorEstaCadastrado.
	 *
	 * Pr�-condi��o: recebe String c�digo do fornecedor e procura por ele no sistema.
	 * P�s-condi��o: retorna um booleano, TRUE, caso fornecedor � encontrado e FALSE, caso contr�rio.
	 */
	public boolean fornecedorEstaCadastrado(String codigo) {
		for(int i = 0; i < this.fornecedores.length; i++)
			if(this.fornecedores[i] != null && this.fornecedores[i].ehIgual(codigo))
				return true;
		
		return false;
	}

	/**
	 * M�todo cadastrarVendedor.
	 *
	 * Pr�-condi��o: recebe como par�metro cinco Strings e dois floats, o nome, endere�o, CPF, telefone, codigo, sal�rio base e a meta de vendas, respectivamente.
	 * P�s-condi��o: retorna um booleano, TRUE, caso vendedor seja cadastrado com sucesso e FALSE, caso contr�rio.
	 */
	public boolean cadastrarVendedor(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase, float metaVendas) {
	
		if(!funcionarioEstaCadastrado(codigo)) {			
			Vendedor funcionario = new Vendedor(nome, endereco, cpf, telefone, codigo, salarioBase, metaVendas);
			for (int i = 0; i < funcionarios.length; i++)
				if (funcionarios[i] == null) {
					funcionarios[i] = funcionario;
					funcionario = null;
					return true;
				} 
		}
		return false;
	}

	/**
	 * M�todo cadastrarGerente.
	 *
	 * Pr�-condi��o: recebe como par�metro cinco Strings e um float, o nome, endere�o, CPF, telefone, codigo e o sal�rio base, respectivamente.
	 * P�s-condi��o: retorna um booleano, TRUE, caso gerente seja cadastrado com sucesso e FALSE, caso contr�rio.
	 */
	public boolean cadastrarGerente(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase) {

		if(!funcionarioEstaCadastrado(codigo)) {			
			Gerente funcionario = new Gerente(nome, endereco, cpf, telefone, codigo, salarioBase);			
			for (int i = 0; i < funcionarios.length; i++)
				if (funcionarios[i] == null) {
					funcionarios[i] = funcionario;
					funcionario = null;
					return true;
				} 
		}
		return false;
	}

	/**
	 * M�todo cadastrarPadeiro.
	 *
	 * Pr�-condi��o: recebe como par�metro cinco Strings e um float, o nome, endere�o, CPF, telefone, codigo e o sal�rio base, respectivamente.
	 * P�s-condi��o: retorna um booleano, TRUE, caso padeiro seja cadastrado com sucesso e FALSE, caso contr�rio.
	 */
	public boolean cadastrarPadeiro(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase) {

		if(!funcionarioEstaCadastrado(codigo)) {						
			Padeiro funcionario = new Padeiro(nome, endereco, cpf, telefone, codigo, salarioBase);
			for (int i = 0; i < funcionarios.length; i++)
				if (funcionarios[i] == null) {
					funcionarios[i] = funcionario;
					funcionario = null;
					return true;
				} 
		}
		return false;
	}

	/**
	 * M�todo descadastrarFuncionario.
	 *
	 * Pr�-condi��o: recebe String codigo do funcion�rio e o mesmo � descadastrado, caso ele seja encontrado.
	 * P�s-condi��o: retorna um booleano, TRUE, caso funcion�rio seja descadastrado com sucesso e FALSE, caso contr�rio.
	 */
	public boolean descadastrarFuncionario(String codigo) {
		for (int i = 0; i < funcionarios.length && funcionarios[i] != null; i++)
			if (funcionarios[i].ehIgual(codigo)) {
				funcionarios[i] = null;
				return true;
			}
		return false;
	}

	/**
	 * M�todo encontraFuncionario.
	 *
	 * Pr�-condi��o: recebe String codigo do funcion�rio e procura por ele no sistema.
	 * P�s-condi��o: caso encontrado, retorna o objeto do tipo Funcion�rio, caso contr�rio retorna null.
	 */
	public Funcionario encontraFuncionario(String codigo) {
		for (int i = 0; i < funcionarios.length; i++) {
			if (funcionarios[i] != null && funcionarios[i].ehIgual(codigo))
				return funcionarios[i];
		}
		return null;
	}

	/**
	 * M�todo encontraVendedor.
	 *
	 * Pr�-condi��o: recebe String codigo do vendedor e procura por ele no sistema.
	 * P�s-condi��o: caso encontrado, retorna o objeto do tipo Vendedor, caso contr�rio retorna null.
	 */
	public Vendedor encontraVendedor(String codigo) {
		for (int i = 0; i < funcionarios.length; i++) {
			if (funcionarios[i] != null && funcionarios[i].ehIgual(codigo))
				if (funcionarios[i] instanceof Vendedor)
					return (Vendedor) funcionarios[i];
				else
					return null;
		}
		return null;
	}
	
	/**
	 * M�todo funcionarioEstaCadastrado.
	 *
	 * Pr�-condi��o: recebe String c�digo do funcion�rio e procura por ele no sistema.
	 * P�s-condi��o: retorna um booleano, TRUE, caso funcion�rio � encontrado e FALSE, caso contr�rio.
	 */
	public boolean funcionarioEstaCadastrado(String codigo) {
		for(int i = 0; i < this.funcionarios.length; i++)
			if(this.funcionarios[i] != null && this.funcionarios[i].ehIgual(codigo))
				return true;
		
		return false;
	}

	/**
	 * M�todo realizarVenda.
	 *
	 * Pr�-condi��o: recebe tr�s Strings e quatro floats, o CPF do cliente, o c�digo do vendedor, a forma de pagamento, o n�mero de parcelas e a data (dia, mes, ano), respectivamente.
	 * P�s-condi��o: retorna um booleano, TRUE, caso venda seja realizada e armazanada no vetor de objetos do tipo Venda, e FALSE, caso contr�rio.
	 */
	public boolean realizarVenda(String cpfCliente, String codigoVendedor, String formaPagamento, int numParcelas,
			int dia, int mes, int ano) {
		
		if(this.comprasRealizadas != null) {

			Cliente clienteVenda = encontraCliente(cpfCliente);
			
			Vendedor vendedor = encontraVendedor(codigoVendedor);
			
			if(clienteVenda == null || vendedor == null)
				return false;
			
			Venda venda = new Venda(clienteVenda, vendedor, formaPagamento, numParcelas, this.comprasRealizadas, dia, mes, ano);
			
			vendas[contVendas] = venda;
			vendas[contVendas].calcularValorFinalCompra(numParcelas);
			this.montanteVendasGlobal += vendas[contVendas].getValorFinalCompra();
			venda = null;
			this.comprasRealizadas = null;
			this.comprasRealizadas = new Produto[20];
			contVendas++;
			if(contVendas == 20) {
				contVendas = 0;
				return true;
			}
			else
				return true;
		}
		else
			return false;

	}
	

	/**
	 * M�todo adicionarProdutoVenda.
	 *
	 * Pr�-condi��o: recebe uma String e um inteiro, o c�digo do produto e a quantidade daquele produto, respectivamente
	 * P�s-condi��o: retorna um booleano, TRUE, caso produto seja adicionado ao vetor de objetos do tipo Produto, e FALSE, caso contr�rio.
	 */
	public boolean adicionarProdutoVenda(String codigo, int quantidade){

		if (estoque.venderQuantidadeProduto(codigo, quantidade)) {
			
			Produto produtoComprado = estoque.procurarProduto(codigo);
			
			for (int i = 0; i < comprasRealizadas.length; i++)
				if (comprasRealizadas[i] == null) {
					comprasRealizadas[i] = produtoComprado;
					produtoComprado = null;
					return true;
				}
		}
		return false;
	}
	
	/**
	 * M�todo removeProdutosVenda.
	 *
	 * Pr�-condi��o: Sem pr�-condi��o.
	 * P�s-condi��o: Sem retorno, apenas apaga os dados atuais do vetor de comprasRealizadas e inst�ncia 20 novos objetos.
	 */
	
	public void removeProdutosVenda() {
		comprasRealizadas = null;
		comprasRealizadas = new Produto[20];
	}

	/**
	 * M�todo procuraVenda.
	 *
	 * Pr�-condi��o: recebe String CPF do cliente e procura por ele no sistema.
	 * P�s-condi��o: caso encontrado, retorna o objeto do tipo Venda, caso contr�rio retorna null.
	 */
	public Venda encontraVenda(String cpfCliente) {
		for (int i = 0; i < vendas.length; i++) {
			if (vendas[i] != null)
				if (vendas[i].getCliente().ehIgual(cpfCliente))
					return vendas[i];
		}
		return null;
	}
	
	/**
	 * M�todo calcularImpostos.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro, 
	 * P�s-condi��o: n�o retorna nada, apenas calcula e instancia os atributos do tipo float impostoVendas, impostoFuncionario e impostoTotal, respons�veis por armazenar os impostos a serem pagos. 
	 */
	public void calcularImpostos() {
		this.impostoVendas = this.montanteVendasGlobal * this.PERCENTUALSOBREVENDAS;
		for(int i =0; i < funcionarios.length; i++) {
			if(funcionarios[i] != null)
				impostoFuncionarios += funcionarios[i].calcularSalarioFinal();
		}
		this.impostoFuncionarios = (this.impostoFuncionarios * this.PERCENTUALSOBRESALARIOFUNCIONARIOS);
		this.impostoTotal = impostoVendas + impostoFuncionarios;	
	}

	/**
	 * M�todo imprimeInfoClientes.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: n�o retorna nada, apenas imprime os atributos dos objetos do tipo Cliente.
	 */
	public void imprimeInfoClientes() {
		System.out.println("------------------------CLIENTES------------------------");
		alpha.ordena(clientes);
		for (int i = 0; i <= Ordenacao.cont; i++)
			if (clientes[i] != null) {
				clientes[i].imprimeInformacoesCliente();
				System.out.println();
			}
		System.out.println();
	}

	/**
	 * M�todo imprimeInfoClientes.
	 *
	 * Pr�-condi��o: recebe uma String CPF do cliente como par�metro.
	 * P�s-condi��o: n�o retorna nada, apenas imprime os atributos do objeto Cliente que possui o CPF passado como par�metro.
	 */
	public void  imprimeInfoClientes(String cpf) {
		boolean encontra = false;
		for (int i = 0; !encontra && i < clientes.length; i++)
			if (clientes[i] != null && clientes[i].ehIgual(cpf)) {
				System.out.println();
				clientes[i].imprimeInformacoesCliente();
				encontra = true;
			}
	}

	/**
	 * M�todo imprimeInfoFornecedores.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: n�o retorna nada, apenas imprime os atributos dos objetos do tipo Fornecedor.
	 */
	public void imprimeInfoFornecedores() {
		System.out.println("------------------------FORNECEDORES------------------------");
		alpha.ordena(fornecedores);
		for (int i = 0; i <= Ordenacao.cont; i++)
			if (fornecedores[i] != null) {
				fornecedores[i].imprimeInformacoesFornecedor();
				System.out.println();
			}
		System.out.println();
	}

	/**
	 * M�todo imprimeInfoFornecedores.
	 *
	 * Pr�-condi��o: recebe como par�metro uma String c�digo do fornecedor.
	 * P�s-condi��o: n�o retorna nada, apenas imprime os atributos do objeto Fornecedor que possui o c�digo passado como par�metro.
	 */
	public void  imprimeInfoFornecedores(String codigo) {
		boolean encontra = false;
		for (int i = 0; !encontra && i < fornecedores.length; i++)
			if (fornecedores[i] != null && fornecedores[i].ehIgual(codigo)) {
				System.out.println();
				fornecedores[i].imprimeInformacoesFornecedor();
				encontra = true;
			}
	}


	/**
	 * M�todo imprimeInfoFuncionarios.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: n�o retorna nada, apenas imprime os atributos dos objetos do tipo Funcionario.
	 */
	public void imprimeInfoFuncionarios() {
		System.out.println("------------------------FUNCIONARIOS------------------------");
		alpha.ordena(funcionarios);
		for (int i = 0; i <= Ordenacao.cont; i++)
			if (funcionarios[i] != null) {
				funcionarios[i].imprimeInformacoesFuncionario();
				System.out.println();

			}
		System.out.println();
	}

	/**
	 * M�todo imprimeInfoFuncionarios.
	 *
	 * Pr�-condi��o: recebe como par�metro uma String c�digo do funcion�rio.
	 * P�s-condi��o: n�o retorna nada, apenas imprime os atributos do objeto Funcion�rio que possui o c�digo passado como par�metro.
	 */
	public void  imprimeInfoFuncionarios(String codigo) {
		boolean encontra = false;
		for (int i = 0; !encontra && i < funcionarios.length; i++)
			if (funcionarios[i] != null && funcionarios[i].ehIgual(codigo)) {
				System.out.println();
				funcionarios[i].imprimeInformacoesFuncionario();
				encontra = true;
			}
	}

	/**
	 * M�todo imprimeInfoEstoque.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: n�o retorna nada, apenas imprime os atributos dos objetos do tipo Produto contido no atributo estoque..
	 */
	public void imprimeInfoEstoque() {
		System.out.println("------------------------ESTOQUE------------------------");
		alpha.ordena(estoque.getProdutos());
		this.estoque.imprimeInformacoesEstoque();
		System.out.println();
	}

	/**
	 * M�todo imprimeInfoEstoque.
	 *
	 * Pr�-condi��o: recebe como par�metro uma String c�digo do produto.
	 * P�s-condi��o: n�o retorna nada, apenas imprime os atributos do objeto Produto que possui o c�digo passado como par�metro.
	 */
	public void imprimeInfoEstoque(String codigo) {
		Produto imprime = this.estoque.procurarProduto(codigo);
		if(imprime != null)
			imprime.imprimeInformacoesProduto();
		else
			System.out.println("Produto n�o encontrado em estoque!");
	}

	/**
	 * M�todo imprimeInfoVendas.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: n�o retorna nada, apenas imprime os atributos dos objetos do tipo Venda.
	 */
	public void imprimeInfoVendas() {
		System.out.println("------------------------VENDAS REALIZADAS------------------------");
		for (int i = 0; i < vendas.length; i++)
			if (vendas[i] != null)
				vendas[i].imprimeInformacoesVenda();
	}
	
	/**
	 * M�todo imprimeInfoVendas.
	 *
	 * Pr�-condi��o: recebe como par�metro uma String CPF do cliente.
	 * P�s-condi��o: n�o retorna nada, apenas imprime os atributos do objeto Venda que possui o CPF do objeto Cliente passado como par�metro.
	 */
	public void imprimeInfoVendas(String cpfCliente) {
		System.out.println("------------------------VENDAS CLIENTE------------------------");
		for (int i = 0; i < vendas.length; i++)
			if (vendas[i] != null && vendas[i].getCliente().ehIgual(cpfCliente)) {
				vendas[i].imprimeInformacoesVenda();
			}
	}
	
	/**
	 * M�todo imprimeInfoImposto.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: n�o retorna nada, apenas imprime os atributos de tipo float, montanteVendasGlobal, impostoVendas, impostoFuncionarios e impostoTotal.
	 */
	public void imprimeInfoImposto() {
		System.out.println("------------------------IMPOSTO------------------------");
		if(this.impostoTotal > 0) {
			System.out.printf("Montante de venda global: %.2fR$.\n", this.montanteVendasGlobal);
			System.out.printf("Imposto sobre vendas: %.2fR$.\n", this.impostoVendas);
			System.out.printf("Imposto sobre sal�rio dos funcion�rios: %.2fR$.\n", this.impostoFuncionarios);
			System.out.printf("Imposto Total: %.2fR$.\n", this.impostoTotal);
		}
		else
			System.out.println("Imposto n�o foi calculado!");
	}
	
	/**
	 * M�todo imprimeInfoPadaria.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: n�o retorna nada, apenas chama todos os m�todos de impress�o da classe Padaria, exceto imprimeInfoVendas, e imprime eles.
	 */
	public void imprimeInfoPadaria() {
		System.out.println("------------------------PADARIA TREM B�O------------------------\n");
		imprimeInfoFuncionarios();
		imprimeInfoFornecedores();
		imprimeInfoEstoque();
		imprimeInfoClientes();
		imprimeInfoImposto();
	}

}
