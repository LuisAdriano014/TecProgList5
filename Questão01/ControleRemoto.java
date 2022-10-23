package Questão01;

public class ControleRemoto {
	
	private int volume;
	private int canal;
	
	public void volumeMais() {
		volume++;
	}
	
	public void volumeMenos() {
		volume--;
	}
	
	public void canalMais() {
		canal++;
	}
	
	public void canalMenos() {
		canal--;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void setCanal (int c) {
		this.canal = c;
	}
	
	public ControleRemoto (int vol, int can) { //metodo construtor
		volume = vol;
		canal = can;
	}
}
