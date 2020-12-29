package com.ar.ali.concesionaria;

import java.util.Iterator;

public class Vehiculo implements mostrarCaracteristicas {

	// Atributos de la clase
	private String marca;
	private String modelo;
	private String cilindrada;
	private int puertas;
	private double precio;
	
	// Constructor primero
	public Vehiculo(String marca, String modelo, int puertas, double precio) {
		this.marca=marca;
		this.modelo=modelo;
		this.puertas=puertas;
		this.precio=precio;
		
	}
	
	// Constructor segundo
	public Vehiculo(String marca, String modelo, String cilindrada, double precio) {
		this.marca=marca;
		this.modelo=modelo;
		this.cilindrada=cilindrada;
		this.precio=precio;
	}
	
	// Definimos que va mostrar el primer método implementado
	@Override
	public String mostrarCaracteristicas() {
		return "Marca: " + marca + " // Modelo: " + modelo + " // Puertas: " + puertas
				+ " // Precio: $" +precio + "";
	}
	
	// Definimos que va mostrar el segundo método implementado
	@Override
	public String mostrarCaracteristicas2() {
		return "Marca: " + marca + " // Modelo: " + modelo + " // Cilindrada: " 
				+ cilindrada+ " // Precio: $" +precio+ "";
	}
	
	// Método para listar vehiculos
	public static String listarVehiculos(Vehiculo vehiculo) {
		
		if(vehiculo.getPuertas() != 0 || vehiculo.getCilindrada() == null) 
			return vehiculo.mostrarCaracteristicas();
				return vehiculo.mostrarCaracteristicas2();
				
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
	public String getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
