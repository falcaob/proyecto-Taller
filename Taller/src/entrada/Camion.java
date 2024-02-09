package entrada;

public class Camion extends Vehiculo{
	
	private boolean articulado;
	
	//CONSTRUCTORES
	public Camion(String matricula, String marca, String modelo, boolean articulado) {
		super(matricula, marca, modelo);
		this.articulado = articulado;
	}
	
	//GETTERS Y SETTERS
	public boolean isArticulado() {
		return articulado;
	}

	public void setArticulado(boolean articulado) {
		this.articulado = articulado;
	}
	
	//MÉTODOS ESTÁTICOS
	
	/*
	 * Crea un objeto Camion con los datos que nos pasan como argumentos.
	 * Devuelve el objeto camión que se ha creado.
	 */
 	public static Camion altaEntrada(String matricula, String marca, String modelo, boolean articulado) {
 		
 		Camion nuevoCamion = new Camion(matricula, marca, modelo, articulado);
		
		return nuevoCamion;
 	}

}
