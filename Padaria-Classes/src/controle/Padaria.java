package controle;

import java.util.Scanner;

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
import produtos.Produto;
import produtos.ProdutoNaoPerecivel;
import produtos.ProdutoPerecivel;

public class Padaria {
	
	Scanner teclado = new Scanner(System.in);
	
	private Fornecedor[] fornecedores;
	private Estoque[] estoque;
	private Funcionario[] funcionarios;
	private Cliente[] clientes;
	private Venda[] vendas;
	private float montanteVendasGlobal;
	private float MontanteVendasComprador;
	private float MontanteVendasVendedor;

	public Padaria() {
		this.fornecedores = new Fornecedor[15];
		this.estoque = new Estoque[50];
		this.funcionarios = new Funcionario[10];
		this.clientes = new Cliente[50];
		this.vendas = new Venda[20];
		
	}

	public Fornecedor[] getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(Fornecedor[] fornecedores) {
		this.fornecedores = fornecedores;
	}

	/*public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}*/

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

	public float getMontanteVendasComprador() {
		return MontanteVendasComprador;
	}

	public void setMontanteVendasComprador(float montanteVendasComprador) {
		MontanteVendasComprador = montanteVendasComprador;
	}

	public float getMontanteVendasVendedor() {
		return MontanteVendasVendedor;
	}

	public void setMontanteVendasVendedor(float montanteVendasVendedor) {

		MontanteVendasVendedor = montanteVendasVendedor;
	}

	public boolean cadastrarProdutoNaoPerecivel(String nome, String codigo, Fornecedor fornecedor, float precoCusto,
			float precoFinal, String[] apelido, int quantidadeEstoque) {
		
		boolean jaCadastrado = produtoEmEstoque(codigo);
		
		if(!jaCadastrado) {
			for (int i = 0; i < estoque.length; i++) {
				if (estoque[i] == null) {
						estoque[i] = new Estoque(nome, codigo, fornecedor, precoCusto, precoFinal, apelido, quantidadeEstoque);
						System.out.println("Produto cadastrado com sucesso!");
						return true;
				}
			}
		}
		else {
			System.out.println("Produto já cadastrado");
		}
		return false;
	}

	public boolean cadastrarProdutoPerecivel(String nome, String codigo, Fornecedor fornecedor, float precoCusto,
			float precoFinal, int dia, int mes, int ano, String[] apelido, int quantidadeEstoque) {
		
		boolean jaCadastrado = produtoEmEstoque(codigo);
		
		if(!jaCadastrado) {
			for (int i = 0; i < estoque.length; i++) {
				if (estoque[i] == null) {
						estoque[i] = new Estoque(nome, codigo, fornecedor, precoCusto, precoFinal, dia, mes, ano, apelido, quantidadeEstoque);
						System.out.println("Produto cadastrado com sucesso!");
						return true;
				}
			}
		}
		else {
			System.out.println("Produto já cadastrado");
		}
		return false;
	}

	public boolean descadastrarProduto(String codigo, int quantidade) {
		
		for (int i = 0; i < estoque.length; i++) {
			if (estoque[i] != null && estoque[i].getCodigo().equals(codigo)) {
				estoque[i] = null;
				return true;
				}	
			}
		
		return false; // produto não encontrado
	}
	
	public boolean produtoEmEstoque(String codigo) {
		for (int i = 0; i < estoque.length; i++) {
			if (estoque[i] != null && estoque[i].getCodigo().equals(codigo)) {
				return true;
			}
		}
		return false;
	}
	
