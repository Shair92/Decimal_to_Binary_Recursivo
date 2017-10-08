package app;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		binario b = new binario();

		System.out.println("+++++++++++++++ Convertir de decimal a binario ++++++++++++++++++++");
		System.out.println("Cantidad que desea convertir  (^ w ^)");
		int d = scan.nextInt();
		System.out.println("El reultado es : " + b.bin(d));
	}

}
