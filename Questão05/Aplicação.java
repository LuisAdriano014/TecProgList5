package Questão05;

import java.util.Scanner;

public class Aplicação {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Informe o nome do empregado:");
	String nome = entrada.nextLine();
	System.out.println("Informe o sobrenome do empregado:");
	String sobrenome = entrada.nextLine();
	System.out.println("Informe o id do empregado:");
	int id = entrada.nextInt();
				
	Empregado empregado1 = new Empregado(nome, sobrenome);
	Empregado empregado2 = new Empregado(id, nome, sobrenome);
				
	System.out.println("Informe o salário do funcionário: ");
	double salario = entrada.nextDouble();
				
	empregado1.calcularSalario();

	entrada.close();

	}
}
