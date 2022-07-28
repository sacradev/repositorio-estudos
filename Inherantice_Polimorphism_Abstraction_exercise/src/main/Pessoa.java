package main;

public abstract class  Pessoa {

	private String nome;
	private String endereco;
	private String telefone;

	public Pessoa() {
	}

	public Pessoa(String a) {
		this.setTelefone(a);
	}

	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	// Modulo de construtores
	public String getNome() {
		return nome;
	}

	public String setNome(String nome) {
		return this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public String setEndereco(String endereco) {
		return this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String a) {
		this.telefone = a;
	}
	
	

}
