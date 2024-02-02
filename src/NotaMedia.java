import java.util.Scanner;

public class NotaMedia {
    public static void main(String[] args){
        int [] notas = new int [15]; // el array
        notas = leerNotas();
        System.out.println("La nota media es un " + calcularNotaMedia(notas));
    }
    private static int[] leerNotas(){
        int [] notas = new int [15];
        Scanner teclado = new Scanner(System.in);
        for (int contador = 0; contador < notas.length; ++contador){
            System.out.print("Introduzca una nota: ");
            notas[contador] = teclado.nextInt();
        }
        teclado.close();
        return notas;
    }
    private static double calcularNotaMedia(int[] notas){
        int suma = 0;
        for (int contador = 0; contador < notas.length; ++contador) {
            suma = suma + notas[contador];
        }
        float media = (float) suma/notas.length;
        return media;
    }
}