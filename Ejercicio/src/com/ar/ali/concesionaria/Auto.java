package com.ar.ali.concesionaria;

public class Auto extends Vehiculo {

	private int puertas;

	// Constructor clase Auto
	public Auto(String marca, String modelo, int puertas, double precio) {
		super(marca, modelo, precio);
		this.puertas = puertas;
	}

	public int getPuertas() {
		return puertas;
	}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	@Override
	public String mostrarCaracteristicas() {
		return "Marca: " + marca + " // Modelo: " + modelo + " // Puertas: " 
				+ puertas+ " // Precio: $" +precio + "";
	}

	@Override
	public String mostrarVehiculoMasCaro() {
		return null;
	}
	
}
