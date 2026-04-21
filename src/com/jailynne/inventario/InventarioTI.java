package com.jailynne.inventario;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Clase principal de lógica del inventario.
 *
 * <p>Aquí se hace la carga inicial de los datos y se concentran los métodos de
 * consulta, búsqueda, validación y resumen del sistema.</p>
 */
public class InventarioTI {

    // Lista principal donde se almacenan todos los activos del inventario.
    private static final List<Activo> activos = new ArrayList<>();

    static {
        // Aquí se realiza la inserción manual de la información del inventario.
        // Los datos fueron adaptados a partir del archivo Excel proporcionado.
        activos.add(new Activo("Monitores", 1, "Monitor", "Dell", "Dañado***", ""));
        activos.add(new Activo("Monitores", 14, "Monitor", "Marcas mixtas", "Bueno", ""));
        activos.add(new Activo("Monitores", 4, "Monitor", "Dell", "Nuevo", ""));
        activos.add(new Activo("Monitores", 6, "Monitor Qflow", "HP", "Bueno", ""));
        activos.add(new Activo("Monitores", 1, "Monitor", "HP", "Bueno", ""));
        activos.add(new Activo("Desktop", 3, "Desktop 5090", "Dell", "Bueno", "CRP"));
        activos.add(new Activo("Desktop", 4, "Desktop Elite 600", "HP", "Bueno", "CRP"));
        activos.add(new Activo("Desktop", 1, "Desktop 3060", "Dell", "Bueno", ""));
        activos.add(new Activo("Desktop", 12, "PCs CRP y cargadores hay cajas cerradas con cargadores", "HP / Dell", "Bueno", "Equipo del área CRP"));
        activos.add(new Activo("Desktop", 3, "PCs ING y cargadores", "Dell", "Bueno", "Equipos del área Ing"));
        activos.add(new Activo("Desktop", 3, "PC Gamer", "Sin especificar", "Dañado***", ""));
        activos.add(new Activo("Desktop", 1, "PC", "Samsung", "Diagnóstico", "Equipo en caja"));
        activos.add(new Activo("Laptops", 14, "Laptop 3410", "Dell", "Sin especificar", ""));
        activos.add(new Activo("Laptops", 10, "Laptop 3420", "Dell", "Sin especificar", ""));
        activos.add(new Activo("Laptops", 1, "Laptop 3440", "Dell", "Sin especificar", ""));
        activos.add(new Activo("Laptops", 1, "Laptop G10", "HP", "Usado", "Asignada a Celso"));
        activos.add(new Activo("Laptops", 1, "Laptop 5510", "HP", "Usado", ""));
        activos.add(new Activo("Proyector", 1, "Proyector PowerLite", "Epson", "Bueno", ""));
        activos.add(new Activo("Proyector", 1, "Proyector PowerLite", "Epson", "Usado", "Equipo viejo"));
        activos.add(new Activo("Periféricos", 6, "Teclado", "HP", "Nuevo", ""));
        activos.add(new Activo("Periféricos", 13, "Base negra", "Dell", "Bueno", ""));
        activos.add(new Activo("Periféricos", 8, "Candado de seguridad", "HP", "Bueno", ""));
        activos.add(new Activo("Periféricos", 1, "Docking", "HP", "Nuevo", ""));
        activos.add(new Activo("Periféricos", 1, "Biométrico", "Sin especificar", "Bueno", ""));
        activos.add(new Activo("Componentes", 2, "Memoria RAM 16 GB", "Hynix", "Nuevo", ""));
        activos.add(new Activo("Componentes", 4, "Disco 500 GB", "Kingston", "Nuevo", "SSD"));
        activos.add(new Activo("Red", 1, "Módem", "Sin especificar", "Nuevo", ""));
        activos.add(new Activo("Red", 1, "Switch Ing", "Cisco", "Bueno", ""));
        activos.add(new Activo("Herramientas", 1, "Multímetro", "Sin especificar", "Bueno", ""));
        activos.add(new Activo("Validación", 7, "Validadora", "Sin especificar", "Nuevo", ""));
        activos.add(new Activo("Validación", 1, "Validadora", "Sin especificar", "Usado", ""));
        activos.add(new Activo("Cajas", 1, "Caja con cables variados", "Sin especificar", "Bueno", ""));
        activos.add(new Activo("Cajas", 1, "Caja tapa celeste", "Sin especificar", "Bueno", "Cables de corriente"));
        activos.add(new Activo("Cajas", 1, "Caja tapa verde pequeña", "Sin especificar", "Bueno", "Cables de red"));
        activos.add(new Activo("Cajas", 1, "Caja con cables Display y cargadores Lenovo", "Sin especificar", "Usado", ""));
        activos.add(new Activo("Cajas", 1, "Caja con repuestos Dell", "Sin especificar", "Nuevo", "Repuestos varios"));
        activos.add(new Activo("Suministros", 1, "Caja hojas blancas", "Sin especificar", "Nuevo", "6 blocks"));
    }

