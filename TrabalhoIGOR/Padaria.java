package trabalhoProgooII.TrabalhoIGOR;

public class Padaria {

	private Cliente [] clientesPadaria;
	private Fornecedores[] fornecedoresPadaria;
	private Funcionario [] funcionariosPadaria;
	private Vendas [] vendasPadaria;
	private Produto[] produtosPadaria;
	private Produto [] carrinhoDeComprasTemp;
	private float montanteVendasGlobal;
	private float MontanteVendasComprador;
	private float MontanteVendasVendedor;
	
	public Padaria() {
		//Estoque estoquePadaria = new Estoque();
		clientesPadaria = new Cliente [50];
		fornecedoresPadaria = new Fornecedores [50];
		funcionariosPadaria = new Funcionario [50];
		vendasPadaria = new Vendas[50];
		produtosPadaria = new Produto[50];
		carrinhoDeComprasTemp = new Produto[20];
	}
	
	
	public Produto[] getProdutosPadaria() {
		return produtosPadaria;
	}


	public void setProdutosPadaria(Produto[] produtosPadaria) {
		this.produtosPadaria = produtosPadaria;
	}


	public void setMontanteVendasGlobal(float montanteVendasGlobal) {
		this.montanteVendasGlobal = montanteVendasGlobal;
	}
	//OK
	public void cadastrarClientes(String nome, String endereco, String telefone, String cpf, String codigoCliente) {
		Cliente cliente = new Cliente(nome, endereco, telefone, cpf, codigoCliente);
		boolean cadastrado = false;
		for(int i=0; i < clientesPadaria.length && !cadastrado; i++) {
			if(clientesPadaria[i] == null) {
				clientesPadaria[i] = cliente;
				cadastrado = true;
			}
		}
		if (cadastrado)
			System.out.println("Cadastrado com Sucesso");
		else
			System.out.println("Erro ao cadastrar");
		
	}
	//OK
	public void descadastrarClientes(String cpf)  {
		boolean descadastrado = false;
		for(int i=0; i < clientesPadaria.length && !descadastrado; i++) {
			if(clientesPadaria[i].getCpf().equals(cpf)) {
				clientesPadaria[i] = null;
				descadastrado = true;
			}
		}
		if (descadastrado)
			System.out.println("Cadastrado com Sucesso");
		else
			System.out.println("Erro ao cadastrar");
		
	}
	//OK
	public void cadastrarFornecedorNaoRecorrente(String nome, String endereco, String cnpj, String codigoFornecedor){
		Fornecedores fornecedor = new FornecedorNaoRecorrente(nome,endereco,cnpj,codigoFornecedor);
		boolean cadastrado = false;
		for(int i=0; i < fornecedoresPadaria.length && !cadastrado; i++) {
			if(fornecedoresPadaria[i] == null) {
				fornecedoresPadaria[i] = fornecedor;
				cadastrado = true;
			}
		}
		if (cadastrado)
			System.out.println("Cadastrado com Sucesso");
		else
			System.out.println("Erro ao cadastrar");
		
	}
	//OK
	public void cadastrarFornecedorRecorrente(String nome, String endereco, String cnpj, float txDesconto, String codigoFornecedor){
		Fornecedores fornecedor = new FornecedorRecorrente(nome,endereco,cnpj, txDesconto, codigoFornecedor);
		boolean cadastrado = false;
		for(int i=0; i < fornecedoresPadaria.length && !cadastrado; i++) {
			if(fornecedoresPadaria[i] == null) {
				fornecedoresPadaria[i] = fornecedor;
				cadastrado = true;
			}
		}
		if (cadastrado)
			System.out.println("Cadastrado com Sucesso");
		else
			System.out.println("Erro ao cadastrar");
		
	}
	//OK
	public void descadastrarFornecedores(String cnpj)  {
		boolean descadastrado = false;
		for(int i=0; i < fornecedoresPadaria.length && !descadastrado; i++) {
			if(fornecedoresPadaria[i].getCnpj().equals(cnpj)) {
				fornecedoresPadaria[i] = null;
				descadastrado = true;
			}
		}
		if (descadastrado)
			System.out.println("Descadastrado com Sucesso");
		else
			System.out.println("Erro ao descadastrar");
		
	}
	//OK
	public void cadastrarVendedor(String nome, String endereco, String telefone, String cpf, float salarioBase, String codigo) {
		Funcionario funcionario = new Vendedor(nome, endereco, telefone, cpf, salarioBase, codigo);
		boolean cadastrado = false;
		for(int i=0; i < funcionariosPadaria.length && !cadastrado; i++) {
			if(funcionariosPadaria[i] == null) {
				funcionariosPadaria[i] = funcionario;
				cadastrado = true;
			}
		}
		if (cadastrado)
			System.out.println("Cadastrado com Sucesso");
		else
			System.out.println("Erro ao cadastrar");
		
	}
	//OK
	public void cadastrarGerente(String nome, String endereco, String telefone, String cpf, float salarioBase, String codigo) {
		Funcionario funcionario = new Gerente(nome, endereco, telefone, cpf, salarioBase, codigo);
		boolean cadastrado = false;
		for(int i=0; i < funcionariosPadaria.length && !cadastrado; i++) {
			if(funcionariosPadaria[i] == null) {
				funcionariosPadaria[i] = funcionario;
				cadastrado = true;
			}
		}
		if (cadastrado)
			System.out.println("Cadastrado com Sucesso");
		else
			System.out.println("Erro ao cadastrar");
		
	}
	//OK
	public void cadastrarPadeiro(String nome, String endereco, String telefone, String cpf, float salarioBase, String codigo, int horasTrabalhadas) {
		Funcionario funcionario = new Padeiro(nome, endereco, telefone, cpf, salarioBase, codigo, horasTrabalhadas);
		boolean cadastrado = false;
		for(int i=0; i < funcionariosPadaria.length && !cadastrado; i++) {
			if(funcionariosPadaria[i] == null) {
				funcionariosPadaria[i] = funcionario;
				cadastrado = true;
			}
		}
		if (cadastrado)
			System.out.println("Cadastrado com Sucesso");
		else
			System.out.println("Erro ao cadastrar");
		
	}
	//OK
	public void descadastrarFuncionarios(String	cpf) {
		boolean descadastrado = false;
		for(int i=0; i < funcionariosPadaria.length && !descadastrado; i++) {
			if(funcionariosPadaria[i].getCpf().equals(cpf)) {
				funcionariosPadaria[i] = null;
				descadastrado = true;
			}
		}
		if (descadastrado)
			System.out.println("Descadastrado com Sucesso");
		else
			System.out.println("Erro ao descadastrar");
		
	}
	//OK
	public void cadastrarProdutoNaoPerecivel(String nome, String codigoProduto, String codigoFornecedor, float precoCusto, float precoFinal, int qtdProdutos) {
		Produto produto = new ProdutoNaoPerecivel(nome,codigoProduto,codigoFornecedor,precoCusto,precoFinal, qtdProdutos);
		boolean cadastrado = false;
		for(int i=0; i < produtosPadaria.length && !cadastrado; i++) {
			if(produtosPadaria[i] == null) {
				produtosPadaria[i] = produto;
				cadastrado = true;
			}
		}
		if (cadastrado)
			System.out.println("Cadastrado com Sucesso");
		else
			System.out.println("Erro ao cadastrar");
		
	}
	//OK
	public void cadastrarProdutoPerecivel(String nome, String codigoProduto, String codigoFornecedor, float precoCusto, float precoFinal, int diaValidade, int mesValidade, int anoValidade, int qtdProdutos) {
		Produto produto = new ProdutoPerecivel(nome,codigoProduto,codigoFornecedor,precoCusto,precoFinal,diaValidade,mesValidade,anoValidade,qtdProdutos);
		boolean cadastrado = false;
		for(int i=0; i < produtosPadaria.length && !cadastrado; i++) {
			if(produtosPadaria[i] == null) {
				produtosPadaria[i] = produto;
				cadastrado = true;
			}
		}
		if (cadastrado)
			System.out.println("Cadastrado com Sucesso");
		else
			System.out.println("Erro ao cadastrar");
		
	}
	//OK
	public void descadastrarProdutos(String	codigoProduto) {
		boolean descadastrado = false;
		for(int i=0; i < produtosPadaria.length && !descadastrado; i++) {
			if(produtosPadaria[i].getCodigoProduto().equals(codigoProduto)) {
				produtosPadaria[i] = null;
				descadastrado = true;
			}
		}
		if (descadastrado)
			System.out.println("Descadastrado com Sucesso");
		else
			System.out.println("Erro ao descadastrar");
		
	}
	
