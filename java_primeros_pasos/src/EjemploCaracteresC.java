public class EjemploCaracteresC {
	public static void main(String[] args) {
		char caracter = 'a';//soporta solo 1 caracter a la vez 
		System.out.println(caracter);
		
		caracter = 65;
		System.out.println(caracter);
		
		caracter = 65+1;
		System.out.println(caracter);
		
		char segundoCaracter = (char) (caracter+1); //no compila
		System.out.println(segundoCaracter);
		
		String palabra = "Alura cursos online";
		System.out.println(palabra);
		
		palabra = palabra + " 2022";
		System.out.println(palabra);
	}
}
