public class TipoVariableB {
	public static void main(String[] args) {
		System.out.println("Hola mundo!!!!");
		
		int edad;//declaracion de variable
		edad = 28;//inicializacion de variable
		System.out.println(edad);//variable como parametro
		
		edad = 47;
		System.out.println(edad);
		
		edad = 46+88;
		System.out.println("Mi edad es: " + edad);
		
		double salario = 1250.56;
		System.out.println(salario);
		
		double poto = 28;
		System.out.println(poto);
		
		double salarioMitad = salario/2;
		System.out.println(salarioMitad);
		
		int div = 1250/3;
		System.out.println(div);
		
		//Ejemplo de cast
		double var1 = 230.89;
		int varEntero = (int) var1;
		System.out.println(varEntero);
		
		long a = 122222222222222L; //int no alcanza 
		short b = 13555; //medio
		byte c = 15;//muy peque
		float u = 2.5F;
		
		int resultado = (int) a+b+c;
		System.out.println(resultado);
		
	}
}
