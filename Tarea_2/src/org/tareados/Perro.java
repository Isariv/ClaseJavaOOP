package org.tareados;

public class Perro extends Mascota {
	
	private String raza;
	private double longitud;
	private boolean sexo;
	
	
	//Constructores
	
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public boolean isSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	
	public String toString() {
		if (sexo = true) {
		return  nombre + " es una perra que tiene " + edad +" a�os, es de raza "+ raza + 
				 " y mide "+ longitud + " cent�metros.";
		}else {
			return  nombre + " es un perro que tiene " + edad +" a�os, es de raza "+ raza + 
					 " y mide "+ longitud + " cent�metros.";
		}
	}
	
	
}

	
