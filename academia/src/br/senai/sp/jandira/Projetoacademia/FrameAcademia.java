package br.senai.sp.jandira.Projetoacademia;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameAcademia {

	public void criarTela() {

	// tela
	JFrame tela = new JFrame();
	tela.setTitle("Academia");
	tela.setSize(1080, 720);
	tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	tela.setLayout(null);
	
	//JLabelAltura
	JLabel labelAltura = new JLabel();
	labelAltura.setText("Altura:");
	labelAltura.setBounds(10, 10, 60, 30);

	//JTextFieldAltura
	JTextField textAltura = new JTextAltura();
	textAltura.setBounds(70, 10, 50, 30);

	//JLabelPeso
	JLabel labelPeso = new JLabel();
	labelPeso.setText("Peso:");
	labelPeso.setBounds(110, 10, 60, 30);

	//JTextAlturaPeso
	JTextFiel textPeso = new JTextAltura();
	textPeso.setBounds(170, 10, 50, 30);












	tela.getContentPane().add(labelAltura);
	tela.getContentPane().add(textAltura);
	tela.getContentPane().add(labelPeso);
	tela.getContentPane().add(textPeso);







	tela.setVisible(true);








	}








































}






















































