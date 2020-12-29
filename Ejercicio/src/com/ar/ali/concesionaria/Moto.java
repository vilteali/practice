package com.ar.ali.concesionaria;

public class Moto extends Vehiculo {

	private String cilindrada;
	
	public Moto(String marca, String modelo, String cilindrada, double precio) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String mostrarCaracteristicas() {
		return "Marca: " + marca + " // Modelo: " + modelo + " // Cilindrada: " 
				+ cilindrada+ " // Precio: $" +precio+ "";
	}

}
