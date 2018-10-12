package trabalhoProgooII;

public class TesteVendedor {
	public static void main(String[] args) {
		Padeiro pade = new Padeiro("Gil", "Ru1", 100f, "01");
		Vendedor vende1 = new Vendedor("Raul", "Ru2", 100f, "abc");
		Gerente gere1 = new Gerente("Gugu", "Ru3", 200f, "abcd");
		
		System.out.println(vende1.calculaSalario(1000, 1001));
		System.out.println(gere1.calculaSalario(100, 99));
		System.out.println(pade.calculaSalario(2));
	}
}