	public void imprimeInformacoesEstoque() {
		for (Estoque i : estoque) {
			if (i != null) {
				i.imprimeInformacoesProduto();
				System.out.printf("Contém %d unidade(s) em estoque.\n", i.getQuantidadeEstoque());
				System.out.println();
			}
		}
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
	
	public Cliente encontraCliente(String cpf) {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null && clientes[i].getCpf().equals(cpf))
				return clientes[i];
		}
		System.out.println("Cliente não encontrado!");
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
					System.out.println("Fornecedor já cadastrado!");
					fornecedores = null;
					return false;
				}
			}

		System.out.println("Não foi possível descadastrar!");
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

		System.out.println("Não foi possível descadastrar!");
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
	
	public Fornecedor  encontraFornecedor(String codigo) {
		for (int i = 0; i < fornecedores.length; i++) {
			if (fornecedores[i] != null && fornecedores[i].getCodigo().equals(codigo))
				return fornecedores[i];
		}
		System.out.println("Fornecedor não encontrado!");
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
					System.out.println("Vendedor já cadastrado!");
					funcionario = null;
					return false;
				}
			}

		System.out.println("Não foi possível descadastrar!");
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

		System.out.println("Não foi possível descadastrar!");
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

		System.out.println("Não foi possível descadastrar!");
		funcionario = null;
		return false;
	}

	public boolean descadastrarFuncionarios(String cpf) {
		for (int i = 0; i < funcionarios.length; i++)
			if (funcionarios[i].getCpf().equals(cpf)) {
				funcionarios[i] = null;
				return true;
			}
		System.out.println("Não foi possível descadastrar!");
		return false;

	}
	
	public Funcionario  encontraFuncionario(String codigo) {
		for (int i = 0; i < funcionarios.length; i++) {
			if (funcionarios[i] != null && funcionarios[i].getCodigo().equals(codigo))
				return funcionarios[i];
		}
		System.out.println("Funcionário não encontrado!");
		return null;
	}

	public boolean realizarVendaProdutos(String cpfCliente, String codigoVendedor, String formaPagamento,
			int numParcelas, int dia, int mes, int ano) {

		int c = 0;
		int f = 0;
		int cont = 0;

		for (int j = 0; j < clientes.length && cont != 2; j++) {
			if (clientes[j] != null && clientes[j].getCpf().equals(cpfCliente)) {
				c = j;
				cont += 1;
			}

			if (j < funcionarios.length && funcionarios[j] != null
					&& funcionarios[j].getCodigo().equals(codigoVendedor)) {
				f = j;
				cont += 1;
			}
		}

		Venda venda = new Venda(clientes[c], (Vendedores) funcionarios[f], formaPagamento, numParcelas, dia, mes, ano);
		
		
		
		boolean maisProduto = false;
		
		for (int i = 0; i < vendas.length; i++)
			if (vendas[i] == null) {
				this.vendas[i] = venda;
//				venda = null;
				
				System.out.print("Digite o código do produto: ");
				String codigoProduto = "000001"; //teclado.next();
				
				System.out.print("Digite a quantidade do produto: ");
				int quantidade = 30; //teclado.nSextInt();
				
				do {
					adicionarProdutoVenda(codigoProduto, quantidade, i);
				
					System.out.print("Deseja cadastrar mais produtos? ");
//					maisProduto = teclado.nextBoolean();
				
				} while (maisProduto);
				
				vendas[i].calcularValorFinalCompra(numParcelas);
				this.montanteVendasGlobal = vendas[i].getValorFinalCompra();
				funcionarios[f].atualizarMontanteVendas(vendas[i].getValorFinalCompra());
				return true;
			}

		System.out.println("Não foi possível cadastrar venda!");
		venda = null;
		return false;
	}
	
	public boolean adicionarProdutoVenda(String codigo, int quantidade, int n) {
		
		for (int i = 0; i < estoque.getProdutos().length; i++)
			
			if (estoque.getProdutos()[i] != null)
			
				if (estoque.getProdutos()[i].getCodigo().equals("codigo"))
				
					if ((estoque.getProdutos()[i].getQuantidade() - quantidade) > 0) {
					
						estoque.descadastrarProduto(codigo, quantidade);
						
						this.vendas[n].adicionarProduto(estoque.getProdutos()[i]);
						
						this.vendas[n].calcularValorCompra(estoque.getProdutos()[i].getPrecoFinal());
						
						return true;
					} else if (((estoque.getProdutos()[i].getQuantidade() - quantidade) == 0)) {
						///////////////////////////////////////////////////////////////////
						estoque.getProdutos()[i].setQuantidade(estoque.getProdutos()[i].getQuantidade() - quantidade);
//						produtos[i] = null;
					}
		return false;
	}
	
	public Venda procuraVenda(String cpfCliente) {
		for (int i = 0; i < vendas.length; i++) {
			if (vendas[i] != null)
				if(vendas[i].getCliente().getCpf().equals("cpfCliente"))
					return vendas[i];
		}
		return null;
	}

	public void imprimeInfoClientes() {
		System.out.println("***********************CLIENTES***********************");
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
			if (clientes[i] != null && clientes[i].getCpf().equals(cpf)) {
				clientes[i].imprimeInformacoesCliente();
				encontra = true;
			}
		}
		if(encontra == false)
			System.out.println("Cliente não encontrado!");
	}

	public void imprimeInfoFornecedores() {
		System.out.println("***********************FORNECEDORES***********************");
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
				fornecedores[i].imprimeInformacoesFornecedor();
				encontra = true;
			}
		}
		if(encontra == false)
			System.out.println("Fornecedor não encontrado!");
	}

	public void imprimeInfoFuncionarios() {
		System.out.println("***********************FUNCIONARIOS***********************");
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
				funcionarios[i].imprimeInformacoesFuncionario();
				encontra = true;
			}
		}
		if(encontra == false)
			System.out.println("Funcionário não encontrado!");
	}

	public void imprimeInfoProdutos() {
		System.out.println("***********************ESTOQUE***********************");
		imprimeInformacoesEstoque();
		System.out.println();
	}
	
	public void  imprimeInfoProdutos(String codigo) {
		boolean encontra = produtoEmEstoque(codigo);
		
		if(encontra == false)
			System.out.println("Produto não encontrado!");
	}

	public void imprimeInfoVendas() {
		System.out.println("***********************VENDAS REALIZADAS***********************");
		for (int i = 0; i < vendas.length; i++)
			if(vendas[i] != null)
				vendas[i].imprimeInformacoesVenda();
	}

}
