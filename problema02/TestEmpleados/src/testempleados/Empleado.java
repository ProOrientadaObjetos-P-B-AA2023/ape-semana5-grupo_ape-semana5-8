
package testempleados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empleado {
    private String nombre;
    private double salario;
    private int edad;

    public Empleado(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s | Salario: $%.2f | Edad: %d", nombre, salario, edad);
    }
}


    class GestionEmpleados {
    private List<Empleado> empleados;
    private double salarioPromedio;
    private double porcentajeAumento;
    private boolean porcentajeRegistrado;

    public GestionEmpleados() {
        empleados = new ArrayList<>();
    }

  public void agregarEmpleado() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el nombre del empleado: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese el salario del empleado: ");
    double salario = scanner.nextDouble();
    System.out.print("Ingrese la edad del empleado: ");
    int edad = scanner.nextInt();

    Empleado empleado = new Empleado(nombre, salario, edad);
    empleados.add(empleado);

    // Recalcular el salario promedio
    double sumaSalarios = 0;
    for (Empleado emp : empleados) {
        sumaSalarios += emp.getSalario();
    }
    salarioPromedio = sumaSalarios / empleados.size();

    System.out.println("Empleado agregado exitosamente.");
}


    public void mostrarInformacionEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("----- Información de Empleados -----");
            for (Empleado empleado : empleados) {
                System.out.println(empleado.toString());
            }
        }
    }

    public void calcularAumentoSalario(double porcentajeAumento) {
        this.porcentajeAumento = porcentajeAumento;
        this.porcentajeRegistrado = true;
        System.out.println("Se ha registrado el porcentaje de aumento salarial.");
    }

    // ...

    public boolean PorcentajeRegistrado() {
        return porcentajeRegistrado;
    }

    public void aplicarAumentoSalario() {
    if (empleados.isEmpty()) {
        System.out.println("No hay empleados registrados.");
        return;
    }

    double salarioPromedio = calcularSalarioPromedio();

    for (Empleado empleado : empleados) {
        if (empleado.getSalario() < salarioPromedio) {
            double aumento = empleado.getSalario() * (porcentajeAumento / 100);
            double nuevoSalario = empleado.getSalario() + aumento;
            empleado.setSalario(nuevoSalario);
        }
    }

    System.out.println("Se han calculado los aumentos salariales correctamente.");
}


            


    private double calcularSalarioPromedio() {
        double totalSalarios = 0;
        for (Empleado empleado : empleados) {
            totalSalarios += empleado.getSalario();
        }
        return totalSalarios / empleados.size();
    }
}

   

