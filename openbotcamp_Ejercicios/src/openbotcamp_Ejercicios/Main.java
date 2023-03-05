package openbotcamp_Ejercicios;


public class Main {
	
	
	public static int sumatresnum(int a, int b, int c) {//////////////Primera Parte 
		return a+b+c;
	}///////////////
	
	public static class coche{//////////////////Segunda Parte
		int puertas_Coche=0;
		
		public void aumentar_Puertas() {
			puertas_Coche++;
		}
		
		public int mosrarn_Puertas() {
			return puertas_Coche;
		}
		
	}////////////////////////////

	
	
	public static void main(String[] args) {
		/* 
		 	Primera parte:
				Crear una función con tres parámetros que sean números que se suman entre si.
				Llamar a la función en el main y darle valores.
			Segunda parte:
				Crear una clase coche.
				Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
				Una función que incremente el número de puertas que tiene el coche.
				Crear un objeto miCoche en el main y añadirle una puerta.
				Mostrar el número de puertas que tiene el objeto.
		 */
		sumatresnum(2,4,7);  ////Primera Parte
		
		coche miCoche = new coche();////Segunda Parte
		System.out.print(miCoche.mosrarn_Puertas()+"\n");
		miCoche.aumentar_Puertas();
		miCoche.aumentar_Puertas();
		miCoche.aumentar_Puertas();
		miCoche.aumentar_Puertas();
		System.out.print(miCoche.mosrarn_Puertas()+"\n");
		
	}
}
