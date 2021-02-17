package br.senai.sp.jandira.model.Projetoacademia;

import java.time.LocalDate;

import br.senai.sp.jandira.NivelDeAtividade.NivelDeAtividade;
import br.senai.sp.jandira.Projetoacademia.Cliente;
import br.senai.sp.jandira.gui.Projetoacademia.FrameAcademia;

public class App {

	public static void main(String[] args) {
		System.out.println();
		// TODO Auto-generated method stub

		Cliente clienteMarcos = new Cliente (); 
		FrameAcademia telaAcademia = new FrameAcademia();		
		telaAcademia.criarTela();
		
		clienteMarcos.setNome("Mariana Matilde");
		clienteMarcos.setDatadenascimento(LocalDate.of(1974,10,2)); 
		clienteMarcos.setSexo("Feminino");
		clienteMarcos.setPeso(78);
		clienteMarcos.setAltura(1.67);
		clienteMarcos.setniveldeatividade(NivelDeAtividade.leve);
		
		System.out.println("Nome: "+ clienteMarcos.getNome());
		System.out.println("Idade: " + clienteMarcos.getIdade());
		System.out.println("Altura: " + clienteMarcos.getAltura());
		System.out.println("Peso: " + clienteMarcos.getPeso());
		System.out.println("Sexo: " + clienteMarcos.getSexo());
		System.out.println("IMC = " + clienteMarcos.getCalcularIMC());
		System.out.println("NCD = " + clienteMarcos.getCalcularNcd());
		System.out.println("Situação: " + clienteMarcos.getSituacao());
		
		
		clienteMarcos.getCalcularNcd();


	
	
	}

}
