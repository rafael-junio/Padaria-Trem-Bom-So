package controle;

import javax.swing.JOptionPane;

import cliente.Cliente;
import cliente.ClienteGold;
import cliente.ClientePlatinum;
import cliente.ClienteRegular;
import fornecedores.Fornecedor;
import fornecedores.FornecedorOcasional;
import fornecedores.FornecedorRecorrente;
import funcionalidades.Ordenacao;
import funcionalidades.ValidaDocumento;
import funcionarios.Funcionario;
import funcionarios.Gerente;
import funcionarios.Padeiro;
import funcionarios.Vendedor;
import produtos.Produto;

public class Padaria {

	private Fornecedor[] fornecedores;
	private Estoque estoque;
	private Funcionario[] funcionarios;
	private Cliente[] clientes;
	private Venda[] vendas;
	private float montanteVendasGlobal;
	private Produto[] comprasRealizadas;

	public Padaria() {
		this.fornecedores = new Fornecedor[15];
		this.estoque = new Estoque();
		this.funcionarios = new Funcionario[10];
		this.clientes = new Cliente[50];
		this.vendas = new Venda[20];
		this.comprasRealizadas = new Produto[20];

	}

	public Fornecedor[] getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(Fornecedor[] fornecedores) {
		this.fornecedores = fornecedores;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}

	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	public Venda[] getVendas() {
		return vendas;
	}

	public void setVendas(Venda[] vendas) {
		this.vendas = vendas;
	}

	public float getMontanteVendasGlobal() {
		return montanteVendasGlobal;
	}

	public void setMontanteVendasGlobal(float montanteVendasGlobal) {
		this.montanteVendasGlobal = montanteVendasGlobal;
	}

	public boolean cadastrarClienteRegular(String nome, String endereco, String cpf, String telefone) {
		ClienteRegular cliente = new ClienteRegular(nome, endereco, cpf, telefone);

		for (int i = 0; i < clientes.length; i++)
			if (clientes[i] == null) {
				clientes[i] = cliente;
				cliente = null;
				return true;
			} else {
				if (clientes[i].getCpf().equals(cpf)) {
//					System.out.println("Cliente já cadastrado!");
					cliente = null;
					return false;
				}
			}

//		System.out.println("Não foi possível cadastrar!");
		cliente = null;
		return false;
	}
	
	public boolean cadastrarClienteGold(String cpf) {

		for (int i = 0; i < clientes.length; i++)
			if (clientes[i] != null && clientes[i].getCpf().equals(cpf) && clientes[i].getValorCompras() > 90f){
				ClienteGold cliente = new ClienteGold(clientes[i].getNome(), clientes[i].getEndereco(), clientes[i].getCpf(), clientes[i].getTelefone());
				clientes[i] = null;
				clientes[i] = cliente;
				cliente = null;
				return true;
			}
		
		return false;
	}
	
	public boolean cadastrarClientePlatinum(String cpf) {

		for (int i = 0; i < clientes.length; i++)
			if (clientes[i] != null && clientes[i].getCpf().equals(cpf) && clientes[i].getValorCompras() > 500f){
				ClientePlatinum cliente = new ClientePlatinum(clientes[i].getNome(), clientes[i].getEndereco(), clientes[i].getCpf(), clientes[i].getTelefone());
				clientes[i] = null;
				clientes[i] = cliente;
				cliente = null;
				return true;
			}
		
		return false;
	}

	public boolean descadastrarCliente(String cpf) {
		for (int i = 0; i < clientes.length && clientes[i] != null; i++) {
			if (clientes[i].removeCaracteresEspeciais(clientes[i].getCpf()).equals(cpf)) {
				clientes[i] = null;
				return true;
			}
		}

//		System.out.println("Não foi possível descadastrar!");
		return false;

	}

	public Cliente encontraCliente(String cpf) {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null && clientes[i].getCpf().equals(cpf))
				return clientes[i];
		}
