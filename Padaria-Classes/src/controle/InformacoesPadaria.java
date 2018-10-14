package controle;

import cliente.Cliente;
import cliente.ClienteRegular;
import fornecedores.Fornecedor;
import fornecedores.FornecedorOcasional;
import fornecedores.FornecedorRecorrente;
import funcionarios.Funcionario;
import funcionarios.Gerente;
import funcionarios.Padeiro;
import funcionarios.Vendedor;
import funcionarios.Vendedores;

public class InformacoesPadaria {

	private Fornecedor[] fornecedores;
	private Estoque estoque;
	private Funcionario[] funcionarios;
	private Cliente[] clientes;
	private Venda[] vendas;
	private float montanteVendasGlobal;
	private float MontanteVendasComprador;
	private float MontanteVendasVendedor;

	public InformacoesPadaria() {
		fornecedores = new Fornecedor[15];
		estoque = new Estoque();
		funcionarios = new Funcionario[10];
		clientes = new Cliente[50];
		vendas = new Venda[20];
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
					System.out.println("Cliente já cadastrado!");
					cliente = null;
					return false;
				}
			}

		System.out.println("Não foi possível cadastrar!");
		cliente = null;
		return false;
	}

	public boolean descadastrarCliente(String cpf) {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i].getCpf().equals(cpf)) {
				clientes[i] = null;
				return true;
			}
		}

		System.out.println("Não foi possível descadastrar!");
		return false;

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
					System.out.println("Fornecedor já cadastrado!");
					fornecedores = null;
					return false;
				}
			}

		System.out.println("Não foi possível cadastrar!");
		fornecedores = null;
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
					System.out.println("Fornecedor já cadastrado!");
					fornecedores = null;
					return false;
				}
			}

		System.out.println("Não foi possível cadastrar!");
		fornecedores = null;
		return false;
	}

	public boolean descadastrarFornecedores(String cnpj) {

		for (int i = 0; i < fornecedores.length; i++)
			if (fornecedores[i].getCnpj().equals(cnpj)) {
				fornecedores[i] = null;
				return true;
			}
		System.out.println("Não foi possível descadastrar!");
		return false;
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
					System.out.println("Vendedor já cadastrado!");
					funcionario = null;
					return false;
				}
			}

		System.out.println("Não foi possível cadastrar!");
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
					System.out.println("Gerente já cadastrado!");
					funcionario = null;
					return false;
				}
			}

		System.out.println("Não foi possível cadastrar!");
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
					System.out.println("Padeiro já cadastrado!");
					funcionario = null;
					return false;
				}
			}

		System.out.println("Não foi possível cadastrar!");
		funcionario = null;
		return false;
	}

	// OK
	public boolean descadastrarFuncionarios(String cpf) {
		for (int i = 0; i < funcionarios.length; i++)
			if (funcionarios[i].getCpf().equals(cpf)) {
				funcionarios[i] = null;
				return true;
			}
		System.out.println("Não foi possível descadastrar!");
		return false;

	}

	public boolean realizarVendaProdutos(String cpfCliente, String codigoVendedor, String formaPagamento,
			int numParcelas, int dia, int mes, int ano) {

		int n = 0;
		int p = 0;
		int cont = 0;

		for (int j = 0; j < clientes.length && cont != 2; j++) {
			if (clientes[j] != null && clientes[j].getCpf().equals(cpfCliente)) {
				n = j;
				cont += 1;
			}

			if (j < funcionarios.length && funcionarios[j] != null
					&& funcionarios[j].getCodigo().equals(codigoVendedor)) {
				p = j;
				cont += 1;
			}
		}

		Venda venda = new Venda(clientes[n], (Vendedores) funcionarios[p], formaPagamento, numParcelas, dia, mes, ano);
		
		for (int i = 0; i < vendas.length; i++)
			if (vendas[i] == null) {
				vendas[i] = venda;
				venda = null;
				return true;
			}

		System.out.println("Não foi possível cadastrar!");
		venda = null;
		return false;
		venda.realizarVenda("123456", 0);

	}

	public void imprimeClientes() {
		System.out.println("***********************CLIENTES***********************");
		for (int i = 0; i < clientes.length; i++)
			if (clientes[i] != null)
				clientes[i].imprimeInformacoesCliente();
		System.out.println();
	}

	public void imprimefornecedores() {
		System.out.println("***********************FORNECEDORES***********************");
		for (int i = 0; i < fornecedores.length; i++)
			if (fornecedores[i] != null)
				fornecedores[i].imprimeInformacoesFornecedor();
		System.out.println();
	}

	public void imprimefuncionarios() {
		System.out.println("***********************FUNCIONARIOS***********************");
		for (int i = 0; i < funcionarios.length; i++)
			if (funcionarios[i] != null)
				funcionarios[i].imprimeInformacoesFuncionario();
		System.out.println();
		System.out.println();
	}

	public void imprimeProdutos() {
		System.out.println("***********************ESTOQUE***********************");
		this.estoque.imprimeInformacoesEstoque();
		System.out.println();
	}

	public void imprimeVendas() {
		System.out.println("***********************VENDAS REALIZADAS***********************");
		for (int i = 0; i < vendas.length; i++) {
			if(vendas[i] != null)
				vendas[i].imprimeInformacoesVenda();
	}

}
