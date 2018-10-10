package trabalhoProgooII;

public final class Padeiro extends Funcionario {
	
	protected int horaExcedente;
	protected float gratificacao;
	
	public Padeiro(String nome, String endereco, float salarioBase, String codigoFuncionario, int horaExcedente, float gratificacao) {
		super(nome, endereco, salarioBase, codigoFuncionario);
		this.horaExcedente = horaExcedente;
		this.gratificacao = gratificacao;
	}

	public int getHoraExcedente() {
		return horaExcedente;
	}

	public void setHoraExcedente(int horaExcedente) {
		this.horaExcedente = horaExcedente;
	}

	public float getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(float gratificacao) {
		this.gratificacao = gratificacao;
	}

}