	public void adicionarProdutoCarrinhoCompras(String codigoProduto) {
		int indiceProduto=0;
			
		for(int p=0; p < produtosPadaria.length-1; p++) {
			if(produtosPadaria[p] != null && (produtosPadaria[p].getCodigoProduto().equals(codigoProduto) == true))
				indiceProduto = p;}
		
		boolean cadastrado = false;
			for(int j=0; j < carrinhoDeComprasTemp.length && !cadastrado; j++) {
				if(carrinhoDeComprasTemp[j] == null) {
					carrinhoDeComprasTemp[j] = produtosPadaria[indiceProduto];
					cadastrado = true;
			
				}
			}
			if (cadastrado)
				System.out.println("Cadastrado com Sucesso");
			else
				System.out.println("Erro ao cadastrar");				
		
	}
	
	
	
		
		
	/*public void adicionarProdutoCarrinhoCompras(String codigoProduto) {
		int indiceProduto=0;
			
		for(int p=0; p < produtosPadaria.length-1; p++) {
			if(produtosPadaria[p] != null && (produtosPadaria[p].getCodigoProduto().equals(codigoProduto) == true))
				indiceProduto = p;}
		
		
		
		boolean cadastrado = false;
			for(int j=0; j < produtosPadaria.length && !cadastrado; j++) {
				if(carrinhoDeCompras[j] == null) {
					carrinhoDeCompras[j] = carrinhoDeCompras[indiceProduto];
					cadastrado = true;
				}
			}
			if (cadastrado)
				System.out.println("Cadastrado com Sucesso");
			else
				System.out.println("Erro ao cadastrar");				
		
	}*/
	public void realizarVenda(String codigoCliente, String codigoResponsavelVenda, int diaVenda, int mesVenda, int anoVenda, String formaPagamento, int numParcelas) {
		int indiceCliente=0;
		int indiceCodigoResponsavelVenda =0;
		
		
		for(int c=0; c < clientesPadaria.length; c++) {
			if(clientesPadaria[c] != null && clientesPadaria[c].getCodigoCliente().equals(codigoCliente) == true)
				indiceCliente = c;
		}
	
		for(int f=0; f < funcionariosPadaria.length; f++) {
			if(funcionariosPadaria[f] != null && funcionariosPadaria[f].getCodigoFuncionario().equals(codigoResponsavelVenda) == true)
				indiceCodigoResponsavelVenda = f;
		}
		
		
		
		Vendas venda = new Vendas( clientesPadaria[indiceCliente], (Vendedor) funcionariosPadaria[indiceCodigoResponsavelVenda], diaVenda, mesVenda, anoVenda, formaPagamento, numParcelas);
		
		//for(int z=0; z < venda[vendasPadaria[z]-1].getCarrinhoDeCompra().length; z++) {
		//	venda.getCarrinhoDeCompra()[z] = null;}
		
		for(int a=0; a < carrinhoDeComprasTemp.length; a++) {
			venda.getCarrinhoDeCompra()[a] = carrinhoDeComprasTemp[a];
			carrinhoDeComprasTemp[a] = null;
		}
		boolean cadastrado = false;
		for(int i=0; i < vendasPadaria.length && !cadastrado; i++) {
			if(vendasPadaria[i] == null) {
				vendasPadaria[i] = venda;
				cadastrado = true;
			}
		}
		if (cadastrado)
			System.out.println("Venda realizada com Sucesso");
		else
			System.out.println("Erro ao realizar");
		
	}
	
	
	
