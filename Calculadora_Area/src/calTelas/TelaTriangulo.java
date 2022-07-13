package calTelas;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTriangulo {
	
	public TelaTriangulo() {
		
		// criação do container
		
			JFrame janela = new JFrame("Área do Triângulo");
			JPanel panel = new JPanel();
				
			// organização do container
			panel.setLayout(new GridBagLayout());
			GridBagConstraints gbc = new GridBagConstraints(); // método responsável por controlar as posições
				
			// Revisar 
			
			janela.add(panel);
			janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			janela.setVisible(true);
			janela.setSize(500,200);
			janela.setLocationRelativeTo(null);
			
			
			// Label de apresentação
			
			JLabel label = new JLabel("Digite a base do triângulo (cm): ");
			JLabel label2 = new JLabel("Digite a altura do triângulo (cm): ");
			
			
			JTextField field = new JTextField(17);
			JTextField field2 = new JTextField(17);

			// botões

			JButton btn1 = new JButton("Calcular");
			btn1.setPreferredSize(new Dimension(156,20));
			JButton btn2 = new JButton("Seção Anterior");
			btn2.setPreferredSize(new Dimension(156,20));
			
			// adição e organização dos componentes na tela do retângulo
			
			gbc.gridx = 0; gbc.gridy = 0;
			panel.add(label, gbc);
			
			gbc.gridx = 1; gbc.gridy = 0;
			panel.add(field, gbc);
			
			gbc.gridx = 0; gbc.gridy = 1;
			panel.add(label2, gbc);				
			
			gbc.gridx = 1; gbc.gridy = 1;
			panel.add(field2, gbc);
			
			gbc.gridx = 1; gbc.gridy = 2; 
			panel.add(btn1, gbc);
			
			gbc.gridx = 1; gbc.gridy = 3; 
			panel.add(btn2, gbc);
			
			// Adicionando o JFrame no JPanel
			
			janela.add(panel);
			janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			janela.setSize(600,150);
			janela.setVisible(true);
			janela.setLocationRelativeTo(null);
			
			btn1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					DecimalFormat df = new DecimalFormat("0.00");
					
					double var1, var2, area;
					
					var1 = Double.parseDouble(field.getText());
					var2 = Double.parseDouble(field2.getText());
					
					area = (var1*var2)/2;
					
					JOptionPane.showMessageDialog(null, "O triângulo de base igual a " + df.format(var1) + " cm e altura igual a " + df.format(var2) + " cm possui área de " + df.format(area) + " cm².");
					
				}
			});
			
			btn2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					new TelaEntrada();
					janela.dispose();

				}
			});
	}

}
