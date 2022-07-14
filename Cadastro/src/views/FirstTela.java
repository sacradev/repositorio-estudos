package views;

import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FirstTela {
	
	public FirstTela() {
		
		// Organizando os containers
		
		JFrame frame = new JFrame("Cadastro de Clientes Resumidos");
		JPanel firstPanel = new JPanel();
		firstPanel.setLayout(null);
		JPanel secondPanel = new JPanel();
		
		//Labels de Controle
		
		JLabel title = new JLabel("Cadastro de Clientes Resumido");
		Font f = new Font("SansSerif", Font.BOLD, 25);
		JLabel idData = new JLabel("Dados de Identificação");
		JLabel adress = new JLabel("Endereço de Entrega");
		
		// Labels firstpanel 
			//primeira linha
		
		JLabel nome = new JLabel("Nome");
		JLabel chapa = new JLabel("Chapa");
		JLabel empresa = new JLabel("Empresa");
			//segunda linha
		
		JLabel bornDt = new JLabel("Dt.Nascimento");
		JLabel celPhone = new JLabel("Celular");
		JLabel telPhone1 = new JLabel("Telefone 1");
		JLabel telPhone2 = new JLabel("Telefone 2");
			//terceira linha
		
		JLabel emailCtt = new JLabel("E-mail de contato");
		JLabel emailNF = new JLabel("E-mail para envio de NF-e");
			//quarta linha
		
		JLabel cadPessoa = new JLabel("Pessoa");
		JLabel ruralProd = new JLabel("Produtor Rural");
		JLabel cpf = new JLabel("CPF");
		JLabel rg = new JLabel("RG");
		JLabel orgExp = new JLabel("Orgão Exp");
		JLabel estadoExp = new JLabel("U.F Exp");
			//quinta linda
		
		JLabel cnpj = new JLabel("CNPJ");
		JLabel inscEstadual = new JLabel("Inscrição Estadual");
		JLabel idEstrangeiro = new JLabel("Id. Estrangeiro");
			//sexta linha
		
		JLabel icmsTypeCont = new JLabel("Tipo de Contribuindo do ICMS");
		JLabel finalidaeVenda = new JLabel("Finalidade da Venda");
		JLabel checkBox = new JLabel("Pariticpa do Cartão");
		JLabel checkBox2 = new JLabel("Fidelidade");
			//setima linha
		
		JLabel cep = new JLabel("CEP");
		JLabel endereco = new JLabel("Endereço");
		JLabel numero = new JLabel("Número");
		JLabel estado = new JLabel("UF");
			//oitava linha
		
		JLabel bairro = new JLabel("Bairro");
		JLabel cidade = new JLabel("Cidade");
		JLabel complemento = new JLabel("Complemento");
			//nona linha
		
		JLabel referencia = new JLabel("Referência");
		JLabel rotaEntrega = new JLabel("Rota");
		
		
		// TextField
			//primeira linha
		
		JTextField txtnome = new JTextField();
		JTextField txtchapa = new JTextField();
		JTextField txtempresa = new JTextField();
			//segunda linha
		
		JTextField txtbonr = new JTextField();
		JTextField txtcel = new JTextField();
		JTextField txttel1 = new JTextField();
		JTextField txttel2 = new JTextField();
			//terceira linha
		
		JTextField txtctt = new JTextField();
		JTextField txtnf = new JTextField();
			//quarta linha
		
		JTextField txtcpf = new JTextField();
		JTextField txtrg = new JTextField();
		JTextField txtOrgExp = new JTextField();
			//quinta linha
		
		JFormattedTextField txtcnpj = new JFormattedTextField("##.###.###/0001-##");
		JTextField txtinsEstadual = new JTextField();
		JTextField txtIdEstrangeira = new JTextField();
			//sexta linha não precisou
		
			//setima linha
		
		JTextField txtCep = new JTextField();
		JTextField txtEndereco = new JTextField();
		JTextField txtNumero = new JTextField();
			//oitava linha
		
		JTextField txtBairro = new JTextField();
		JTextField txtCidade = new JTextField();
		JTextField txtComplemento = new JTextField();
			//nona linha
		
		JTextField txtReferencia = new JTextField();
		
		// boões
		
		JCheckBox caixa = new JCheckBox();
		JButton lookCep = new JButton("Procurar");
		JButton ok = new JButton("OK (F3)");
		JButton cancelar = new JButton("Cancelar (Esc)");
		
		// jcombobox
		
		String[] empresas = {"Empresa A", "Empresa B", "Empresa C"};
		JComboBox<String> companyType = new JComboBox<>(empresas);
	
		
		String[] pessoa = {"Física","Jurídica"};
		JComboBox<String> pessoaType = new JComboBox<>(pessoa);
		
		String[] confirm = {"Sim","Não"};
		JComboBox<String> confirmation = new JComboBox<>(confirm);
		
		String[] UF = {"AC", "AL", "AP", "AM", "BA",
				"CE", "DF", "ES", "GO", "MA", "MS",
				"MT", "MG", "PA", "PB", "PR", "PE",
				"PI", "RJ", "RN", "RS", "RO", "RR",
				"SC", "SP", "SE", "TO"};
		
		JComboBox<?> ufExp = new JComboBox<Object>(UF);
		JComboBox<?> uf = new JComboBox<Object>(UF);
		
		String[] contribICMS = {"Não Contribuinte do ICMS","Contribuinte do ICMS", "Isento"};
		JComboBox<?> icmsType = new JComboBox<Object>(contribICMS);
		
		String[] saleObjective = {"Tipo1","Tipo2", "Tipo3"};
		JComboBox<?> saleType = new JComboBox<Object>(saleObjective);
		
		String[] rota = {"Rota1","Rota2", "Rota3"};
		JComboBox<?> rotaType = new JComboBox<Object>(rota);
		
		// compontens de controle
		
		firstPanel.add(title);
		title.setBounds(5, 0, 500, 50);
		title.setFont(f);
		
		firstPanel.add(idData);
		idData.setBounds(20, 60, 150, 25);
		
		firstPanel.add(adress);
		adress.setBounds(20, 353, 150, 25);
			
		
		// adicionando componente da primeira linha de comando
				
		firstPanel.add(nome);
		nome.setBounds(5, 80, 150, 25);
		
		firstPanel.add(txtnome);
		txtnome.setBounds(5, 100, 270, 25);
		
		firstPanel.add(chapa);
		chapa.setBounds(280, 80, 150, 25);
		
		firstPanel.add(txtchapa);
		txtchapa.setBounds(280, 100, 95, 25);
		
		
		firstPanel.add(empresa);
		empresa.setBounds(380, 80, 150, 25);
		
		firstPanel.add(txtempresa);
		txtempresa.setBounds(380, 100, 50, 25);
		
		firstPanel.add(companyType);
		companyType.setBounds(440, 100, 140, 23);
			
		// Adicionando componentes da segunda linha de comando
		
		firstPanel.add(bornDt);
		bornDt.setBounds(5, 125, 150, 25);
		firstPanel.add(txtbonr);
		txtbonr.setBounds(5, 145, 130, 25);
		
		firstPanel.add(celPhone);
		celPhone.setBounds(140, 125, 130, 25);
		firstPanel.add(txtcel);
		txtcel.setBounds(140, 145, 135, 25);
		
		firstPanel.add(telPhone1);
		telPhone1.setBounds(280, 125, 150, 25);
		firstPanel.add(txttel1);
		txttel1.setBounds(280, 145, 150, 25);
		
		firstPanel.add(telPhone2);
		telPhone2.setBounds(440, 125, 140, 25);
		firstPanel.add(txttel2);
		txttel2.setBounds(440, 145, 140, 25);
		
		// Adicionando componentes da terceira linha de comando
		
		firstPanel.add(emailCtt);
		emailCtt.setBounds(5, 170, 150, 25);
		firstPanel.add(txtctt);
		txtctt.setBounds(5, 190, 270, 25);
		
		firstPanel.add(emailNF);
		emailNF.setBounds(280, 170, 150, 25);
		firstPanel.add(txtnf);
		txtnf.setBounds(280, 190, 300, 25);
		
		// Adicionando componentes da quarta linha de comando
		
		firstPanel.add(cadPessoa);
		cadPessoa.setBounds(5, 215, 150, 25);
		firstPanel.add(pessoaType);
		pessoaType.setBounds(5, 235, 70, 23);
		
		firstPanel.add(ruralProd);
		ruralProd.setBounds(80, 215, 150, 25);
		firstPanel.add(confirmation);
		confirmation.setBounds(80, 235, 85, 23);
		
		firstPanel.add(cpf);
		cpf.setBounds(175, 215, 150, 25);
		firstPanel.add(txtcpf);
		txtcpf.setBounds(175, 235, 100, 25);
		
		firstPanel.add(rg);
		rg.setBounds(280, 215, 150, 25);
		firstPanel.add(txtrg);
		txtrg.setBounds(280, 235, 100, 25);
		
		firstPanel.add(orgExp);
		orgExp.setBounds(390, 215, 77, 25);
		
		firstPanel.add(txtOrgExp);
		txtOrgExp.setBounds(390, 235, 80, 25);
		
		firstPanel.add(estadoExp);
		estadoExp.setBounds(480, 215, 77, 25);
		firstPanel.add(ufExp);
		ufExp.setBounds(480, 235, 99, 23);
		
		// Adicionando componentes da quinta linha de comando
		
		firstPanel.add(cnpj);
		cnpj.setBounds(5, 260, 150, 25);
		firstPanel.add(txtcnpj);
		txtcnpj.setBounds(5, 280, 185, 25);
		
		firstPanel.add(inscEstadual);
		inscEstadual.setBounds(200, 260, 120, 25);
		firstPanel.add(txtinsEstadual);
		txtinsEstadual.setBounds(200, 280, 190, 25);
		
		firstPanel.add(idEstrangeiro);
		idEstrangeiro.setBounds(400, 260, 100, 25);
		firstPanel.add(txtIdEstrangeira);
		txtIdEstrangeira.setBounds(400, 280, 180, 25);
		
		// Adicionando componentes da sexta linha de comando
		
		firstPanel.add(icmsTypeCont);
		icmsTypeCont.setBounds(5, 305, 200, 25);
		firstPanel.add(icmsType);
		icmsType.setBounds(5, 325, 280, 23);
		
		
		firstPanel.add(finalidaeVenda);
		finalidaeVenda.setBounds(290, 305, 280, 23);
		firstPanel.add(saleType);
		saleType.setBounds(290, 325, 150, 23);
		
		firstPanel.add(caixa);
		caixa.setBounds(440, 320, 20, 23);
		firstPanel.add(checkBox);
		checkBox.setBounds(460, 318, 120, 25);		
		firstPanel.add(checkBox2);
		checkBox2.setBounds(460, 333, 120, 25);
		
		// Adicionando componentes da sétima linha de comando
		
		firstPanel.add(cep);
		cep.setBounds(5, 375, 200, 25);
		firstPanel.add(txtCep);
		txtCep.setBounds(5, 395, 80, 25);
		
		firstPanel.add(lookCep);
		lookCep.setBounds(90, 395, 85, 25);
	
		firstPanel.add(endereco);
		endereco.setBounds(185, 375, 200, 25);
		firstPanel.add(txtEndereco);
		txtEndereco.setBounds(185, 395, 230, 25);
		
		firstPanel.add(numero);
		numero.setBounds(425, 375, 200, 25);
		firstPanel.add(txtNumero);
		txtNumero.setBounds(425, 395, 70, 25);
		
		firstPanel.add(estado);
		estado.setBounds(505, 375, 200, 25);
		firstPanel.add(uf);
		uf.setBounds(505, 395, 75, 23);
		
		// Adicionando componentes da oitava linha de comando
		
		firstPanel.add(bairro);
		bairro.setBounds(5, 415, 200, 25);
		firstPanel.add(txtBairro);
		txtBairro.setBounds(5, 435, 170, 25);
		
		firstPanel.add(cidade);
		cidade.setBounds(185, 415, 200, 25);
		firstPanel.add(txtCidade);
		txtCidade.setBounds(185, 435, 230, 25);
		
		firstPanel.add(complemento);
		complemento.setBounds(425, 415, 200, 25);
		firstPanel.add(txtComplemento);
		txtComplemento.setBounds(425, 435, 155, 25);
		
		// Adicionando componentes da nona linha de comando
		
		firstPanel.add(referencia);
		referencia.setBounds(5, 455, 200, 25);
		firstPanel.add(txtReferencia);
		txtReferencia.setBounds(5, 475, 200, 25);
		
		firstPanel.add(rotaEntrega);
		rotaEntrega.setBounds(215, 455, 200, 25);
		firstPanel.add(rotaType);
		rotaType.setBounds(215, 475, 200, 23);
		
		firstPanel.add(ok);
		ok.setBounds(364, 530, 90, 25);
		
		
		firstPanel.add(cancelar);
		cancelar.setBounds(464, 530, 116, 25);

		
		// container principal
		
		frame.setVisible(true);
		frame.setLocation(370,50);
		frame.setSize(600,600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.add(firstPanel);
		
	}

}
