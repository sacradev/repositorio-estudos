package main;

import interfaces.executar;

public class Administrador extends Empregado implements executar{

	private double ajudaDeCusto;

	public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
			double imposto, double ajudaDeCusto) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);

		this.setNome(setNome(nome));
		this.setEndereco(setEndereco(endereco));
		this.setTelefone(telefone);
		this.setCodigoSetor(codigoSetor);
		this.setSalarioBase(salarioBase);
		this.setImposto(imposto);
		this.setAjudaDeCusto(ajudaDeCusto);

	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;

	}
	
	
	@Override
	public void run() {
		
		this.credenciais();	
		System.out.println("Sario final(Base - imposto(15%) + ajuda de custo): " + this.calcularSalario() + this.getAjudaDeCusto());
		System.out.println("");
		
	}
	

}