//		System.out.println("Cliente não encontrado!");
		return null;
	}

	public boolean cadastrarFornecedorOcasional(String nome, String endereco, String codigo, String cnpj) {
		FornecedorOcasional fornecedor = new FornecedorOcasional(nome, endereco, codigo, cnpj);

		for (int i = 0; i < fornecedores.length; i++)
			if (fornecedores[i] == null) {
				fornecedores[i] = fornecedor;
				fornecedor = null;
				return true;
			} else {
				if (fornecedores[i].getCnpj().equals(cnpj)) {
//					System.out.println("Fornecedor já cadastrado!");
					fornecedor = null;
					return false;
				}
			}

//		System.out.println("Não foi possível descadastrar!");
		fornecedor = null;
		return false;
	}

	public boolean cadastrarFornecedorRecorrente(String nome, String endereco, String codigo, String cnpj,
			float taxaDesconto) {
		FornecedorRecorrente fornecedor = new FornecedorRecorrente(nome, endereco, codigo, cnpj, taxaDesconto);

		for (int i = 0; i < fornecedores.length; i++)
			if (fornecedores[i] == null) {
				fornecedores[i] = fornecedor;
				fornecedor = null;
				return true;
			} else {
				if (fornecedores[i].getCnpj().equals(cnpj)) {
//					System.out.println("Fornecedor já cadastrado!");
					fornecedor = null;
					return false;
				}
			}
//		System.out.println("Não foi possível descadastrar!");
		fornecedor = null;
		return false;
	}

	public boolean descadastrarFornecedor(String codigo) {

		for (int i = 0; i < fornecedores.length && fornecedores[i] != null; i++)
			if (fornecedores[i].getCodigo().equals(codigo)) {
				fornecedores[i] = null;
				return true;
			}
//		System.out.println("Não foi possível descadastrar!");
		return false;
	}

	public Fornecedor encontraFornecedor(String codigo) {
		for (int i = 0; i < fornecedores.length; i++) {
			if (fornecedores[i] != null && fornecedores[i].getCodigo().equals(codigo))
				return fornecedores[i];
		}
//		System.out.println("Fornecedor não encontrado!");
		return null;
	}

	public boolean cadastrarVendedor(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase) {
		Vendedor funcionario = new Vendedor(nome, endereco, cpf, telefone, codigo, salarioBase);

		for (int i = 0; i < funcionarios.length; i++)
			if (funcionarios[i] == null) {
				funcionarios[i] = funcionario;
				funcionario = null;
				return true;
			} else {
				if (funcionarios[i].getCpf().equals(cpf)) {
//					System.out.println("Vendedor já cadastrado!");
					funcionario = null;
					return false;
				}
			}

//		System.out.println("Não foi possível descadastrar!");
		funcionario = null;
		return false;
	}

	public boolean cadastrarGerente(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase) {
		Gerente funcionario = new Gerente(nome, endereco, cpf, telefone, codigo, salarioBase);

		for (int i = 0; i < funcionarios.length; i++)
			if (funcionarios[i] == null) {
				funcionarios[i] = funcionario;
				funcionario = null;
				return true;
			} else {
				if (funcionarios[i].getCpf().equals(cpf)) {
//					System.out.println("Gerente já cadastrado!");
					funcionario = null;
					return false;
				}
			}

//		System.out.println("Não foi possível descadastrar!");
		funcionario = null;
		return false;
	}

	public boolean cadastrarPadeiro(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase) {
		Padeiro funcionario = new Padeiro(nome, endereco, cpf, telefone, codigo, salarioBase);

		for (int i = 0; i < funcionarios.length; i++)
			if (funcionarios[i] == null) {
				funcionarios[i] = funcionario;
				funcionario = null;
				return true;
			} else {
				if (funcionarios[i].getCpf().equals(cpf)) {
//					System.out.println("Padeiro já cadastrado!");
					funcionario = null;
					return false;
				}
			}

//		System.out.println("Não foi possível descadastrar!");
		funcionario = null;
		return false;
	}

	public boolean descadastrarFuncionario(String codigo) {
		for (int i = 0; i < funcionarios.length && funcionarios[i] != null; i++)
			if (funcionarios[i].getCodigo().equals(codigo)) {
				funcionarios[i] = null;
				return true;
			}
//		System.out.println("Não foi possível descadastrar!");
		return false;

	}

	public Funcionario encontraFuncionario(String codigo) {
		for (int i = 0; i < funcionarios.length; i++) {
			if (funcionarios[i] != null && funcionarios[i].getCodigo().equals(codigo))
				return funcionarios[i];
		}
//		System.out.println("Funcionário não encontrado!");
		return null;
	}

	public Vendedor encontraVendedor(String codigo) {
		for (int i = 0; i < funcionarios.length; i++) {
			if (funcionarios[i] != null && funcionarios[i].getCodigo().equals(codigo))
				if (funcionarios[i] instanceof Vendedor)
					return (Vendedor) funcionarios[i];
				else
					return null;
		}
//		System.out.println("Funcionário não encontrado!");
		return null;
	}

	public boolean realizarVenda(String cpfCliente, String codigoVendedor, String formaPagamento, int numParcelas,
			int dia, int mes, int ano) {
		
		Cliente c = encontraCliente(cpfCliente).clone();
		
		Vendedor v = encontraVendedor(codigoVendedor).clone();

		Venda venda = new Venda(c, v, formaPagamento, numParcelas, comprasRealizadas, dia, mes, ano);

		for (int i = 0; i < vendas.length; i++) {
			if (vendas[i] == null) {
				vendas[i] = venda;
				vendas[i].calcularValorFinalCompra(numParcelas);
				this.montanteVendasGlobal += vendas[i].getValorFinalCompra();
				venda = null;
				this.comprasRealizadas = null;
				this.comprasRealizadas = new Produto[20];
				return true;
			}

		}
//		System.out.println("Não foi possível criar nova venda!");
		venda = null;
		return false;

	}

	public boolean adicionarProdutoVenda(String codigo, int quantidade){

		if (estoque.venderQuantidadeProduto(codigo, quantidade)) {

			Produto produtoComprado = estoque.procurarProduto(codigo).clone();

			for (int i = 0; i < comprasRealizadas.length; i++)
				if (comprasRealizadas[i] == null) {
					comprasRealizadas[i] = produtoComprado;
					produtoComprado = null;
					return true;
				}
		}
		return false;
	}

	public Venda procuraVenda(String cpfCliente) {
		for (int i = 0; i < vendas.length; i++) {
			if (vendas[i] != null)
				if (vendas[i].getCliente().getCpf().equals(cpfCliente))
					return vendas[i];
		}
		return null;
	}

	public void imprimeInfoClientes() {
		System.out.println("***********************CLIENTES***********************");
		Ordenacao.ordena(clientes);
		for (int i = 0; i < clientes.length; i++)
			if (clientes[i] != null) {
				clientes[i].imprimeInformacoesCliente();
				System.out.println();
			}
		System.out.println();
	}

	public void  imprimeInfoClientes(String cpf) {
		boolean encontra = false;
		for (int i = 0; !encontra && i < clientes.length; i++) {
			if (clientes[i] != null && clientes[i].removeCaracteresEspeciais(clientes[i].getCpf()).equals(cpf)) {
				JOptionPane.showMessageDialog(null, "Informação solicitada impressa no console");
				System.out.println();
				clientes[i].imprimeInformacoesCliente();
				encontra = true;
			}
		}
	}

	public void imprimeInfoFornecedores() {
		System.out.println("***********************FORNECEDORES***********************");
		Ordenacao.ordena(fornecedores);
		for (int i = 0; i < fornecedores.length; i++)
			if (fornecedores[i] != null) {
				fornecedores[i].imprimeInformacoesFornecedor();
				System.out.println();
			}
		System.out.println();
	}

	public void  imprimeInfoFornecedores(String codigo) {
		boolean encontra = false;
		for (int i = 0; !encontra && i < fornecedores.length; i++) {
			if (fornecedores[i] != null && fornecedores[i].getCodigo().equals(codigo)) {
				JOptionPane.showMessageDialog(null, "Informação solicitada impressa no console");
				System.out.println();
				System.out.println("----------Fornecedor encontrado-----------");
				fornecedores[i].imprimeInformacoesFornecedor();
				encontra = true;
			}
		}
	}


	public void imprimeInfoFuncionarios() {
		System.out.println("***********************FUNCIONARIOS***********************");
		Ordenacao.ordena(funcionarios);
		for (int i = 0; i < funcionarios.length; i++)
			if (funcionarios[i] != null) {
				funcionarios[i].imprimeInformacoesFuncionario();
				System.out.println();

			}
		System.out.println();
	}

	public void  imprimeInfoFuncionarios(String codigo) {
		boolean encontra = false;
		for (int i = 0; !encontra && i < funcionarios.length; i++) {
			if (funcionarios[i] != null && funcionarios[i].getCodigo().equals(codigo)) {
				JOptionPane.showMessageDialog(null, "Informação solicitada impressa no console");
				System.out.println();
				System.out.println("----------Funcionário encontrado-----------");
				funcionarios[i].imprimeInformacoesFuncionario();
				encontra = true;
			}
		}
	}

	public void imprimeInfoProdutos() {
		System.out.println("***********************ESTOQUE***********************");
		Ordenacao.ordena(estoque.getProdutos());
		this.estoque.imprimeInformacoesEstoque();
		System.out.println();
	}

	public void imprimeInfoProdutos(String codigo) {
		this.estoque.procurarProduto(codigo).imprimeInformacoesProduto();
	}

	public void imprimeInfoVendas() {
		System.out.println("***********************VENDAS REALIZADAS***********************");
		for (int i = 0; i < vendas.length; i++)
			if (vendas[i] != null)
				vendas[i].imprimeInformacoesVenda();
	}

}
