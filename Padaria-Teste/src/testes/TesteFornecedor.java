package testes;

import fornecedores.FornecedorOcasional;
import fornecedores.FornecedorRecorrente;

public class TesteFornecedor {
    public static void main(String[] args) {
	FornecedorRecorrente fr1 = new FornecedorRecorrente("Casa Talheres", "Rua 01", "88.155.645/0001-44", 90);
	
	System.out.println(fr1.getTaxaDesconto());
	System.out.println(fr1.getNome());
	System.out.println(fr1.getEndereco());
	System.out.println(fr1.getCnpj());
	
	System.out.println();
	
	FornecedorOcasional fo1 = new FornecedorOcasional("Casa Arroz", "Rua 02", "53.387.524/0001-43");
	
	System.out.println(fo1.getNome());
	System.out.println(fo1.getEndereco());
	System.out.println(fo1.getCnpj());
    }
}
