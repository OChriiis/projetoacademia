package br.senai.sp.jandira.gui.Projetoacademia;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;


public class FrameAcademia {

	public void criarTela() {
		
	
		
	// tela
	
	JFrame tela = new JFrame();
	tela.setTitle("Academia");
	tela.setSize(1080, 720);
	tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//JLabelNome
	JLabel labelNome = new JLabel();
	labelNome.setText("Nome:");
	labelNome.setBounds(10, 10, 60, 30);

	//JTextFieldNome
	JTextField textNome = new JTextField();
	textNome.setBounds(70, 10, 120, 30);

	//JLabelPeso
	JLabel labelPeso = new JLabel();
	labelPeso.setText("Peso:");
	labelPeso.setBounds(235, 10, 60, 30);

	//JTextPeso
	JTextField textPeso = new JTextField();
	textPeso.setBounds(280, 10, 50, 30);
	
	//JTextAltura
	JLabel labelAltura = new JLabel();
	labelAltura.setText("Altura:");
	labelAltura.setBounds(10, 60, 60, 30);

	//JTextFieldAltura
	JTextField textAltura = new JTextField();
	textAltura.setBounds(70, 60, 50, 30);


	//JLabelDataDeNascimento
	
	JLabel labelNascimento = new JLabel ();
	labelNascimento.setText("Data de Nascimento:");
	labelNascimento.setBounds(150, 0, 200, 150);

	//JTextFieldDataDeNascimento

	JTextField textDataDeNascimento = new JTextField();
	textDataDeNascimento.setBounds(280, 60, 120, 30);


	tela.getContentPane().add(labelNome);
	tela.getContentPane().add(textNome);
	tela.getContentPane().add(labelPeso);
	tela.getContentPane().add(textPeso);
	tela.getContentPane().add(labelAltura);
	tela.getContentPane().add(textAltura);
	tela.getContentPane().add(labelNascimento);
	tela.getContentPane().add(textDataDeNascimento);




	tela.setLayout(null);
	tela.setVisible(true);







	}








































}






















































