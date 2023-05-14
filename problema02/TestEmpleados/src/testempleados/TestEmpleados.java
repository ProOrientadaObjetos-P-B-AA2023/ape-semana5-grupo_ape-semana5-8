
package testempleados;
import java.util.Scanner;
import testempleados.Empleado;
import testempleados.GestionEmpleados;

    public class TestEmpleados {
     public static void main(String[] args) {
        GestionEmpleados gestionEmpleados = new GestionEmpleados();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        while (true) {
            System.out.println("\n----- Menú -----");
            System.out.println("1. Agregar un empleado");
            System.out.println("2. Mostrar información de los empleados");
            if (!gestionEmpleados.PorcentajeRegistrado()) {
                System.out.println("3. Calcular aumento de salario");
            }
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    gestionEmpleados.agregarEmpleado();
                    break;
                case 2:
                    gestionEmpleados.mostrarInformacionEmpleados();
                    break;
                case 3:
                    if (!gestionEmpleados.PorcentajeRegistrado()) {
                        System.out.print("Ingrese el porcentaje de aumento salarial: ");
                        double porcentaje = scanner.nextDouble();
                        gestionEmpleados.calcularAumentoSalario(porcentaje);
                    } else {
                        System.out.println("El porcentaje de aumento salarial ya ha sido registrado.");
                    }
                    break;
                case 4:
                    gestionEmpleados.aplicarAumentoSalario();  // Aplicar los aumentos antes de salir
                    gestionEmpleados.mostrarInformacionEmpleados();  // Mostrar información de los empleados
                    System.out.println("¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }
}
