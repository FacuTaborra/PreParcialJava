package entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mecanico extends Empleado {
	
	private double valorKm;
	private ArrayList<Vehiculo> vehiculos;
	
	public Mecanico(int id, String nombre, LocalDate ingreso, double sueldoBase, double valorKm) {
		super(id, nombre, ingreso, sueldoBase);
		this.setValorKm(valorKm);
		// TODO Auto-generated constructor stub
	}

	public double getValorKm() {
		return valorKm;
	}

	public void setValorKm(double valorKm) {
		this.valorKm = valorKm;
	}
	
	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	public ArrayList<Vehiculo> getVehiculosReparadosMes(){
		ArrayList<Vehiculo> vehiculosReparadosMes = new ArrayList<Vehiculo>();
		return vehiculosReparadosMes;
	}

	public double getSueldo() {
		double sueldo = this.getSueldoBase();
		 //cantidad kilometros
		for(Vehiculo v: this.getVehiculosReparadosMes()) {
			sueldo = sueldo + this.valorKm * v.getCantidadKilometros() ;
		}
		return sueldo;
	}
	
}
