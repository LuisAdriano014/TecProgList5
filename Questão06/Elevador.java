package Questão06;

public class Elevador {

	private int andaratual;
	private int totalandar;
	private int pessoasatual;
	private int capacidadepessoas;
		
	public Elevador(int capacidadepessoas,int totalandares) {
		this.capacidadepessoas = capacidadepessoas;
		this.totalandar = totalandares;
		andaratual = 0;
		pessoasatual = 0;
	}
		
	public void Entrar() {
		if(pessoasatual<capacidadepessoas) {
			pessoasatual++;
		}
	}
		
	public void Sair() {
		if(pessoasatual>0) {
			pessoasatual--;
		}
	}
		
	public void Subir() {
			if(andaratual<totalandar) {
			andaratual++;
		}
	}
		
	public void Descer() {
		if(andaratual>0) {
			andaratual--;
		}
	}
		
	public int getAndarAtual() {
		return andaratual;
	}
		
	public void setAndarAtual(int andaratual) {
		this.andaratual = andaratual;
	}
		
	public int getTotalAndar() {
		return totalandar;
	}
		
	public void setTotalAndar(int totalandar) {
		this.totalandar = totalandar;
	}
		
	public int getPessoasAtual() {
		return pessoasatual;
	}
		
	public void setPessoasAtual(int pessoasatual) {
		this.pessoasatual = pessoasatual;
	}
	
	public int getCapacidadeTotal() {
		return capacidadepessoas;
	}
		
	public void setCapacidadeTotal(int capacidadedepessoas) {
		this.capacidadepessoas = capacidadedepessoas;
	}
		
}	
