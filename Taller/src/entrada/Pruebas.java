package entrada;

public class Pruebas {
	
	public static void main(String[] args) {
		
		/*
		Vehiculo v1 = new Vehiculo("8812JSD", "Opel", "Corsa");
		Vehiculo v2 = new Vehiculo("8812JSD", "Opel", "Corsa");
		Vehiculo v3 = new Vehiculo("5896HUI", "Opel", "Corsa");
		
		//toString devuelve una cadena del objeto
		//para imprimirlo necesitamos Syso
		System.out.println(v1.toString());
		//por defecto busca el toString
		System.out.println(v1);
		
		
		System.out.println("El primer vehículo es: ");
		System.out.println(v1);
		
		System.out.println();
		
		System.out.println("El segundo vehículo es: ");
		System.out.println(v2);
		
		System.out.println();
		
		if(v1.equals(v2)) System.out.println("Los vehículos son el mismo.");
		else System.out.println("Los vehículos son diferentes.");
		
		if(v1.equals(v3)) System.out.println("Los vehículos son el mismo.");
		else System.out.println("Los vehículos son diferentes.");
		*/
		
		//métodos estáticos a los que llamo
		Coche v1 = Coche.altaEntrada("8812JSD", "Opel", "Corsa", TipoCombustible.GASOLINA);
		Camion ca1 = Camion.altaEntrada("58965JOU", "Renault", "Clio", false);
	}

}
