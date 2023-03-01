package application;

import java.util.Scanner;

import entities.Conversao;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("IOF = 0,06%");
		System.out.print("What is the dollar price? ");
		Double cotacao = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		Double dolar = sc.nextDouble();
		
	
		System.out.println("Amount to be paid in reais = " + Conversao.converter(cotacao, dolar));
		
		sc.close();
	}

}
