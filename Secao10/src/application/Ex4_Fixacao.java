package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex4_Fixacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double sum = 0;

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();

		}
		System.out.print("VALORES = ");

		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + " ");

		}

		for (int i = 0; i < n; i++) {
			sum += vect[i];

		}
		double avg = sum / n;
		System.out.println();
		System.out.println("SOMA = " + sum);
		System.out.println("MEDIA = " + avg);
		sc.close();

	}

}
