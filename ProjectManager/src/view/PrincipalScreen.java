package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PrincipalScreen {

	public PrincipalScreen() {

		// Configurando container principal

		JFrame frame = new JFrame("Project Manager");
		frame.setVisible(true);
		frame.setSize(800, 700);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// Criando fonte padrão

		Font fBold = new Font("Tahoma", Font.BOLD, 25);
		Font fBoldBody = new Font("Tahoma", Font.PLAIN, 15);
		Font fItalic = new Font("Tahoma", Font.ITALIC, 16);

		// Configurando panel para receber componentes

		JPanel panel = new JPanel();

		frame.add(panel);
		panel.setLayout(null);
		panel.setSize(800, 700);

		// Construção dos Labels

		JLabel title;
		JLabel toDoLabel;
		JLabel doingLabel;
		JLabel doneLabel;

		// Construção dos campos de texto

		JTextField txtToDo;
		JTextField txtDoing;
		JTextField txtDone;

		// Construção dos botões

		JButton btnAddDo;
		JButton btnAddDoing;
		JButton btnAddDone;

		JButton btnPassToDoing;
		JButton btnBackToDo;
		JButton btnPassToDone;
		JButton btnBackToDoing;

		JButton btnDelDo;
		JButton btnDelDoing;
		JButton btnDelDone;

		// Cosntrução das tabelas

		JTable tableDo;
		JTable tableDoing;
		JTable tableDone;
		DefaultTableModel modelDo;
		DefaultTableModel modelDoing;
		DefaultTableModel modelDone;

		// Adicionando labels

		title = new JLabel("Project Manager");
		panel.add(title);
		title.setBounds(70, 15, 250, 50);
		title.setFont(fBold);

		toDoLabel = new JLabel("To do");
		panel.add(toDoLabel);
		toDoLabel.setBounds(145, 100, 200, 50);
		toDoLabel.setFont(fItalic);

		doingLabel = new JLabel("Doing");
		panel.add(doingLabel);
		doingLabel.setBounds(385, 100, 200, 50);
		doingLabel.setFont(fItalic);

		doneLabel = new JLabel("Done");
		panel.add(doneLabel);
		doneLabel.setBounds(620, 100, 200, 50);
		doneLabel.setFont(fItalic);

		// Adicionando TextField

		txtToDo = new JTextField();
		panel.add(txtToDo);
		txtToDo.setBounds(70, 150, 200, 35);
		txtToDo.setFont(fBoldBody);

		txtDoing = new JTextField("");
		panel.add(txtDoing);
		txtDoing.setBounds(308, 150, 200, 35);
		txtDoing.setFont(fBoldBody);

		txtDone = new JTextField("");
		panel.add(txtDone);
		txtDone.setBounds(540, 150, 210, 35);
		txtDone.setFont(fBoldBody);

		// Adicionando Botões

		btnAddDo = new JButton("Add to-do list");
		panel.add(btnAddDo);
		btnAddDo.setBounds(70, 200, 200, 35);
		btnAddDo.setFont(fBoldBody);

		btnAddDoing = new JButton("Add running to-do list");
		panel.add(btnAddDoing);
		btnAddDoing.setBounds(308, 200, 200, 35);
		btnAddDoing.setFont(fBoldBody);

		btnAddDone = new JButton("Add to completed task list");
		panel.add(btnAddDone);
		btnAddDone.setBounds(540, 200, 210, 35);
		btnAddDone.setFont(fBoldBody);

		btnDelDo = new JButton("Delete task in to-do list");
		panel.add(btnDelDo);
		btnDelDo.setBounds(70, 600, 200, 35);
		btnDelDo.setFont(fBoldBody);

		btnDelDoing = new JButton("Delete running task");
		panel.add(btnDelDoing);
		btnDelDoing.setBounds(308, 600, 200, 35);
		btnDelDoing.setFont(fBoldBody);

		btnDelDone = new JButton("Delete done task");
		panel.add(btnDelDone);
		btnDelDone.setBounds(540, 600, 210, 35);
		btnDelDone.setFont(fBoldBody);

		btnPassToDoing = new JButton(" >> ");
		panel.add(btnPassToDoing);
		btnPassToDoing.setBounds(70, 558, 200, 35);
		btnPassToDoing.setFont(fBoldBody);

		btnBackToDo = new JButton(" << ");
		panel.add(btnBackToDo);
		btnBackToDo.setBounds(308, 558, 95, 35);
		btnBackToDo.setFont(fBoldBody);

		btnPassToDone = new JButton(" >> ");
		panel.add(btnPassToDone);
		btnPassToDone.setBounds(413, 558, 95, 35);
		btnPassToDone.setFont(fBoldBody);

		btnBackToDoing = new JButton(" << ");
		panel.add(btnBackToDoing);
		btnBackToDoing.setBounds(540, 558, 210, 35);
		btnBackToDoing.setFont(fBoldBody);

		// adicionando tabelas
		// Do table

		JScrollPane scrollDo = new JScrollPane();
		panel.add(scrollDo);
		scrollDo.setBounds(70, 250, 200, 300);

		tableDo = new JTable();
		modelDo = new DefaultTableModel();
		Object[] columnDo = { "To-do" };
		final Object[] rowDo = new Object[1];
		modelDo.setColumnIdentifiers(columnDo);
		tableDo.setModel(modelDo);
		scrollDo.setViewportView(tableDo);

		// Doing Table

		JScrollPane scrollDoing = new JScrollPane();
		panel.add(scrollDoing);
		scrollDoing.setBounds(308, 250, 200, 300);

		tableDoing = new JTable();
		modelDoing = new DefaultTableModel();
		Object[] columnDoing = { "Doing" };
		final Object[] rowDoing = new Object[1];
		modelDoing.setColumnIdentifiers(columnDoing);
		tableDoing.setModel(modelDoing);
		scrollDoing.setViewportView(tableDoing);

		// Done Table

		JScrollPane scrollDone = new JScrollPane();
		panel.add(scrollDone);
		scrollDone.setBounds(540, 250, 210, 300);

		tableDone = new JTable();
		modelDone = new DefaultTableModel();
		Object[] columnDone = { "Doing" };
		final Object[] rowDone = new Object[1];
		modelDone.setColumnIdentifiers(columnDone);
		tableDone.setModel(modelDone);
		scrollDone.setViewportView(tableDone);

		// Button action
		// Add button

		btnAddDo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (txtToDo.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Por favor, preenchar o campo acima.");
				} else {
					rowDo[0] = txtToDo.getText();
					modelDo.addRow(rowDo);
					txtToDo.setText("");
				}
			}
		});

		btnAddDoing.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (txtDoing.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Por favor, preenchar o campo acima.");
				} else {
					rowDoing[0] = txtDoing.getText();
					modelDoing.addRow(rowDoing);
					txtDoing.setText("");
				}
			}
		});

		btnAddDone.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (txtDone.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Por favor, preenchar o campo acima.");
				} else {
					rowDone[0] = txtDone.getText();
					modelDone.addRow(rowDone);
					txtDone.setText("");
				}
			}
		});

		// Pass and delete button in to-do container

		btnPassToDoing.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int i = tableDo.getSelectedRow();
				if (i < 0) {
					JOptionPane.showMessageDialog(null, "Por favor, selecione uma tarefa!");
				} else {
					String aux = modelDo.getValueAt(i, 0).toString();
					rowDoing[0] = aux;
					modelDoing.addRow(rowDoing);
					modelDo.removeRow(i);
				}
			}
		});

		btnDelDo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int i = tableDo.getSelectedRow();
				if (i < 0) {
					JOptionPane.showMessageDialog(null, "Por favor, selecione uma tarefa!");
				} else {
					modelDo.removeRow(i);
				}
			}
		});

		// Pass, back and delete button in Doing container

		btnBackToDo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int i = tableDoing.getSelectedRow();
				if (i < 0) {
					JOptionPane.showMessageDialog(null, "Por favor, selecione uma tarefa!");
				} else {
					String aux = modelDoing.getValueAt(i, 0).toString();
					rowDo[0] = aux;
					modelDo.addRow(rowDo);
					modelDoing.removeRow(i);
				}
			}
		});

		btnPassToDone.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int i = tableDoing.getSelectedRow();
				if (i < 0) {
					JOptionPane.showMessageDialog(null, "Por favor, selecione uma tarefa!");
				} else {
					String aux = modelDoing.getValueAt(i, 0).toString();
					rowDone[0] = aux;
					modelDone.addRow(rowDone);
					modelDoing.removeRow(i);
				}
			}
		});

		btnDelDoing.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int i = tableDoing.getSelectedRow();
				if (i < 0) {
					JOptionPane.showMessageDialog(null, "Por favor, selecione uma tarefa!");
				} else {
					modelDoing.removeRow(i);
				}
			}
		});

		// Back and delete button in Done container

		btnBackToDoing.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int i = tableDone.getSelectedRow();
				if (i < 0) {
					JOptionPane.showMessageDialog(null, "Por favor, selecione uma tarefa!");
				} else {
					rowDoing[0] = modelDone.getValueAt(i, 0).toString();
					modelDoing.addRow(rowDoing);
					modelDone.removeRow(i);
				}
			}
		});

		btnDelDone.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int i = tableDone.getSelectedRow();
				if (i < 0) {
					JOptionPane.showMessageDialog(null, "Por favor, selecione uma tarefa!");
				} else {
					modelDone.removeRow(i);
				}
			}
		});

	}

}
