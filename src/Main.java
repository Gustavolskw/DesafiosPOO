
import java.util.Scanner;

import static BasePath.DataBase.*;


public class Main {
	public static void main(String[] args) {
		int option;
		//boolean numValido = true;
		Scanner escolha = new Scanner(System.in);

		System.out.println(separador() + "\n");
		System.out.println(dataBase());
		System.out.println(saldo());
		System.out.println("\n" + separador() + "\n");

		do {
			System.out.println(showOptions());
			option = escolha.nextInt();
			if (option >= 5) {
				System.out.println("*** Valor inválido! *** \n" + showOptions());
				option = escolha.nextInt();
			}
		}while (option != 4) ;









	}
}