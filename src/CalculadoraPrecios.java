public class CalculadoraPrecios {
    PoliticaDescuento politica;

    public CalculadoraPrecios(PoliticaDescuento politica) {
        this.politica = politica;
    }

    public double calcularPrecioFinal(double montoOriginal) {
        double descuento = politica.calcularDescuento(montoOriginal);
        return montoOriginal - descuento;
    }
}
