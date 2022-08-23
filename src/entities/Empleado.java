package entities;


import java.time.*;

public class Empleado {
	private int id; 
	private String nombre;
	private LocalDate ingreso;
	private double sueldoBase;
	
	public Empleado(int id, String nombre, LocalDate ingreso, double sueldoBase){
		setId(id);
		setNombre(nombre);
		setIngreso(ingreso);
		setSueldoBase(sueldoBase);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getIngreso() {
		return ingreso;
	}
	public void setIngreso(LocalDate ingreso) {
		this.ingreso = ingreso;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	
}
