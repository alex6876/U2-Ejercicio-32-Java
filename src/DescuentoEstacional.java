public class DescuentoEstacional implements PoliticaDescuento{

    @Override
    public double calcularDescuento(double montoOriginal) {
        if(montoOriginal <= 0){
            System.out.println("El monto tiene que ser mayor a 0");
            return 0;
        }
        return montoOriginal * 0.20;
    }
}
