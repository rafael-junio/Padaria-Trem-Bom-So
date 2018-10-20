package controle;

import javax.swing.JOptionPane;

import funcionalidades.Ordenacao;
import pessoa.fornecedor.*;
import controle.estoque.Estoque;
import pessoa.funcionario.*;
import pessoa.*;
import pessoa.cliente.*;
import controle.produto.*;



public class Padaria {

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
	 * Método construtor da classe Padaria.java.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public Padaria() {
		this.fornecedores = new Fornecedor[15];
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
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public Fornecedor[] getFornecedores() {
		return fornecedores;
	}

	/**
	 * Método setFornecedores.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setFornecedores(Fornecedor[] fornecedores) {
		this.fornecedores = fornecedores;
	}

	/**
	 * Método getEstoque.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public Estoque getEstoque() {
		return estoque;
	}

	/**
	 * Método setEstoque.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	/**
	 * Método getFuncionarios.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}

	/**
	 * Método setFuncionarios.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}

	/**
	 * Método getClientes.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public Cliente[] getClientes() {
		return clientes;
	}

	/**
	 * Método setClientes.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	/**
	 * Método getVendas.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public Venda[] getVendas() {
		return vendas;
	}

	/**
	 * Método setVendas.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setVendas(Venda[] vendas) {
		this.vendas = vendas;
	}

	/**
	 * Método getMontanteVendasGlobal.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public float getMontanteVendasGlobal() {
		return montanteVendasGlobal;
	}

	/**
	 * Método setMontanteVendasGlobal.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setMontanteVendasGlobal(float montanteVendasGlobal) {
		this.montanteVendasGlobal = montanteVendasGlobal;
	}

	/**
	 * Método cadastrarClienteRegular.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public boolean cadastrarClienteRegular(String nome, String endereco, String cpf, String telefone) {
		ClienteRegular cliente = new ClienteRegular(nome, endereco, cpf, telefone);

		for (int i = 0; i < clientes.length; i++)
			if (clientes[i] == null) {
				clientes[i] = cliente;
				cliente = null;
				return true;
			} else {
				if (clientes[i].ehIgual(cpf)) {
					cliente = null;
					return false;
				}
			}
		cliente = null;
		return false;
	}
	
	/**
	 * Método cadastrarClienteGold.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public boolean cadastrarClienteGold(String cpf) {

		for (int i = 0; i < clientes.length; i++)
			if (clientes[i] != null && clientes[i].ehIgual(cpf) && clientes[i].getValorCompras() > 250f){
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
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public boolean cadastrarClientePlatinum(String cpf) {

		for (int i = 0; i < clientes.length; i++)
			if (clientes[i] != null && clientes[i].getCpf().equals(cpf) && clientes[i].getValorCompras() > 500f){
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
	 * Pré-condição: 
	 * Pós-condição: 
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
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public Cliente encontraCliente(String cpf) {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null && clientes[i].ehIgual(cpf))
				return clientes[i];
		}
		return null;
	}

	/**
	 * Método cadastrarFornecedorOcasional.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public boolean cadastrarFornecedorOcasional(String nome, String endereco, String codigo, String cnpj) {
		FornecedorOcasional fornecedor = new FornecedorOcasional(nome, endereco, codigo, cnpj);

		for (int i = 0; i < fornecedores.length; i++)
			if (fornecedores[i] == null) {
				fornecedores[i] = fornecedor;
				fornecedor = null;
				return true;
			} else {
				if (fornecedores[i].ehIgual(codigo)) {
					fornecedor = null;
					return false;
				}
			}
		fornecedor = null;
		return false;
	}

	/**
	 * Método cadastrarFornecedorRecorrente.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public boolean cadastrarFornecedorRecorrente(String nome, String endereco, String codigo, String cnpj,
			float taxaDesconto) {
		FornecedorRecorrente fornecedor = new FornecedorRecorrente(nome, endereco, codigo, cnpj, taxaDesconto);

		for (int i = 0; i < fornecedores.length; i++)
			if (fornecedores[i] == null) {
				fornecedores[i] = fornecedor;
				fornecedor = null;
				return true;
			} else {
				if (fornecedores[i].ehIgual(codigo)) {
					fornecedor = null;
					return false;
				}
			}
		fornecedor = null;
		return false;
	}

	/**
	 * Método descadastrarFornecedor.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
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
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public Fornecedor encontraFornecedor(String codigo) {
		for (int i = 0; i < fornecedores.length; i++) {
			if (fornecedores[i] != null && fornecedores[i].ehIgual(codigo))
				return fornecedores[i];
		}
		return null;
	}

	/**
	 * Método cadastrarVendedor.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public boolean cadastrarVendedor(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase, float metaVendas) {
		Vendedor funcionario = new Vendedor(nome, endereco, cpf, telefone, codigo, salarioBase, metaVendas);

		for (int i = 0; i < funcionarios.length; i++)
			if (funcionarios[i] == null) {
				funcionarios[i] = funcionario;
				funcionario = null;
				return true;
			} else {
				if (funcionarios[i].ehIgual(codigo)) {
					funcionario = null;
					return false;
				}
			}
		funcionario = null;
		return false;
	}

	/**
	 * Método cadastrarGerente.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public boolean cadastrarGerente(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase) {
		Gerente funcionario = new Gerente(nome, endereco, cpf, telefone, codigo, salarioBase);

		for (int i = 0; i < funcionarios.length; i++)
			if (funcionarios[i] == null) {
				funcionarios[i] = funcionario;
				funcionario = null;
				return true;
			} else {
				if (funcionarios[i].ehIgual(codigo)) {
					funcionario = null;
					return false;
				}
			}
		funcionario = null;
		return false;
	}

	/**
	 * Método cadastrarPadeiro.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public boolean cadastrarPadeiro(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase) {
		Padeiro funcionario = new Padeiro(nome, endereco, cpf, telefone, codigo, salarioBase);

		for (int i = 0; i < funcionarios.length; i++)
			if (funcionarios[i] == null) {
				funcionarios[i] = funcionario;
				funcionario = null;
				return true;
			} else {
				if (funcionarios[i].ehIgual(codigo)) {
					funcionario = null;
					return false;
				}
			}
		funcionario = null;
		return false;
	}

	/**
	 * Método descadastrarFuncionario.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
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
	 * Pré-condição: 
	 * Pós-condição: 
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
	 * Pré-condição: 
	 * Pós-condição: 
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
	 * Método realizarVenda.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public boolean realizarVenda(String cpfCliente, String codigoVendedor, String formaPagamento, int numParcelas,
			int dia, int mes, int ano) {
		
		Cliente clienteVenda = encontraCliente(cpfCliente);
		
		Vendedor vendedor = encontraVendedor(codigoVendedor);

		Venda venda = new Venda(clienteVenda, vendedor, formaPagamento, numParcelas, comprasRealizadas, dia, mes, ano);

		for (int i = 0; i < vendas.length; i++)
			if (vendas[i] == null) {
				vendas[i] = venda;
				vendas[i].calcularValorFinalCompra(numParcelas);
				this.montanteVendasGlobal += vendas[i].getValorFinalCompra();
				venda = null;
				this.comprasRealizadas = null;
				this.comprasRealizadas = new Produto[20];
				return true;
			}
		venda = null;
		return false;

	}

	/**
	 * Método adicionarProdutoVenda.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
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
	 * Método procuraVenda.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public Venda procuraVenda(String cpfCliente) {
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
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void calcularImpostos() {
		impostoVendas = montanteVendasGlobal * 0.15f;
		for(int i =0; i < funcionarios.length; i++) {
			if(funcionarios[i] != null)
				impostoFuncionarios += funcionarios[i].calcularSalarioFinal();
		}
		this.impostoFuncionarios *= 0.18f;
		this.impostoTotal = impostoVendas + impostoFuncionarios;	
	}

	/**
	 * Método imprimeInfoClientes.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
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
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void  imprimeInfoClientes(String cpf) {
		boolean encontra = false;
		for (int i = 0; !encontra && i < clientes.length; i++)
			if (clientes[i] != null && clientes[i].ehIgual(cpf)) {
				JOptionPane.showMessageDialog(null, "Informação solicitada impressa no console");
				System.out.println();
				clientes[i].imprimeInformacoesCliente();
				encontra = true;
			}
	}

	/**
	 * Método imprimeInfoFornecedores.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
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
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void  imprimeInfoFornecedores(String codigo) {
		boolean encontra = false;
		for (int i = 0; !encontra && i < fornecedores.length; i++)
			if (fornecedores[i] != null && fornecedores[i].ehIgual(codigo)) {
				JOptionPane.showMessageDialog(null, "Informação solicitada impressa no console");
				System.out.println();
				System.out.println("----------Fornecedor encontrado-----------");
				fornecedores[i].imprimeInformacoesFornecedor();
				encontra = true;
			}
	}


	/**
	 * Método imprimeInfoFuncionarios.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
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
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void  imprimeInfoFuncionarios(String codigo) {
		boolean encontra = false;
		for (int i = 0; !encontra && i < funcionarios.length; i++)
			if (funcionarios[i] != null && funcionarios[i].ehIgual(codigo)) {
				JOptionPane.showMessageDialog(null, "Informação solicitada impressa no console");
				System.out.println();
				System.out.println("----------Funcionário encontrado-----------");
				funcionarios[i].imprimeInformacoesFuncionario();
				encontra = true;
			}
	}

	/**
	 * Método imprimeInfoEstoque.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
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
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void imprimeInfoEstoque(String codigo) {
		this.estoque.procurarProduto(codigo).imprimeInformacoesProduto();
	}

	/**
	 * Método imprimeInfoVendas.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
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
	 * Pré-condição: 
	 * Pós-condição: 
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
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void imprimeInfoImposto() {
		System.out.println("------------------------IMPOSTO------------------------");
		System.out.printf("Montante de venda global: %.2fR$.\n", this.montanteVendasGlobal);
		System.out.printf("Imposto sobre vendas: %.2fR$.\n", this.impostoVendas);
		System.out.printf("Imposto sobre salário dos funcionários: %.2fR$.\n", this.impostoFuncionarios);
		System.out.printf("Imposto Total: %.2fR$.\n", this.impostoTotal);
	}
	
	/**
	 * Método imprimeInfoPadaria.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
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
