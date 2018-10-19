package funcionalidades;

import cliente.Cliente;
import fornecedores.Fornecedor;
import funcionarios.Funcionario;
import produtos.Produto;

public class Ordenacao {
	public static void mergeSort(Object[] a, int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			mergeSort(a, inicio, meio);
			mergeSort(a, meio + 1, fim);
			merge(a, inicio, meio, fim);
		}
	}

	public static void merge(Object[] a, int inicio, int meio, int fim) {
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

	public static void ordena(Cliente[] obj) {
		int cont = 0;

		Cliente[] objAux = new Cliente[obj.length];

		for (int i = 0, j = 0; i < obj.length; i++)
			if (obj[i] != null) {
				objAux[j] = obj[i];
				cont++;
				j++;
				obj[i] = null;
			}

		Cliente[] objAux2 = new Cliente[cont];

		for (int i = 0; i < cont; i++) {
			objAux2[i] = objAux[i];
		}

		objAux = null;

		mergeSort(objAux2, 0, objAux2.length - 1);

		for (int i = 0; i < objAux2.length; i++) {
			obj[i] = objAux2[i];
		}
	}

	public static void ordena(Fornecedor[] obj) {
		int cont = 0;

		Fornecedor[] objAux = new Fornecedor[obj.length];

		for (int i = 0, j = 0; i < obj.length; i++)
			if (obj[i] != null) {
				objAux[j] = obj[i];
				cont++;
				j++;
				obj[i] = null;
			}

		Fornecedor[] objAux2 = new Fornecedor[cont];

		for (int i = 0; i < cont; i++) {
			objAux2[i] = objAux[i];
		}

		objAux = null;

		mergeSort(objAux2, 0, objAux2.length - 1);

		for (int i = 0; i < objAux2.length; i++) {
			obj[i] = objAux2[i];
		}
	}

	public static void ordena(Funcionario[] obj) {
		int cont = 0;

		Funcionario[] objAux = new Funcionario[obj.length];

		for (int i = 0, j = 0; i < obj.length; i++)
			if (obj[i] != null) {
				objAux[j] = obj[i];
				cont++;
				j++;
				obj[i] = null;
			}

		Funcionario[] objAux2 = new Funcionario[cont];

		for (int i = 0; i < cont; i++) {
			objAux2[i] = objAux[i];
		}

		objAux = null;

		mergeSort(objAux2, 0, objAux2.length - 1);

		for (int i = 0; i < objAux2.length; i++) {
			obj[i] = objAux2[i];
		}

	}

	public static void ordena(Produto[] obj) {
		int cont = 0;

		Produto[] objAux = new Produto[obj.length];

		for (int i = 0, j = 0; i < obj.length; i++)
			if (obj[i] != null) {
				objAux[j] = obj[i];
				cont++;
				j++;
				obj[i] = null;
			}

		Produto[] objAux2 = new Produto[cont];

		for (int i = 0; i < cont; i++) {
			objAux2[i] = objAux[i];
		}

		objAux = null;

		mergeSort(objAux2, 0, objAux2.length - 1);

		for (int i = 0; i < objAux2.length; i++) {
			obj[i] = objAux2[i];
		}

	}

//	public static void main(String[] args) {
//		String[] v = new String[9]; //{"Dinh","oasd","ZA","abc","dfc","boo"};
//		v[7] = "Dbnh";
//		v[5] = "abc";
//		v[3] = "dfc";
//		
//		ordena(v);
////		mergeSort(v, 0, v.length-1);
//		
//		
//		for(int i = 0; i < v.length; i++)
////		for(String i : v) 
//		{
//			if(v[i] != null)
//				System.out.println(v[i]);
//		}

//	}
}