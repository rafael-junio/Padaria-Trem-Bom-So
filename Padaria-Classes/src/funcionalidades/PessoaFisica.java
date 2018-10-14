package funcionalidades;

public class PessoaFisica extends Pessoa{
    private String cpf;
    private String telefone;
    
    public PessoaFisica(String nome, String endereco, String cpf, String telefone) {
	super(nome, endereco);
	
	if(isCPF(cpf))
	    this.cpf = cpf;
	else
	    System.out.println("CPF inválido!");
	
	this.telefone = telefone;
    }

    public String getCpf() {
        return imprimeCPF(cpf);
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
