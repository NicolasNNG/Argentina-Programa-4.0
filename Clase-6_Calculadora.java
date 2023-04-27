import java.io.IOException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        double num1,num2,resultado;
        int opcion;
        do{
            System.out.println("\nCalculadora Arimetica");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija una opción");
            
            opcion=entrada.nextInt();
            switch(opcion){
                case 1:
                    System.out.print("Ingrese un Número : ");
                    num1=entrada.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2=entrada.nextDouble();
                    resultado=num1+num2;
                    System.out.println("La Suma es : "+ resultado);    
                    System.out.println("\nPrecione Enter  para continuar...");
                    try{
                        System.in.read();    
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.print("Ingrese un Número: ");
                    num1=entrada.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2=entrada.nextDouble();
                    resultado=num1-num2;
                    System.out.println("La Resta es: "+ resultado);
                    System.out.println("\nPrecione Enter  para continuar...");
                    try{
                        System.in.read();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.print("Ingrese un Número: ");
                    num1=entrada.nextDouble();
                    System.out.print("Ingrese el segundo Número: ");
                    num2=entrada.nextDouble();
                    resultado=num1*num2;
                    System.out.println("La Multiplicación es: "+ resultado);
                    System.out.println("\n Precione Enter para continuar...");
                    try{
                        System.in.read();
                    }catch (IOException e ){
                        e.printStackTrace();
                    }
                
                    break;
                case 4:
                    System.out.print("Ingrese un Número: ");
                    num1=entrada.nextDouble();
                    System.out.print("Ingrese el  segundo Número: ");
                    num2=entrada.nextDouble();
                    resultado=num1/num2;
                    System.out.println("La Divicion es: "+ resultado);
                    System.out.println("\n Precione Enter para continuar...");
                    try{
                        System.in.read();
                    }catch (IOException e ){
                        e.printStackTrace();
                    }
                        
                    break;
                case 5:
                    System.out.println("Hasta luego...");
                break;
                default:
                    System.out.println("Opcion invalida!");
            }

        }while (opcion !=5);
            entrada.close();
    }
    public static  double  sumar(double num1 , double num2){
        return num1+num2;
    }
    public static double restar (double num1, double num2){
        return num1-num2;
    }
    public static double multiplicar (double num1, double num2 ){
        return num1*num2;
    }
    public static double dividir (double num1 , double num2 ){
        if(num2==0){
            System. out.println("No se puede devidir por cero.!");
            return 0;
        }else {
            return num1/num2;
        }
        
    }
}
