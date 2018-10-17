package funcionalidades;

public class Ordenacao {
	public static void mergeSort(String[] a, int inicio, int fim) {
		if(inicio < fim) {
			int meio = (inicio + fim) / 2;
			mergeSort(a, inicio, meio);
			mergeSort(a, meio+1, fim);			
			merge(a, inicio, meio, fim);
		}
	}
	
	public static void merge(String[] a, int inicio, int meio, int fim) {
		String[] b = new String[a.length];
		
		for(int i = inicio; i <= fim; i++) {
			b[i] = a[i];
		}
		
		int i = inicio;
		int	j = meio + 1;
		int	k = inicio;
		
		while(i <= meio && j <= fim) {
			if(b[i].compareToIgnoreCase(b[j]) < 0)
				a[k++] = b[i++];
			else
				a[k++] = b[j++];
		}
		
		while(i <= meio)
			a[k++] = b[i++];
	}
	
	public static void main(String[] args) {
		String[] v = new String[] {"b","e","u","a","D","d","A"};
		
		mergeSort(v, 0, v.length-1);
		
		System.out.println("A".compareToIgnoreCase("a"));
		
		for(String i : v) {
			System.out.println(i);
		}
		
		
	}
}