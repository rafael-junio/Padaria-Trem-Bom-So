package funcionalidades;

import java.util.InputMismatchException;

public class ValidaDocumento {

	/**
	 * M�todo removeCaracteresEspeciais.
	 *
	 * Pr�-condi��o: recebe uma String.
	 * P�s-condi��o: retorna uma String sem caracteres especiais.
	 */
	public String removeCaracteresEspeciais(String doc) {
		if (doc.contains(".")) {
			doc = doc.replace(".", "");
		}
		if (doc.contains("-")) {
			doc = doc.replace("-", "");
		}
		if (doc.contains("/")) {
			doc = doc.replace("/", "");
		}
		return doc;
	}

	/**
	 * M�todo isCNPJ.
	 *
	 * Pr�-condi��o: recebe uma String.
	 * P�s-condi��o: retorna TRUE, caso DV do CNJP seja v�lido, e FALSE, caso contr�rio.
	 */
	public boolean isCNPJ(String cnpj) {
		cnpj = removeCaracteresEspeciais(cnpj);

		if (cnpj.equals("00000000000000") || cnpj.equals("11111111111111") || cnpj.equals("22222222222222")
				|| cnpj.equals("33333333333333") || cnpj.equals("44444444444444") || cnpj.equals("55555555555555")
				|| cnpj.equals("66666666666666") || cnpj.equals("77777777777777") || cnpj.equals("88888888888888")
				|| cnpj.equals("99999999999999") || cnpj.length() != 14)
			return false;

		char dig13, dig14;
		int sm, i, r, num, peso;

		// "try" - protege o c�digo para eventuais erros de conversao de tipo (int)
		try {
			// Calculo do 1o. Digito Verificador
			sm = 0;
			peso = 2;

			for (i = 11; i >= 0; i--) {
				// converte o i-�simo caractere do cnpj em um n�mero:
				// por exemplo, transforma o caractere '0' no inteiro 0
				// (48 eh a posi��o de '0' na tabela ASCII)
				num = (int) (cnpj.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso + 1;
				if (peso == 10)
					peso = 2;
			}

			r = sm % 11;
			if ((r == 0) || (r == 1))
				dig13 = '0';
			else
				dig13 = (char) ((11 - r) + 48);

			// Calculo do 2o. Digito Verificador
			sm = 0;
			peso = 2;
			for (i = 12; i >= 0; i--) {
				num = (int) (cnpj.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso + 1;
				if (peso == 10)
					peso = 2;
			}

			r = sm % 11;
			if ((r == 0) || (r == 1))
				dig14 = '0';
			else
				dig14 = (char) ((11 - r) + 48);

			// Verifica se os d�gitos calculados conferem com os d�gitos informados.
			if ((dig13 == cnpj.charAt(12)) && (dig14 == cnpj.charAt(13)))
				return (true);
			else
				return (false);
		} catch (InputMismatchException erro) {
			return (false);
		}
	}

	/**
	 * M�todo imprimeCNPJ.
	 *
	 * Pr�-condi��o: recebe uma String. 
	 * P�s-condi��o: retorna uma Sting com a m�scara do CNPJ (99.999.999/9999-99).
	 */
	protected String imprimeCNPJ(String cnpj) {
		cnpj = removeCaracteresEspeciais(cnpj);
		return (cnpj.substring(0, 2) + "." + cnpj.substring(2, 5) + "." + cnpj.substring(5, 8) + "/"
				+ cnpj.substring(8, 12) + "-" + cnpj.substring(12, 14));
	}

	/**
	 * M�todo isCPF.
	 *
	 * Pr�-condi��o: recebe uma String.
	 * P�s-condi��o: retorna TRUE, caso DV do CPF seja v�lido, e FALSE, caso contr�rio.
	 */
	public boolean isCPF(String cpf) {
		cpf = removeCaracteresEspeciais(cpf);

		if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222")
				|| cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555")
				|| cpf.equals("66666666666") || cpf.equals("77777777777") || cpf.equals("88888888888")
				|| cpf.equals("99999999999") || cpf.length() != 11)
			return false;

		int dig10, dig11;
		int sm, i, r, num, peso;

		try {
			// Encontra primero DV
			sm = 0;
			peso = 10;

			for (i = 0; i < 9; i++) {
				num = (int) (cpf.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}

			r = 11 - (sm % 11);
			if (r == 10 || r == 11)
				dig10 = '0';
			else
				dig10 = (char) (r + 48);

			// Encontra segundo DV
			sm = 0;
			peso = 11;
			for (i = 0; i < 10; i++) {
				num = (int) (cpf.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}

			r = 11 - (sm % 11);
			if (r == 10 || r == 11)
				dig11 = '0';
			else
				dig11 = (char) (r + 48);

			// Verifica d�gitos encontrados
			if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10)))
				return true;
			else
				return false;
		} catch (InputMismatchException erro) {
			return false;
		}
	}

	/**
	 * M�todo imprimeCPF.
	 *
	 * Pr�-recebe uma String. 
	 * P�s-condi��o: retorna uma Sting com a m�scara do CPF (999.999.999-99).
	 */
	protected String imprimeCPF(String cpf) {
		cpf = removeCaracteresEspeciais(cpf);
		return (cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-"
				+ cpf.substring(9, 11));
	}
}