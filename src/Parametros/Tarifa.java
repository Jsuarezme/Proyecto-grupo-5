package Parametros;

import java.text.*;
import java.util.*;
import java.time.*;

public class Tarifa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Capacidad=50;
		Date date = new Date();
		//Caso 1: obtener la hora y salida por pantalla con formato:
		DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
	    System.out.println("Cupos disponibles: "+Capacidad);
	    System.out.println("Hora: "+hourFormat.format(date));
	    String TipVehiculo=" ";
	    int TipoVehiculo=0;
	    do{
	    System.out.println("\nSi el vehiculo que va a ingresar es un carro marque 1, si es una moto marque 2");
	    TipoVehiculo=scan.nextInt();
	    
	    }while(!(TipoVehiculo==1 || TipoVehiculo==2));
	    
	    if(TipoVehiculo==1){
	        TipVehiculo="Carro";
	    }else if (TipoVehiculo==2){
	        TipVehiculo="Moto";
	    }
	    
	    System.out.println("Por favor ingrese su nombre");
	    String Nombre=scan.nextLine();
	    System.out.println("Por favor ingrese su numero de identificacion");
	    int Identificacion=scan.nextInt();
	    
	    
	    System.out.println(Nombre);
	    System.out.println(Identificacion);
	    System.out.println(TipVehiculo);
		 }
	}

