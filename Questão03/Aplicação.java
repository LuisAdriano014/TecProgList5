package Questão03;

import java.util.Scanner;

public class Aplicação {

	public static void main(String[] args) {
		
		Scanner entradaTeclado = new Scanner (System.in);
		
		System.out.print("Digite o valor do raio (em metros): ");
		double r = entradaTeclado.nextDouble();

		Circulo c = new Circulo(r);
		
		System.out.printf("A área do circulo é %.2f metros e o comprimento de sua circunferência é %.2f metros.", c.getArea(), c.getCircunferencia());
		
		System.out.print("\nDigite o valor da porcentagem que deseja aplicar: ");
		double p = entradaTeclado.nextDouble();
		
		c.aumentarRaio(p);
		
		System.out.printf("A nova área do circulo é %.2f metros e o novo comprimento de sua circunferência é %.2f metros.", c.getArea(), c.getCircunferencia());
	}

}
