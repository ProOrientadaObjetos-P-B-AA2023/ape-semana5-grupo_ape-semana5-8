package problema01;

import java.util.Scanner;

public class Problema01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precio=0, descuento;
        int cantidad;
        
        System.out.println("Ingrese la Cantidad de productos");
        cantidad = entrada.nextInt();
        System.out.println("");
        System.out.println("Ingrese el Precio de Cada Producto");
        double arr[] = new double[cantidad];
        int n=0;
        for(int i=0; i<arr.length;i++){
            System.out.print("Producto N "+(i+1)+": ");
            arr[i] = entrada.nextDouble();
            if(arr[i]>=1000){
                n++;
            }
           precio = arr[i]+ precio   ; 
        }
        
        if(n==10){
            descuento = 0.1;
            System.out.println("Usted tendra un Descuento del 10%");
        }else{
            descuento = 0.05;
            System.out.println("Usted tendra un Descuento del 5%");
        }
        
        System.out.println("");
        Venta venta1 = new Venta(precio,cantidad);
        venta1.calcularDescuento(descuento);
        venta1.calcularPrecioFinal();
        System.out.println(venta1);
}
}
