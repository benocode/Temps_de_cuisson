package fr.eni.tempsdecuisson;

import java.util.Scanner;

public class TempsDeCuisson {

	public static void main(String[] args) {

		/**
		 * Définition des variables temps de cuisson des viandes par kilo, en seconde
		 */

		double boeufBleu = 10.0 / 500.0 * 60.0;
		double boeufAPoint = 17.0 / 500.0 * 60.0;
		double boeufBienCuit = 25.0 / 500.0 * 60.0;
		double porcBleu = 15.0 / 400.0 * 60.0;
		double porcAPoint = 25.0 / 400.0 * 60.0;
		double porcBienCuit = 40.0 / 400.0 * 60.0;

		double tempsCuisson;

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Choisissez votre viande : boeuf (1) ou porc (2) :");
			int choixViande = Integer.parseInt(scanner.nextLine());

			System.out.println("Choisissez le poids de la viande en gramme :");
			int poidsViande = scanner.nextInt();

			System.out.println("Choisissez votre cuisson : bleu (1), à point (2) ou bien cuit (3) :");
			int choixCuisson = scanner.nextInt();

			double coef = 0.0;
			if (choixViande == 1) {
				switch (choixCuisson) {
				case 1:
					coef = boeufBleu;
					break;
				case 2:
					coef = boeufAPoint;
					break;
				case 3:
					coef = boeufBienCuit;
					break;
				default:
					tempsCuisson = 0.0;
				}
			} else if (choixViande == 2) {
				switch (choixCuisson) {
				case 1:
					coef = porcBleu;
					break;
				case 2:
					coef = porcAPoint;
					break;
				case 3:
					coef = porcBienCuit;
					break;
				default:
					tempsCuisson = 0.0;
				}
			} else {
				tempsCuisson = 0.0;
			}

			tempsCuisson = poidsViande * coef;

		} while (tempsCuisson == 0);

		System.out.println("Le temps de cuisson de votre viande est de " + tempsCuisson + " secondes");

		scanner.close();

	}

}
