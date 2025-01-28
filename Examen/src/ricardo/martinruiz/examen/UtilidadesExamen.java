package ricardo.martinruiz.examen;

import java.util.Scanner;

public class UtilidadesExamen {

	public static int[] crearArray() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el tamaño del array, entre 1 y 10");
		int tamanio = teclado.nextInt();
		int[] numeros = new int[tamanio];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca el valor para la posicion " + i);
			int valor = teclado.nextInt();
			numeros[i] = valor;

		}
		return numeros;

	}

	public static void mostrarArray(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {

			System.out.println(numeros[i]);
		}

	}

	public static double calcularPromedio(int[] numeros) {
		int suma = 0;
		double promedio = 0;
		for (int valores : numeros) {
			suma += valores;

		}
	  promedio = suma/(numeros.length);

		return promedio;
	}

	public static int[] encontrarExtremos(int[]numeros) {
		int menor = Integer.MAX_VALUE;
		int mayor = Integer.MIN_VALUE;
		for (int i=0;i<numeros.length;i++) {
			if (numeros[i]<menor ) {
				menor=numeros[i];
			}	
	}
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}
	}
		int[]valores = {mayor,menor};
		
		return valores;
		
	}
	
	public static int[]filtrarMayoresQuePromedio(int[]numeros,double promedio){
		int contador = 0;
		for (int numero : numeros) {
			if (numero>promedio) {
				contador ++;
			}
		}
		
		int[]mayoresPromedio = new int[contador];
		int posicionArray = 0;
		for (int numero : numeros) {
			if(numero>promedio) {
				mayoresPromedio[posicionArray++]= numero;
				//posicionArray++;
			}
		}
		
		return mayoresPromedio;
		
		
	}
}
