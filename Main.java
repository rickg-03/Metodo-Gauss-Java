public class Main {
    public static void main(String[] neu) {
        System.out.println("==========================================");
        System.out.println("   MEtODO DE GAUSS - SISTEMA DE ECUACIONES");
        System.out.println("==========================================\n");

        try{
            double[][] matrizAumentada = LectorDatos.leerMatrizAumentada();

            System.out.println("\nMatriz aumentada ingresada:");
            LectorDatos.imprimirMatriz(matrizAumentada);

            double[] solucion = MetodoGauss.resolver(matrizAumentada);

            // Mostrar resultados
            System.out.println("\n==========================================");
            System.out.println("               RESULTADOS");
            System.out.println("==========================================");
            for(int i = 0; i < solucion.length; i++){
                System.out.printf("x_%d = %.4f\n", (i + 1), solucion[i]);
            }

        }catch(Exception e){
            System.out.println("\n[ERROR]: " + e.getMessage());
        }
    }
}