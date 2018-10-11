package trabalhoProgooII;

public class Data {
    private static final int[] DIASMESSES = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private int dia, mes, ano;

    
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

	private boolean validaDia(int dia, int mes, int ano) {
      if (dia == 29 && mes == 2 && validaAnoBi(ano))
        return true;
      if(validaMes(mes) && (dia < 1 || dia > DIASMESSES[mes - 1]))
        return false;
      else
        return true;
    }

    private boolean validaMes(int mes) {
      if(mes < 1 || mes > 12)
        return false;
      else
        return true;
    }

    private boolean validaAnoBi(int ano) {
      if(ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0))
        return true;
      else
        return false;
    }
}
