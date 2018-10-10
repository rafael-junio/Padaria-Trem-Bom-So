package trabalhoProgooII;

public class Vendas implements CompraPrazo {

	protected Produto[] produtosVendidos;
	protected Vendedor vendedor;
	protected int diaCompra;
	protected int mesCompra;
	protected int anoCompra;
	

	public Vendas(Vendedor vendedor, int diaCompra, int mesCompra, int anoCompra) {
	
		this.produtosVendidos = new Produto[20];

		this.vendedor = vendedor;
		this.diaCompra = diaCompra;
		this.mesCompra = mesCompra;
		this.anoCompra = anoCompra;
	}


	@Override
	public void parcelarCompra(float valorCompra, int numParcelas) {
		// TODO Auto-generated method stub

	}

}
