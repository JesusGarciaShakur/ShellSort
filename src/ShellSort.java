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
        for (){

        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        Files archivo = new Files();
        String entrada;
        int[] datos;
        System.out.println("-----------Shell Sort-----------");
        System.out.println("Escriba el nombre del archivo de datos");
        entrada = bufer.readLine();

        // Solicitar archivos con datos
        datos = archivo.fileToIntArray(entrada);
        //
        System.out.println("Arreglo original");
        imprimirArreglo(datos);
        //
        datos = shellSort(datos);
        System.out.println("Arreglo ordenado");
        //
        imprimirArreglo(datos);

        archivo.writeArrayToFile("ordenado", datos);
    }
}
