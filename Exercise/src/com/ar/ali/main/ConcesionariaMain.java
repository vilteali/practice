package com.ar.ali.main;

import java.util.ArrayList;
import java.util.List;
import com.ar.ali.clases.Auto;
import com.ar.ali.clases.Moto;
import com.ar.ali.clases.Vehiculo;

public class ConcesionariaMain {

	public static void main(String[] args) {
		
		Vehiculo v1 = new Auto("Peugeot", "206", 4, 200000000d);
		Vehiculo v2 = new Moto("Honda", "Titan", "125cc", 60000000d);
		Vehiculo v3 = new Auto("Peugeot", "208", 5, 250000000d);
		Vehiculo v4 = new Moto("Yamaha", "YBR", "160cc", 80500500d);
		
		List<Vehiculo> vehiculos = new ArrayList<>();
		vehiculos.add(v1);
		vehiculos.add(v2);
		vehiculos.add(v3);
		vehiculos.add(v4);
		
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println(Vehiculo.listarVehiculos(vehiculo));
		}
	}
	
}


