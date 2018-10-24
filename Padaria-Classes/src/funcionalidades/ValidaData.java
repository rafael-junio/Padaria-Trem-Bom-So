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
 * @author Igor Jos� Tamagno - RGA: 2018.1907.034-4
 *
 */
public class ValidaData {
	
	/**
     * M�todo construtor da classe ValidaData.
     * 
     * Pr�-condi��o: recebe tr�s inteiros, dia, mes, ano. 
     * P�s-condi��o: 
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
