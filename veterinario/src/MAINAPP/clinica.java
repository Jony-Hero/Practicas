package MAINAPP;
import java.util.ArrayList;

import Animales.animales;
public class clinica {
static ArrayList<animales> listaAnimal = new ArrayList<animales>();

public clinica(ArrayList<animales> listaAnimal) {
	super();
	this.listaAnimal = listaAnimal;
}

@Override
public String toString() {
	return "clinica [listaAnimal=" + listaAnimal + "]";
}
	
	
	
	
}
