package main;

import interfaces.ObterSaldo;
import interfaces.executar;

public class Fornecedor extends Pessoa implements ObterSaldo, executar {

	private double valorCredito;
	private double valorDivida;

	public Fornecedor() {
	}

	public Fornecedor(String nome, String endereco, String telefone, double a, double b) {

		this.setNome(setNome(nome));
		this.setEndereco(setEndereco(endereco));
		this.setTelefone(telefone);
		this.setValorCredito(a);
		this.setValorDivida(b);
	}

	// Modulo

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	@Override
	public double obterSaldo() {
		return this.getValorCredito() - this.getValorDivida();
	}

	@Override
	public void run() {
		
		System.out.println("Fornecedor: " + this.getNome());
		System.out.println("Endereço: " + this.getEndereco());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("Saldo devedor: " + this.getValorDivida());
		System.out.println("Crédito: " + this.getValorCredito());
		System.out.println("");
		System.out.println("Saldo final: " + this.obterSaldo());
	}

}
