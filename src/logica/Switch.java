package logica;

import front.Pantalla;
import java.util.Scanner;

public class Switch {
	
	public static void main(String[] args) {
		Pantalla panta = new Pantalla();
		panta.setVisible(true);
		panta.setLocationRelativeTo(null);
		
		
	}
}
	/*public void menuPrincipal(){
		Scanner scanner = new Scanner(System.in);
		int opcion;
		
		//
	while(true){	 
	    System.out.println("         Menu principal:       ");
            System.out.println("1. Opcion 1: calcular area");
            System.out.println("2. Opcion 2: calculadora");
	    System.out.println("3. Opcion 3: conversion");
            System.out.println("4. Salir");

            System.out.print("Seleccione una opcion: ");
	    opcion = scanner.nextInt();
		switch (opcion){
			case 1 :
				menuArea();
				
				break;
			case 2 : 
				menuCalculadora();
				break;
			case 3 :
				menuConversion();
				break;
			case 4 :
				System.out.println("Saliendo");
				break;
			default : 
				System.out.println("Solo puede elegir una de las opciones");	
		}
		
	}
	}
	public void menuArea (){
		Area cArea = new Area();
		Scanner scanner = new Scanner(System.in);
		int opcion;
		//
	while(true){ 
	    System.out.println("         Menu de Area:       ");
            System.out.println("1. Circulo");
            System.out.println("2. triangulo");
	    System.out.println("3. Cuadrado");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
	    opcion = scanner.nextInt();
		switch (opcion){
			case 1 :
				System.out.println("Selecciono circulo");
				System.out.println("Ingrese el radio");
				int radio = scanner.nextInt();
				cArea.setRadio(radio);
				cArea.circulo();
				
				break;
			case 2 : 
				System.out.println("Selecciono triangulo");
				System.out.println("Ingrese la base");
				int base = scanner.nextInt();
				cArea.setBase(base);
				System.out.println("Ingrese la altura");
				int altura = scanner.nextInt();
				cArea.setAltura(altura);
				cArea.triangulo();
				
				break;
			case 3 :
				System.out.println("Selecciono cuadrado");
				System.out.println("Ingrese un lado");
				int lado = scanner.nextInt();
				cArea.setLado(lado);
				cArea.cuadrado();
				break;
			case 4 :
				System.out.println("Saliendo");
				return;
			default : 
				System.out.println("Solo puede elegir una de las opciones");	
		}
		
	}
	}
	public void menuCalculadora (){
		Calculadora calcu = new Calculadora();
		Scanner scanner = new Scanner(System.in);
		int opcion;
		//
	while(true){ 
	    System.out.println("         Menu de calculadora:       ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
	    System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Saliendo");
            System.out.print("Seleccione una opcion: ");
	    opcion = scanner.nextInt();
		switch (opcion){
			
			case 1 :
				System.out.println("Selecciono suma");
				System.out.println("Ingrese numero 1: ");
				int n = scanner.nextInt();
				calcu.setNum1(n);
				System.out.println("Ingrese numero 2: ");
				int n1 = scanner.nextInt();
				calcu.setNum2(n1);
				calcu.suma();
				
				break;
			case 2 : 
				System.out.println("Selecciono resta");
				System.out.println("Ingrese numero 1: ");
				int n2 = scanner.nextInt();
				calcu.setNum1(n2);
				System.out.println("Ingrese numero 2: ");
				int n3 = scanner.nextInt();
				calcu.setNum2(n3);
				calcu.resta();
				break;
			case 3 :
				System.out.println("Selecciono multiplicacion");
				System.out.println("Ingrese numero 1: ");
				int n4 = scanner.nextInt();
				calcu.setNum1(n4);
				System.out.println("Ingrese numero 2: ");
				int n5 = scanner.nextInt();
				calcu.setNum2(n5);
				calcu.multiplicacion();
				
				break;
			case 4 :
				System.out.println("Selecciono Division");
				System.out.println("Ingrese numero 1: ");
				int n6 = scanner.nextInt();
				calcu.setNum1(n6);
				System.out.println("Ingrese numero 2: ");
				int n7 = scanner.nextInt();
				calcu.setNum2(n7);
				calcu.division();
				
				break;
			case 5 :
				System.out.println("Saliendo");
				return;
			default : 
				System.out.println("Solo puede elegir una de las opciones");	
		}
		
	}
	}
	public void menuConversion (){
		Conversion conv = new Conversion();
		Scanner scanner = new Scanner(System.in);
		int opcion;
		//
	while(true){	 
	    System.out.println("         Menu de conversor:       ");
            System.out.println("1. Km a Millas");
            System.out.println("2. Millas a Km");
	    System.out.println("3. Celsius a Fahrenheit");
            System.out.println("4. Fahrenheit a Celsius");
            System.out.println("5. Saliendo");
            System.out.print("Seleccione una opcion: ");
	    opcion = scanner.nextInt();
		switch (opcion){
			case 1 :
				System.out.println("Selecciono Km a Millas");
				System.out.println("Ingrese los Kilometros");
				int km = scanner.nextInt();
				conv.setKm(km);
				conv.kmMilla();
				
				break;
			case 2 : 
				System.out.println("Selecciono Millas a Km");
				System.out.println("Ingrese las Millas");
				int millas = scanner.nextInt();
				conv.setMillas(millas);
				conv.millaKm();
				break;
			case 3 :
				System.out.println("Celsius a Fahrenheit");
				System.out.println("Ingrese los Celsius");
				int c = scanner.nextInt();
				conv.setgC(c);
				conv.gcGf();
				break;
			case 4 :
				System.out.println("Fahrenheit a Celsius");
				System.out.println("Ingrese los Fahrenheit");
				int f = scanner.nextInt();
				conv.setgF(f);
				conv.gfGc();
				
				break;
			case 5 : 
				System.out.println("Saliendo");
				return;
			default : 
				System.out.println("Solo puede elegir una de las opciones");	
		}
		
	}
	}
	}
	
*/
