import java.util.Scanner;



public class Inicio {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.println("introduzca el denominador");
		String denominador = sc.next();
		System.out.println("introduzca el numerador");
		String numerador = sc.next();
		sc.close();

		division(denominador, numerador);

	}


	/**
	 * 
	 * @param denominador
	 * @param numerador
	 */
	public static void division(String denominador, String numerador) {
		//TODO: cambiar MaxInteracciones una vez calculado y ajustado
		int MaxInteracciones = Integer.MAX_VALUE;
		//int MaxInteracciones = Integer.parseInt(numerador);
		division(denominador, numerador, MaxInteracciones);
	}

	/**
	 * Algoritmo para realizar la division sin dividir
	 * @param denominador
	 * @param numerador
	 * @param MaxInteracciones
	 * 
	 * TODO: revisar el tema de los decimales, los voy a quitar desde el principio por le momento 
	 * considero que es facil colocarlos
	 */
	public static void division(String denominador, String numerador, int MaxInteracciones){

		//tema decimales
		denominador = denominador.replace(".", "").replace(",", "");
		numerador= numerador.replace(".", "").replace(",", "");
		
		int numNumerador = Integer.valueOf(numerador);
		int numDenominador = Integer.valueOf(denominador.substring(0, numerador.length()) );
		denominador = denominador.substring(numerador.length(), denominador.length() );
		
		//
		//String coeficienteTotal;
		int interacciones = 0;
		int lastCoeficiente;
		int resto;

		while (interacciones <= MaxInteracciones) {
			
				
			
			lastCoeficiente = encontrarCoeficiente(numDenominador, numNumerador);
			resto = numDenominador - (numNumerador * lastCoeficiente);
			
			if (resto == 0 && denominador.equals("")) {
				break;
				
			}else {
				
				if (denominador.equals("")) {
					numDenominador = resto * 10;
				}else {
					//aniade el siguiente numero del string denominador a numDenominador
					numDenominador = Integer.valueOf(String.valueOf(resto).concat(denominador.substring(0, 1))) ;
					denominador = denominador.substring(1, denominador.length());
				}
				
			}
			System.out.println("resto = " + resto);
			System.out.println("coeficiente = " + lastCoeficiente);
			System.out.println("-------------------------");
			
			interacciones++;
		}



	}









	/**
	 * 
	 * @param denominador
	 * @param numerador
	 * @return coeficiente
	 */
	private static int encontrarCoeficiente(int denominador, int numerador) {
		
		int coeficiente = 0;

		while (denominador >= numerador) {
			denominador = denominador - numerador;
			coeficiente++;
		}

		return coeficiente;
	}

}