    public static List<Activo> getActivos() {
        return activos;
    }

    /**
     * Muestra el inventario completo con enumeración, total de registros y total de unidades.
     */
    public static void verInventarioCompleto() {
        System.out.println("\n========== INVENTARIO GENERAL DE TI ==========");
        for (int i = 0; i < activos.size(); i++) {
            System.out.printf("%02d. %s%n", i + 1, activos.get(i));
        }
        System.out.println("Total de registros: " + activos.size());
        System.out.println("Total de unidades: " + obtenerTotalUnidades());
    }

    /**
     * Busca activos por categoría. La búsqueda es parcial para facilitar la consulta.
     */
    public static void buscarPorCategoria(String categoria) {
        System.out.println("\n========== BÚSQUEDA POR CATEGORÍA ==========");

        if (!esTextoValido(categoria)) {
            System.out.println("Debe ingresar una categoría válida.");
            return;
        }

        boolean encontrado = false;
        String criterio = categoria.trim().toLowerCase();

        for (Activo activo : activos) {
            // Aquí se compara la categoría ingresada con la categoría de cada activo.
            if (activo.getCategoria().toLowerCase().contains(criterio)) {
                System.out.println(activo);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron registros para la categoría: " + categoria);
            System.out.println("Categorías disponibles: " + obtenerCategoriasDisponibles());
        }
    }

    /**
     * Busca activos por estado. También permite coincidencia parcial.
     */
    public static void buscarPorEstado(String estado) {
        System.out.println("\n========== BÚSQUEDA POR ESTADO ==========");

        if (!esTextoValido(estado)) {
            System.out.println("Debe ingresar un estado válido.");
            return;
        }

        boolean encontrado = false;
        String criterio = estado.trim().toLowerCase();

        for (Activo activo : activos) {
            // Aquí se filtran los activos que coinciden con el estado solicitado.
            if (activo.getEstado().toLowerCase().contains(criterio)) {
                System.out.println(activo);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron registros para el estado: " + estado);
            System.out.println("Estados disponibles: " + obtenerEstadosDisponibles());
        }
    }

    /**
     * Realiza una búsqueda libre en varios campos del activo.
     */
    public static void buscarPorTexto(String texto) {
        System.out.println("\n========== BÚSQUEDA GENERAL ==========");

        if (!esTextoValido(texto)) {
            System.out.println("Debe ingresar un texto válido para buscar.");
            return;
        }

        boolean encontrado = false;
        for (Activo activo : activos) {
            // Aquí se reutiliza el método contieneTexto de la clase Activo.
            if (activo.contieneTexto(texto)) {
                System.out.println(activo);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron registros con el criterio ingresado.");
        }
    }

    /**
     * Suma todas las cantidades de la lista para obtener el total de unidades.
     */
    public static int obtenerTotalUnidades() {
        int total = 0;
        for (Activo activo : activos) {
            total += activo.getCantidad();
        }
        return total;
    }

    /**
     * Agrupa las cantidades por categoría utilizando Map.
     */
    public static Map<String, Integer> resumenPorCategoria() {
        Map<String, Integer> resumen = new LinkedHashMap<>();
        for (Activo activo : activos) {
            resumen.put(activo.getCategoria(),
                    resumen.getOrDefault(activo.getCategoria(), 0) + activo.getCantidad());
        }
        return resumen;
    }

    /**
     * Agrupa las cantidades por estado utilizando Map.
     */
    public static Map<String, Integer> resumenPorEstado() {
        Map<String, Integer> resumen = new LinkedHashMap<>();
        for (Activo activo : activos) {
            resumen.put(activo.getEstado(),
                    resumen.getOrDefault(activo.getEstado(), 0) + activo.getCantidad());
        }
        return resumen;
    }

    /**
     * Retorna solo los activos que tienen observaciones registradas.
     */
    public static List<Activo> activosConObservaciones() {
        List<Activo> lista = new ArrayList<>();
        for (Activo activo : activos) {
            if (activo.tieneObservaciones()) {
                lista.add(activo);
            }
        }
        return lista;
    }

    /**
     * Extra 1: obtiene las categorías disponibles en el sistema.
     */
    public static Set<String> obtenerCategoriasDisponibles() {
        Set<String> categorias = new LinkedHashSet<>();
        for (Activo activo : activos) {
            categorias.add(activo.getCategoria());
        }
        return categorias;
    }

    /**
     * Extra 2: obtiene los estados disponibles en el sistema.
     */
    public static Set<String> obtenerEstadosDisponibles() {
        Set<String> estados = new LinkedHashSet<>();
        for (Activo activo : activos) {
            estados.add(activo.getEstado());
        }
        return estados;
    }

    /**
     * Valida que el texto no venga nulo ni vacío.
     */
    private static boolean esTextoValido(String texto) {
        return texto != null && !texto.isBlank();
    }
}
