package problema01;

import java.util.Scanner;

public class Problema01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precio,suma = 0;
        int cantidad;
        
        System.out.println("Ingrese la Cantidad de productos");
        cantidad = entrada.nextInt();
        System.out.println("");
        System.out.println("Ingrese el Precio de Cada Producto");
        
        for(int i=0; i<cantidad;i++){
            System.out.print("Producto N "+(i+1)+": ");
            precio = entrada.nextInt();
            suma = precio+suma;
        }
        
        System.out.println("");
        Venta venta1 = new Venta(suma,cantidad);
        venta1.calcularDescuento();
        venta1.calcularPrecioFinal();
        System.out.println(venta1);
}

}
