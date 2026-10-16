
public class Main {

    public static void main(String[] args) {

        double monto = 100000;

        PoliticaDescuento lealtad = new DescuentoLealtad();
        PoliticaDescuento estacional = new DescuentoEstacional();
        PoliticaDescuento volumen = new DescuentoVolumen();

        CalculadoraPrecios calculadora;

        // Descuento por lealtad
        calculadora = new CalculadoraPrecios(lealtad);
        double ahorroLealtad = lealtad.calcularDescuento(monto);
        double finalLealtad = calculadora.calcularPrecioFinal(monto);

        System.out.println("Descuento por lealtad: $" + ahorroLealtad);
        System.out.println("Precio final: $" + finalLealtad);

        System.out.println("----------------------");

        // Descuento estacional
        calculadora = new CalculadoraPrecios(estacional);
        double ahorroEstacional = estacional.calcularDescuento(monto);
        double finalEstacional = calculadora.calcularPrecioFinal(monto);

        System.out.println("Descuento estacional: $" + ahorroEstacional);
        System.out.println("Precio final: $" + finalEstacional);

        System.out.println("----------------------");

        // Descuento por volumen
        calculadora = new CalculadoraPrecios(volumen);
        double ahorroVolumen = volumen.calcularDescuento(monto);
        double finalVolumen = calculadora.calcularPrecioFinal(monto);

        System.out.println("Descuento por volumen: $" + ahorroVolumen);
        System.out.println("Precio final: $" + finalVolumen);
    }
}
