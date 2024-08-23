package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insira o nome do vendedor: ");
		String nome = scanner.nextLine();
		
		
		System.out.print("Insira o valor do salario fixo: ");
		float salarioBase = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.print("Total de vendas em Dinheiro: ");
		float valorVendas = scanner.nextInt();
		
		scanner.nextLine();
		float temp = salarioBase;
		salarioBase = salarioBase + (valorVendas * 0.15f);
		System.out.println("Nome do Vendedor: "+ nome);
		System.out.println("Salario base: R$ "+ temp);
		System.out.println("Salario ao final do mes: R$ "+ salarioBase);

		scanner.close();

	}

}
