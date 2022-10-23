package Questão04;

import java.util.Scanner;

public class Aplicação {

	public static void main(String[] args) {
		
		Scanner entradaTeclado = new Scanner (System.in);
		
		System.out.print("Digite o nome do produto: ");
		String nome  = entradaTeclado.nextLine();
		
		System.out.print("Digite o preço de custo do produto: ");
		double pc = entradaTeclado.nextDouble();
		
		System.out.print("Digite o preço de venda do produto: ");
		double pv = entradaTeclado.nextDouble();
		
		System.out.print("Digite o valor das despesas da empresa: ");
		double de = entradaTeclado.nextDouble();
		
		Produto p = new Produto(nome, pc, pv, de);
		p.CalculoMargem();
		
		System.out.printf("A margem de lucro(em porcentagem) do(a) %s é %.2f%%", p.getNome(), p.getmargemLucro());
	}
}
