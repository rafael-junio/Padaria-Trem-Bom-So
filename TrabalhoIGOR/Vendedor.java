package trabalhoProgooII.TrabalhoIGOR;

public class Vendedor extends Funcionario implements SalarioFinal {
	private float montanteVendas; // ver como vai ser
	private float meta; // ver como vai ser
	private float salarioFinal;
	private float percentual = (float) 0.1;
	
	public Vendedor(String nome, String endereco, String telefone, String cpf, float salarioBase, String codigoFuncionario) {
		super(nome, endereco, telefone, cpf, salarioBase, codigoFuncionario);
		calcularSalarioFinal();
		
	}

	public float calcularSalarioFinal() {
		if (montanteVendas > meta)
			salarioFinal = salarioBase * (1+percentual);
		else
			salarioFinal = salarioBase;
		return salarioFinal;
	}

	public float getSalarioFinal() {
		return salarioFinal;
	}

	public void setSalarioFinal(float salarioFinal) {
		this.salarioFinal = salarioFinal;
	}

	public float getPercentual() {
		return percentual;
	}

	public void setPercentual(float percentual) {
		this.percentual = percentual;
	}
	
	public float getMontanteVendas() {
		return montanteVendas;
	}

	public void setMontanteVendas(float montanteVendas) {
		this.montanteVendas = montanteVendas;
	}

	public float getMeta() {
		return meta;
	}

	public void setMeta(float meta) {
		this.meta = meta;
	}

	public void ImprimeInformacoesFuncionarios()
	{
		super.ImprimeInformacoesFuncionarios();
		System.out.println("Salário Final: " +getSalarioFinal());
	}
	
}
