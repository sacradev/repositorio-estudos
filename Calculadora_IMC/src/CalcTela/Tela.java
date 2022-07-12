package CalcTela;

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

public class Tela {
	
	public Tela() {
		
	DecimalFormat df = new DecimalFormat("0.00");

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton btn1 = new JButton("Calcular");
	
	JLabel label1 = new JLabel("Peso: ");
	JLabel label2 = new JLabel("Altura (cm): ");
	
	JTextField peso = new JTextField(20);
	JTextField altura = new JTextField(20);
	
	panel.setLayout(new GridBagLayout());
	GridBagConstraints gbc = new GridBagConstraints(); // método responsável por controlar as posições
	
	gbc.gridx = 0; gbc.gridy = 0; 
	panel.add(label1, gbc);
	
	gbc.gridx = 0; gbc.gridy = 1; 
	panel.add(peso, gbc);
	
	gbc.gridx = 1; gbc.gridy = 0; 
	panel.add(label2, gbc);
	
	gbc.gridx = 1; gbc.gridy = 1; 
	panel.add(altura, gbc);
	
	gbc.gridx = 2; gbc.gridy = 1; 
	panel.add(btn1, gbc);
	
	frame.add(panel);
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	frame.pack();
	frame.setVisible(true);
	frame.setSize(500,200);
	frame.setLocationRelativeTo(null);
	
	btn1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			double num1, num2, IMC;
			String classificacao = "";
			
			num1 = Double.parseDouble(peso.getText());
			num2 = Double.parseDouble(altura.getText())/100;
			
			IMC =num1/(Math.pow(num2, 2));
			
			if(IMC < 18.5) {
				classificacao = "Magreza.";
			}
			else if(IMC >= 18.5 && IMC <= 24.9) {
				classificacao = "Normal.";
			}else if(IMC >= 25 && IMC < 29.9) {
				classificacao = "Sobrepeso - Obesidade Grau I.";
			}else if(IMC >= 30 && IMC < 39.9) {
				classificacao = "Obesidade - Obesidade Grau II.";
			}else if(IMC >= 40){
				classificacao = "Obesidade Grave - Obesidade Grau III.";
			}
			
						
			JOptionPane.showMessageDialog(null, "Seu IMC é: " + df.format(IMC) + " - Classificado como: " + classificacao);
		}
	});
	}
	
}
