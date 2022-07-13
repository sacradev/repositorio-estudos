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

public class TelaQuadrado {
	
	public TelaQuadrado() {
		
		// criação do container
		
			JFrame janela = new JFrame("Área do Quadrado");
			JPanel panel = new JPanel();
				
			// organização do container
			panel.setLayout(new GridBagLayout());
			GridBagConstraints gbc = new GridBagConstraints();
				
			// Revisar 
			janela.setSize(400,400);
			janela.setVisible(true);
			janela.setLocationRelativeTo(null);
			
			
			// Label de apresentação
			
			JLabel label = new JLabel("Digite o lado do quadrado (cm): ");
			JTextField field = new JTextField(17);

			// botões

			JButton btn1 = new JButton("Calcular");
			btn1.setPreferredSize(new Dimension(156,20));
			JButton btn2 = new JButton("Seção Anterior");
			btn2.setPreferredSize(new Dimension(156,20));
			
			// adição e organização dos componentes na tela do quadradk
			
			gbc.gridx = 0; gbc.gridy = 1;
			panel.add(label);
			
			gbc.gridx = 0; gbc.gridy = 1;
			panel.add(field);
			
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
					
					double var, area;
					
					var = Double.parseDouble(field.getText());
					
					area = Math.pow(var, 2);
					
					JOptionPane.showMessageDialog(null, "O quadrado de lado igual a " + df.format(var) + " cm possui área de " + df.format(area) + " cm².");
					
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
