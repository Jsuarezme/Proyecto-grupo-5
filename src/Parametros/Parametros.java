package Parametros;

import java.util.*;

public class Parametros {
	
	String Nombrepa;
	String 	Direcciom;
	int Capacidad;
	String Nopoliza;
	int tarifa;
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String Nombrepa = scan.nextLine();
		String Direccion = scan.nextLine();
		int Capacidad = scan.nextInt();
		//int Capacidad = scan.nextInt();
		String Nopoliza = scan.nextLine();
		int tarifa = scan.nextInt();
		
		System.out.println("Datos parqueadero");
		System.out.println("Nombre: "+Nombrepa);
		System.out.println("Dirección: "+Direccion);
		System.out.println("Capacidad: "+Capacidad);
		System.out.println("NoPoliza: "+Nopoliza);
		System.out.println("Tarifa por minuto: "+tarifa);
		
	}
}