package calc2020;

import javax.swing.JOptionPane;

/**
 * @author Armandol
 * @version 1.0
 * @created 02-oct.-2020 14:39:56
 */
public class Cartera {

	public Moneda cordoba,dolar,euro,peso=new Moneda(),colon=new Moneda();

	public Cartera(){
            cordoba=new Moneda();
            dolar=new Moneda();
            euro=new Moneda();
            
            euro.setCapital(100);
            euro.setTasaVentaCL(500);
            euro.setTasaVentaCS(40);
            euro.setTasaVentaDL(2);
            euro.setTasaVentaEU(1);
            euro.setTasaVentaPS(34);
            
            
            
            
	}

	public void finalize() throws Throwable {

	}

	public int actualizarCapital(){
		return 0;
	}

	public int agregarMoneda(){
		return 0;
	}

	public float calcularNetoCobrar(int codMonedaOrigen, int codMonedaDestino, float cantidad ){
		float tasaVenta=0.0f;
           switch(codMonedaOrigen){
               case 0: 
                      switch(codMonedaDestino){
                          case 0:
                                  tasaVenta=this.dolar.getTasaVentaDL();
                                  break;
                          case 1:
                                  tasaVenta=this.dolar.getTasaVentaEU();
                                  break;
                          case 2: 
                                  tasaVenta=this.dolar.getTasaVentaPS();
                                  break;
                          case 3:
                                  tasaVenta=this.dolar.getTasaVentaCL();
                                  break;
                          case 4:
                                  tasaVenta=this.dolar.getTasaVentaCS();
                                  break;
                      }
                      break;
                case 1: 
                      switch(codMonedaDestino){
                          case 0:
                                  tasaVenta=this.euro.getTasaVentaDL();
                                  break;
                          case 1:
                                  tasaVenta=this.euro.getTasaVentaEU();
                                  break;
                          case 2: 
                                  tasaVenta=this.euro.getTasaVentaPS();
                                  break;
                          case 3:
                                  tasaVenta=this.euro.getTasaVentaCL();
                                  break;
                          case 4:
                                  tasaVenta=this.euro.getTasaVentaCS();
                                  break;
                      }
                      break;
                case 2: 
                      switch(codMonedaDestino){
                          case 0:
                                  tasaVenta=this.peso.getTasaVentaDL();
                                  break;
                          case 1:
                                  tasaVenta=this.peso.getTasaVentaEU();
                                  break;
                          case 2: 
                                  tasaVenta=this.peso.getTasaVentaPS();
                                  break;
                          case 3:
                                  tasaVenta=this.peso.getTasaVentaCL();
                                  break;
                          case 4:
                                  tasaVenta=this.peso.getTasaVentaCS();
                                  break;
                      }
                      break;
                case 3: 
                      switch(codMonedaDestino){
                          case 0:
                                  tasaVenta=this.colon.getTasaVentaDL();
                                  break;
                          case 1:
                                  tasaVenta=this.colon.getTasaVentaEU();
                                  break;
                          case 2: 
                                  tasaVenta=this.colon.getTasaVentaPS();
                                  break;
                          case 3:
                                  tasaVenta=this.colon.getTasaVentaCL();
                                  break;
                          case 4:
                                  tasaVenta=this.colon.getTasaVentaCS();
                                  break;
                      }
                      break;
                case 4: 
                      switch(codMonedaDestino){
                          case 0:
                                  tasaVenta=this.cordoba.getTasaVentaDL();
                                  break;
                          case 1:
                                  tasaVenta=this.cordoba.getTasaVentaEU();
                                  break;
                          case 2: 
                                  tasaVenta=this.cordoba.getTasaVentaPS();
                                  break;
                          case 3:
                                  tasaVenta=this.cordoba.getTasaVentaCL();
                                  break;
                          case 4:
                                  tasaVenta=this.cordoba.getTasaVentaCS();
                                  break;
                      }
                default: tasaVenta=0;      
           }
           
            return tasaVenta*cantidad; 
         
	}

	public int elliminarMoneda(){
		return 0;
	}

	public int mostrarMoneda(){
		return 0;
	}

	public int mostrarTasas(){
		return 0;
	}

	public boolean verificarCapital(int moneda, float monto){
          boolean capital;
            switch(moneda){
              case 0: 
                  if(this.dolar.getCapital()>=monto)
                      capital=true;
                  else
                      capital= false;
                  break;
            case 1: 
                  if(this.euro.getCapital()>=monto)
                       capital=true;
                  else
                      capital= false;
                  break;
            case 2: 
                  if(this.peso.getCapital()>=monto)
                       capital=true;
                  else
                      capital= false;
                  break;
            case 3: 
                  if(this.colon.getCapital()>=monto)
                       capital=true;
                  else
                      capital= false;
                  break;
            case 4: 
                  if(this.cordoba.getCapital()>=monto)
                     capital=true;
                  else
                      capital= false;
                  break;
            default:
                 capital= false;
           }
           return capital;
            
	}

    public Moneda getCordoba() {
        return cordoba;
    }

    public void setCordoba(Moneda cordoba) {
        this.cordoba = cordoba;
    }

    public Moneda getDolar() {
        return dolar;
    }

    public void setDolar(Moneda dolar) {
        this.dolar = dolar;
    }

    public Moneda getEuro() {
        return euro;
    }

    public void setEuro(Moneda euro) {
        this.euro = euro;
    }

    public Moneda getPeso() {
        return peso;
    }

    public void setPeso(Moneda peso) {
        this.peso = peso;
    }

    public Moneda getColon() {
        return colon;
    }

    public void setColon(Moneda colon) {
        this.colon = colon;
    }
        
        

}