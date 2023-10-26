
import java.util.Scanner;

import static BasePath.DataBase.*;

public class Main {
	public static void main(String[] args) {
		int option;
		double saldo = 2500;
		double novoSaldo;
		double valTransf;
		int cont=0;
		int contMaster=0;

		Scanner escolha = new Scanner(System.in);
		Scanner transf = new Scanner(System.in);

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
				System.out.println("Seu Saldo é de "+ saldo+"\n");
			} else if (option==1 && contMaster>=1) {
				System.out.println("Seu Saldo é de "+ saldo+" Após "+cont+" Transações\n");
			} else if (option==2) {
				System.out.println("Digite o Valor que voce deseja transferir: ");
				valTransf = transf.nextDouble();
				novoSaldo=saldo-valTransf;
				saldo=novoSaldo;
				cont++;
			}else if (option==3) {
				System.out.println("Digite o Valor que voce deseja Receber: ");
				valTransf = transf.nextDouble();
				novoSaldo=saldo+valTransf;
				saldo=novoSaldo;
				cont++;
			}


			contMaster++;
		}while (option != 4) ;









	}
}