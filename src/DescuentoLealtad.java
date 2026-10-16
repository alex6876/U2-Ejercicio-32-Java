public class DescuentoLealtad implements PoliticaDescuento{

    @Override
    public double calcularDescuento(double montoOriginal) {
        if(montoOriginal <= 0){
            System.out.println("El monto debe ser mayor a 0.");
            return 0;
        }

        return montoOriginal * 0.10;
    }
}
