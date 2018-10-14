package trabalhoProgooII.TrabalhoIGOR;

public abstract class PessoaFisica extends Pessoa {
	protected String telefone;
	protected String cpf;
	
	public PessoaFisica(String nome, String endereco, String telefone, String cpf) {
		super(nome, endereco);
		this.telefone=telefone;
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
