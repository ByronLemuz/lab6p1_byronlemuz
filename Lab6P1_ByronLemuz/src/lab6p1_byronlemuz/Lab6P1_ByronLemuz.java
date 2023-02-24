/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_byronlemuz;

import java.util.Scanner;

/**
 *
 * @author lesly
 */
public class Lab6P1_ByronLemuz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        
        while (opcion != 4) {
            System.out.println("Por favor, seleccione una opción:");
            System.out.println("1. +Arrglos");
            System.out.println("2. Vocales");
            System.out.println("3. Floor ad Ceilig");
            System.out.println("4. Salir");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    int[] notasEstudiante1;
        int[] notasEstudiante2;
        int cantidadClases1;
        int cantidadClases2;

        System.out.print("Ingrese cantidad de clases de estudiante 1: ");
        cantidadClases1 = leer.nextInt();
        notasEstudiante1 = new int[cantidadClases1];
        llenarNotas(notasEstudiante1);

        System.out.print("Ingrese cantidad de clases de estudiante 2: ");
        cantidadClases2 = leer.nextInt();
        notasEstudiante2 = new int[cantidadClases2];
        llenarNotas(notasEstudiante2);

        int sumaNotas1 = sumarNotas(notasEstudiante1);
        int sumaNotas2 = sumarNotas(notasEstudiante2);
        double promedio = calcularPromedio(sumaNotas1, sumaNotas2, cantidadClases1, cantidadClases2);

        System.out.println("Promedio de notas de ambos estudiantes: " + promedio);
            
             
                case 2:
                    System.out.print("Ingrese una cadena: ");
                    String palabra = leer.nextLine();
                    char[] arreglo = separarVocalesConsonantes(palabra);
                    System.out.print("Resultado: " );
                    imprimirArreglo(arreglo);
                 break;
                case 3:
                    System.out.print("Ingrese tamaño de arreglo: ");
        int n = leer.nextInt();

        int[] alturas = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese altura " + (i + 1) + ": ");
            alturas[i] = leer.nextInt();
        }

        int[] resultado = obtenerAlturas(alturas);

        System.out.println("Altura mínima: " + resultado[0]);
        System.out.println("Altura máxima: " + resultado[1]);
    
                    
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                    
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
        }
    }
    
    }
   public static void llenarNotas(int[] notas) {
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println("Notas estudiante: " + java.util.Arrays.toString(notas));
    }

    public static int sumarNotas(int[] notas) {
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma;
    }

    public static double calcularPromedio(int suma1, int suma2, int cantidadClases1, int cantidadClases2) {
        double promedio = (suma1 + suma2) / (double) (cantidadClases1 + cantidadClases2);
        return promedio;


    }
    public static char[] separarVocalesConsonantes(String palabra) {
    char[] arreglo = new char[palabra.length()];
    int indiceVocales = 0;
    int indiceConsonantes = arreglo.length - 1;
    for (int i = 0; i < palabra.length(); i++) {
        char letra = palabra.charAt(i);
        if (esVocal(letra)) {
            arreglo[indiceVocales] = letra;
            indiceVocales++;
        } else {
            arreglo[indiceConsonantes] = letra;
            indiceConsonantes--;
        }
    }
    return arreglo;
}

public static boolean esVocal(char letra) {
    letra = Character.toLowerCase(letra);
    return (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u');
}

public static void imprimirArreglo(char[] arreglo) {
    System.out.print("[");
    for (int i = 0; i < arreglo.length; i++) {
        System.out.print(arreglo[i]);
        if (i < arreglo.length - 1) {
            System.out.print("][");
        }
    }
    System.out.println("]");
}

public static int[] obtenerAlturas(int[] alturas) {
        int min = alturas[0];
        int max = alturas[0];

        for (int i = 1; i < alturas.length; i++) {
            if (alturas[i] < min) {
                min = alturas[i];
            }
            if (alturas[i] > max) {
                max = alturas[i];
            }
        }

        int[] resultado = {min, max};
        return resultado;
    }

}



