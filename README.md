# Sistema de Inventario de Bodega TI

**Integrantes:** Jailynne Acuña Corrales y Carlos Díaz  
**Lenguaje:** Java  
**Tipo:** Aplicación de consola  

## Descripción
El sistema carga el inventario con base en la información del archivo **Inventario_TI_Completo.xlsx** y permite:

- Consultar el inventario completo
- Buscar activos por categoría
- Buscar activos por estado
- Buscar activos por texto
- Ver resumen por categoría
- Ver resumen por estado
- Ver activos con observaciones
- Ver resumen general
- Ver categorías disponibles
- Ver estados disponibles

## Estructura del proyecto
- `Main.java`: punto de entrada del sistema
- `Menu.java`: muestra las opciones del programa
- `Activo.java`: representa cada registro del inventario
- `InventarioTI.java`: contiene la lógica de negocio y los datos
- `Reportes.java`: genera resúmenes e información agrupada
- `Utilidades.java`: lectura y validación básica desde consola

## Cómo compilar
Ubícate en la carpeta raíz del proyecto y ejecuta:

```bash
javac -d bin src/com/jailynne/inventario/*.java
```

## Cómo ejecutar
```bash
java -cp bin com.jailynne.inventario.Main
```

## Ejemplos de uso
- Opción 2: escribir `Laptops` para buscar por categoría.
- Opción 3: escribir `Bueno` para buscar por estado.
- Opción 4: escribir `Dell` para buscar por texto.
- Opción 7: ver activos que contienen observaciones importantes.

## Casos validados
- Si el usuario ingresa una opción inválida, el sistema lo indica.
- Si el usuario deja la búsqueda vacía, el sistema muestra un mensaje de validación.
- Si no existen coincidencias, el sistema informa que no hubo resultados.

## Integrantes
**Jailynne Acuña Corrales** y **Carlos Díaz**.

# Proyecto-Inventario

