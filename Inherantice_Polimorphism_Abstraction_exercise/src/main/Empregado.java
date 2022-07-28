package main;

import interfaces.executar;

public class Empregado extends Pessoa implements executar {

	private int codigoSetor;
	private double salarioBase;
	private double imposto;

	public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
			double imposto) {
		this.setNome(setNome(nome));
		this.setEndereco(setEndereco(endereco));
		this.setTelefone(telefone);
		this.setCodigoSetor(codigoSetor);
		this.setSalarioBase(salarioBase);
		this.setImposto(imposto);
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public double calcularSalario() {
		double aux;
		aux = this.getSalarioBase() - this.getSalarioBase() * this.getImposto();
		return aux;
	}
	
	public void credenciais() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Endereço: " + this.getEndereco());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("Setor: " + this.getCodigoSetor());
		System.out.println("Salário base: " + this.getSalarioBase());
	}

	@Override
	public void run() {

		this.credenciais();
		System.out.println(this.calcularSalario());
		System.out.println("");

	}
}
