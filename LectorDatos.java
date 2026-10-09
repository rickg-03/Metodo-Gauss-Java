import java.util.Scanner;

public class LectorDatos{
    private static final Scanner scanner = new Scanner(System.in);

    // M=etodo para leer la matriz aumentada [A|b] ingresada por el usuario
    public static double[][] leerMatrizAumentada(){
        System.out.print("Ingrese el numero de variables(ecuaciones): ");
        int n = scanner.nextInt();

        double[][] matriz = new double[n][n + 1];

        System.out.println("\nIngrese los coeficientes de la matriz aumentada [A|b]:");
        for (int i=0; i<n; i++){
            System.out.println("Ecuacion " + (i + 1) + ":");
            for(int j=0; j<=n; j++){
                if (j < n) {
                    System.out.print("Coeficiente de x_" + (j + 1) + ": ");
                } else {
                    System.out.print("Termino independiente (b_" + (i + 1) + "): ");
                }
                matriz[i][j]=scanner.nextDouble();
            }
        }
        return matriz;
    }

    //metodo para imprimir la matriz de manera ordenada en consola
    public static void imprimirMatriz(double[][] matriz){
        int n = matriz.length;
        for(int i=0; i<n; i++){
            System.out.print("[ ");
            for (int j=0; j<=n; j++){
                System.out.printf("%8.2f ", matriz[i][j]);
                if (j == n - 1) System.out.print("| ");
            }
            System.out.println("]");
        }
    }
}