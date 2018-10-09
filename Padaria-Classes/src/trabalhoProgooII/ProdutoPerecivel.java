package trabalhoProgooII;

public final class ProdutoPerecivel extends Produto {
	
	protected int diaValidade;
	protected int mesValidade;
	protected int anoValidade;
	
	public ProdutoPerecivel(String nome, Fornecedor fornecedor, float precoCusto, float precoFinal, String[] apelido, int codigo, int diaValidade, int mesValidade, int anoValidade) {
		super(nome, fornecedor, precoCusto, precoFinal, apelido, codigo);
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
	
	void imprimeInformacoesPerecivel() {
		super.imprimeInformacoesProduto();
		System.out.println("Validade: " + getDiaValidade() + "/" + getMesValidade() + "/" + getAnoValidade());
	}

}
