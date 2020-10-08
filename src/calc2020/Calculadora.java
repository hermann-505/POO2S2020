package calc2020;

import gui.Aplicacion;

/**
 * @author Armandol
 * @version 1.0
 * @created 02-oct.-2020 14:39:52
 */
public class Calculadora {

	private String nombre;
	private float version;
        
	public Cartera wallet = new Cartera();
        
	public Venta ventas [] = new Venta[10];
	public Compra compras [] = new Compra[10];
	
        public Aplicacion aplic;

	public Calculadora(){

	}

	public void finalize() throws Throwable {

	}

	public int agregarMoneda(){
		return 0;
	}

	public int crearCompra(){
		return 0;
	}

	public int crearVenta(){
		return 0;
	}

	public int eliminarCompra(){
		return 0;
	}

	public int eliminarMoneda(){
		return 0;
	}

	public int eliminarVenta(){
		return 0;
	}

	public int mostrarCapital(){
		return 0;
	}

	public int mostrarCompra(){
		return 0;
	}

	public int mostrarMoneda(){
		return 0;
	}

	public void mostrarVenta(){
           
	}

	public int realizarCompra(){
		return 0;
	}

	public float realizarVenta(int monedaOrigen, int monedaDestino, float cant){
             this.ventas[0]=new Venta();
             this.ventas[0].setWallet(wallet);
             
             this.ventas[0].setCodMonedaOrigen(monedaOrigen);
             this.ventas[0].setCodMonedaDestino(monedaDestino);
             this.ventas[0].setCantidad(cant);
             
             float monto;
             monto= this.ventas[0].calcularConversion();
             
            return monto;
             
             
	}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getVersion() {
        return version;
    }

    public void setVersion(float version) {
        this.version = version;
    }

    public Cartera getWallet() {
        return wallet;
    }

    public void setWallet(Cartera wallet) {
        this.wallet = wallet;
    }

    public Aplicacion getAplic() {
        return aplic;
    }

    public void setAplic(Aplicacion aplic) {
        this.aplic = aplic;
    }
        
        

}