package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.*;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
public abstract class  CalculadoraTarifas {

	public double IMPUESTO = 0.28 ;
	
	public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
		return -1;
	}
	protected int calcularCostoBase(Vuelo vuelo,Cliente cliente ) {
		return -1;
	}
	protected double calcularPorcenajeDescuento(Cliente cliente) {
		return -1;
	}
	protected int calcularDistanciaVuelo(Ruta ruta) {
		return -1;
	}
	protected int calcularValorImpuestos(int costoBase) {
		return -1;
	}
	
	
	
	
}
