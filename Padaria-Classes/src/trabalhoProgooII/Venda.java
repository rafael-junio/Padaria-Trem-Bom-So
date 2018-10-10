package trabalhoProgooII;

public class Venda {
	private Venda produtosVendidos[];
	private Produto produtoVendido;
	private int dia, mes, ano;
	private Vendedor vendedor;
	
	public Venda() {
		this.produtosVendidos = new Venda [20];
	}

	public Venda(Produto produtoVendido, int dia, int mes, int ano, Vendedor vendedor) {
		this.produtoVendido = produtoVendido;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.vendedor = vendedor;
	}
	
	
	
	
	
}
