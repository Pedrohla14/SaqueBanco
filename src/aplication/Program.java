
/*Fazer um programa para ler os dados de uma conta banc�ria e depois realizar um
saque nesta conta banc�ria, mostrando o novo saldo. Um saque n�o pode ocorrer
ou se n�o houver saldo na conta, ou se o valor do saque for superior ao limite de
saque da conta. Implemente a conta banc�ria conforme projeto abaixo:*/


package aplication;

import java.util.Locale;
import java.util.Scanner;

import Model_exeptions.DomainExeption;
import etities.Account;

public class Program {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		try {
		System.out.print("Number: ");
		int number = sc.nextInt();
		
		System.out.print("Holder: ");
		sc.nextLine();
		String holder=sc.nextLine();
		
		System.out.print("Initial balance: ");
		Double balance= sc.nextDouble();
		
		System.out.print("withdraw limit: ");
		Double  withdrawLimit= sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withdrawLimit);
		
		System.out.print("Enter amount for withdraw: ");
		Double amount= sc.nextDouble();
		account.withdraw(amount);
		
		//imprimir novo balan�o
		System.out.println("New balance:"+ account.getBalance());
		}
		catch ( DomainExeption e) {
			System.out.println("Withdraw error: "+ e.getMessage());
			
		}
		catch (Exception e) {
			System.out.println("An error occurred, I'm finishing.Try later");
		}
		sc.close();
	}

}
