public class MetodoVectoresSuma {
    public static void main(String[] args) {
        int[] vector3 = { 4, 76, 51, 10, 6 };

        int x = 50, suma = 0;

        System.out.println();

        System.out.println("Sumatoria del vector mayor a "+x);

        for (int i = 0; i < vector3.length; i++) {

            if (vector3[i] > x) {

                suma = suma + vector3[i];

            }

        }

        System.out.print("La suma es:  " + suma);
    }
}
