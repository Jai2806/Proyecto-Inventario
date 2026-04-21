package com.jailynne.inventario;

/**
 * Clase encargada de mostrar el menú principal del sistema.
 */
public class Menu {

    public static void mostrar() {
        System.out.println("\n==================================================");
        System.out.println("   SISTEMA DE INVENTARIO DE BODEGA TI");
        System.out.println("==================================================");
        System.out.println("1. Ver inventario completo");
        System.out.println("2. Buscar por categoría");
        System.out.println("3. Buscar por estado");
        System.out.println("4. Buscar por texto");
        System.out.println("5. Ver resumen por categoría");
        System.out.println("6. Ver resumen por estado");
        System.out.println("7. Ver activos con observaciones");
        System.out.println("8. Ver resumen general");
        System.out.println("9. Ver categorías disponibles");
        System.out.println("10. Ver estados disponibles");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }
}
