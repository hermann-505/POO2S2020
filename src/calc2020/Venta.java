package calc2020;

import java.util.Date;

/**
 * @author Armandol
 * @version 1.0
 * @created 02-oct.-2020 14:39:49
 */
public class Venta {

	private float cantidad;
	private int codMonedaDestino;
	private int codMonedaOrigen;
	private Date fecha;
        
	public Cartera wallet;

	public Venta(){

	}

	public void finalize() throws Throwable {

	}

	public float calcularConversion(){
           float monto;
           monto = this.wallet.calcularNetoCobrar(codMonedaOrigen, codMonedaDestino, cantidad);
           boolean capital;
           capital=this.wallet.verificarCapital(codMonedaOrigen,cantidad);
           
           if(capital==false)
               return 0.0f;
           else
               return monto;
           
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