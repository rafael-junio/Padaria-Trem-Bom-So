package controle;

import controle.produto.Produto;
import pessoa.cliente.Cliente;
import pessoa.cliente.ClienteGold;
import pessoa.cliente.ClientePlatinum;
import pessoa.funcionario.Vendedor;

/**
 * Alunos:
 * @author Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * @author Rafael Junio Xavier - RGA: 2018.1907.050-6
 * @author Igor Jos� Tamagno - RGA: 2018.1907.034-4
 *
 */
public class Venda{

	private static final float JUROSPRAZO = 0.02f;
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
	 * Pr�-condi��o: recebe como par�metro, um objeto Cliente, objeto Vendedor, uma String forma de pagamento, int numero de parcelas, vetor de objetos Produto, e int dia, mes e ano.
	 * P�s-condi��o: inst�ncia atributos da classe.
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
	 * M�todo getProdutosVendidos.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna um vetor de objetos Produto.
	 */
	public Produto[] getProdutosVendidos() {
		return produtosVendidos;
	}

	/**
	 * M�todo setProdutosVendidos.
	 *
	 * Pr�-condi��o: recebe como par�mero um vetor de Produto.
	 * P�s-condi��o: n�o retorna nada, apenas instancia atributo produtosVendidos.
	 */
	public void setProdutosVendidos(Produto[] produtosVendidos) {
		this.produtosVendidos = produtosVendidos;
	}

	/**
	 * M�todo getCliente.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna um objeto Cliente, que realizou a venda.
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * M�todo setCliente.
	 *
	 * Pr�-condi��o: recebe como par�metro um objeto Cliente.
	 * P�s-condi��o: n�o retorna nada, apenas instancia atributo do tipo Cliente.
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * M�todo getVendedor.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna um objeto Vendedor, respos�vel pela venda.
	 */
	public Vendedor getVendedor() {
		return vendedor;
	}

	/**
	 * M�todo setVendedor.
	 *
	 * Pr�-condi��o: recebe como par�metro um objeto Vendedor.
	 * P�s-condi��o: n�o retorna nada, apenas instancia atributo do tipo Vendedor.
	 */
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	/**
	 * M�todo getFormaPagamento.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna uma String que informa o tipo de pagamento realizado pelo cliente.
	 */
	public String getFormaPagamento() {
		return formaPagamento;
	}

	/**
	 * M�todo setFormaPagamento.
	 *
	 * Pr�-condi��o: recebe como par�metro uma String.
	 * P�s-condi��o: n�o retorna nada, apenas instancia atributo do tipo String, formaPagamento.
	 */
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	/**
	 * M�todo getNumParcelas.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna atributo do tipo int numParcelas.
	 */
	public int getNumParcelas() {
		return numParcelas;
	}

	/**
	 * M�todo setNumParcelas.
	 *
	 * Pr�-condi��o: recebe como par�metro um int.
	 * P�s-condi��o: n�o retorna nada, apenas instancia o atributo do tipo int, numParcelas.
	 */
	public void setNumParcelas(int numParcelas) {
		this.numParcelas = numParcelas;
	}



	/**
	 * M�todo getValorFinalCompra.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna atributo do tipo float valorFinalCompra.
	 */
	public float getValorFinalCompra() {
		return valorFinalCompra;
	}

	/**
	 * M�todo setValorFinalCompra.
	 *
	 * Pr�-condi��o: recebe como par�metro um float.
	 * P�s-condi��o: n�o retorna valor, apenas inst�ncia atributo float ValorFinalCompra.
	 */
	public void setValorFinalCompra(float valorFinalCompra) {
		this.valorFinalCompra = valorFinalCompra;
	}

	/**
	 * M�todo getInfoVendedor.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna atributo do tipo String infoVendedor.
	 */
	public String getInfoVendedor() {
		return infoVendedor;
	}

