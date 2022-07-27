package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Agenda {

	String nome;
	String idade;
	String altura;
	Scanner scan = new Scanner(System.in);
	ArrayList<Agenda> agenda = new ArrayList<>();
	Vector<String> names = new Vector<>();

	public Agenda() {
	}

	private Agenda(String nome, String idade, String altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	// Módulo de getters and Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	// Método para armazenamento de contato

	public void armazenaContato(String nome, String idade, String Altura) {

		System.out.println("Digite o nome do contato: ");
		setNome(nome = scan.next());
		System.out.println("Digite a idade: ");
		setIdade(idade = scan.next());
		System.out.println("Digite a altura: ");
		setAltura(altura = scan.next());

		Agenda contato = new Agenda(getNome(), getIdade(), getAltura());
		

		System.out.println(contato.nome + "; " + contato.idade + "; " + contato.altura);
		if (agenda.size() < 2) {
			agenda.add(contato);
			names.add(contato.getNome());
			System.out.println(agenda.size() + " Contato Cadastrado.");
		} else if (agenda.size() >= 2 && agenda.size()<=9){
			agenda.add(contato);
			names.add(contato.getNome());
			System.out.println(agenda.size() + " Contatos Cadastrados.");
		} else {
			System.out.println("Capacidade máxima de " +  agenda.size() + " atiginda.");
		}

	}

	// Método para remoção de contato

	public void removePessoa() {
		System.out.println("Esses são os contatos registrados na sua agenda até o momento: ");
		// A contagem inicia em um. Afim de gerar uma usuabilidade confortável
		// para o usuário, porém, para fins de programação, é important lembrar
		// que o método array tem sua posição inicial igual a 0, sendo necessário
		// adapatar esse valor na hora da seleção da posição a ser excluida,
		// diminuindo uma unidade (-1) da variável position.

		int i = 1;
		for (Agenda set : agenda) {
			System.out.println(i + " - " + set);
			i++;
		}

		System.out.println("Digite a posição que deseja excluir");
		int position = scan.nextInt() - 1;

		if (position < agenda.size()) {
			String aux = names.get(position);
			agenda.remove(position);
			names.remove(position);
			
			System.out.println("\nO contato " + aux + " foi excluido com sucesso.");
		} else {
			System.out.println("\nO contato não está registrado na agenda");
		}
	}

	// M=étodo para Buscar um novo contato
	
	public void buscaPessoa(String nome) {
		System.out.println("\nDigite o nome que deseja buscar na agenda");
		nome = scan.next();
		int verify = names.indexOf(nome);
		int position = 0;
		for (int i = 0; i < agenda.size(); i++) {
			if (verify != -1) {
				position = verify + 1;
				System.out.println("\nO contato: " + names.get(verify));
				System.out.println("\nEstá armazenado na posição: " + position);
				break;
			} else {
				System.out.println("\nO contato não consta na agenda!");
			}

		}

	}

	// Método de impressão de contatos

	@Override // Alteração do método ToString para setar a impressão do array
	public String toString() {
		return nome + "; " + idade + "; " + altura;

	}

	public void imprimirAgenda() {
		System.out.println("");
		for (Agenda set : agenda) {
			System.out.println(set);
		}
	}

	// Método para impriimr um único contato

	public void imprimirPessoa(int i) {

		System.out.println("\nSua agenda atualmente possui " + agenda.size() + "contatos.");
		System.out.println("\nDigite a posição que deseja buscar na agenda");

		i = scan.nextInt() - 1;
		int aux = i+1;
		System.out.println("\nO contato " + names.get(i) + " cadastrado na posição " + aux + ".");
		System.out.println("\nPossui os seguintes dados: " + agenda.get(i));

	}

	public void executar() {
		String action = "";
		String continuar = "";
		System.out.println("Bem vindo a sua Agenda!\n");

		do {
			System.out.println("Escolha uma opção qeu deseja acessar: \n");
			System.out.println("Digite 1: Para ARMAZENAR um novo contato."); 
			System.out.println("Digite 2: Para REMOVER um contato."); 
			System.out.println("Digite 3: Para BUSCAR um novo contato.");
			System.out.println("Digite 4: Para IMPRIMIR TODOS os contatos."); 
			System.out.println("Digite 5: Para IMPRIMIR um único contato.");
			System.out.println("Digite 0: Para SAIR da agenda.");
			System.out.println("");

			int opcao = scan.nextInt();
			switch (opcao) {
			case 1:

				do {
					armazenaContato(nome, idade, altura);
					if(agenda.size()<=9) {
					System.out.println("\nDeseja adicionar outro contato? [S/N]");
					continuar = scan.next();
					}else {
						continuar = "n";
						System.out.println("\nCapacidade máxima de " +  agenda.size() + " atiginda.");
					}

					if (continuar.equalsIgnoreCase("n")) {
						System.out.println("\nDeseja realizar uma nova ação? [S/N]");
						action = scan.next();
						if (action.equalsIgnoreCase("n")) {
							System.out.println("\nSua agenda está sendo encerrada, até a próxima!");
							System.exit(0);
						}
					}
				} while (continuar.equalsIgnoreCase("s"));
				break;

			case 2:
				do {
					removePessoa();

					System.out.println("\nDeseja remover outro contato? [S/N]");
					continuar = scan.next();

					if (continuar.equalsIgnoreCase("n")) {
						System.out.println("\nDeseja realizar uma nova ação? [S/N]");
						action = scan.next();
						if (action.equalsIgnoreCase("n")) {
							System.out.println("\nSua agenda está sendo encerrada!");
							System.exit(0);
						}
					}
				} while (continuar.equalsIgnoreCase("s"));
				break;

			case 3:
				do {
					buscaPessoa(nome);

					System.out.println("\nDeseja buscar outra posição? [S/N]");
					continuar = scan.next();

					if (continuar.equalsIgnoreCase("n")) {
						System.out.println("\nDeseja realizar uma nova ação? [S/N]");
						action = scan.next();
						if (action.equalsIgnoreCase("n")) {
							System.out.println("\nSua agenda está sendo encerrada!");
							System.exit(0);
						}
					}

				} while (continuar.equalsIgnoreCase("s"));
				break;

			case 4:
				imprimirAgenda();
				System.out.println("\nDeseja realizar uma nova ação? [S/N]");
				action = scan.next();
				if (action.equalsIgnoreCase("n")) {
					System.out.println("\nSua agenda está sendo encerrada!");
					System.exit(0);
				}
				break;

			case 5:
				do {
					imprimirPessoa(opcao);
					
					System.out.println("\nDeseja buscar outro contato? [S/N]");
					continuar = scan.next();

					if (continuar.equalsIgnoreCase("n")) {
						System.out.println("\nDeseja realizar uma nova ação? [S/N]");
						action = scan.next();
						if (action.equalsIgnoreCase("n")) {
							System.out.println("\nSua agenda está sendo encerrada!");
							System.exit(0);
						}
					}

				} while (continuar.equalsIgnoreCase("s"));
				break;
			case 0:
				action = "n";
				System.out.println("\nSua agenda está sendo encerrada, até a próxima!");
				System.exit(0);
				break;
			}
		} while (action.equals("s"));
	}

}
