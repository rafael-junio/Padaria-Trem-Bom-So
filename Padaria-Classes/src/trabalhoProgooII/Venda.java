package trabalhoProgooII;

public class Venda extends Estoque {
    private String[] codigo;
    private Produto[] produtoVendido;
    private Data dataVenda;
    private int dia;
    private int mes;
    private int ano;
    private Vendedor vendedor;
    private String formaPagamento;
    private String pagamentoRealizado;
    private final float JUROSPRAZO = 0.02f;
    private int numParcelas;
    private float valorFinalCompra;

    public Venda(String[] codigo, int dia, int mes, int ano, Vendedor vendedor, String formaPagamento,
	    String pagamentoRealizado) {
	
	int cont = 0;
	String[] codigoEstoque = new String[codigo.length];
	
	for(int i = 0; i < codigo.length; i++) {
	    if(super.produdoEmEstoque(codigo[i])) {
		codigoEstoque[cont] = codigo[i];
		cont += 1;
	    }
	}
	
	this.produtoVendido = new Produto[20];
	
	for(int i = 0; i < this.produtoVendido.length; i++) {
	    this.produtoVendido[i] = procurarProdudo(codigoEstoque[i]);
	}
	
	this.dataVenda = new Data(dia, mes, ano);
	this.vendedor = vendedor;
	this.formaPagamento = formaPagamento;
	this.pagamentoRealizado = pagamentoRealizado;
	this.valorFinalCompra = calcularvalorFinalCompra();
    }

    public Venda(String[] codigo, int dia, int mes, int ano, Vendedor vendedor, String formaPagamento,
	    String pagamentoRealizado, int numParcelas) {

	int cont = 0;
	String[] codigoEstoque = new String[codigo.length];
	
	for(int i = 0; i < codigo.length; i++) {
	    if(super.produdoEmEstoque(codigo[i])) {
		codigoEstoque[cont] = codigo[i];
		cont += 1;
	    }
	}
	
	this.produtoVendido = new Produto[20];
	
	for(int i = 0; i < this.produtoVendido.length; i++) {
	    this.produtoVendido[i] = procurarProdudo(codigoEstoque[i]);
	}
	
	this.dataVenda = new Data(dia, mes, ano);
	this.vendedor = vendedor;
	this.formaPagamento = formaPagamento;
	this.pagamentoRealizado = pagamentoRealizado;
	this.numParcelas = numParcelas;
	this.valorFinalCompra = calcularvalorFinalCompra();
    }

    private float calcularvalorFinalCompra() {
	float total = 0;

	for (Produto i : produtoVendido)
	    total += i.getPrecoFinal();

	if (this.pagamentoRealizado.equalsIgnoreCase("prazo"))
	    total = total + (total * JUROSPRAZO);

	return total;
    }

    public Produto[] getProdutosVendidos() {
	return produtoVendido;
    }

    public void setProdutosVendidos(Produto[] produtosVendidos) {
	this.produtoVendido = produtosVendidos;
    }

    public Data getDataVenda() {
	return dataVenda;
    }

    public void setDataVenda(Data dataVenda) {
	this.dataVenda = dataVenda;
    }

    public String getDataVendaProduto() {
	return this.dataVenda.getData();
    }

    public boolean alterarDataVendaProduto(int dia, int mes, int ano) {
	Data novaData = new Data(dia, mes, ano);

	if (novaData.getData().equals("00/00/0000"))
	    return false;
	else {
	    this.dataVenda = novaData;
	    return true;
	}
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

    public float getValorFinalCompra() {
	return valorFinalCompra;
    }

    public void setValorFinalCompra(float valorFinalCompra) {
	this.valorFinalCompra = valorFinalCompra;
    }
}
