package com.ar.ali.concesionaria;

public abstract class Vehiculo {

	// Atributos de la clase
	protected String marca;
	protected String modelo;
	protected double precio;
	
	// Constructor general Vehiculo
	public Vehiculo(String marca, String modelo, double precio) {
		this.marca=marca;
		this.modelo=modelo;
		this.precio=precio;
	}
	
	// Definimos metodos para mostrar caracteristicas
	public abstract String mostrarCaracteristicas();
	
	// Método para listar vehiculos
	public static String listarVehiculos(Vehiculo vehiculo) {
		if(vehiculo instanceof Auto || vehiculo instanceof Moto)
			return vehiculo.mostrarCaracteristicas();
				return null;
	}
	
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
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
