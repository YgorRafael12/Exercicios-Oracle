package exercicios;

import java.util.Scanner;

public class exer04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Informe sua massa");
		double massa = input.nextDouble();

		System.out.println("Informe sua altura");
		double altura = input.nextDouble();

		double imc = massa / (altura * altura);

		if (imc < 18.5) {
			System.out.println("Seu índice é magreza");
		} else if (imc >= 18.5 && imc < 24.9) {
			System.out.println("Seu índice é normal");
		} else if (imc >= 24.9 && imc < 30) {
			System.out.println("Seu índice é sobrepeso");
		} else
			System.out.println("Seu indice é obesidade");
	}
}