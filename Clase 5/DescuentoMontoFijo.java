public class DescuentoMontoFijo extends Descuento {
    public DescuentoMontoFijo(String descripcion, double valor ){
        super(descripcion,valor);
    }
    @Override
    public double calcularDescuento (double precio ){
        return Math.min(precio,getValor());
    }
    
}
