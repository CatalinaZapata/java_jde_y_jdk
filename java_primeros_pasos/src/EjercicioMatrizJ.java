
public class EjercicioMatrizJ {
	public static void main(String[] args) {
		for (int fila = 0; fila <= 10; fila++) {
			for (int columna = 0; columna <= 10; columna++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		
		for (int fila = 0; fila <= 10; fila++) {
			for (int columna = 0; columna < fila; columna++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