	/**
	 * M�todo setInfoVendedor.
	 *
	 * Pr�-condi��o: recebe uma String.
	 * P�s-condi��o: n�o retorna valor. Instancia atributo String infoVendedor.
	 */
	public void setInfoVendedor(String infoVendedor) {
		this.infoVendedor = infoVendedor;
	}

	/**
	 * M�todo getInfoCliente.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna atributo String infoCliente.
	 */
	public String getInfoCliente() {
		return infoCliente;
	}

	/**
	 * M�todo setInfoCliente.
	 *
	 * Pr�-condi��o: recebe uma String.
	 * P�s-condi��o: n�o retorna valor. Instancia atributo String infoCliente.
	 */
	public void setInfoCliente(String infoCliente) {
		this.infoCliente = infoCliente;
	}

	/**
	 * M�todo getInfoProduto.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna atributo String infoProduto
	 */
	public String getInfoProduto() {
		return infoProduto;
	}

	/**
	 * M�todo setInfoProduto.
	 *
	 * Pr�-condi��o: recebe uma String.
	 * P�s-condi��o: n�o retorna valor. Instancia atributo String infoProduto.
	 */
	public void setInfoProduto(String infoProduto) {
		this.infoProduto = infoProduto;
	}

	/**
	 * M�todo getDia.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna atributo int dia.
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * M�todo setDia.
	 *
	 * Pr�-condi��o: recebe um inteiro.
	 * P�s-condi��o: n�o retorna valor. Instancia atributo int dia.
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * M�todo getMes.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna atributo int mes.
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * M�todo setMes.
	 *
	 * Pr�-condi��o: recebe um inteiro.
	 * P�s-condi��o: n�o retorna valor. Instancia atributo int mes.
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/**
	 * M�todo getAno.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna atributo int ano.
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * M�todo setAno.
	 *
	 * Pr�-condi��o: recebe um inteiro.
	 * P�s-condi��o: n�o retorna valor. Instancia atributo int ano.
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}

	/**
	 * M�todo getJUROSPRAZO.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna atributo final float JUROSPRAZO, porcentagem de juros quando a compra � parcelada.
	 */
	public float getJUROSPRAZO() {
		return JUROSPRAZO;
	}

	/**
	 * M�todo calcularValorFinalCompra.
	 *
	 * Pr�-condi��o: recebe um int.
	 * P�s-condi��o: retorna atributo float valorFinalCompra, ap�s calculado pre�o final a ser pago pelo cliente.
	 */
	public float calcularValorFinalCompra(int numParcelas) {
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
		
		vendedor.atualizaMontanteVendas(this.valorFinalCompra);
		
		this.infoCliente = cliente.exibeInfoVendaCliente();
		
		this.infoVendedor = vendedor.exibeInfoVendaVendedor();
		
		this.infoProduto = infoProdutosVendidos;
		
		return this.valorFinalCompra;
	}
	
	/**
	 * M�todo imprimeInformacoesVenda.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: n�o retorna valor. Imprime valores dos atributos da classe.
	 */
	public void imprimeInformacoesVenda() {
		System.out.println("\n--------------------------------------------------------");
		
		System.out.printf("\nVENDA REALIZADA EM %02d/%02d/%04d POR FUNCION�RIO(A)\n", this.dia, this.mes, this.ano);
		
		System.out.println(this.infoVendedor);
		
		System.out.println("\n------------------------PRODUTO(S) VENDIDOS------------------------");
		
		System.out.print(this.infoProduto);
		
		System.out.println("\n------------------------CLIENTE------------------------");
		
		System.out.println(this.infoCliente);
		
		System.out.printf("Forma de pagamento: %s.\n", this.formaPagamento);
		
		if(this.numParcelas > 0)
			System.out.printf("N�mero de parcelas: %d.\n", this.numParcelas);
		
		System.out.println("------------------------VALOR TOTAL DA COMPRA------------------------");
		System.out.print("\nValor total");
		
		if (this.numParcelas > 0)
			System.out.print(" (Com acr�scimo de 2% sobre as vendas)");
				
		System.out.printf(": %.2fR$.\n\n", this.valorFinalCompra);
	}
}
