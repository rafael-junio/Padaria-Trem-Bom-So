package controle;

import pessoa.cliente.*;
import pessoa.funcionario.Vendedor;
import controle.produto.Produto;

public final class Venda{

	private final float JUROSPRAZO = 0.02f;

	private Produto[] produtosVendidos;
	private Cliente cliente;
	private Vendedor vendedor;
	private String formaPagamento;
	private int numParcelas;
	private float valorFinalCompra;
	private String infoVendedor;
	private String infoCliente;
	private String infoProduto;
	private int dia;
	private int mes;
	private int ano;

	public Venda(Cliente cliente, Vendedor vendedor, String formaPagamento, int numParcelas, Produto[] produtosVendidos, int dia, int mes,
			int ano) {
		
		if(produtosVendidos.length <= 20)
			this.produtosVendidos = produtosVendidos;
		else
			System.out.println("Número de produtos inválido!");
		
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.formaPagamento = formaPagamento;
		this.numParcelas = numParcelas;
		this.valorFinalCompra = 0;
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

	public String getInfoVendedor() {
		return infoVendedor;
	}

	public void setInfoVendedor(String infoVendedor) {
		this.infoVendedor = infoVendedor;
	}

	public String getInfoCliente() {
		return infoCliente;
	}

	public void setInfoCliente(String infoCliente) {
		this.infoCliente = infoCliente;
	}

	public String getInfoProduto() {
		return infoProduto;
	}

	public void setInfoProduto(String infoProduto) {
		this.infoProduto = infoProduto;
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
		float desconto = 0;
		String infoProdutosVendidos = "";
		
		for(int i = 0; i < this.produtosVendidos.length; i++)
			if(this.produtosVendidos[i] != null) {
				infoProdutosVendidos += produtosVendidos[i].exibeInfoVendaProdutos() + "\n";
				this.valorFinalCompra += this.produtosVendidos[i].getPrecoFinal() * this.produtosVendidos[i].getQuantidadeVenda();
			}
		
		if (this.numParcelas > 0)
			this.valorFinalCompra += (this.valorFinalCompra * JUROSPRAZO);
		
		if(cliente instanceof ClienteGold)
			desconto = ((ClienteGold) cliente).calculaDesconto(this.valorFinalCompra);
		
		else if(cliente instanceof ClientePlatinum)
			desconto = ((ClientePlatinum) cliente).calculaDesconto(this.valorFinalCompra);
		
		this.valorFinalCompra -= desconto;
		
		cliente.atualizaCompraCliente(this.valorFinalCompra);
		
		this.infoCliente = cliente.exibeInfoVendaCliente();
		
		this.infoVendedor = vendedor.exibeInfoVendaVendedor();
		
		this.infoProduto = infoProdutosVendidos;
		
		return this.valorFinalCompra;
	}
	
	public void imprimeInformacoesVenda() {
		System.out.println("\n--------------------------------------------------------");
		
		System.out.printf("\nVENDA REALIZADA EM %02d/%02d/%04d POR FUNCIONÁRIO(A)\n", this.dia, this.mes, this.ano);
		
		System.out.println(this.infoVendedor);
		
		System.out.println("\n------------------------CLIENTE------------------------");
		
		System.out.println(this.infoCliente);
		
		System.out.printf("Forma de pagamento: %s.\n", this.formaPagamento);
		
		if(this.numParcelas > 0)
			System.out.printf("Número de parcelas: %d.\n", this.numParcelas);
		
		System.out.println("\n------------------------PRODUTO(S) VENDIDOS------------------------");
		
		System.out.print(this.infoProduto);
		
		System.out.println("------------------------VALOR TOTAL DA COMPRA------------------------");
		System.out.print("\nValor total");
		
		if (this.numParcelas > 0)
			System.out.print(" (Mais acréscimo de 2% sobre as vendas)");
				
		System.out.printf(": %.2fR$.\n\n", this.valorFinalCompra);
	}
}
