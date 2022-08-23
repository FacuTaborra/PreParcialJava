package entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Guia extends Empleado {
	private String disponibilidad;
	private double valorHora;
	private ArrayList<Idioma> idiomas;
	
	public Guia(int id, String nombre, LocalDate ingreso, double sueldoBase) {
		super(id, nombre, ingreso, sueldoBase);
		// TODO Auto-generated constructor stub
	}

	public String getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public ArrayList<Idioma> getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(ArrayList<Idioma> idiomas) {
		this.idiomas = idiomas;
	}

	public ArrayList<Viaje> getViajesDelMes(){
		// Ya Incluido, no debe programarse
		ArrayList<Viaje> viajes = new ArrayList<Viaje>();
		return viajes;
	}
	
	public double getSueldo(){ 
		//sueldo base
		double sueldo = this.getSueldoBase();
		//sumo horas de viaje
		for(Viaje v: this.getViajesDelMes() ){
			sueldo = sueldo + this.valorHora * v.getDuracionHs();
		}
		//sumo valor adicional por idioma
		for(Idioma i: this.getIdiomas()) {
			sueldo = sueldo + i.getAdicionalActual();
		}
		return sueldo;
	}
}
