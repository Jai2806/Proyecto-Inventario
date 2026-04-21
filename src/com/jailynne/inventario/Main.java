// Clase principal del sistema de inventario TI
package com.jailynne.inventario;

/**
 * Punto de entrada del sistema.
 * Aquí se controla el flujo principal del menú y se llama cada funcionalidad
 * según la opción que el usuario seleccione.
 */
/**
 * Trabajo realizado por Jailynne Acuña Corrales y Carlos Díaz.
 */
public class Main {

    public static void main(String[] args) {
        int opcion;

        // El sistema se mantiene en ejecución hasta que el usuario elija salir.
        do {
            Menu.mostrar();
            opcion = Utilidades.leerEntero();

            // Aquí se evalúa la opción seleccionada y se dirige al módulo correspondiente.
            switch (opcion) {
                case 1:
                    // Consulta completa del inventario.
                    InventarioTI.verInventarioCompleto();
                    break;
                case 2:
                    // Búsqueda de activos por categoría.
                    System.out.print("Ingrese la categoría: ");
                    InventarioTI.buscarPorCategoria(Utilidades.leerTexto());
                    break;
                case 3:
                    // Búsqueda de activos por estado.
                    System.out.print("Ingrese el estado: ");
                    InventarioTI.buscarPorEstado(Utilidades.leerTexto());
                    break;
                case 4:
                    // Búsqueda libre usando texto en varios campos del inventario.
                    System.out.print("Ingrese el texto a buscar: ");
                    InventarioTI.buscarPorTexto(Utilidades.leerTexto());
                    break;
                case 5:
                    // Genera un resumen agrupado por categoría.
                    Reportes.mostrarResumenPorCategoria();
                    break;
                case 6:
                    // Genera un resumen agrupado por estado.
                    Reportes.mostrarResumenPorEstado();
                    break;
                case 7:
                    // Lista únicamente los activos que tienen observaciones.
                    Reportes.mostrarActivosConObservaciones();
                    break;
                case 8:
                    // Muestra un resumen general del inventario.
                    Reportes.mostrarResumenGeneral();
                    break;
                case 9:
                    // Extra: muestra las categorías disponibles para facilitar búsquedas.
                    Reportes.mostrarCategoriasDisponibles();
                    break;
                case 10:
                    // Extra: muestra los estados disponibles para facilitar búsquedas.
                    Reportes.mostrarEstadosDisponibles();
                    break;
                case 0:
                    System.out.println("Sistema finalizado.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }
}
