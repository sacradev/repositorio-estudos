package main;

public class Vendedor extends Empregado{
	
	private double valorVendas;
	private double comissao;

	public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
			double imposto, double valorVendas, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		
		this.setNome(setNome(nome));
		this.setEndereco(setEndereco(endereco));
		this.setTelefone(telefone);
		this.setCodigoSetor(codigoSetor);
		this.setSalarioBase(salarioBase);
		this.setImposto(imposto);
		this.setValorVendas(valorVendas);
		this.setComissao(comissao);
		
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
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
		System.out.println("Sario final(Base - imposto(15%) + comissão): " + this.calcularSalario() + (this.getValorVendas()*this.getComissao()));
		System.out.println("");

	}
	

}
