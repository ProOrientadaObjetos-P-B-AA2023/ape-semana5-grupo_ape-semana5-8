package problema01;

public class Venta {
    private int cantidad;
    private double precio;
    private double decuento;
    private double precioFinal;
    
    public Venta(){}

    public Venta(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //Calculos para el descuento y el precioFinal
    public void calcularDescuento(double porsentaje) {
        if(this.precio >= 1000 & this.cantidad >= 10){
            this.decuento = (this.precio * porsentaje); 
        }else{
            this.decuento = (this.precio * porsentaje);
        }   
    }
    public void calcularPrecioFinal() {
        this.precioFinal = this.precio - this.decuento;
    }
    
    public double getCantidad(){
        return this.cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public double getDecuento() {
        return decuento;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }
   
    public String toString() {
        String msj = String.format("        Datos de la Venta\n"
                +"=============================\n"
                +"%nNumero de Productos: %s"
                +"%nPrecio: %.2f"
                +"%nDescuento: %.2f"
                +"%nPresio Final: %.2f",this.getCantidad(), this.getPrecio(),this.getDecuento(),this.getPrecioFinal());
        return msj;
}
//Calculos para el descuento y el precioFinal
    public void calcularDescuento() {
        if(this.precio >= 1000 & this.cantidad >= 10){
            this.decuento = (this.precio * 0.1); 
        }else{
            this.decuento = (this.precio * 0.05);
}
}
}