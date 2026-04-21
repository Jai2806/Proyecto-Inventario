package com.jailynne.inventario;

/**
 * Clase que representa un activo individual dentro del inventario de bodega TI.
 *
 * <p>Aquí se almacena la información principal de cada registro: categoría,
 * cantidad, descripción, marca/modelo, estado y observaciones.</p>
 */
public class Activo {
    private final String categoria;
    private final int cantidad;
    private final String descripcion;
    private final String marcaModelo;
    private final String estado;
    private final String observaciones;

    /**
     * Constructor del activo.
     * Aquí se realiza la creación de cada registro cargado en el inventario.
     */
    public Activo(String categoria, int cantidad, String descripcion, String marcaModelo, String estado, String observaciones) {
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.marcaModelo = marcaModelo;
        this.estado = estado;
        this.observaciones = observaciones;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getMarcaModelo() {
        return marcaModelo;
    }

    public String getEstado() {
        return estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Valida si el activo tiene observaciones registradas.
     */
    public boolean tieneObservaciones() {
        return observaciones != null && !observaciones.isBlank();
    }

    /**
     * Permite realizar una búsqueda general en varios campos del activo.
     * Aquí se compara el texto ingresado con categoría, descripción, marca,
     * estado y observaciones.
     */
    public boolean contieneTexto(String texto) {
        String criterio = texto.toLowerCase();
        return categoria.toLowerCase().contains(criterio)
                || descripcion.toLowerCase().contains(criterio)
                || marcaModelo.toLowerCase().contains(criterio)
                || estado.toLowerCase().contains(criterio)
                || observaciones.toLowerCase().contains(criterio);
    }

    /**
     * Convierte el objeto a un formato legible para mostrarlo en consola.
     */
    @Override
    public String toString() {
        return String.format(
                "Categoría: %-14s | Cantidad: %-3d | Descripción: %-45s | Marca/Modelo: %-18s | Estado: %-15s | Observaciones: %s",
                categoria, cantidad, descripcion, marcaModelo, estado, observaciones.isBlank() ? "-" : observaciones
        );
    }
}
