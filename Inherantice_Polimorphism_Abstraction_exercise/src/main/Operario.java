package main;

import interfaces.executar;

public class Operario extends Empregado implements executar{
	
	
	private double valorProducao;
	private double comissao;

	public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
			double imposto, double valorProducao, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		
		this.setNome(setNome(nome));
		this.setEndereco(setEndereco(endereco));
		this.setTelefone(telefone);
		this.setCodigoSetor(codigoSetor);
		this.setSalarioBase(salarioBase);
		this.setImposto(imposto);
		this.setValorProducao(valorProducao);
		this.setComissao(comissao);
		
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public void run() {

		this.credenciais();
		System.out.println("Sario final(Base - imposto(15%) + comissão): " + this.calcularSalario() + (this.getValorProducao()*this.getComissao()));
		System.out.println("");

	}
	
	
}
