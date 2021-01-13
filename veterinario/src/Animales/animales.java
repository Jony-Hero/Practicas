package Animales;
import java.util.Date;
public abstract class animales {
	 protected Date fechaNacimiento = new Date ();
	 protected String  nombre;
	 protected  double peso;
	 protected String comentarios;
	 
	public animales(Date fechaNacimiento, String nombre, double peso, String comentarios) {
		
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
		this.peso = peso;
		this.comentarios = comentarios;
		
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

}
