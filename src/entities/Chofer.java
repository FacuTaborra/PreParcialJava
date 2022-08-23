package entities;

import java.time.*;
import java.util.ArrayList;
import entities.Viaje;

public class Chofer extends Empleado{
	
	private String carnet;
	private LocalDate proximoVencimiento;
	private double cantViajesPremio;
	private double premio;
	private Viaje viaje;
	
	public Chofer(int id, String nombre, LocalDate ingreso, double sueldoBase) {
		super(id, nombre, ingreso, sueldoBase);
		// TODO Auto-generated constructor stub
	}
	
	public String getCarnet() {
		return carnet;
	}
	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}
	public LocalDate getProximoVencimiento() {
		return proximoVencimiento;
	}
	public void setProximoVencimiento(LocalDate proximoVencimiento) {
		this.proximoVencimiento = proximoVencimiento;
	}
	public double getCantViajesPremio() {
		return cantViajesPremio;
	}
	public void setCantViajesPremio(double cantViajesPremio) {
		this.cantViajesPremio = cantViajesPremio;
	}
	public double getPremio(){
		return premio;
	}
	public void setPremio(double premio) {
		this.premio = premio;
	}
	public Viaje getViaje() {
		return viaje;
	}
	public void setViaje(Viaje viaje) {
		this.viaje = viaje;
	}

	public ArrayList<Viaje> getViajesDelMes(){
		// Ya Incluido, no debe programarse
		ArrayList<Viaje> viajes = new ArrayList<Viaje>();
		return viajes;
	}
	
	public double getSueldo() {
		double sueldo = this.getSueldoBase();
		
		if(this.getViajesDelMes().size() > this.cantViajesPremio) {
			sueldo = sueldo + this.getPremio();
		}

		return sueldo;
	}
	
	
}