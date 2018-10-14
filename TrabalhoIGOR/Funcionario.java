package trabalhoProgooII.TrabalhoIGOR;

public abstract class Funcionario extends PessoaFisica {
	protected float salarioBase;
	protected String codigoFuncionario;
	
	public Funcionario(String nome, String endereco, String telefone, String cpf, float salarioBase,String codigoFuncionario) {
		super(nome, endereco, telefone, cpf);
		this.salarioBase = salarioBase;
		this.codigoFuncionario = codigoFuncionario;
	}


	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public String getCodigoFuncionario() {
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(String codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	public void ImprimeInformacoesFuncionarios()
	{
		System.out.println("Nome: " +getNome());
		System.out.println("Endereço: " +getEndereco());
		System.out.println("Telefone: " +getTelefone());
		System.out.println("Cpf: " +getCpf());
		System.out.println("Salário Base: " +getSalarioBase());
		System.out.println("Código do Funcionário: " +getCodigoFuncionario());
	}

}
