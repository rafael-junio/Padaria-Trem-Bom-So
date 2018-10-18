package funcionalidades;

public class Ordenacao {
	public static void mergeSort(Object[] a, int inicio, int fim) {
		if(inicio < fim) {
			int meio = (inicio + fim) / 2;
			mergeSort(a, inicio, meio);
			mergeSort(a, meio+1, fim);			
			merge(a, inicio, meio, fim);
		}
	}
	
	public static void merge(Object[] a, int inicio, int meio, int fim) {
		String[] b = new String[a.length];
		
		for(int i = inicio; i <= fim; i++) {
			if(a[i] != null)
				b[i] = a[i].toString();
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
	
	public static void ordena(Object[] obj) {
		int cont = 0;
		
		Object[] objAux = new Object[obj.length];
		
		for(int i = 0, j = 0; i < obj.length; i++)
			if(obj[i] != null) {
				objAux[j] = obj[i];
				cont++;
				j++;
				obj[i] = null;
			}
		
		
		Object[] objAux2 = new Object[cont];
		
		for(int i = 0; i < cont; i++) {
			objAux2[i] = objAux[i];
		}
		
		objAux = null;
		
		mergeSort(objAux2, 0, objAux2.length-1);
		
		for(int i = 0; i < objAux2.length; i++) {
			obj[i] = objAux2[i];
		}
		
	}
	
	public static void main(String[] args) {
		String[] v = new String[9]; //{"Dinh","oasd","ZA","abc","dfc","boo"};
		v[7] = "Dbnh";
		v[5] = "abc";
		v[3] = "dfc";
		
		ordena(v);
//		mergeSort(v, 0, v.length-1);
		
		
		for(int i = 0; i < v.length; i++)
//		for(String i : v) 
		{
			if(v != null)
				System.out.println(v[i]);
		}
		
		
	}
}