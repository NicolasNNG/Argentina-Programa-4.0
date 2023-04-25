public class DescuentoPorcentaje extends Descuento {
    public DescuentoPorcentaje(String descripcion, double valor){
    super(descripcion,valor);
    }
    @Override
    public double calcularDescuento(double precio){
        return precio*getValor()  / 100;   
    }
}


