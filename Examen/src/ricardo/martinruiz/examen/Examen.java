package ricardo.martinruiz.examen;

public class Examen {

	public static void main(String[] args) {
		
		int[]numeros = UtilidadesExamen.crearArray();
		
		UtilidadesExamen.mostrarArray(numeros);
		
		
		double promedio = UtilidadesExamen.calcularPromedio(numeros);
		System.out.println("Promedio :"+ promedio);
		
		//System.out.println(UtilidadesExamen.encontrarExtremos(numeros));
		int[]mayoresPromedio = UtilidadesExamen.filtrarMayoresQuePromedio(numeros, promedio);
		UtilidadesExamen.calcularPromedio(mayoresPromedio);

	}

}
