package uniandes.dpoo.aerolinea.modelo.cliente;
import uniandes.dpoo.aerolinea.tiquetes.*;
import uniandes.dpoo.aerolinea.modelo.*;

import java.util.List;

public abstract class Cliente {

	
	
	private List<Tiquete> tiquetesSinUsar;
	private List<Tiquete> tiquetesUsados;
	public Cliente () {
		
	}
	
	public abstract String getTipoCliente () ;
	
	public abstract String getIdentificador();
	
	public void agregarTiquete(Tiquete tiquete) {
		tiquetesSinUsar.add(tiquete);
		
	}
	public int calcularValorTotalTiquetes() {
		
		return -1;
	}
	public void usarTiquetes(Vuelo vuelo) {
		
	}
	
	
}
