package entities;

import java.util.ArrayList;

public class Vehiculo {
	private String patente;
	private String marca;
	private String modelo;
	private Mecanico mecanico;
	
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
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
	public Mecanico getMecanico(){
		return mecanico;
	}
	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}
	public ArrayList<Viaje> getViajesDelMes(){
		// Ya Incluido, no debe programarse
		ArrayList<Viaje> viajes = new ArrayList<Viaje>();
		return viajes;
	}
	
	public double getCantidadKilometros() {
		double cantkm = 0;
		for(Viaje v: this.getViajesDelMes()) {
			cantkm = cantkm + v.getKms();
		}
		return cantkm;
	}

}
