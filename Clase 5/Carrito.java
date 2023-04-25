import java.util.*;

public class Carrito {
    private List<ItemCarrito> items=new ArrayList<>();
        public void addItem(ItemCarrito item){
            items.add(item);
        }
        public double getPrecio(){
            double precio=0;
            for(ItemCarrito item : items){
                precio+=item.getPrecio();
            }
            return precio;
        }
}

