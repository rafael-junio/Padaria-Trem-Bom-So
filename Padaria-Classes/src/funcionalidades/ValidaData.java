/**
 * 
 */
package funcionalidades;

import java.time.DateTimeException;
import java.time.LocalDate;

/**
 * Alunos:
 * @author Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * @author Rafael Junio Xavier - RGA: 2018.1907.050-6
 * @author Igor José Tamagno - RGA: 2018.1907.034-4
 *
 */
public class ValidaData {
	
	/**
     * Método construtor da classe ValidaData.
     * 
     * Pré-condição: recebe três inteiros, dia, mes, ano. 
     * Pós-condição: 
     */
	public static boolean isDateValid(int dia, int mes, int ano) {
		boolean dataValida = true;
		try {
			LocalDate.of(ano, mes, dia);
		}
		catch(DateTimeException e) {
			dataValida = false;
		}
		
		return dataValida;
	}
}
