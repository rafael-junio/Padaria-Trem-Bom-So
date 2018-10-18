package controle;


import cliente.Cliente;
import cliente.ClienteGold;
import cliente.ClientePlatinum;
import funcionarios.Vendedor;
import produtos.Produto;

public final class Venda{

	private final float JUROSPRAZO = 1.02f;

	private Produto[] produtosVendidos;
	private Cliente cliente;
	private Vendedor vendedor;
	private String formaPagamento;
	private int numParcelas;
	private float valorFinalCompra;
	private int dia;
	private int mes;
	private int ano;

	public Venda(Cliente cliente, Vendedor vendedor, String formaPagamento, int numParcelas, Produto[] produtosVendidos, int dia, int mes,
			int ano) {
		
		if(produtosVendidos.length <= 20)
			this.produtosVendidos = produtosVendidos.clone();
		else
			System.out.println("Número de produtos inválido!");
		
		this.cliente = cliente;
		this.vendedor = vendedor;
		if(formaPagamento.equalsIgnoreCase("crédito"))
			if(numParcelas > 0) {
				this.formaPagamento = formaPagamento;
				this.numParcelas = numParcelas;
			}
		this.formaPagamento = formaPagamento;
		this.numParcelas = numParcelas;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		
	}

	public float getJUROSPRAZO() {
		return this.JUROSPRAZO;
	}
	
	public Produto[] getProdutosVendidos() {
		return produtosVendidos;
	}

	public void setProdutosVendidos(Produto[] produtosVendidos) {
		this.produtosVendidos = produtosVendidos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public int getNumParcelas() {
		return numParcelas;
	}

	public void setNumParcelas(int numParcelas) {
		this.numParcelas = numParcelas;
	}

	public float getValorFinalCompra() {
		return valorFinalCompra;
	}

	public void setValorFinalCompra(float valorFinalCompra) {
		this.valorFinalCompra = valorFinalCompra;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	float calcularValorFinalCompra(int numParcelas) {
		
		this.valorFinalCompra = 0;
		
		for(int i = 0; i < this.produtosVendidos.length; i++) {
			if(this.produtosVendidos[i] != null)
				this.valorFinalCompra += this.produtosVendidos[i].getPrecoFinal() * this.produtosVendidos[i].getQuantidadeVenda();
		}
		
		if (this.numParcelas > 0)
			this.valorFinalCompra *= JUROSPRAZO;
		
		this.cliente.setValorCompras(this.cliente.getValorCompras() + this.valorFinalCompra);
		
		if(this.cliente instanceof ClienteGold)
			this.cliente.setValorCompras(this.cliente.getValorCompras() - (this.cliente.getValorCompras() * ((ClienteGold) this.cliente).getDESCONTO()));
		
		else if(this.cliente instanceof ClientePlatinum)
			this.cliente.setValorCompras(this.cliente.getValorCompras() - (this.cliente.getValorCompras() * ((ClientePlatinum) this.cliente).getDESCONTO()));
		

		this.vendedor.setMontanteVendas(this.vendedor.getMontanteVendas() + this.valorFinalCompra);
		
		return this.valorFinalCompra;
	}
	
//	public boolean adicionarProduto(Produto p) {
//		for(int i = 0; i < produtosVendidos.length; i++)
//			if(produtosVendidos[i] == null) {
//				produtosVendidos[i] = p;
//				return true;
//			}
//		return false;
//			
//	}
	
	public void imprimeProdutosVendidos() {
		for(Produto i : produtosVendidos)
			if(i != null)
				i.imprimeInformacoesProdutoVenda();
	}
	
	public void imprimeInformacoesVenda() {
		System.out.printf("Data da venda: %02d/%02d/%04d.\n", this.dia, this.mes, this.ano);
		System.out.println("\n***********************PRODUTO(S) VENDIDOS***********************");
		imprimeProdutosVendidos();
		System.out.printf("\nVALOR TOTAL DA COMPRA: %.2f.\n", this.valorFinalCompra);
		System.out.println("\n***********************CLIENTE***********************");
		this.cliente.imprimeInformacoesCliente();
		System.out.printf("Forma de pagamento: %s.\n", this.formaPagamento);
		System.out.printf("Número de parcelas: %d.\n", this.numParcelas);
		System.out.println("\n***********************VENDEDOR***********************");
		this.vendedor.imprimeInformacoesFuncionario();
		System.out.println("\n**********************************************");
	}

}
