package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.*;
import uniandes.dpoo.aerolinea.modelo.cliente.*;
public class Tiquete {

	private String codigo;
	private int tarifa;
	private boolean usado;
	private Vuelo vuelo;
	private Cliente cliente;
	public Tiquete(String codigo, Vuelo vuelo, Cliente cliente, int tarifa) {
		this.codigo = codigo;
		this.tarifa = tarifa;
		this.vuelo = vuelo;
		this.cliente = cliente;
	}
	public String getCodigo() {
		return codigo;
	}
	public int getTarifa() {
		return tarifa;
	}
	public Vuelo getVuelo() {
		return vuelo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void marcarComoUsado() {
		usado = true;
	}
	
	public boolean esUsado() {
		return usado;
	}
	
	
}
