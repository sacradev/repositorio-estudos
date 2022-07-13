package calTelas;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaEntrada {
	
	public TelaEntrada() {
		
		// criação do container
		
		JFrame janela = new JFrame("Calculadora de Áreas");
		JPanel panel = new JPanel();
		
		// organização do container
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints(); // método responsável por controlar as posições
		
		// Revisar 
		janela.setSize(400,400);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);
		
		// Label de apresentação
		
		JLabel init = new JLabel("Escolha qual área deseja calcular: ");
		
		// botões janela princial
		
		JButton btn1 = new JButton("Circunferência");
		btn1.setPreferredSize(new Dimension(120,20));
		JButton btn2 = new JButton("Quadrado");
		btn2.setPreferredSize(new Dimension(120,20));
		JButton btn3 = new JButton("Triângulo");
		btn3.setPreferredSize(new Dimension(120,20));
		JButton btn4 = new JButton("Retângulo");
		btn4.setPreferredSize(new Dimension(120,20));

		// adição e organização dos componentes na tela principal
		
		gbc.gridx = 0; gbc.gridy = 0;
		panel.add(init, gbc);
		
		gbc.gridx = 0; gbc.gridy = 1; 
		panel.add(btn1, gbc);
		
		gbc.gridx = 1; gbc.gridy = 1; 
		panel.add(btn2, gbc);
		
		gbc.gridx = 0; gbc.gridy = 2;
		panel.add(btn3, gbc);
		
		gbc.gridx = 1; gbc.gridy = 2; 
		panel.add(btn4, gbc);
		
		// Adicionando o JFrame no JPanel
		
		janela.add(panel);
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(500,150);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new TelaCirculo();
				janela.dispose();
				
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new TelaQuadrado();
				janela.dispose();

			}
		});
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new TelaTriangulo();
				janela.dispose();
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new TelaRetangulo();
				janela.dispose();
			}
		});
		
	}

}
