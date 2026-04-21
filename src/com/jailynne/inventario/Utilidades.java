package com.jailynne.inventario;

import java.util.Scanner;

/**
 * Clase de apoyo para lectura de datos desde consola.
 * Aquí se manejan validaciones básicas para evitar errores de entrada.
 */
public class Utilidades {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * Lee un número entero desde consola.
     * Si el usuario escribe algo inválido, se vuelve a solicitar el dato.
     */
    public static int leerEntero() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.print("Ingrese un número válido: ");
            }
        }
    }

    /**
     * Lee texto y elimina espacios sobrantes al inicio y al final.
     */
    public static String leerTexto() {
        return sc.nextLine().trim();
    }
}
