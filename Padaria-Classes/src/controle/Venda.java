package controle;

import cliente.Cliente;
import funcionalidades.Data;
import funcionarios.Vendedores;
import produtos.Produto;

public final class Venda{

	private final float JUROSPRAZO = 0.02f;

	private Produto[] produtosVendidos;
	private Cliente cliente;
	private Vendedores vendedor;
	private String formaPagamento;
	private int numParcelas;
	private float valorFinalCompra;
	private Data dataVenda;
	private int dia;
	private int mes;
	private int ano;

	public Venda(Cliente cliente, Vendedores vendedor, String formaPagamento, int numParcelas, int dia, int mes,
			int ano) {
		this.produtosVendidos = new Produto[20];
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.formaPagamento = formaPagamento;
		this.numParcelas = numParcelas;
		this.dataVenda = new Data(dia, mes, ano);
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

	public Vendedores getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedores vendedor) {
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

	public Data getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Data dataVenda) {
		this.dataVenda = dataVenda;
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

	public float calcularValorCompra(float precoProduto) {
		this.valorFinalCompra += precoProduto;
		return this.valorFinalCompra;
	}
	
	public float calcularValorFinalCompra(int numParcelas) {
		if (this.numParcelas > 1)
			this.valorFinalCompra += (1f * JUROSPRAZO);
		
		return this.cliente.atualizarValorCompras(this.valorFinalCompra);
	}
	
	public boolean adicionarProduto(Produto p) {
		for(Produto i : produtosVendidos)
			if(i == null) {
				i = p;
				return true;
			}
		return false;
			
	}
	
	public void imprimeProdutosVendidos() {
		for(Produto i : produtosVendidos)
			if(i != null)
				i.imprimeInformacoesProduto();
			else
				System.out.printf("%d\n", +1);
	}
	
	public void imprimeInformacoesVenda() {
		System.out.printf("Data da venda: %s.\n", this.dataVenda.getDataFormatada());
		System.out.println("\nCliente");
		this.cliente.imprimeInformacoesCliente();
		System.out.printf("Forma de pagamento: %s.\n", this.formaPagamento);
		System.out.printf("Número de parcelas: %d.\n", this.numParcelas);
		System.out.println("\nVendedor");
		this.vendedor.imprimeInformacoesFuncionario();
		System.out.println("\nProdutos Vendidos");
		imprimeProdutosVendidos();
		System.out.printf("\nValor total compra: %.2f.\n", this.valorFinalCompra);
	}

}
