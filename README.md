# 🏷️ Simulación de Cálculo de Precios y Políticas de Descuento (Patrón Strategy e Interfaces en Java)

Este proyecto es una aplicación en Java que modela un sistema flexible para calcular precios finales aplicando distintas reglas comerciales o descuentos (Lealtad, Estacional y por Volumen). Pone en práctica conceptos avanzados de la **Programación Orientada a Objetos (POO)** como **interfaces**, **polimorfismo** y el **Patrón de Comportamiento Strategy** en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se compone de un contrato contractual por interfaz y múltiples implementaciones concretas:

*   **`PoliticaDescuento` (Interfaz)**: Define el contrato genérico que toda regla de descuento debe cumplir mediante el método `calcularDescuento(double montoOriginal)`.
*   **`DescuentoLealtad`**: Modela una bonificación fija del **10%** basada en la fidelidad del cliente, aplicando una validación previa para montos mayores a cero.
*   **`DescuentoEstacional`**: Modela una promoción temporal o estacional que aplica un **20%** de descuento sobre el monto original.
*   **`DescuentoVolumen`**: Modela un descuento por compras mayoristas del **15%**, condicionado a que el monto supere un umbral mínimo ($50,000$).
*   **`CalculadoraPrecios`**: Actúa como el contexto o invocador principal que procesa el valor final a pagar.
    *   **Atributos:** Mantiene una referencia a la interfaz `PoliticaDescuento`.
    *   **Métodos principales:** `calcularPrecioFinal(double montoOriginal)`, invoca la estrategia activa de descuento y resta el monto bonificado al valor original.
*   **`Main`**: Punto de entrada del programa. Instancia las distintas políticas de descuento, configura la calculadora intercambiando dinámicamente las estrategias y muestra el desglose del ahorro y precio final por consola.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Validación Defensiva de Montos:** Todas las clases concretas validan al inicio que el `montoOriginal` sea mayor estricto a cero (`montoOriginal <= 0`). Si no se cumple, imprimen un mensaje de error y retornan cero de descuento.
2. **Condicional de Umbral por Volumen:** La clase `DescuentoVolumen` añade una regla adicional de negocio, evaluando si el total de la compra alcanza o supera los $50,000 para habilitar la bonificación por cantidad.
3. **Intercambiabilidad Dinámica (Patrón Strategy):** La `CalculadoraPrecios` puede reutilizarse con diferentes algoritmos de descuento sin alterar su estructura interna, simplemente reasignando la estrategia en tiempo de ejecución.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
Descuento por lealtad: $10000.0
Precio final: $90000.0
----------------------
Descuento estacional: $20000.0
Precio final: $80000.0
----------------------
Descuento por volumen: $15000.0
Precio final: $85000.0
