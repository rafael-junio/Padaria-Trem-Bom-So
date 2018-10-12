package trabalhoProgooII;

public class Cliente extends PessoaFisica {
    protected float valorCompras;
    protected float desconto;

    public Cliente(String nome, String endereco, String cpf, String telefone) {
	super(nome, endereco, cpf, telefone);
	this.valorCompras = 0f;
	this.desconto = 0f;
    }

    public float getValorCompras() {
	return valorCompras;
    }

    public void setValorCompras(float valorCompras) {
	this.valorCompras = valorCompras;
    }
    
    public float atualizarValorCompras(float totalCompra) {
	return this.valorCompras += totalCompra;
    }
}
