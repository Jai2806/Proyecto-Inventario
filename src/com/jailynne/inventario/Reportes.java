package com.jailynne.inventario;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Clase encargada de generar reportes y resúmenes del inventario.
 */
public class Reportes {

    /**
     * Muestra el total de unidades agrupadas por categoría.
     */
    public static void mostrarResumenPorCategoria() {
        System.out.println("\n========== RESUMEN POR CATEGORÍA ==========");
        Map<String, Integer> resumen = InventarioTI.resumenPorCategoria();

        for (Map.Entry<String, Integer> entrada : resumen.entrySet()) {
            System.out.printf("%-15s : %d unidades%n", entrada.getKey(), entrada.getValue());
        }

        System.out.println("--------------------------------------------");
        System.out.println("Total general     : " + InventarioTI.obtenerTotalUnidades() + " unidades");
    }

    /**
     * Muestra el total de unidades agrupadas por estado.
     */
    public static void mostrarResumenPorEstado() {
        System.out.println("\n========== RESUMEN POR ESTADO ==========");
        Map<String, Integer> resumen = InventarioTI.resumenPorEstado();

        for (Map.Entry<String, Integer> entrada : resumen.entrySet()) {
            System.out.printf("%-15s : %d unidades%n", entrada.getKey(), entrada.getValue());
        }
    }

    /**
     * Lista únicamente los activos que tienen observaciones.
     */
    public static void mostrarActivosConObservaciones() {
        System.out.println("\n========== ACTIVOS CON OBSERVACIONES ==========");
        List<Activo> lista = InventarioTI.activosConObservaciones();

        if (lista.isEmpty()) {
            System.out.println("No hay activos con observaciones registradas.");
            return;
        }

        for (Activo activo : lista) {
            System.out.println(activo);
        }
    }

    /**
     * Muestra un resumen general del sistema.
     */
    public static void mostrarResumenGeneral() {
        System.out.println("\n========== RESUMEN GENERAL ==========");
        System.out.println("Responsables del proyecto : Jailynne Acuña Corrales y Carlos Díaz");
        System.out.println("Registros cargados        : " + InventarioTI.getActivos().size());
        System.out.println("Unidades totales          : " + InventarioTI.obtenerTotalUnidades());
    }

    /**
     * Extra: imprime las categorías existentes para ayudar al usuario.
     */
    public static void mostrarCategoriasDisponibles() {
        System.out.println("\n========== CATEGORÍAS DISPONIBLES ==========");
        Set<String> categorias = InventarioTI.obtenerCategoriasDisponibles();
        for (String categoria : categorias) {
            System.out.println("- " + categoria);
        }
    }

    /**
     * Extra: imprime los estados existentes para ayudar al usuario.
     */
    public static void mostrarEstadosDisponibles() {
        System.out.println("\n========== ESTADOS DISPONIBLES ==========");
        Set<String> estados = InventarioTI.obtenerEstadosDisponibles();
        for (String estado : estados) {
            System.out.println("- " + estado);
        }
    }
}
