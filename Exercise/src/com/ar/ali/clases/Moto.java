package com.ar.ali.clases;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Moto extends Vehiculo {

	@Override
	public String mostrarCaracteristicas() {
		DecimalFormat formatPrice = new DecimalFormat("$ ###, ###. ###");
		
		return "Marca: " + marca + " // Modelo: " + modelo + " // Cilindrada: " 
				+ cilindrada+ " // Precio: " +formatPrice.format(precio)+ "";
	}

	@Override
	public String mostrarVehiculoMasCaroYBarato(Vehiculo vehiculo) {
		
		List<Vehiculo> list = new ArrayList<>();
		list.add(vehiculo);
		
		double temp = 0;
		double maxPrice = 0;
		
		for (Vehiculo e : list) {
			temp = e.getPrecio();
			
			if(e.getPrecio() > maxPrice)
				temp = e.getPrecio();
				
			if(temp<maxPrice)
				maxPrice=temp;
		}
		
		return null;
	}
	
	public Moto(String marca, String modelo, String cilindrada, Double precio) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}

	private String cilindrada;
	
	public String getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

}
