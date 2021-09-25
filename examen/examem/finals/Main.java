package examem.finals;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int opcion;
		String marcaIngresada, modeloIngresado, anioIngresado, placaIngresada = "";
		String kilometrajeIngresado, codigoNacional, codigoImportacionIngre, valorImportacionIngre, kilometrajeNuevo;
		String placaIngresadaAuto;
		int i = 0 ;
		Autos vector[] = new Autos[i];

		Autos auto1 = new Autos();

		do {
			System.out.println("########################################");
			System.out.println("CONCESIONARIO AMBACAR, elija una opción:");
			System.out.println("1.Ingresar Auto                         ");
			System.out.println("2.Consultar Auto                        ");
			System.out.println("3.Actualizar kilometraje                ");
			System.out.println("4.Imprimir reporte                      ");
			System.out.println("5.SALIR                                 ");
			System.out.println("########################################");
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Escoja tipo de auto");
				System.out.println("1.Auto Nacional");
				System.out.println("2.Auto Importado");
				int opcionTipoAuto = teclado.nextInt();
				if (opcionTipoAuto == 1) {
					System.out.println("Ingrese marca del auto");
					marcaIngresada = teclado.nextLine();
					System.out.println("Ingrese modelo del auto");
					modeloIngresado = teclado.nextLine();
					System.out.println("Ingrese año de fabricacion del auto");
					anioIngresado = teclado.nextLine();
					System.out.println("Ingrese placa del auto");
					placaIngresada = teclado.nextLine();
					System.out.println("Ingrese kilometraje del auto");
					kilometrajeIngresado = teclado.nextLine();
					System.out.println("Ingrese codigo nacional del auto");
					codigoNacional = teclado.nextLine();

					auto1.setMarca(marcaIngresada);
					auto1.setModelo(modeloIngresado);
					auto1.setPlaca(placaIngresada);
					auto1.setAnioFabricacion(anioIngresado);
					auto1.setKilometraje(kilometrajeIngresado);
					auto1.setAnioFabricacion(anioIngresado);
					auto1.setCodigoNacional(codigoNacional);
					i = i + 1;
					vector[i] = auto1;

				} else if (opcionTipoAuto == 2)
					;
				System.out.println("Ingrese marca del auto");
				marcaIngresada = teclado.nextLine();
				System.out.println("Ingrese modelo del auto");
				modeloIngresado = teclado.nextLine();
				System.out.println("Ingrese año de fabricacion del auto");
				anioIngresado = teclado.nextLine();
				System.out.println("Ingrese placa del auto");
				placaIngresada = teclado.nextLine();
				System.out.println("Ingrese kilometraje del auto");
				kilometrajeIngresado = teclado.nextLine();
				System.out.println("Ingrese codigo de importacion");
				codigoImportacionIngre = teclado.nextLine();
				System.out.println("Ingrese valor de importacion");
				valorImportacionIngre = teclado.nextLine();

				auto1.setMarca(marcaIngresada);
				auto1.setModelo(modeloIngresado);
				auto1.setPlaca(placaIngresada);
				auto1.setAnioFabricacion(anioIngresado);
				auto1.setKilometraje(kilometrajeIngresado);
				auto1.setPlaca(placaIngresada);
				auto1.setCodigoDeImportacion(codigoImportacionIngre);
				auto1.setValorDeImportacion(valorImportacionIngre);
				i = i + 1;
				vector[i] = auto1;
				break;

			case 2:
				System.out.println("Ingrese placa del auto");
				placaIngresadaAuto = teclado.nextLine();
				if (placaIngresadaAuto.equals(placaIngresada)) {
					System.out.println(vector[i]);
				}
				System.out.println("El auto no esta registrado");
				break;

			case 3:
				System.out.println("Ingrese numero de placa del auto");
				String placaIngre = teclado.nextLine();
				if (placaIngre.equals(placaIngresada)) {
					System.out.println("Ingrese nuevo kilometraje");
					kilometrajeNuevo = teclado.nextLine();
					auto1.getKilometraje(kilometrajeNuevo);

				}
				System.out.println("No se encuentra el auto");
				break;

			case 4:
				System.out.println(vector[i]);
				break;

			default:
				System.out.println("Escoge una opcion valida porfavor");
				break;

			}

		} while (opcion != 5);
		System.out.println("Sistema cerrado");

	}

}
