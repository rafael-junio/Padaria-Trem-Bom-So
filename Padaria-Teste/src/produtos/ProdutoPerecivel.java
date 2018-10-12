package produtos;

import fornecedores.Fornecedor;
import funcionalidades.Data;

public class ProdutoPerecivel extends Produto {

    private Data dataValidade;
    private int dia;
    private int mes;
    private int ano;

    public ProdutoPerecivel(String nome, String codigo, Fornecedor fornecedorProduto, float precoCusto, float precoFinal, int dia, int mes, int ano) {
	super(nome, codigo, fornecedorProduto, precoCusto, precoFinal);
	dataValidade = new Data(dia, mes, ano);
    }
    
    public ProdutoPerecivel(String nome, String codigo, Fornecedor fornecedorProduto, float precoCusto, float precoFinal, String[] apelido, int dia, int mes, int ano) {
	super(nome, codigo, fornecedorProduto, precoCusto, precoFinal, apelido);
	dataValidade = new Data(dia, mes, ano);
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }
    
    public String getDataValidadeProduto() {
	return this.dataValidade.getData();
    }
    
    public boolean alterarDataValidadeProduto(int dia, int mes, int ano) {
	Data novaData = new Data(dia, mes, ano);
	
	if(novaData.getData().equals("00/00/0000"))
	    return false;
	else {
	    this.dataValidade = novaData;
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

}
