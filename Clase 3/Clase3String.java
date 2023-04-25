public class Clase3String {
    public static void main(String[] args) {
        String palabra ="Programacion";
        int contador=0,posicion=0;
        char caracter ='o';
        posicion= palabra.indexOf(caracter);
        if (posicion !=-1){//si no encuentra el caracter 
            while (posicion != -1){
                contador++;
                posicion=palabra.indexOf(caracter,posicion+1);

            }
            System.out.println("Cantidad de apariciones de la letra "+caracter+ " son "+contador);
        }else
        System.out.println("No hay coincidencias");

    }
}
