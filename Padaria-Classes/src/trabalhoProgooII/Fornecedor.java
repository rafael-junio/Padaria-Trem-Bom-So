package trabalhoProgooII;


public abstract class Fornecedor extends Pessoa {
    protected String cnpj;

    public Fornecedor(String nome, String endereco, String cnpj) {
	super(nome, endereco);
	if (isCNPJ(cnpj))
	    this.cnpj = cnpj;
	else
	    System.out.println("CNPJ inválido!");
    }

    public String getCnpj() {
	return imprimeCNPJ(cnpj);
    }

    public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
    }
    
    public void imprimeInformacoesFornecedor() {
	System.out.printf("Fornecedor: %s.\n", this.nome);
	System.out.printf("Endereço: %s.\n", this.endereco);
	System.out.printf("CNPJ: %s.\n", imprimeCNPJ(this.cnpj));
    }
}