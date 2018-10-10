package trabalhoProgooII;

public class Padeiro extends Funcionario {
	
	protected int horaExcedente;
	protected final float gratificacao = 0.25f;
	
	public Padeiro(String nome, String endereco, float salarioBase, String codigoFuncionario) {
		super(nome, endereco, salarioBase, codigoFuncionario);
	}

	public int getHoraExcedente() {
		return horaExcedente;
	}
	
	public void setHoraExcedente(int horaExcedente) {
		this.horaExcedente = horaExcedente;
	}

	public float calculaSalario(int horaExtra) {
		 setHoraExcedente(horaExtra);
		 if(horaExtra > 0) {
			return super.salarioBase + super.salarioBase * (this.gratificacao * horaExtra);
		 }
		 else
			 return this.salarioBase;
	}
	
	

}
