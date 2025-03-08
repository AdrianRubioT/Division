package OutputFile;




/**
 * Clase para manejar el archivo de salida del programa y recupear los datos 
 * ver exampleOutput.txt para ver la estructura
 */
public class outputFile {

	
	String file;
	
	public outputFile(String filePath) {
		this.file = filePath;
	}

	
	//Create
	/**
	 * escribe en file denominador y numerador en el archivo
	 * @param denominador
	 * @param numerador
	 * TODO: determinar si separar este metodo para cada parametro
	 */
	public void escribirValoresOriginales(String denominador, String numerador) {
		
	}
	
	/**
	 * escribe en file el ciclo en el archivo 
	 * @param ciclo indica el ciclo que procede
	 * @param coeficiente coeficiente calculado
	 * @param resto resto calculado
	 * @param coma indicar si se tiene que escribir el separador de unidades y decimales
	 */
	public void escribirCiclo(String ciclo, String coeficiente, String resto, String coma ) {
		
	}
	
	/**
	 * escribe Terminado mas el motivo de porque termino
	 * TODO: determinar si motivo tiene que recibir el ciclo en el que se repite
	 * @param motivo
	 */
	public void escribirTerminado(String motivo) {
		
	}
	

	//Read
	
	/** lee de file el denominador original guardado en el archivo */
	public void leerDenominadorOrigninal() {
		
	}
	
	/** lee de file el numerador original guardado en el archivo */
	public void leerNumeradorOrigninal() {
		
	}
	
	/** lee de file el ultimo cilco guardado en el archivo */
	public void leerUltimoCiclo() {
		
	}
	
	/**
	 * devuelve los valores del ciclo indicado como parametro
	 * @param ciclo 
	 * TODO: crear el objeto ciclo con los valores y refactorizar metodo escribirCiclo()
	 */
	public void leerCiclo(int ciclo) {
		
	}
	
	
	/**
	 * busca resto entre los ciclos escritos en file
	 * @param resto 
	 * @return 0 si no se encuentra o el ciclo que lo contiene 
	 */
	public int buscarResto(String resto) {
		return -100;
	}
	
	//Update (no necesario)
	//Delete (no necesario)
}
