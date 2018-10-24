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
 * @author Igor José Tamagno - RGA: 2018.1907.034-4
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
	 * Método construtor da classe Padaria.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: instância todos os atributos da classe.
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
	 * Método getFornecedores.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna o vetor de objetos do tipo Fornecedor, contendo os fornecedores cadastrados.
	 */
	public Fornecedor[] getFornecedores() {
		return fornecedores;
	}

	/**
	 * Método setFornecedores.
	 *
	 * Pré-condição: recebe como parâmetro um vetor de fornecedores.
	 * Pós-condição: não retorna nada, apenas instancia atributo vetor do tipo Fornecedor.
	 */
	public void setFornecedores(Fornecedor[] fornecedores) {
		this.fornecedores = fornecedores;
	}

	/**
	 * Método getEstoque.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição:retorna objeto do tipo Estoque, atributo contendo todos os produtos cadastrados.
	 */
	public Estoque getEstoque() {
		return estoque;
	}

	/**
	 * Método setEstoque.
	 *
	 * Pré-condição: recebe objeto da classe Estoque como parâmetro.
	 * Pós-condição: não retorna nada, apenas instancia atributo do tipo Estoque.
	 */
	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	/**
	 * Método getFuncionarios.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna vetor do tipo Funcionario, contendo os funcionários cadastrados.
	 */
	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}

	/**
	 * Método setFuncionarios.
	 *
	 * Pré-condição: recebe vetor de objetos da classe Funcionario como parâmetro.
	 * Pós-condição: não retorna nada, apenas instancia atributo vetor da tipo Funcionario.
	 */
	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}

	/**
	 * Método getClientes.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna vetor de objetos do tipo Cliente, contendo clientes cadastrados.
	 */
	public Cliente[] getClientes() {
		return clientes;
	}

	/**
	 * Método setClientes.
	 *
	 * Pré-condição: recebe vetor de objetos da classe Cliente como parâmetro.
	 * Pós-condição: não retorna nada, apenas instancia atributo vetor do tipo Cliente.
	 */
	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	/**
	 * Método getVendas.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna vetor de objetos do tipo Venda, contendo as vendas realizadas.
	 */
	public Venda[] getVendas() {
		return vendas;
	}

	/**
	 * Método setVendas.
	 *
	 * Pré-condição: recebe vetor do tipo Venda como parâmetro.
	 * Pós-condição: não retorna nada, apenas instancia atributo vetor do tipo Venda.
	 */
	public void setVendas(Venda[] vendas) {
		this.vendas = vendas;
	}

	/**
	 * Método getMontanteVendasGlobal.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna atributo do tipo float contendo o montante de vendas realizadas.
	 */
	public float getMontanteVendasGlobal() {
		return montanteVendasGlobal;
	}

	/**
	 * Método setMontanteVendasGlobal.
	 *
	 * Pré-condição: recebe variável do tipo float como parâmetro.
	 * Pós-condição: não retorna nada, apenas instancia atributo do tipo float montanteVendasGlobal, que contém montante de vendas realizadas.
	 */
	public void setMontanteVendasGlobal(float montanteVendasGlobal) {
		this.montanteVendasGlobal = montanteVendasGlobal;
	}
	
	/**
	 * Método getComprasRealizadas.
	 *
	 * Pré-condição: não recebe nenhum parâmetro
	 * Pós-condição: retorna vetor do tipo Produto que contém as os produtos vendidos.
	 */
	public Produto[] getComprasRealizadas() {
		return comprasRealizadas;
	}

	/**
	 * Método setComprasRealizadas.
	 *
	 * Pré-condição: recebe como parâmetro vetor do tipo Produto.
	 * Pós-condição: não retorna nada, apenas instancia atributo vetor do tipo Produto que contém os produtos vendidos.
	 */
	public void setComprasRealizadas(Produto[] comprasRealizadas) {
		this.comprasRealizadas = comprasRealizadas;
	}

	/**
	 * Método getImpostoVendas.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna valor do tipo float imposto sobre as vendas, impostoVendas.
	 */
	public float getImpostoVendas() {
		return impostoVendas;
	}

	/**
	 * Método setImpostoVendas.
	 *
	 * Pré-condição: recebe como parâmetro um valor float.
	 * Pós-condição: não retorna nada, apenas instacia atributo float impostoVendas.
	 */
	public void setImpostoVendas(float impostoVendas) {
		this.impostoVendas = impostoVendas;
	}

	/**
	 * Método getImpostoFuncionarios.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna valor do tipo float improsto sobre o salário dos funcionários, impostoFuncionarios.
	 */
	public float getImpostoFuncionarios() {
		return impostoFuncionarios;
	}

	/**
	 * Método setImpostoFuncionarios.
	 *
	 * Pré-condição: recebe como parâmetro um valor do tipo float.
	 * Pós-condição: não retorna nada, apenas instancia atributo impostoFuncionarios.
	 */
	public void setImpostoFuncionarios(float impostoFuncionarios) {
		this.impostoFuncionarios = impostoFuncionarios;
	}

	/**
	 * Método getImpostoTotal.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna valor do tipo float improsto total calculado, impostoTotal.
	 */
	public float getImpostoTotal() {
		return impostoTotal;
	}

	/**
	 * Método setImpostoTotal.
	 *
	 * Pré-condição: recebe como parâmetro um valor do tipo float.
	 * Pós-condição: não retorna nada, apenas instancia atributo impostoTotal.
	 */
	public void setImpostoTotal(float impostoTotal) {
		this.impostoTotal = impostoTotal;
	}

	/**
	 * Método getImpostosobrevendas.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna valor do atributo final tipo float PERCENTUALSOBREVENDAS.
	 */
	public float getPERCENTUALSOBREVENDAS() {
		return PERCENTUALSOBREVENDAS;
	}

	/**
	 * Método getImpostosobresalariofuncionarios.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna valor do atributo final tipo float PERCENTUALSOBRESALARIOFUNCIONARIOS.
	 */
	public float getPERCENTUALSOBRESALARIOFUNCIONARIOS() {
		return PERCENTUALSOBRESALARIOFUNCIONARIOS;
	}

	/**
	 * Método cadastrarClienteRegular.
	 *
	 * Pré-condição: recebe como parâmetro quatro Strings, o nome, endereço, CPF e telefone, respectivamente.
	 * Pós-condição: retorna um booleano, TRUE, caso cliente seja cadastrado com sucesso e FALSE, caso contrário.
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
	 * Método cadastrarClienteGold.
	 *
	 * Pré-condição: recebe String CPF do cliente regular, caso ele atenda a condição estabelecida, cliente é convertido em cliente gold.
	 * Pós-condição: retorna um booleano, TRUE, caso cliente seja atualizado com sucesso e FALSE, caso contrário.
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
	 * Método cadastrarClientePlatinum.
	 *
	 * Pré-condição: recebe String CPF do cliente regular, caso ele atenda a condição estabelecida, cliente é convertido em cliente platinum.
	 * Pós-condição: retorna um booleano, TRUE, caso cliente seja atualizado com sucesso e FALSE, caso contrário.
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
	 * Método descadastrarCliente.
	 *
	 * Pré-condição: recebe String CPF do cliente e o mesmo é descadastrado, caso ele seja encontrado.
	 * Pós-condição: retorna um booleano, TRUE, caso cliente seja descadastrado com sucesso e FALSE, caso contrário.
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
	 * Método encontraCliente.
	 *
	 * Pré-condição: recebe String CPF do cliente e procura por ele no sistema.
	 * Pós-condição: caso encontrado, retorna o objeto do tipo Cliente, caso contrário retorna null.
	 */
	public Cliente encontraCliente(String cpf) {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null && clientes[i].ehIgual(cpf))
				return clientes[i];
		}
		return null;
	}
	
	/**
	 * Método clienteEstaCadastrado.
	 *
	 * Pré-condição: recebe String CPF do cliente e procura por ele no sistema.
	 * Pós-condição: retorna um booleano, TRUE, caso cliente é encontrado e FALSE, caso contrário.
	 */
	public boolean clienteEstaCadastrado(String cpf) {
		for(int i = 0; i < this.clientes.length; i++)
			if(this.clientes[i] != null && this.clientes[i].ehIgual(cpf))
				return true;
		
		return false;
	}

	/**
	 * Método cadastrarFornecedorOcasional.
	 *
	 * Pré-condição: recebe como parâmetro quatro Strings, o nome, endereço, codigo e CNPJ, respectivamente.
	 * Pós-condição: retorna um booleano, TRUE, caso fornecedor ocasional seja cadastrado com sucesso e FALSE, caso contrário.
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
	 * Método cadastrarFornecedorRecorrente.
	 *
	 * Pré-condição: recebe como parâmetro quatro Strings e um float, o nome, endereço, codigo, CNPJ e taxa de desconto, respectivamente.
	 * Pós-condição: retorna um booleano, TRUE, caso fornecedor recorrente seja cadastrado com sucesso e FALSE, caso contrário.
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
	 * Método descadastrarFornecedor.
	 *
	 * Pré-condição: recebe String codigo do fornecedor e o mesmo é descadastrado, caso ele seja encontrado.
	 * Pós-condição: retorna um booleano, TRUE, caso fornecedor seja descadastrado com sucesso e FALSE, caso contrário.
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
	 * Método encontraFornecedor.
	 *
	 * Pré-condição: recebe String codigo do fornecedor e procura por ele no sistema.
	 * Pós-condição: caso encontrado, retorna o objeto do tipo Fornecedor, caso contrário retorna null.
	 */
	public Fornecedor encontraFornecedor(String codigo) {
		for (int i = 0; i < fornecedores.length; i++) {
			if (fornecedores[i] != null && fornecedores[i].ehIgual(codigo))
				return fornecedores[i];
		}
		return null;
	}
	
	/**
	 * Método fornecedorEstaCadastrado.
	 *
	 * Pré-condição: recebe String código do fornecedor e procura por ele no sistema.
	 * Pós-condição: retorna um booleano, TRUE, caso fornecedor é encontrado e FALSE, caso contrário.
	 */
	public boolean fornecedorEstaCadastrado(String codigo) {
		for(int i = 0; i < this.fornecedores.length; i++)
			if(this.fornecedores[i] != null && this.fornecedores[i].ehIgual(codigo))
				return true;
		
		return false;
	}

	/**
	 * Método cadastrarVendedor.
	 *
	 * Pré-condição: recebe como parâmetro cinco Strings e dois floats, o nome, endereço, CPF, telefone, codigo, salário base e a meta de vendas, respectivamente.
	 * Pós-condição: retorna um booleano, TRUE, caso vendedor seja cadastrado com sucesso e FALSE, caso contrário.
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
	 * Método cadastrarGerente.
	 *
	 * Pré-condição: recebe como parâmetro cinco Strings e um float, o nome, endereço, CPF, telefone, codigo e o salário base, respectivamente.
	 * Pós-condição: retorna um booleano, TRUE, caso gerente seja cadastrado com sucesso e FALSE, caso contrário.
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
	 * Método cadastrarPadeiro.
	 *
	 * Pré-condição: recebe como parâmetro cinco Strings e um float, o nome, endereço, CPF, telefone, codigo e o salário base, respectivamente.
	 * Pós-condição: retorna um booleano, TRUE, caso padeiro seja cadastrado com sucesso e FALSE, caso contrário.
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
	 * Método descadastrarFuncionario.
	 *
	 * Pré-condição: recebe String codigo do funcionário e o mesmo é descadastrado, caso ele seja encontrado.
	 * Pós-condição: retorna um booleano, TRUE, caso funcionário seja descadastrado com sucesso e FALSE, caso contrário.
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
	 * Método encontraFuncionario.
	 *
	 * Pré-condição: recebe String codigo do funcionário e procura por ele no sistema.
	 * Pós-condição: caso encontrado, retorna o objeto do tipo Funcionário, caso contrário retorna null.
	 */
	public Funcionario encontraFuncionario(String codigo) {
		for (int i = 0; i < funcionarios.length; i++) {
			if (funcionarios[i] != null && funcionarios[i].ehIgual(codigo))
				return funcionarios[i];
		}
		return null;
	}

	/**
	 * Método encontraVendedor.
	 *
	 * Pré-condição: recebe String codigo do vendedor e procura por ele no sistema.
	 * Pós-condição: caso encontrado, retorna o objeto do tipo Vendedor, caso contrário retorna null.
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
	 * Método funcionarioEstaCadastrado.
	 *
	 * Pré-condição: recebe String código do funcionário e procura por ele no sistema.
	 * Pós-condição: retorna um booleano, TRUE, caso funcionário é encontrado e FALSE, caso contrário.
	 */
	public boolean funcionarioEstaCadastrado(String codigo) {
		for(int i = 0; i < this.funcionarios.length; i++)
			if(this.funcionarios[i] != null && this.funcionarios[i].ehIgual(codigo))
				return true;
		
		return false;
	}

	/**
	 * Método realizarVenda.
	 *
	 * Pré-condição: recebe três Strings e quatro floats, o CPF do cliente, o código do vendedor, a forma de pagamento, o número de parcelas e a data (dia, mes, ano), respectivamente.
	 * Pós-condição: retorna um booleano, TRUE, caso venda seja realizada e armazanada no vetor de objetos do tipo Venda, e FALSE, caso contrário.
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
	 * Método adicionarProdutoVenda.
	 *
	 * Pré-condição: recebe uma String e um inteiro, o código do produto e a quantidade daquele produto, respectivamente
	 * Pós-condição: retorna um booleano, TRUE, caso produto seja adicionado ao vetor de objetos do tipo Produto, e FALSE, caso contrário.
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
	 * Método removeProdutosVenda.
	 *
	 * Pré-condição: Sem pré-condição.
	 * Pós-condição: Sem retorno, apenas apaga os dados atuais do vetor de comprasRealizadas e instância 20 novos objetos.
	 */
	
	public void removeProdutosVenda() {
		comprasRealizadas = null;
		comprasRealizadas = new Produto[20];
	}

	/**
	 * Método procuraVenda.
	 *
	 * Pré-condição: recebe String CPF do cliente e procura por ele no sistema.
	 * Pós-condição: caso encontrado, retorna o objeto do tipo Venda, caso contrário retorna null.
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
	 * Método calcularImpostos.
	 *
	 * Pré-condição: não recebe nenhum parâmetro, 
	 * Pós-condição: não retorna nada, apenas calcula e instancia os atributos do tipo float impostoVendas, impostoFuncionario e impostoTotal, responsáveis por armazenar os impostos a serem pagos. 
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
	 * Método imprimeInfoClientes.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: não retorna nada, apenas imprime os atributos dos objetos do tipo Cliente.
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
	 * Método imprimeInfoClientes.
	 *
	 * Pré-condição: recebe uma String CPF do cliente como parâmetro.
	 * Pós-condição: não retorna nada, apenas imprime os atributos do objeto Cliente que possui o CPF passado como parâmetro.
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
	 * Método imprimeInfoFornecedores.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: não retorna nada, apenas imprime os atributos dos objetos do tipo Fornecedor.
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
	 * Método imprimeInfoFornecedores.
	 *
	 * Pré-condição: recebe como parâmetro uma String código do fornecedor.
	 * Pós-condição: não retorna nada, apenas imprime os atributos do objeto Fornecedor que possui o código passado como parâmetro.
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
	 * Método imprimeInfoFuncionarios.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: não retorna nada, apenas imprime os atributos dos objetos do tipo Funcionario.
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
	 * Método imprimeInfoFuncionarios.
	 *
	 * Pré-condição: recebe como parâmetro uma String código do funcionário.
	 * Pós-condição: não retorna nada, apenas imprime os atributos do objeto Funcionário que possui o código passado como parâmetro.
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
	 * Método imprimeInfoEstoque.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: não retorna nada, apenas imprime os atributos dos objetos do tipo Produto contido no atributo estoque..
	 */
	public void imprimeInfoEstoque() {
		System.out.println("------------------------ESTOQUE------------------------");
		alpha.ordena(estoque.getProdutos());
		this.estoque.imprimeInformacoesEstoque();
		System.out.println();
	}

	/**
	 * Método imprimeInfoEstoque.
	 *
	 * Pré-condição: recebe como parâmetro uma String código do produto.
	 * Pós-condição: não retorna nada, apenas imprime os atributos do objeto Produto que possui o código passado como parâmetro.
	 */
	public void imprimeInfoEstoque(String codigo) {
		Produto imprime = this.estoque.procurarProduto(codigo);
		if(imprime != null)
			imprime.imprimeInformacoesProduto();
		else
			System.out.println("Produto não encontrado em estoque!");
	}

	/**
	 * Método imprimeInfoVendas.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: não retorna nada, apenas imprime os atributos dos objetos do tipo Venda.
	 */
	public void imprimeInfoVendas() {
		System.out.println("------------------------VENDAS REALIZADAS------------------------");
		for (int i = 0; i < vendas.length; i++)
			if (vendas[i] != null)
				vendas[i].imprimeInformacoesVenda();
	}
	
	/**
	 * Método imprimeInfoVendas.
	 *
	 * Pré-condição: recebe como parâmetro uma String CPF do cliente.
	 * Pós-condição: não retorna nada, apenas imprime os atributos do objeto Venda que possui o CPF do objeto Cliente passado como parâmetro.
	 */
	public void imprimeInfoVendas(String cpfCliente) {
		System.out.println("------------------------VENDAS CLIENTE------------------------");
		for (int i = 0; i < vendas.length; i++)
			if (vendas[i] != null && vendas[i].getCliente().ehIgual(cpfCliente)) {
				vendas[i].imprimeInformacoesVenda();
			}
	}
	
	/**
	 * Método imprimeInfoImposto.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: não retorna nada, apenas imprime os atributos de tipo float, montanteVendasGlobal, impostoVendas, impostoFuncionarios e impostoTotal.
	 */
	public void imprimeInfoImposto() {
		System.out.println("------------------------IMPOSTO------------------------");
		if(this.impostoTotal > 0) {
			System.out.printf("Montante de venda global: %.2fR$.\n", this.montanteVendasGlobal);
			System.out.printf("Imposto sobre vendas: %.2fR$.\n", this.impostoVendas);
			System.out.printf("Imposto sobre salário dos funcionários: %.2fR$.\n", this.impostoFuncionarios);
			System.out.printf("Imposto Total: %.2fR$.\n", this.impostoTotal);
		}
		else
			System.out.println("Imposto não foi calculado!");
	}
	
	/**
	 * Método imprimeInfoPadaria.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: não retorna nada, apenas chama todos os métodos de impressão da classe Padaria, exceto imprimeInfoVendas, e imprime eles.
	 */
	public void imprimeInfoPadaria() {
		System.out.println("------------------------PADARIA TREM BÃO------------------------\n");
		imprimeInfoFuncionarios();
		imprimeInfoFornecedores();
		imprimeInfoEstoque();
		imprimeInfoClientes();
		imprimeInfoImposto();
	}

}
