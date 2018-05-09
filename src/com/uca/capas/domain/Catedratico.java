package com.uca.capas.domain;

public class Catedratico {
	private int codigo;
	private String nombre;
	private String apellido;
	private int edad;
	private String dui;
	private String fContratacion;
	
	//Constructor Vacio
	public Catedratico() {}
	
	//Constructor
	public Catedratico(int codigo, String nombre, String apellido, int edad, String dui, String fContratacion) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dui = dui;
		this.fContratacion = fContratacion;
	}

	
	//Setters y Getters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDui() {
		return dui;
	}

	public void setDui(String dui) {
		this.dui = dui;
	}

	public String getfContratacion() {
		return fContratacion;
	}

	public void setfContratacion(String fContratacion) {
		this.fContratacion = fContratacion;
	}
	
	
	

}
