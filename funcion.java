package Funciones;

public class funcion {
	
	
	public static double sumar(double m , double n) {
		double z = 0;
		
		z = m+n;
		System.out.println(z);
		return z;
	}
	public static void par_o_no(int z) {
		
		if(z%2==0) {
			System.out.println("ES PAR EL NUMERO INTRODUCIDO");
		}else {
			System.out.println("No es par el numero introducido");
		}
		
		
	}

}
