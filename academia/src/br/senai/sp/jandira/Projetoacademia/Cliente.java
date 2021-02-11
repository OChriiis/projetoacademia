package br.senai.sp.jandira.Projetoacademia;

import java.time.LocalDate;

public class Cliente {

	private String nome;
	private LocalDate datadenascimento;
	private char sexo;
	private double peso;
	private double altura;
	private int niveldeatividade;
	
	public void setNome(String nome) {
		
	this.nome = nome;
	}
	 public void setDataDeNascimento(LocalDate datadenascimento) {

	 this.datadenascimento = datadenascimento;
	 }
	public void setSexo(char sexo) {

	this.sexo = sexo;
	}
	public void setPeso(double peso){

	 this.peso = peso;
	}
	public void setAltura(double altura){

	this.altura = altura;
	}
	public void setNivelDeAtividade (int niveldeatividade){

	 this.niveldeatividade = niveldeatividade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public LocalDate getDataDeNascimento() {
		return this.datadenascimento;
	}
	 public int getIdade(){
		LocalDate hoje = LocalDate.now():
		Period period = Period.between(this.datadenascimento, hoje);
		return period.getYears();

	 }
	
	 public char getSexo(){
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
	
	public void setIMC(double IMC){
	 return this.IMC
	 }
	 public double getCalcularIMC(){
	 return this.peso/(this.altura*this.altura)
	 
	 }
	   
	 
	 if (this.getCalcularIMC() <= 18.5) {
		return "Abaixo do peso!";
		}
		else if (this.getCalcularIMC() >= 18.6 && <=24.9){
			return "Peso ideal, parabéns!";
		}
		else if (this.getCalcularIMC() >=25.0 && <=29.9 ){
			return "Levemente acima do peso!";
		}
		else if (this.getCalcularIMC() >=30.0 && <= 34.9){
			return "Obesidade grau I!";
		}
		else if (this.getCalcularIMC() >=35.0 && <= 39.5){
		  return "Obesidade grau II(Severa)";
		 }
		else (this.getCalcularIMC() >=40){
			return "Obesidade III (Mórbida)";
		}
	 
	
	  
  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
































}
