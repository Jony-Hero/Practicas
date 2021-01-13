package Animales;
import java.util.Date;
public class gato extends animales {
	private String microChip;
	private enum RazaGato{Comun, Siames, Persa, Angora, ScottishFold};
	private RazaGato raza;
	public gato(Date fechaNacimiento, String nombre, double peso, String comentarios,String microChip, RazaGato raza) {
		super(fechaNacimiento,nombre,peso,comentarios);
		this.microChip = microChip;
		this.raza = raza;
		
	}

}
