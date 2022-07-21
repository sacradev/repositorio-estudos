package produto;

import javax.swing.JOptionPane;

public class Produto {

	private String nomeProduto;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;
	private double margemLucroPorcent;

	public Produto() { // Construtor
		setNomeProduto(JOptionPane.showInputDialog("Digite o nome do produto: "));
		setPrecoCusto(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de Custo: ")));
		setPrecoVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de Venda: ")));

	}

	// Módulo de métodos seletores

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public double getMargemLucro() {
		return margemLucro;
	}

	public void setMargemLucro(double margemLucro) {
		this.margemLucro = margemLucro;
	}

	/*
	 * Método usado para calcular margem de lucro absoluto acrescido de uma
	 * verificação na relação custo/preço. A verificação consiste em observar se o
	 * preço de custo é maior que o de venda, caso seja, o laço de repetição é
	 * acionado, retornando uma mensagem de alerta caso a condição continue
	 * atendida. O objetivo é garantir a existência de uma margem de lucro.
	 */

	public void CalcularMargeLucro() {
		if (this.getPrecoCusto() > this.getPrecoVenda()) {
			do {
				JOptionPane.showMessageDialog(null, "Preço de custo maior que o preço de venda, reveja seus preços!");
				this.setPrecoCusto(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de Custo: ")));
				this.setPrecoVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de Venda: ")));
			} while (this.getPrecoCusto() > this.getPrecoVenda());
		}
		setMargemLucro(this.getPrecoVenda() - this.getPrecoCusto());
	}

	// Método usado para calular a margem de lucro percentual

	public double getMargemLucroPorcentagem() {
		return margemLucroPorcent = this.getMargemLucro() / this.getPrecoCusto() * 100;
	}

	// método final, encapsulando todos os demais e retornando uma única janela a
	// solução para a task

	public void result() {
		this.CalcularMargeLucro();
		this.getMargemLucroPorcentagem();

		JOptionPane.showMessageDialog(null,
				"O produto: " + this.getNomeProduto() + " possui: " + "\nPreço de custo igual a: "
						+ this.getPrecoCusto() + "\nPreço de venda igual a: " + this.getPrecoVenda()
						+ "\nMargem de lucro absoluta de: " + this.getMargemLucro()
						+ "\nMargem de lucro percentual de: " + this.getMargemLucroPorcentagem() + "%");
	}
}
