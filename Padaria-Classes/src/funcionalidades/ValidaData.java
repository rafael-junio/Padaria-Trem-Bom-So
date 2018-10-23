/**
 * 
 */
package funcionalidades;

import java.time.DateTimeException;
import java.time.LocalDate;

/**
 * @author rafael
 *
 */
public class ValidaData {
	
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
