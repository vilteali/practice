package com.ar.ali.concesionaria;

public class ConcesionariaMain {

	public static void main(String[] args) {
		
		// Instanciamos los objetos 
		Vehiculo v1 = new Auto("Peugeot", "206", 4, 200.00000);
		Vehiculo v2 = new Moto("Honda", "Tital", "125cc", 60.00000);
		Vehiculo v3 = new Auto("Peugeot", "208", 5, 250.00000);
		Vehiculo v4 = new Moto("Yamaha", "YBR", "160cc", 80.50050);
		
		// Los guardamos en un array para poder recorrerlos con un bucle for
		Vehiculo[] vehiculos = {v1, v2, v3, v4};
		
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println(Vehiculo.listarVehiculos(vehiculo));
			
		}
		
	}

}