	// Parcial, falta sobrecarga para sair apenas um cliente - APENAS PARA TESTE
	public void imprimeClientes() {
		System.out.println("***********************CLIENTES***********************");
		for(int i=0; i< clientesPadaria.length; i++) {
			if(clientesPadaria[i] != null) {
				System.out.println("Nome: " + clientesPadaria[i].getNome());
				System.out.println("Telefone: " + clientesPadaria[i].getTelefone());
				System.out.println("Endereco: " + clientesPadaria[i].getEndereco());
				System.out.println("CPF: " + clientesPadaria[i].getCpf());
				System.out.println("Categoria: " + clientesPadaria[i].getCategoria());
			}
		
		}
		System.out.println();
	}
	// Parcial, falta sobrecarga para sair apenas um fornecedor - APENAS PARA TESTE
	public void imprimeFornecedoresPadaria() {
		System.out.println("***********************FORNECEDORES***********************");
		for(int i=0; i< fornecedoresPadaria.length; i++) {
			if(fornecedoresPadaria[i] != null) {
				System.out.println("Nome: " + fornecedoresPadaria[i].getNome());
				System.out.println("Código do Fornecedor: " + fornecedoresPadaria[i].getCodigoFornecedor());
				System.out.println("Endereco: " + fornecedoresPadaria[i].getEndereco());
				System.out.println("CNPJ: " + fornecedoresPadaria[i].getCnpj());
				if(fornecedoresPadaria[i] instanceof FornecedorRecorrente)
					System.out.println("Tipo: Recorrente" );
				else
					System.out.println("Tipo: Não Recorrente" );
			System.out.println();
			}
			
		}
		System.out.println();
	}
	
