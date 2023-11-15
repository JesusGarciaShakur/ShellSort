import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import files.Files;

public class ShellSort {

    public static void imprimirArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.println(elemento);
        }
    }

    public static int[] shellSort(int[] arreglo) {
        int n = arreglo.length;
        int salto = n / 2;
        while (salto > 0) {
            for (int i = salto; i < n; i++) {
                int saltoactual = arreglo[i];
                int j = i;

                while (j >= salto && arreglo[j - salto] > saltoactual) {
                    arreglo[j] = arreglo[j - salto];
                    j -= salto;
                }
                arreglo[j] = saltoactual;
            }
            salto /= 2;
        }
        return arreglo;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        Files archivo = new Files();
        String entrada;
        int[] datos;

        System.out.println("-----------Shell Sort-----------");
        System.out.println("Escriba el nombre del archivo de datos");
        entrada = buffer.readLine();

        datos = archivo.fileToIntArray(entrada);

        if (datos != null) {
            System.out.println("Arreglo original");
            imprimirArreglo(datos);

            datos = shellSort(datos);
            System.out.println("Arreglo ordenado");
            imprimirArreglo(datos);

            archivo.writeArrayToFile("ordenadoshell", datos);
        } else {
            System.out.println("Los valores en el archivo son incorrectos");
        }
    }
}
