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
 * @author Igor José Tamagno - RGA: 2018.1907.034-4
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
	 * Método construtor da classe Venda.
	 *
	 * Pré-condição: recebe como parâmetro, um objeto Cliente, objeto Vendedor, uma String forma de pagamento, int numero de parcelas, vetor de objetos Produto, e int dia, mes e ano.
	 * Pós-condição: instância atributos da classe.
	 */
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

	/**
	 * Método getProdutosVendidos.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna um vetor de objetos Produto.
	 */
	public Produto[] getProdutosVendidos() {
		return produtosVendidos;
	}

	/**
	 * Método setProdutosVendidos.
	 *
	 * Pré-condição: recebe como parâmero um vetor de Produto.
	 * Pós-condição: não retorna nada, apenas instancia atributo produtosVendidos.
	 */
	public void setProdutosVendidos(Produto[] produtosVendidos) {
		this.produtosVendidos = produtosVendidos;
	}

	/**
	 * Método getCliente.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna um objeto Cliente, que realizou a venda.
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * Método setCliente.
	 *
	 * Pré-condição: recebe como parâmetro um objeto Cliente.
	 * Pós-condição: não retorna nada, apenas instancia atributo do tipo Cliente.
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * Método getVendedor.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna um objeto Vendedor, resposável pela venda.
	 */
	public Vendedor getVendedor() {
		return vendedor;
	}

	/**
	 * Método setVendedor.
	 *
	 * Pré-condição: recebe como parâmetro um objeto Vendedor.
	 * Pós-condição: não retorna nada, apenas instancia atributo do tipo Vendedor.
	 */
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	/**
	 * Método getFormaPagamento.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna uma String que informa o tipo de pagamento realizado pelo cliente.
	 */
	public String getFormaPagamento() {
		return formaPagamento;
	}

	/**
	 * Método setFormaPagamento.
	 *
	 * Pré-condição: recebe como parâmetro uma String.
	 * Pós-condição: não retorna nada, apenas instancia atributo do tipo String, formaPagamento.
	 */
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	/**
	 * Método getNumParcelas.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna atributo do tipo int numParcelas.
	 */
	public int getNumParcelas() {
		return numParcelas;
	}

	/**
	 * Método setNumParcelas.
	 *
	 * Pré-condição: recebe como parâmetro um int.
	 * Pós-condição: não retorna nada, apenas instancia o atributo do tipo int, numParcelas.
	 */
	public void setNumParcelas(int numParcelas) {
		this.numParcelas = numParcelas;
	}



	/**
	 * Método getValorFinalCompra.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna atributo do tipo float valorFinalCompra.
	 */
	public float getValorFinalCompra() {
		return valorFinalCompra;
	}

	/**
	 * Método setValorFinalCompra.
	 *
	 * Pré-condição: recebe como parâmetro um float.
	 * Pós-condição: não retorna valor, apenas instância atributo float ValorFinalCompra.
	 */
	public void setValorFinalCompra(float valorFinalCompra) {
		this.valorFinalCompra = valorFinalCompra;
	}

	/**
	 * Método getInfoVendedor.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna atributo do tipo String infoVendedor.
	 */
	public String getInfoVendedor() {
		return infoVendedor;
	}

	/**
	 * Método setInfoVendedor.
	 *
	 * Pré-condição: recebe uma String.
	 * Pós-condição: não retorna valor. Instancia atributo String infoVendedor.
	 */
	public void setInfoVendedor(String infoVendedor) {
		this.infoVendedor = infoVendedor;
	}

	/**
	 * Método getInfoCliente.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna atributo String infoCliente.
	 */
	public String getInfoCliente() {
		return infoCliente;
	}

	/**
	 * Método setInfoCliente.
	 *
	 * Pré-condição: recebe uma String.
	 * Pós-condição: não retorna valor. Instancia atributo String infoCliente.
	 */
	public void setInfoCliente(String infoCliente) {
		this.infoCliente = infoCliente;
	}

	/**
	 * Método getInfoProduto.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna atributo String infoProduto
	 */
	public String getInfoProduto() {
		return infoProduto;
	}

	/**
	 * Método setInfoProduto.
	 *
	 * Pré-condição: recebe uma String.
	 * Pós-condição: não retorna valor. Instancia atributo String infoProduto.
	 */
	public void setInfoProduto(String infoProduto) {
		this.infoProduto = infoProduto;
	}

	/**
	 * Método getDia.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna atributo int dia.
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Método setDia.
	 *
	 * Pré-condição: recebe um inteiro.
	 * Pós-condição: não retorna valor. Instancia atributo int dia.
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * Método getMes.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna atributo int mes.
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * Método setMes.
	 *
	 * Pré-condição: recebe um inteiro.
	 * Pós-condição: não retorna valor. Instancia atributo int mes.
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/**
	 * Método getAno.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna atributo int ano.
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * Método setAno.
	 *
	 * Pré-condição: recebe um inteiro.
	 * Pós-condição: não retorna valor. Instancia atributo int ano.
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}

	/**
	 * Método getJUROSPRAZO.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna atributo final float JUROSPRAZO, porcentagem de juros quando a compra é parcelada.
	 */
	public float getJUROSPRAZO() {
		return JUROSPRAZO;
	}

	/**
	 * Método calcularValorFinalCompra.
	 *
	 * Pré-condição: recebe um int.
	 * Pós-condição: retorna atributo float valorFinalCompra, após calculado preço final a ser pago pelo cliente.
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
	 * Método imprimeInformacoesVenda.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: não retorna valor. Imprime valores dos atributos da classe.
	 */
	public void imprimeInformacoesVenda() {
		System.out.println("\n--------------------------------------------------------");
		
		System.out.printf("\nVENDA REALIZADA EM %02d/%02d/%04d POR FUNCIONÁRIO(A)\n", this.dia, this.mes, this.ano);
		
		System.out.println(this.infoVendedor);
		
		System.out.println("\n------------------------PRODUTO(S) VENDIDOS------------------------");
		
		System.out.print(this.infoProduto);
		
		System.out.println("\n------------------------CLIENTE------------------------");
		
		System.out.println(this.infoCliente);
		
		System.out.printf("Forma de pagamento: %s.\n", this.formaPagamento);
		
		if(this.numParcelas > 0)
			System.out.printf("Número de parcelas: %d.\n", this.numParcelas);
		
		System.out.println("------------------------VALOR TOTAL DA COMPRA------------------------");
		System.out.print("\nValor total");
		
		if (this.numParcelas > 0)
			System.out.print(" (Com acréscimo de 2% sobre as vendas)");
				
		System.out.printf(": %.2fR$.\n\n", this.valorFinalCompra);
	}
}
