package com.ar.ali.clases;

import java.util.List;

import com.ar.ali.interfaces.VehiculoMasBarato;
import com.ar.ali.interfaces.VehiculoMasCaro;

public abstract class Vehiculo implements VehiculoMasCaro, VehiculoMasBarato {
	
	public abstract String mostrarCaracteristicas();
	
	// Listamos los vehiculos
	public static String listarVehiculos (Vehiculo vehiculo) {
		
		if(vehiculo instanceof Moto || vehiculo instanceof Auto)
			
			return vehiculo.mostrarCaracteristicas();
			return vehiculo.mostrarVehiculoMasCaro(vehiculo);
	}
	
	public String mostrarVehiculoMasCaro (Vehiculo vehiculo) {
		return vehiculo.mostrarVehiculoMasCaro(vehiculo);
	}
	
	public String mostrarVehiculoMasBarato (Vehiculo vehiculo) {
		return vehiculo.mostrarVehiculoMasBarato(vehiculo);
	}
	
	public Vehiculo(String marca, String modelo, Double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	protected String marca;
	protected String modelo;
	protected Double precio;
	protected List<Vehiculo> listVehiculo;
	
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
