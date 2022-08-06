package main;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
	
   
   Scanner read = new Scanner (System.in);
	
	int option = 0;
	int opt2 = 0;
	int opt3 = 0;
	do {
		do {
            do {
            	System.out.println("Buenas bienvenido a este programa de Club Social.");
    		    System.out.println("Por favor seleccione una de las opciones." );
    		    System.out.println("1.Empleados");
    		    System.out.println("2.Miembros");
    		    System.out.println("3.Salir");
    		    
    		    option = read.nextInt();
    		    
    		    switch(option)
    		    {
    		    case 1:
    		    	System.out.println("1.Agregar empleado");
    		    	System.out.println("2.Mostrar lista de empleados");
    		    	System.out.println("3.Volver");
    		        opt2 = read.nextInt();
    		    	break;
    		    	
    		    case 2:
    		    	System.out.println("1.Agregar miembros");
    		    	System.out.println("2.Mostrar lista de miembros");
    		    	System.out.println("3.Volver");
    		    	opt3 = read.nextInt();
    		    	break;
    		    	
    		    case 3:
    		    	System.out.println("Usted a decidido salir");
    		    	break;
    		    }
            }while(opt3 > 2);
			
		}while (opt2 > 2);
	}while(option > 2 );	

    }
	
}
