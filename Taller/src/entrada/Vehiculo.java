package entrada;

public class Vehiculo {
	
	private String matricula;
	private String marca;
	private String modelo;
	
	
	//********CONSTRUCTORES*****************
	
	public Vehiculo(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	
	//********GETTERS Y SETTERS*****************
	public String getMatricula() {return matricula;}
	
	public void setMatricula(String matricula) {this.matricula = matricula;}
	
	public String getMarca() {return marca;}
	
	public void setMarca(String marca) {this.marca = marca;}
	
	public String getModelo() {return modelo;}
	
	public void setModelo(String modelo) {this.modelo = modelo;}

	
	//********Métodos heredados de Object*****************
	@Override
	public String toString() {
		//De otra forma: String cadenaVehiculo = "Datos aquí";
		return "Datos del vehiculo \nMatricula: " + this.getMatricula() + "\nMarca: " + this.getMarca() + "\nModelo: " + this.getModelo();
	}
	
	@Override
	public boolean equals(Object otroVehiculo) {
		boolean iguales;
		Vehiculo otro = (Vehiculo) otroVehiculo;
		
		if(this.matricula.equals(otro.matricula)) iguales = true;
		else iguales = false;
		
		return iguales;
	}
	

}
