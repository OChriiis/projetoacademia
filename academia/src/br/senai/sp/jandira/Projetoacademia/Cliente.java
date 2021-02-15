package br.senai.sp.jandira.Projetoacademia;

import java.time.LocalDate;
import java.time.Period;

import br.senai.sp.jandira.NivelDeAtividade.*;

public class Cliente {

	private String nome;
	private LocalDate datadenascimento;
	private String sexo;
	private Double peso;
	private Double altura;
	private String situação;
	private Double calcularNcd;
	private Double calcularIMC;
	private Double niveldeatividade;
	
	public void setNome(String nome) {
		
	this.nome = nome;
	}
	 public void setDataDeNascimento(LocalDate datadenascimento) {

	 this.setDatadenascimento(datadenascimento);
	 }
	public String setSexo(String sexo) {

	 if(sexo.contentEquals("Masculino") || tipo.contentEquals ("Feminino")) {
		
			this.sexo = sexo;
			}
		else {
			return "sexo invalido.";
		}
	}
	public void setPeso(double peso){

	 this.peso = peso;
	}
	public void setAltura(double altura){

	this.altura = altura;
	}
	public Double setNivelDeAtividadeDouble(int niveldeatividade){

	 this.niveldeatividade = niveldeatividade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public LocalDate getDataDeNascimento() {
		return this.getDatadenascimento();
		}
	 public int getIdade(){
		LocalDate hoje = LocalDate.now();
		Period period = Period.between(this.getDatadenascimento(), hoje);
		return period.getYears();
	 }   
	
	 public String getSexo(){
		  return this.sexo;
	 }
	
	public double getPeso(){
		return this.peso;
	}
	
	public double getAltura(){
		return this.altura;
	}
	
	public int getNivelDeAtividade(){
		return this.niveldeatividade;
	}
	
	public void setCalcularIMC(double IMC){
	 return this.calcularIMC();
	
	}
	 public double getCalcularIMC(){
	 return this.peso/(this.altura*this.altura);
	 
	}
	
	public double setCalcularNcd(double Ncd){
		return this.calcularNcd;
	}
	
	public String setSituação(String situação){
	   return this.situação;

	}
	    
	   public String getSituação (){
	 
		if (this.getCalcularIMC() <= 18.5) {
		return "Abaixo do peso!";
		}
		else if (this.getCalcularIMC() >= 18.6 && this.getCalcularIMC() <= 24.9){
			return "Peso ideal, parabéns!";
		}
		else if (this.getCalcularIMC() >= 25.0 && this.getCalcularIMC() <= 29.9 ){
			return "Levemente acima do peso!";
		}
		else if (this.getCalcularIMC() >= 30.0 && this.getCalcularIMC() <= 34.9){
			return "Obesidade grau I!";
		}
		else if (this.getCalcularIMC() >= 35.0 && this.getCalcularIMC() <= 39.5){
		  return "Obesidade grau II(Severa)";
		 }
		else {
			(this.getCalcularIMC() >= 40){
				return "Obesidade III (Mórbida)";
			
			} 
			}
		
	}			

		public double getCalcularNcd (){
		double Ncd = 0;

		//homem

		if(this.sexo == "Masculino"); {
			
			if(this.getIdade() >= 18 && this.getIdade() <=30){
				Ncd = 15.3 * this.peso + 697;
				}		
			else if(this.getIdade() >= 30 && this.getIdade() <=60){
				Ncd = 11.6 * this.peso + 879;
			}
			else (this.getIdade() => 60){
				Ncd = 13.5 * this.peso + 487;
			}

			if(this.niveldeatividade == niveldeatividade.leve) {
				Ncd*= 1.5;
			}
			else if(this.niveldeatividade == br.senai.sp.jandira.NivelDeAtividade.NivelDeAtividade.moderado){
				Ncd*= 1.8;
			}
			else (this.niveldeatividade == br.senai.sp.jandira.NivelDeAtividade.NivelDeAtividade.intenso){
				Ncd*= 2.1;
			}

		}
			
		//muié 
			
		if(this.sexo == "Feminino") {
			
			if(this.getIdade() >= 18 && this.getIdade() <=30){
				Ncd = 14.7 * this.peso + 496;
				}		
			else if(this.getIdade() >= 30 && this.getIdade() <=60){
				Ncd = 8.7 * this.peso + 829;
			}
			else (this.getIdade() =>60){
				Ncd = 10.5 * this.peso + 596;
			}

			if(this.niveldeatividade == br.senai.sp.jandira.NivelDeAtividade.NivelDeAtividade.leve1) {
				Ncd*= 1.6;
			}
			else if(this.niveldeatividade == br.senai.sp.jandira.NivelDeAtividade.NivelDeAtividade.moderado1){
				Ncd*= 1.6;
			}
			else (this.niveldeatividade == br.senai.sp.jandira.NivelDeAtividade.NivelDeAtividade.intenso1){
				Ncd*= 1.8;
			}	
			
		}
		

			
			
			
			
	}
		public LocalDate getDatadenascimento() {
			return datadenascimento;
		}
		public void setDatadenascimento(LocalDate datadenascimento) {
			this.datadenascimento = datadenascimento;
		}	








	 
































}
