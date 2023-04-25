
public abstract class Descuento {
    private String descripcion;
    private double valor;
    public Descuento(String descripcion ,double valor){
        this.descripcion=descripcion;
        this.valor=valor;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public double getValor(){
        return valor;
    }
    
    public abstract double calcularDescuento(double precio );
    }


