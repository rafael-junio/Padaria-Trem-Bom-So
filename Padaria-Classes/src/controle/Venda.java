package controle;

import cliente.Cliente;
import funcionalidades.Data;
import funcionarios.Vendedores;
import produtos.Produto;

public final class Venda extends Estoque {

	private final float JUROSPRAZO = 0.02f;

	private static int cont = 0;

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

	public Vendedores getVendedores() {
		return vendedor;
	}

	public void setVendedores(Vendedores vendedor) {
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

	public boolean realizarVenda(String codigo, int quantidade) {
		for (int i = 0; i < super.produtos.length; i++) {
			if (super.produtos[i] != null && super.produtos[i].getCodigo().equals(codigo)
					&& super.produtos[i].getQuantidade() - quantidade > 0) {
				super.produtos[i].setQuantidade(produtos[i].getQuantidade() - quantidade);
				this.produtosVendidos[cont] = super.produtos[i];
				this.valorFinalCompra = calcularvalorFinalCompra();
				alertaEstoque(produtos[i]);
				cont++;
				System.out.println("Venda Realizada com Sucesso!");
				return true;
			}
		}
		System.out.println("Venda não foi realizada com sucesso!");
		return false;
	}

	private float calcularvalorFinalCompra() {
		float totalCompra = 0f;

		totalCompra += produtosVendidos[cont].getPrecoFinal();

		if (this.numParcelas > 1)
			totalCompra += (1f * JUROSPRAZO);

		return totalCompra;
	}
	
	public void imprimeProdutosVendidos() {
		for(Produto i : produtos)
			if(i != null)
				i.imprimeInformacoesProduto();
	}
	
	public void imprimeInformacoesVenda() {
		System.out.printf("Data da venda: %s.", this.dataVenda.getDataFormatada());
		System.out.println("Cliente");
		this.cliente.imprimeInformacoesCliente();
		System.out.printf("Forma de pagamento: %s.\n", getFormaPagamento());
		System.out.printf("Número de parcelas: %d.\n", getNumParcelas());
		System.out.println("Vendedores");
		this.vendedor.imprimeInformacoesFuncionario();
		System.out.println("Produtos Vendidos");
		imprimeProdutosVendidos();
		System.out.printf("Valor total compra: %.2f.\n", getValorFinalCompra());
	}

}
