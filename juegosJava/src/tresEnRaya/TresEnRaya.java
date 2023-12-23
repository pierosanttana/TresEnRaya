package tresEnRaya;
import java.util.Scanner;

public class TresEnRaya {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		menu(scanner);

	}

	private static void menu(Scanner scanner) {

		System.out.println("¡¡JUEGOS!!");
		System.out.println("----------------");
		System.out.println("(1) Tres en Raya");
		System.out.println("----------------");
		System.out.print("elige una opción:");
		int opcion = scanner.nextInt();

		clearConsole();

		switch (opcion) {
		case 1:
			tresEnRaya(scanner);
			break;
		}

	}

	private static void clearConsole() {
		for (int i = 0; i < 6; i++) {
			System.out.println();
		}

	}

	private static void tresEnRaya(Scanner scanner) {

		String a1 = "1";
		String a2 = "2";
		String a3 = "3";
		String b1 = "4";
		String b2 = "5";
		String b3 = "6";
		String c1 = "7";
		String c2 = "8";
		String c3 = "9";
		imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);

		for (int i = 1; i <= 9; i++) {

			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 9:
				System.out.println();
				System.out.println("Turno " + i + " X");
				System.out.println();

				System.out.print("Elige una número para marcar: ");
				int posicion = scanner.nextInt();
				clearConsole();

				switch (posicion) {
				case 1:
					a1 = "X";
					imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
					break;
				case 2:
					a2 = "X";
					imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
					break;
				case 3:
					a3 = "X";
					imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
					break;
				case 4:
					b1 = "X";
					imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
					break;
				case 5:
					b2 = "X";
					imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
					break;
				case 6:
					b3 = "X";
					imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
					break;
				case 7:
					c1 = "X";
					imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
					break;
				case 8:
					c2 = "X";
					imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
					break;
				case 9:
					c3 = "X";
					imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
					break;
				}
				break;
			case 2:
			case 4:
			case 6:
			case 8:
				System.out.println();
				System.out.println("Turno " + i + " O");
				System.out.println();

				System.out.print("Elige una número para marcar: ");
				posicion = scanner.nextInt();
				clearConsole();

				switch (posicion) {
				case 1:
					a1 = "O";
					imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
					break;
				case 2:
					a2 = "O";
					imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
					break;
				case 3:
					a3 = "O";
					imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
					break;
				case 4:
					b1 = "O";
					imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
					break;
				case 5:
					b2 = "O";
					imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
					break;
				case 6:
					b3 = "O";
					imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
					break;
				case 7:
					c1 = "O";
					imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
					break;
				case 8:
					c2 = "O";
					imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
					break;
				case 9:
					c3 = "O";
					imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
					break;
				}
				break;
			}
			
			boolean resultado = comprobarResultado(a1, a2, a3, b1, b2, b3, c1, c2, c3);
			
			if(resultado) {
				System.out.println("Haz Ganado");
				System.out.println("Fin del juego.");
				break;
			}
		}

	}

	private static boolean comprobarResultado(String a1, String a2, String a3, String b1, String b2, String b3, String c1,
			String c2, String c3) {
		
		boolean resultado = false;
		
		if(a1.equals(a2) && a2.equals(a3)) {
			resultado = true;
		}else if(b1.equals(b2) && b2.equals(b3)) {
			resultado = true;
		}
		else if(c1.equals(c2) && c2.equals(c3)) {
			resultado = true;
		}
		else if(a1.equals(b1) && b1.equals(c1)) {
			resultado = true;
		}else if(a2.equals(b2) && b2.equals(c2)) {
			resultado = true;
		}else if(a3.equals(b3) && b3.equals(c3)) {
			resultado = true;
		}else if(a1.equals(b2) && b2.equals(c3)) {
			resultado = true;
		}else if(a3.equals(b2) && b2.equals(c1)) {
			resultado = true;
		}
		
				return resultado;
		
		
		
	}

	private static void imprimirTresEnRaya(String a1, String a2, String a3, String b1, String b2, String b3, String c1,
			String c2, String c3) {

		System.out.println("     |     |");
		System.out.println("  " + a1 + "  |  " + a2 + "  |  " + a3);
		System.out.println("     |     |");
		System.out.println("-----------------");
		System.out.println("     |     |");
		System.out.println("  " + b1 + "  |  " + b2 + "  |  " + b3);
		System.out.println("     |     |");
		System.out.println("-----------------");
		System.out.println("     |     |");
		System.out.println("  " + c1 + "  |  " + c2 + "  |  " + c3);
		System.out.println("     |     |");

	}

}
