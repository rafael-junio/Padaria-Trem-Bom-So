package trabalhoProgooII.TrabalhoIGOR;

public class Vendas {
	protected Produto [] carrinhoDeCompra;
	//protected String codigoVenda;
	protected Cliente comprador;
	protected int diaVenda;
	protected int mesVenda;
	protected int anoVenda;
	protected Vendedor responsavelVenda;
	protected int numParcelas;
	protected float montanteVendas;
	protected String formaPagamento;
	
	
	public Vendas(Cliente comprador, Vendedor responsavelVenda, int diaVenda, int mesVenda, int anoVenda, String formaPagamento, int numParcelas) {
		carrinhoDeCompra = new Produto [20];
		this.comprador = comprador;
		this.responsavelVenda = responsavelVenda;
		this.diaVenda = diaVenda;
		this.mesVenda = mesVenda;
		this.anoVenda = anoVenda;
		this.numParcelas = numParcelas;
		this.formaPagamento = formaPagamento;
		//this.codigoVenda = codigoVenda;
		
				
	}
	
	/*public void cadastrarProdutoVenda(Produto produto) {
		boolean cadastrado = false;
		for(int i=0; i < produtosVenda.length && !cadastrado; i++) {
			if(produtosVenda[i] == null) {
				produtosVenda[i] = produto;
				if(numParcelas > 0)
					montanteVendas += produto.getPrecoFinal()*1.02;
				else
					montanteVendas += produto.getPrecoFinal();
				produto.setQtdProdutos(produto.getQtdProdutos() - 1);
				cadastrado = true;
			}
		}
		if (cadastrado)
			System.out.println("Cadastrado com Sucesso");
		else
			System.out.println("Erro ao cadastrar");
		
	}
	
		
	public void descadastrarProdutoVenda(Produto produto) {
		boolean descadastrado = false;
		for(int i=0; i < produtosVenda.length && !descadastrado; i++) {
			if(produtosVenda[i].equals(produto)) {
				produtosVenda[i] = null;
				descadastrado = true;
			}
		}
		if (descadastrado)
			System.out.println("Cadastrado com Sucesso");
		else
			System.out.println("Erro ao cadastrar");
		
	}*/
	
	public String getFormaPagamento() {
		return formaPagamento;
	}

	
	public Produto[] getCarrinhoDeCompra() {
		return carrinhoDeCompra;
	}

	public void setCarrinhoDeCompra(Produto[] carrinhoDeCompra) {
		this.carrinhoDeCompra = carrinhoDeCompra;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public float getMontanteVendas() {
		return montanteVendas;
	}

	public void setMontanteVendas(float montanteVendas) {
		this.montanteVendas = montanteVendas;
	}

	public Cliente getComprador() {
		return comprador;
	}

	public void setComprador(Cliente comprador) {
		this.comprador = comprador;
	}

	public int getNumParcelas() {
		return numParcelas;
	}

	public void setNumParcelas(int numParcelas) {
		this.numParcelas = numParcelas;
	}

	//public Produto[] getProdutosVenda() {
	//	return produtosVenda;
	//}

	//public void setProdutosVenda(Produto[] produtosVenda) {
	//	this.produtosVenda = produtosVenda;
	//}

	public int getDiaVenda() {
		return diaVenda;
	}

	public void setDiaVenda(int diaVenda) {
		this.diaVenda = diaVenda;
	}

	public int getMesVenda() {
		return mesVenda;
	}

	public void setMesVenda(int mesVenda) {
		this.mesVenda = mesVenda;
	}

	public int getAnoVenda() {
		return anoVenda;
	}

	public void setAnoVenda(int anoVenda) {
		this.anoVenda = anoVenda;
	}

	public Vendedor getResponsavelVenda() {
		return responsavelVenda;
	}

	public void setResponsavelVenda(Vendedor responsavelVenda) {
		this.responsavelVenda = responsavelVenda;
	}
	
}
