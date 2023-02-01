package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		//para considerar padrão americano(.)
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe os dados da conta:");
		System.out.print("Número: ");
		int number = scanner.nextInt();
		
		System.out.print("Titular: ");
		//para incluir nextLine antes para não consumir o enter dado depois de ler o número
		scanner.nextLine();
		String holder = scanner.nextLine(); // para texto com espaço
		
		System.out.print("Saldo inicial: ");
		Double balance = scanner.nextDouble();
		
		System.out.print("Limite: ");
		Double withdrawLimit = scanner.nextDouble();
		
		Account account = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Informe quantia para sacar: ");
		Double amount = scanner.nextDouble();
		
		//realizar saque
		account.withdraw(amount);
		
		//imprimir novo saldo
		System.out.printf("Novo saldo: %.2f%n", account.getBalance());

		scanner.close();
	}

}
