package entrada;

public class Coche extends Vehiculo {
	
	//ENUM
	private TipoCombustible tipoCombustible;
	
	
	//CONSTRUCTORES
	public Coche(String matricula, String marca, String modelo, TipoCombustible tipoCombustible) {
		super(matricula, marca, modelo);
		this.tipoCombustible = tipoCombustible;
	}
	
	
	//GETTERS Y SETTERS
	public TipoCombustible getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(TipoCombustible tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	
	
	//MÉTODOS ESTÁTICOS
	
	/*
	 * Crea un objeto Coche con los datos que nos pasan como argumentos.
	 * Devuelve true si se ha creado el coche correctamente, devuelve false false en caso contrario
	 */
	
	//Estático para poder llamarlo desde la clase 
	public static Coche altaEntrada(String matricula, String marca, String modelo, TipoCombustible tipoCombustible) {
		
		Coche nuevoCoche = new Coche(matricula, marca, modelo, tipoCombustible);
		
		return nuevoCoche;
	}
	

}
