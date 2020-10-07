package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

import comunes.LectorXml;
import comunes.Lectorcsv;

public class Programa {
	
	public static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion = 0;
		
		System.out.println("�Qu� tipo de fichero quiere leer?");
		
		do {
			
			System.out.println();
			System.out.println("Introduzca 1 para leer un archivo .txt");
			System.out.println("Introduzca 2 para leer un archivo .xml");
			System.out.println("Introduzca 3 para leer un archivo .csv");
			System.out.println();
			System.out.print("Elija su opci�n: ");
			
			try {
				opcion = teclado.nextInt();
				
			} catch (InputMismatchException e) {
				opcion = 0;
				teclado.nextLine();
			}
			
			if (opcion != 1 && opcion != 2 && opcion != 3) {
				
				System.out.println();
				System.out.println("Opci�n incorrecta, vuelva a elegir");
			}
			
			System.out.println();
			
			switch (opcion) {
			case 1:
				
				break;
				
			case 2:
				
				LectorXml.LeerArchivoXML();
				
				break;
			
			case 3:
				
				Lectorcsv.lectorcsv();
				
				break;

			default:
				break;
			}
			
		} while (opcion != 1 && opcion != 2 && opcion != 3);
		
	}

}
