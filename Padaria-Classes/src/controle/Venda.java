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

	/**
	 * M�todo construtor da classe Venda.
	 *
	 * Pr�-condi��o: recebe como atributos um cliente, vendedor, a forma de pagamento
	 * P�s-condi��o: 
	 */
	public Venda(Cliente cliente, Vendedor vendedor, String formaPagamento, int numParcelas, Produto[] produtosVendidos, int dia, int mes,
			int ano) {
		
		if(produtosVendidos.length <= 20)
			this.produtosVendidos = produtosVendidos;
		else
			System.out.println("N�mero de produtos inv�lido!");
		
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.formaPagamento = formaPagamento;
		this.numParcelas = numParcelas;
		this.valorFinalCompra = 0;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	/**
	 * M�todo getJUROSPRAZO.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public float getJUROSPRAZO() {
		return this.JUROSPRAZO;
	}
	
	/**
	 * M�todo getProdutosVendidos.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public Produto[] getProdutosVendidos() {
		return produtosVendidos;
	}

	/**
	 * M�todo setProdutosVendidos.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setProdutosVendidos(Produto[] produtosVendidos) {
		this.produtosVendidos = produtosVendidos;
	}

	/**
	 * M�todo getCliente.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * M�todo setCliente.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * M�todo getVendedor.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public Vendedor getVendedor() {
		return vendedor;
	}

	/**
	 * M�todo setVendedor.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	/**
	 * M�todo getFormaPagamento.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public String getFormaPagamento() {
		return formaPagamento;
	}

	/**
	 * M�todo setFormaPagamento.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	/**
	 * M�todo getNumParcelas.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public int getNumParcelas() {
		return numParcelas;
	}

	/**
	 * M�todo setNumParcelas.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setNumParcelas(int numParcelas) {
		this.numParcelas = numParcelas;
	}

	/**
	 * M�todo getValorFinalCompra.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public float getValorFinalCompra() {
		return valorFinalCompra;
	}

	/**
	 * M�todo setValorFinalCompra.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setValorFinalCompra(float valorFinalCompra) {
		this.valorFinalCompra = valorFinalCompra;
	}

	/**
	 * M�todo getInfoVendedor.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public String getInfoVendedor() {
		return infoVendedor;
	}

	/**
	 * M�todo setInfoVendedor.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setInfoVendedor(String infoVendedor) {
		this.infoVendedor = infoVendedor;
	}

	/**
	 * M�todo getInfoCliente.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public String getInfoCliente() {
		return infoCliente;
	}

	/**
	 * M�todo setInfoCliente.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setInfoCliente(String infoCliente) {
		this.infoCliente = infoCliente;
	}

	/**
	 * M�todo getInfoProduto.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public String getInfoProduto() {
		return infoProduto;
	}

	/**
	 * M�todo setInfoProduto.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setInfoProduto(String infoProduto) {
		this.infoProduto = infoProduto;
	}

	/**
	 * M�todo getDia.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * M�todo setDia.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * M�todo getMes.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * M�todo setMes.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/**
	 * M�todo getAno.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * M�todo setAno.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}

	/**
	 * M�todo calcularValorFinalCompra.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
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
	
	/**
	 * M�todo imprimeInformacoesVenda.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void imprimeInformacoesVenda() {
		System.out.println("\n--------------------------------------------------------");
		
		System.out.printf("\nVENDA REALIZADA EM %02d/%02d/%04d POR FUNCION�RIO(A)\n", this.dia, this.mes, this.ano);
		
		System.out.println(this.infoVendedor);
		
		System.out.println("\n------------------------CLIENTE------------------------");
		
		System.out.println(this.infoCliente);
		
		System.out.printf("Forma de pagamento: %s.\n", this.formaPagamento);
		
		if(this.numParcelas > 0)
			System.out.printf("N�mero de parcelas: %d.\n", this.numParcelas);
		
		System.out.println("\n------------------------PRODUTO(S) VENDIDOS------------------------");
		
		System.out.print(this.infoProduto);
		
		System.out.println("------------------------VALOR TOTAL DA COMPRA------------------------");
		System.out.print("\nValor total");
		
		if (this.numParcelas > 0)
			System.out.print(" (Mais acr�scimo de 2% sobre as vendas)");
				
		System.out.printf(": %.2fR$.\n\n", this.valorFinalCompra);
	}
}
