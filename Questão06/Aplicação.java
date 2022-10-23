package Questão06;

import java.util.Scanner;

public class Aplicação {

public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
		
	System.out.println("Informe o total de andares:");
	int totalandar = entrada.nextInt();
	System.out.println("Informe a capacidade de pessoas total do elevador:");
	int capacidadepessoas = entrada.nextInt();
		
	Elevador elevador = new Elevador(capacidadepessoas, totalandar);
		
	elevador.Entrar();
	elevador.Sair();
	elevador.Subir();
	elevador.Descer();

	entrada.close();
	}
}
