package trabalhoProgooII.TrabalhoIGOR;

public class ProdutoPerecivel extends Produto {

	protected int diaValidade;
	protected int mesValidade;
	protected int anoValidade;
	
	public ProdutoPerecivel(String nome, String codigoProduto, String codigoFornecedor, float precoCusto, float precoFinal, int diaValidade, int mesValidade, int anoValidade, int qtdProdutos) {
		super(nome, codigoProduto, codigoFornecedor, precoCusto, precoFinal, qtdProdutos);
		this.diaValidade = diaValidade;
		this.mesValidade = mesValidade;
		this.anoValidade = anoValidade;
	}

	public int getDiaValidade() {
		return diaValidade;
	}

	public void setDiaValidade(int diaValidade) {
		this.diaValidade = diaValidade;
	}

	public int getMesValidade() {
		return mesValidade;
	}

	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}

	public int getAnoValidade() {
		return anoValidade;
	}

	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}

}
