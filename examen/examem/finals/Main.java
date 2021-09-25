package examem.finals;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int opcion;
		do {
		System.out.println("########################################");
		System.out.println("CONCESIONARIO AMBACAR, elija una opción:");
		System.out.println("1.Ingresar Auto                         ");
		System.out.println("2.Consultar Auto                        ");
		System.out.println("3.Actualizar kilometraje                ");
		System.out.println("4.Imprimir reporte                      ");
		System.out.println("5.SALIR                                 ");
		System.out.println("########################################");
		opcion=teclado.nextInt();
		switch(opcion) {
		case 1:
			System.out.println("Escoja tipo de auto");
			System.out.println("1.Auto Nacional");
			System.out.println("2.Auto Importado");
			int opcionTipoAuto=teclado.nextInt();
			if(opcionTipoAuto==1) {
				System.out.println("Ingrese marca del auto");
				System.out.println("Ingrese modelo del auto");
				System.out.println("Ingrese año de fabricacion del auto");
				System.out.println("Ingrese placa del auto");
				System.out.println("Ingrese kilometraje del auto");
				System.out.println("Ingrese codigo nacional del auto");
			} else if(opcionTipoAuto==2);
			System.out.println("Ingrese marca del auto");
			System.out.println("Ingrese modelo del auto");
			System.out.println("Ingrese año de fabricacion del auto");
			System.out.println("Ingrese placa del auto");
			System.out.println("Ingrese kilometraje del auto");
			System.out.println("Ingrese codigo de importacion");
			System.out.println("Ingrese valor de importacion");
			break;
		case 2:
			System.out.println("Ingrese placa del auto");
			break;
		case 3:
			System.out.println("Ingrese numero de placa");
			break;
		}
		
		
		}while(opcion!=5);

	}

}
