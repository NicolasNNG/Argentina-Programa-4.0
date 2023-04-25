import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import javax.swing.JOptionPane;

public class ClasePrincipal {
    public static void main(String[] args) {

        String archivo = "items.csv";
        String separador = ",";
        List<ItemCarrito> items = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(separador);
                int cantidad = Integer.parseInt(campos[0]);
                double precio = Double.parseDouble(campos[1]);
                String nombre = campos[2];
                Producto producto = new Producto(nombre, precio);
                ItemCarrito item = new ItemCarrito(producto, cantidad);
                items.add(item);
            }
            String listaProductos = "Productos disponibles:\n";
            for (ItemCarrito item : items) {
                listaProductos += item.getCantidad()+"- " + item.getProducto().getNombre() + "\n";
            }
            JOptionPane.showMessageDialog(null, listaProductos);



           
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            System.exit(1);
        }
        Carrito carrito = new Carrito();
        for (ItemCarrito item : items) {
            carrito.addItem(item);
        }
        JOptionPane.showMessageDialog(null, "Precio total del carrito: " + carrito.getPrecio());

    }

}
