package br.senai.sp.jandira.model.Projetoacademia;

import java.time.LocalDate;

import br.senai.sp.jandira.NivelDeAtividade.NivelDeAtividade;
import br.senai.sp.jandira.Projetoacademia.Cliente;

public class App {

	public static void main(String[] args) {
		System.out.println();
		// TODO Auto-generated method stub

		Cliente clienteMarcos = new Cliente (); 

		clienteMarcos.setNome("Marcus Bezerra");
		clienteMarcos.setDatadenascimento(LocalDate.of(1975, 11, 25)); 
		clienteMarcos.setSexo("Masculino");
		clienteMarcos.setPeso(65);
		clienteMarcos.setAltura(1.87);
		clienteMarcos.setniveldeatividade(NivelDeAtividade.leve);
		
		System.out.println("nome:"+clienteMarcos.getNome());
		System.out.println(clienteMarcos.getIdade());
		System.out.println(clienteMarcos.getAltura());
		System.out.println(clienteMarcos.getPeso());
		System.out.println(clienteMarcos.getSexo());
		System.out.println(clienteMarcos.getCalcularIMC());
		System.out.println(clienteMarcos.getCalcularNcd());
		System.out.println(clienteMarcos.getSituacao());
		
		




		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
