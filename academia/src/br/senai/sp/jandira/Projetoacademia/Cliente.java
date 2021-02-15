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
	private String situacao;
	private Double calcularNcd;
	private Double calcularIMC;
	private Double niveldeatividade;
	
	public void setNome(String nome) {
		
	this.nome = nome;
	}
	public void setDatadenascimento(LocalDate datadenascimento) {
		this.datadenascimento = datadenascimento;
	} 
	public LocalDate getDataDeNascimento() {
		return this.datadenascimento;
		}
		public String setSexo(String sexo) {
			return this.sexo;
		}
	
	public void setPeso(double peso){

	 this.peso = peso;
	}
	public void setAltura(double altura){

	this.altura = altura;
	}
	public Double setniveldeatividade(Double niveldeatividade){

	 return this.niveldeatividade = niveldeatividade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	 public int getIdade(){
		LocalDate hoje = LocalDate.now();
		Period period = Period.between(this.getDataDeNascimento(), hoje);
		return period.getYears();
	 }   
	
	 public String getSexo(){


		 if(this.sexo == "Feminino"){
			
			 return "Feminino";
			}
		 else {
				return "Masculino";
		 
		 }
	 }
	
	public double getPeso(){
		return this.peso;
	}
	
	public double getAltura(){
		return this.altura;
	}
	
	public Double getNivelDeAtividade(){
		return this.niveldeatividade;
	}
	
	public double setCalcularIMC(double IMC){
	 return this.getCalcularIMC();
	
	}
	 public double getCalcularIMC(){
	 return this.peso/(this.altura*this.altura);
	 
	}
	
	public double setCalcularNcd(double calcularNcd){
		return this.calcularNcd;
	}
	
	public String setSituacao(String situacao){
	   return this.situacao;

	}
	    
	   public String getSituacao (){
	 
		if (this.getCalcularIMC() <= 18.5) {
		return "Abaixo do peso!";
		}
		else if (this.getCalcularIMC() >= 18.6 && this.getCalcularIMC() <= 24.9){
			return "Peso ideal, parab�ns!";
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
			return "Obesidade III (M�rbida)";
			
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
			else {
				Ncd*= 13.5 * this.peso + 487;
			}

			if(this.niveldeatividade == NivelDeAtividade.leve) {
				Ncd*= 1.5;
			}
			else if(this.niveldeatividade == NivelDeAtividade.moderado)
				Ncd*= 2.1;
			}

		
			
		//mulher 
			
		if(this.sexo == "Feminino") {
			
			if(this.getIdade() >= 18 && this.getIdade() <=30){
				Ncd = 14.7 * this.peso + 496;
				}		
			else if(this.getIdade() >= 30 && this.getIdade() <=60){
				Ncd = 8.7 * this.peso + 829;
			}
			else {
				Ncd = 10.5 * this.peso + 596;
			}

			if(this.niveldeatividade == NivelDeAtividade.leve1) {
				Ncd*= 1.6;
			}
			else if(this.niveldeatividade ==NivelDeAtividade.moderado1){
				Ncd*= 1.6;
			}
			else {
				Ncd*= 1.8;
			}	
			
		}
		return Ncd;
		

			
			
			
			
	}
		








	 
































}
