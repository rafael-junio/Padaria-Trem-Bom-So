package funcionarios;

public final class Padeiro extends Funcionario {

	protected int horaExcedente;
	protected final float gratificacao = 0.25f;

	public Padeiro(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase) {
		super(nome, endereco, cpf, telefone, codigo, salarioBase);
	}

	public int getHoraExcedente() {
		return horaExcedente;
	}

	public void setHoraExcedente(int horaExcedente) {
		this.horaExcedente = horaExcedente;
	}

	public float calculaSalario(int horaExtra) {
		this.horaExcedente = horaExtra;
		if (horaExtra > 0) {
			return this.salarioFinal + ((this.salarioBase * this.gratificacao) * horaExtra);
		} else
			return this.salarioFinal;
	}
	
	public void imprimeInformacoesFuncionario() {
		System.out.printf("Nome Padeiro: %s.\n", this.nome);
		super.imprimeInformacoesFuncionario();
		System.out.printf("Horas excedente de trabalho noturno: %02d hora(s).\n", this.horaExcedente);
		System.out.printf("Salário final: %.2f.\n", this.salarioFinal);
	}
}
