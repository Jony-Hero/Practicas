package Animales;

import java.util.Date;



public class perro extends animales{
	private String microChip;
	public enum RazaPerro{PASTORALEMAN, HUSKY, FOXTERRIER, DALMATA,
		SANBERNARDO};
	private RazaPerro raza;
	
	public perro(Date fechaNacimiento, String nombre, double peso, String comentarios,String microChip,RazaPerro raza) {
		super(fechaNacimiento,nombre,peso,comentarios);
		this.microChip = microChip;
		this.raza = raza;
	}

	public String getMicroChip() {
		return microChip;
	}

	@Override
	public String toString() {
		return 
				"Ficha Perro\n"
				+"nombre: "+this.nombre
				+"\nRaza: "+this.raza
				+"\nFecha de Nacimientos:"+this.fechaNacimiento
				+"\nPeso:" +this.peso +"Kg"
				+"\nMicrochip:"+this.microChip
				+"\nComentario:"+this.comentarios;
//				"perro [microChip=" + microChip + ", raza=" + raza + ", fechaNacimiento=" + fechaNacimiento + ", nombre="
//				+ nombre + ", peso=" + peso + ", comentarios=" + comentarios + "]";
	
	}

	public RazaPerro getRaza() {
		return raza;
	}

	public void setRaza(RazaPerro raza) {
		this.raza = raza;
	}

	public void setMicroChip(String microChip) {
		this.microChip = microChip;
	}
	
	
	

}
