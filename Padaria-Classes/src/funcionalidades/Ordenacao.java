package funcionalidades;

import cliente.Cliente;
import fornecedores.Fornecedor;
import funcionarios.Funcionario;
import produtos.Produto;

public class Ordenacao {
	
	public static void ordena(Object[] obj, int qnt) {
		insertion(obj);
		mergeSort(obj, 0, qnt-1);
	}
	
	private static void mergeSort(Object[] a, int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			mergeSort(a, inicio, meio);
			mergeSort(a, meio + 1, fim);
			merge(a, inicio, meio, fim);
		}
	}

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
			if (b[i].toString().compareTo(b[j].toString()) < 0)
				a[k++] = b[i++];
			else
				a[k++] = b[j++];
		}

		while (i <= meio)
			a[k++] = b[i++];
	}

	private static void insertion(Object[] a) {
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
			int j = i;
			while(j > 0 && a[j-1] == null && a[j] != null) {
				aux = a[j];
				a[j] = a[j-1];
				a[j-1] = aux;
				j = j-1;				
			}
		}
	}
}