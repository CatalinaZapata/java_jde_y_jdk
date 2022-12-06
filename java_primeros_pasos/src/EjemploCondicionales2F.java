public class EjemploCondicionales2F {
	public static void main(String[] args) {
		int edad = 22;
		int cantidadPersonas = 2;
		boolean esPareja = cantidadPersonas > 1;
		boolean puedeEntrar = edad >= 18 && esPareja;

		System.out.println("El valor de la condicion esPareja es: " + esPareja);
		if (puedeEntrar) {
			System.out.println("usted puede entrar");
			}else {
					System.out.println("Chao");
				}		
	}
}
