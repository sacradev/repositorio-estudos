package main;

public class Main {

	public static void main(String[] args) {

		Fornecedor fornecedor = new Fornecedor("fornecedor", "Rua sem rua, 0, sem bairro", "999999999", 18994, 4829);
		fornecedor.run();

		Empregado empregado = new Empregado("empregado", "Rua sem rua, 0, sem bairro", "999999999", 000, 1252.00, 0.15);
		empregado.run();

		Administrador adm = new Administrador("adm", "Rua sem rua, 0, sem bairro", "999999999", 001, 2200.00, 0.15, 400);
		adm.run();
		
		Operario operario = new Operario("operario", "Rua sem rua, 0, sem bairro", "999999999", 002, 1252.00, 0.15, 500, 0.30);
		operario.run();
	
		Vendedor vendedor = new Vendedor("vendedor", "Rua sem rua, 0, sem bairro", "999999999", 002, 1800.50, 0.15, 4500, 0.15);
		vendedor.run();
		
	}

}
