public class Clase1PrimerProyecto {
    public static void main(String[] args) {
        System.out.println("While");
        int variableInicio=1,variableFin=10;
        boolean imprimirPares=false;
        while (variableInicio <= variableFin ) {
            if(imprimirPares==true){
            if(variableInicio %2==0){System.out.print(variableInicio+"-"); }
            }else{
                if(variableInicio %2 !=0){
                    System.out.print(variableInicio+"-");}
            }
            variableInicio+=2;   
            
        }
        System.out.println("");

        int varInicio=1;int varFin=10;
        System.out.println("For");
        for(int i =varFin;i>=varInicio;i--){
            
            if(i%2==0){
                System.out.print(i+"-");
            }
        }
        

    }
}
