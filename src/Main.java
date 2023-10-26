
import java.util.Scanner;

import static BasePath.DataBase.*;



public class Main {
	public static void main(String[] args) {
		int option;
		double saldo = 2500;
		double valorTransferido;
		double novoSaldo;
		int cont = 0;
		int contMaster =0;
		//boolean numValido = true;
		Scanner escolha = new Scanner(System.in);
		Scanner saldoUso = new Scanner(System.in);

		System.out.println(separador() + "\n");
		System.out.println(dataBase());
		System.out.println(saldo);
		System.out.println("\n" + separador() + "\n");

		do {
			System.out.println(showOptions());
			option = escolha.nextInt();
			if (option >= 5) {
				System.out.println("*** Valor inválido! *** \n" + showOptions());
				option = escolha.nextInt();
			}
			if(option==1 && contMaster==0){
				System.out.println("Seu Saldo é de : R$"+ saldo+"\n");
			} else if (option==2) {
				System.out.println("Digite o valor que deseja transferir\n");
				valorTransferido = saldoUso.nextDouble();
				novoSaldo =saldo-valorTransferido;
				saldo = novoSaldo;
				cont++;
			} else if (option==3) {
				System.out.println("Digite o valor que deseja Receber\n");
				valorTransferido = saldoUso.nextDouble();
				novoSaldo =saldo+valorTransferido;
				saldo = novoSaldo;
				cont++;
			} else if (option==1 && contMaster>=1) {
				System.out.println("Seu Saldo é de : R$"+ saldo+ " Após "+cont+" Transações\n");
			}

contMaster++;
		}while (option != 4) ;









	}
}