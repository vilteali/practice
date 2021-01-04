package com.ar.ali.clases;

import com.ar.ali.interfaces.vehiculoMasCaroYBarato;

public abstract class Vehiculo implements vehiculoMasCaroYBarato {
	
	public abstract String mostrarCaracteristicas();
	
	// Listamos los vehiculos
	static String listarVehiculos (Vehiculo vehiculo) {
		
		if(vehiculo instanceof Moto || vehiculo instanceof Auto)
			return vehiculo.mostrarCaracteristicas();
		
		return null;
	}
	
	static String listarMasCaroYBarato (Vehiculo vehiculo) {
		return vehiculo.mostrarVehiculoMasCaroYBarato(vehiculo);
	}
	
	public Vehiculo(String marca, String modelo, Double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	protected String marca;
	protected String modelo;
	protected Double precio;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
}
