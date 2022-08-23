package entities;

public class Idioma {
	private int id;
	private String descripcion;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public double getAdicionalActual() {
		// Ya incluido
		double precioIdioma = 0.00;
		return precioIdioma;
	}
	
}
