package ricardo.martinruiz.examen;

public class Examen {

	public static void main(String[] args) {
		
		int[]numeros = UtilidadesExamen.crearArray();
		
		UtilidadesExamen.mostrarArray(numeros);
		
		
		System.out.println(UtilidadesExamen.calcularPromedio(numeros));

	}

}
