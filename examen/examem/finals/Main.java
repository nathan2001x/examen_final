package examem.finals;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int opcion;
		String marcaIngresada,modeloIngresado,anioIngresado,placaIngresada,kilometrajeIngresad;
		String kilometrajeIngresado,codigoNacional,codigoImportacionIngre,valorImportacionIngre,kilometrajeNuevo;
		Autos vector[]=new Autos[4];
		int i=-1;
		
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
				marcaIngresada=teclado.nextLine();
				Autos marcaAuto=new Autos();
				marcaAuto.setMarca(marcaIngresada);
				
				System.out.println("Ingrese modelo del auto");
				modeloIngresado=teclado.nextLine();
				Autos modeloAuto=new Autos();
				modeloAuto.setModelo(modeloIngresado);
				
				System.out.println("Ingrese año de fabricacion del auto");
				anioIngresado=teclado.nextLine();
				Autos anioAuto=new Autos();
				anioAuto.setAnioFabricacion(anioIngresado);
				
				System.out.println("Ingrese placa del auto");
				placaIngresada=teclado.nextLine();
				Autos placaAuto=new Autos();
				placaAuto.setPlaca(placaIngresada);
				
				System.out.println("Ingrese kilometraje del auto");
				kilometrajeIngresado=teclado.nextLine();
				Autos kilometrajeAuto=new Autos();
				kilometrajeAuto.setKilometraje(kilometrajeIngresado);
				
				System.out.println("Ingrese codigo nacional del auto");
				codigoNacional=teclado.nextLine();
				Autos auto1=new Autos();
				auto1.setCodigoNacional(codigoNacional);
				i=i+1;
				vector[]=;
				
			} else if(opcionTipoAuto==2);
			System.out.println("Ingrese marca del auto");
			marcaIngresada=teclado.nextLine();
			Autos marcaAuto=new Autos();
			marcaAuto.setMarca(marcaIngresada);
			
			System.out.println("Ingrese modelo del auto");
			modeloIngresado=teclado.nextLine();
			Autos modeloAuto=new Autos();
			modeloAuto.setModelo(modeloIngresado);
			
			System.out.println("Ingrese año de fabricacion del auto");
			anioIngresado=teclado.nextLine();
			Autos anioAuto=new Autos();
			anioAuto.setAnioFabricacion(anioIngresado);
			
			System.out.println("Ingrese placa del auto");
			placaIngresada=teclado.nextLine();
			Autos placaAuto=new Autos();
			placaAuto.setPlaca(placaIngresada);
			
			System.out.println("Ingrese kilometraje del auto");
			kilometrajeIngresado=teclado.nextLine();
			Autos kilometrajeAuto=new Autos();
			kilometrajeAuto.setKilometraje(kilometrajeIngresado);
			
			System.out.println("Ingrese codigo de importacion");
			codigoImportacionIngre=teclado.nextLine();
			Autos codigoImportacion=new Autos();
			codigoImportacion.setCodigoDeImportacion(codigoImportacionIngre);
			
			System.out.println("Ingrese valor de importacion");
			valorImportacionIngre=teclado.nextLine();
			Autos valorImportacion=new Autos();
			valorImportacion.setValorDeImportacion(valorImportacionIngre);
			
			break;
		case 2:
			System.out.println("Ingrese placa del auto");
			placaIngresada=teclado.nextLine();
			System.out.println("Ingrese nuevo kilometraje");
			kilometrajeNuevo=teclado.nextLine();
			break;
		case 3:
			System.out.println("Ingrese numero de placa");
			break;
		case 4:
			break;
			default:
				System.out.println("Escoge una opcion valida porfavor");
				break;
				
		}
		
		
		}while(opcion!=5);

	}

}
