package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;
import java.util.Map;

public class Vuelo {
	
	private String fecha;
	private Ruta ruta;
	private Avion avion;
	private Map<String,String>Tiquetes;
	public Vuelo(String fecha, Ruta ruta, Avion avion) {
		this.fecha = fecha;
		this.ruta = ruta;
		this.avion = avion;
	}
	public String getFecha() {
		return fecha;
	}
	public Ruta getRuta() {
		return ruta;
	}
	public Avion getAvion() {
		return avion;
	}
	
	public Collection<Tiquete> getTiquetes() {
		
		return null;
	}
	
	
}
