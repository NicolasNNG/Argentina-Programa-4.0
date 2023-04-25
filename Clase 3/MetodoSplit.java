public class MetodoSplit {
    public static void main(String[] args) {
    String nombres="juan-Pedro-Mounir-Pepe-Yamila-Nicolas-Mariano-Daniel-Marcelo-Cristian";
    String nombresSplit[]=nombres.split("-");
    for(String elemento:nombresSplit){
        System.out.println(elemento);
        }    
    }
    
}
