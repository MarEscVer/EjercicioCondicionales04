package unico;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
/*Escribe un programa que calcule el salario semanal de un trabajador teniendo
 *  en cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12
 *  euros la hora. A partir de la hora 41, se pagan a 16 euros la hora.
 */
		
		final int PRECIO_NORMAL = 12;
		final int PRECIO_EXTRA = 16;
		final int HORA_TOPE = 40;
		
		int horas;
		int salario;
		int horas_extra;
		
		
		System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
		horas = Integer.parseInt(teclado.nextLine());
		
		if (horas < HORA_TOPE) {
			salario = horas * PRECIO_NORMAL;
		} else {
			horas_extra = horas - HORA_TOPE;
			salario = (HORA_TOPE * PRECIO_NORMAL) + (horas_extra * PRECIO_EXTRA);
		}
		
		System.out.println("El sueldo semanal que le corresponde es de " + salario + " euros.");
	}

}