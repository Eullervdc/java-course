package application;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ex3_Fixacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();

		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um número: ");

			vect[i] = sc.nextInt();

		}
		System.out.println("NEGATIVOS: ");

		for (int i = 0; i < n; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);

			}
		}

		sc.close();
	}

}
