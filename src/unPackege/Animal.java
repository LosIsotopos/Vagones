package unPackege;

public class Animal {
	private int cantidad;
	private String nombre;
	private int agresividad;
	public Animal(String nombre,int agresividad, int cantidad) {
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.agresividad = agresividad;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAgresividad() {
		return agresividad;
	}
	public void setAgresividad(int agresividad) {
		this.agresividad = agresividad;
	}
	@Override
	public String toString() {
		return "Animal [cantidad=" + cantidad + ", nombre=" + nombre + ", agresividad=" + agresividad + "]";
	}
	@Override
	protected Animal clone() {
		return new Animal(nombre,agresividad,cantidad);
	}
	
	
	
}
