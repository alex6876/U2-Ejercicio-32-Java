public class DescuentoVolumen implements PoliticaDescuento{

    @Override
    public double calcularDescuento(double montoOriginal) {
        if(montoOriginal <= 0){
            System.out.println("El monot tiene que ser mayor a 0.");
            return 0;
        }

        if(montoOriginal >= 50000){
            return montoOriginal * 0.15;
        }else {
            return 0;
        }
    }
}
