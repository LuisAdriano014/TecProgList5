package Questão02;

public class Pessoa {

	private int idade;
	private int diaAni;
	private int mesAni;
	private int anoAni;
	private String nome;
	
	public void calcularIdade(int dia, int mes, int ano) {
		
		int variavel;
		
		if(dia - this.diaAni < 0) {
			if (mes - this.mesAni < 0) {
				variavel = -1;
			}else {
				variavel = 0;
			}
		}
		else {
			if (mes - this.mesAni < 0) {
				variavel = -1;
			}else {
				variavel = 0;
			}
		}
		
		this.idade = ano - this.anoAni + variavel;
	}
	
	public int getIdade(){
		return this.idade;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void Aniversario (int dia, int mes, int ano) {
		this.diaAni = dia;
		this.mesAni = mes;
		this.anoAni = ano;
	}
	
	public Pessoa (String nome) {
		this.nome = nome;
	}
}
