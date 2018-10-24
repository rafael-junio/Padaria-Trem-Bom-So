package funcionalidades;

import pessoa.cliente.Cliente;
import pessoa.fornecedor.Fornecedor;
import pessoa.funcionario.Funcionario;
import controle.produto.Produto;

/**
 * Alunos:
 * @author Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * @author Rafael Junio Xavier - RGA: 2018.1907.050-6
 * @author Igor José Tamagno - RGA: 2018.1907.034-4
 *
 */
public class Ordenacao {
	public static int cont; // conta o número de posições não nulas no vetor.
	
	/**
	 * Método ordena.
	 *
	 * Pré-condição: recebe um vetor Object a ser ordenado em ordem alfabética.
	 * Pós-condição: não retorna valor. Chama métodos os de ordenação.
	 */
	public void ordena(Object[] obj) {
		int posicaoFinal = insertion(obj);
		mergeSort(obj, 0, posicaoFinal);
	}

	/**
	 * Método insertion.
	 *
	 * Pré-condição: recebe um vetor Object a ser ordenado em ordem posições nula e não nulas.
	 * Pós-condição: retorna um interio com o valor de posições não nulas no vetor Object. Ordena vetor em posições não nulas.
	 */
	private int insertion(Object[] a) {
		Ordenacao.cont = 0;
		
		Object aux = null;
		
		if(a instanceof Fornecedor[]) {
			a = (Fornecedor[]) a;
			aux = (Fornecedor) aux;
		}
		
		else if(a instanceof Cliente[])
			aux = (Cliente) aux;
		
		else if(a instanceof Funcionario[]) {
			a = (Funcionario[]) a;
			aux = (Funcionario) aux;
		}
		
		else if(a instanceof Produto[])
			aux = (Produto) aux;
		
		else
			aux = (String) aux;
		
		for(int i = 1; i < a.length; i++) {
			if(a[i] != null)
				Ordenacao.cont++;
			
			int j = i;				
			while(j > 0 && a[j-1] == null && a[j] != null) {
				aux = a[j];
				a[j] = a[j-1];
				a[j-1] = aux;
				j = j-1;				
			}
		}		
		return Ordenacao.cont;
	}
	
	/**
	 * Método mergeSort.
	 *
	 * Pré-condição: recebe um vetor de Object e dois inteiros.
	 * Pós-condição: não retorna valor. Alteras posições dos valores do vetor Object.
	 */
	private static void mergeSort(Object[] a, int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			mergeSort(a, inicio, meio);
			mergeSort(a, meio + 1, fim);
			merge(a, inicio, meio, fim);
		}
	}

	/**
	 * Método merge.
	 *
	 * Pré-condição: recebe um vetor de Object e três inteiros.
	 * Pós-condição: não retorna valor. Alteras posições dos valores do vetor Object.
	 */
	private static void merge(Object[] a, int inicio, int meio, int fim) {
		Object[] b = null;

		if (a instanceof Fornecedor[]) {
			b = (Fornecedor[]) b;
			b = new Fornecedor[a.length];
			for (int i = inicio; i <= fim; i++) {
				if (a[i] != null)
					b[i] = (Fornecedor) a[i];
			}
		} else if (a instanceof Cliente[]) {
			b = (Cliente[]) b;
			b = new Cliente[a.length];
			for (int i = inicio; i <= fim; i++) {
				if (a[i] != null)
					b[i] = (Cliente) a[i];
			}
		} else if (a instanceof Funcionario[]) {
			b = (Funcionario[]) b;
			b = new Funcionario[a.length];
			for (int i = inicio; i <= fim; i++) {
				if (a[i] != null)
					b[i] = (Funcionario) a[i];
			}
		} else if (a instanceof Produto[]) {
			b = (Produto[]) b;
			b = new Produto[a.length];
			for (int i = inicio; i <= fim; i++) {
				if (a[i] != null)
					b[i] = (Produto) a[i];
			}
		}
		else {
			b = (String[]) b;
			b = new String[a.length];
			for (int i = inicio; i <= fim; i++) {
				if (a[i] != null)
					b[i] = (String) a[i];
			}
		}

		int i = inicio;
		int j = meio + 1;
		int k = inicio;

		while (i <= meio && j <= fim) {
			if (b[i].toString().compareToIgnoreCase(b[j].toString()) < 0)
				a[k++] = b[i++];
			else
				a[k++] = b[j++];
		}

		while (i <= meio)
			a[k++] = b[i++];
	}
}