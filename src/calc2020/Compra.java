package calc2020;

import java.util.Date;

/**
 * @author Armandol
 * @version 1.0
 * @created 02-oct.-2020 14:39:45
 */
public class Compra {

	private float cantidad;
	private int codMonedaDestino;
	private int codMonedaOrigen;
	private Date fecha;
        
	public Cartera wallet;

	public Compra(){

	}

	public void finalize() throws Throwable {

	}

	public int calcularConversion(){
		return 0;
	}

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodMonedaDestino() {
        return codMonedaDestino;
    }

    public void setCodMonedaDestino(int codMonedaDestino) {
        this.codMonedaDestino = codMonedaDestino;
    }

    public int getCodMonedaOrigen() {
        return codMonedaOrigen;
    }

    public void setCodMonedaOrigen(int codMonedaOrigen) {
        this.codMonedaOrigen = codMonedaOrigen;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cartera getWallet() {
        return wallet;
    }

    public void setWallet(Cartera wallet) {
        this.wallet = wallet;
    }
        
        

}