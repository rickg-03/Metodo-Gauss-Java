public class MetodoGauss {

    // Metodo principal que ejecuta la eliminacion hacia adelante y sustitucion hacia atras
    public static double[] resolver(double[][] matriz){
        int n = matriz.length;

        //eliminación hacia adelante con pivoteo
        for(int i=0; i<n; i++) {
            int maxRow = i;
            for(int k = i + 1; k<n; k++) {
                if(Math.abs(matriz[k][i]) > Math.abs(matriz[maxRow][i])){
                    maxRow = k;
                }
            }

            //intercambiar filas
            double[] temp = matriz[i];
            matriz[i] = matriz[maxRow];
            matriz[maxRow] = temp;

            if(Math.abs(matriz[i][i])<1e-12){
                throw new ArithmeticException("El sistema no tiene solucion unica (matriz singular)");
            }

            // Hacer ceros debajo de la diagonal
            for(int k = i + 1; k < n; k++){
                double factor = matriz[k][i] / matriz[i][i];
                for (int j=i; j<=n; j++) {
                    matriz[k][j] -= factor * matriz[i][j];
                }
            }
        }

        double[] solucion = new double[n];
        for(int i=n - 1; i>=0; i--) {
            double suma = 0;
            for(int j = i + 1; j<n; j++){
                suma += matriz[i][j] * solucion[j];
            }
            solucion[i] = (matriz[i][n] - suma) / matriz[i][i];
        }

        return solucion;
    }
}