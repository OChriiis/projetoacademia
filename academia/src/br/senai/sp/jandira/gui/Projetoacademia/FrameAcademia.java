package br.senai.sp.jandira.gui.Projetoacademia;


import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
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

	//JLabelSexo e bot�o
	JLabel labelSexo = new JLabel();
	labelSexo.setText("Sexo: ");
	labelSexo.setBounds(10, 120, 80, 30);
	
	JRadioButton radioMasculino = new JRadioButton("Masculino");
	radioMasculino.setBounds(200, 120, 120, 30);
	JRadioButton radioFeminino = new JRadioButton("Feminino");
	radioFeminino.setBounds(100, 120, 80, 30);
	ButtonGroup bg = new ButtonGroup();
	bg.add(radioFeminino);bg.add(radioMasculino);
	
	//Atividade F�sica
	
	JLabel labelAtividade = new JLabel();
	labelAtividade.setText("Atividade F�sica: ");
	labelAtividade.setBounds(10, 170, 120, 30);
	
	JComboBox<String> box = new JComboBox<String>();
	box.setBounds(120, 170, 120, 30);
	
	JPanel container = new JPanel();
	
	box.addItem("Leve");
	box.addItem("Moderado");
	box.addItem("Intenso");
	container.add(box);

	//Bot�es
	
	JButton buttonCalcular = new JButton();
	buttonCalcular.setText("Calcular");
	buttonCalcular.setBounds(120, 225, 120, 30);
	
	JButton buttonLimpar = new JButton();
	buttonLimpar.setText("Limpar");
	buttonLimpar.setBounds(120, 280, 120, 30);
	
	//Resultados
	
	JLabel labelResultados = new JLabel();
	labelResultados.setText("Resultado   =   ");
	labelResultados.setBounds(10, 330, 120, 30);

	//IMC E NCD
	
	JLabel labelIMC = new JLabel();
	labelIMC.setText("IMC               =               ");
	labelIMC.setBounds(10, 350, 120, 30);
	
	JLabel labelNCD = new JLabel();
	labelNCD.setText("NCD              =             ");
	labelNCD.setBounds(10, 370, 120, 30);
	
	
	
	
	
	tela.getContentPane().add(labelNCD);
	tela.getContentPane().add(labelIMC);
	tela.getContentPane().add(labelResultados);
	tela.getContentPane().add(buttonLimpar);
	tela.getContentPane().add(buttonCalcular);
	tela.getContentPane().add(labelNome);
	tela.getContentPane().add(textNome);
	tela.getContentPane().add(labelPeso);
	tela.getContentPane().add(textPeso);
	tela.getContentPane().add(labelAltura);
	tela.getContentPane().add(textAltura);
	tela.getContentPane().add(labelNascimento);
	tela.getContentPane().add(textDataDeNascimento);
	tela.getContentPane().add(labelSexo);
	tela.getContentPane().add(radioFeminino);
	tela.getContentPane().add(radioMasculino);
	tela.getContentPane().add(labelAtividade);
	tela.getContentPane().add(container);
	tela.getContentPane().add(box);


	tela.setLayout(null);
	tela.setVisible(true);







	}








































}






















































