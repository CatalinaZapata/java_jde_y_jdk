public class EjemploCondicionalesF {
	public static void main(String[] args) {
		System.out.println("Hello word");

		int edad = 28;

		if (edad >= 18) {
			System.out.println("usted puede entrar");
			System.out.println("Bienvenido");
		}

		edad = 16;

		if (edad >= 18)
			System.out.println("usted puede entrar");
		System.out.println("Bienvenido");
		
		
		edad = 16;
		int cantidad = 2;
		if (edad >= 18) {
			System.out.println("usted puede entrar");
			}else {
				if(cantidad >= 2) {
					System.out.println("Puede pasar por compañia");
				}else {
					System.out.println("Chao");
				}		
			}
	}
}