	// Parcial, falta sobrecarga para sair apenas um Funcinario - APENAS PARA TESTE
		public void imprimeFuncionariosPadaria() {
			System.out.println("***********************FUNCIONARIOS***********************");
			for(int i=0; i< funcionariosPadaria.length; i++) {
				if(funcionariosPadaria[i] != null) {
					System.out.println("Nome: " + funcionariosPadaria[i].getNome());
					System.out.println("Endereco: " + funcionariosPadaria[i].getEndereco());
					System.out.println("Telefone: " + funcionariosPadaria[i].getTelefone());
					System.out.println("CPF: " + funcionariosPadaria[i].getCpf());
					System.out.println("Código do Funcionario: " + funcionariosPadaria[i].getCodigoFuncionario());
					if(funcionariosPadaria[i] instanceof Padeiro) {
						System.out.println("Cargo: Padeiro");
						System.out.println("Salario Base: " + funcionariosPadaria[i].getSalarioBase());
						System.out.println("Salario Final: " + ((Padeiro) funcionariosPadaria[i]).getSalarioFinal());
						System.out.println("Horas Trabalhadas: " + ((Padeiro) funcionariosPadaria[i]).getHorasTrabalhadas());
					}
					else if (funcionariosPadaria[i] instanceof Vendedor) {
						System.out.println("Cargo: Vendedor");
						System.out.println("Salario Base: " + funcionariosPadaria[i].getSalarioBase());
						System.out.println("Salario Final: " + ((Vendedor) funcionariosPadaria[i]).getSalarioFinal());
					}
					else if (funcionariosPadaria[i] instanceof Gerente) {
					System.out.println("Cargo: Gerente");
					System.out.println("Salario Base: " + funcionariosPadaria[i].getSalarioBase());
					System.out.println("Salario Final: " + ((Gerente) funcionariosPadaria[i]).getSalarioFinal());}
				System.out.println();
				}
				
			}
			System.out.println();
		}
		
		// Parcial, falta sobrecarga para sair apenas um Produto - APENAS PARA TESTE
		public void imprimeProdutos() {
			System.out.println("***********************Produtos***********************");
			for(int i=0; i< produtosPadaria.length; i++) {
				if(produtosPadaria[i] != null) {
					System.out.println("Nome: " + produtosPadaria[i].getNome());
					System.out.println("Código do Produto: " + produtosPadaria[i].getCodigoProduto());
					System.out.println("Código do Fornecedor: " + produtosPadaria[i].getFornecedorProduto());
					System.out.println("Preço de custo: " + produtosPadaria[i].getPrecoCusto());
					System.out.println("Preço final: " + produtosPadaria[i].getPrecoFinal());
					System.out.println("Quantidade em estoque: " + produtosPadaria[i].getQtdProdutos());
					if(produtosPadaria[i] instanceof ProdutoNaoPerecivel) {
						System.out.println("Tipo: Não perecível");
					}
					else {
					System.out.println("Tipo: Perecível");
					System.out.println("Validade: " + ((ProdutoPerecivel) produtosPadaria[i]).getDiaValidade() + "/" + ((ProdutoPerecivel) produtosPadaria[i]).getMesValidade() + "/" + ((ProdutoPerecivel) produtosPadaria[i]).getAnoValidade());
					}
					System.out.println();
				}
				
			}
			System.out.println();
		}

		public void imprimeVendas() {
			System.out.println("***********************Vendas***********************");
			for(int i=0; i< vendasPadaria.length; i++) {
				if(vendasPadaria[i] != null) {
					System.out.println("Cliente: " + vendasPadaria[i].getComprador().getNome());
					System.out.println("Vendedor: " + vendasPadaria[i].getResponsavelVenda().getNome());
					System.out.println("Data da Venda : " + vendasPadaria[i].getDiaVenda() + "/" + vendasPadaria[i].getMesVenda() + "/" + vendasPadaria[i].getAnoVenda());
					System.out.println("Forma de Pagamento: " + vendasPadaria[i].getFormaPagamento());
					System.out.println("Número de Parcelas: " + vendasPadaria[i].getNumParcelas());
					System.out.println("Montante: " + montanteVendasGlobal);
					imprimeCarrinhoDeCompras();
					}
					
				}	
			
			System.out.println();
		}
		
		public void imprimeCarrinhoDeCompras() {
			for (int i = 0; vendasPadaria[i]!= null && i<  vendasPadaria.length; i++)
				for(int j=0;vendasPadaria[i].getCarrinhoDeCompra()[j] != null && j < vendasPadaria[i].getCarrinhoDeCompra().length; j++)
				System.out.println(vendasPadaria[i].getCarrinhoDeCompra()[j].getNome());
				
		}

		public void imprimeCarrinhoDeComprasGenerico() {
			System.out.println("teste");
			for(int i =0;carrinhoDeComprasTemp[i] != null && i< carrinhoDeComprasTemp.length;i++)
			System.out.println(carrinhoDeComprasTemp[i].getNome());
		}
}

