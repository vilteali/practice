package com.ar.ali.clases;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Auto extends Vehiculo {

	public Auto(String marca, String modelo, int puertas, Double precio) {
		super(marca, modelo, precio);
		this.puertas = puertas;
	}
	
	@Override
	public String mostrarCaracteristicas() {
		DecimalFormat formatPrice = new DecimalFormat("$ ###, ###. ###");
		
		return "Marca: " + marca + " // Modelo: " + modelo + " // Puertas: " 
				+ puertas+ " // Precio: " +formatPrice.format(precio) + "";
	}

	@Override
	public String mostrarVehiculoMasCaroYBarato(Vehiculo vehiculo) {
		double temp = 0;
		double maxPrice = 0;
		
		listVehiculo = new ArrayList<>();
		listVehiculo.add(vehiculo);
		
		for (Vehiculo e : listVehiculo) {
			if(e.getPrecio() > maxPrice)
				maxPrice = e.getPrecio();
			
			String priceMax = ("Vehículo más caro: "+vehiculo.getMarca()+" "+vehiculo.getModelo());
			return priceMax;
		}		

		
		
		return null;
	}
	
	private List<Vehiculo> listVehiculo;
	
	private int puertas;
	
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

}
