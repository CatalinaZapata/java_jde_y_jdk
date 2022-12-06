import java.util.Iterator;

public class EjercicioTablaMultiplicacionI {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			for (int multi = 0; multi < 10; multi++) {
				System.out.print(i * multi);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
