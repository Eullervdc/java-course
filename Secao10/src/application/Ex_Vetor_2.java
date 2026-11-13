package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Ex_Vetor_2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		Product [] vect = new Product[n];
		double sum =0.0;
		
		for(int i=0;i<n;i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
			sum +=vect[i].getPrice();
						
		}
		double avg = sum/n;
		System.out.println(avg);
		sc.close();
	}

}
