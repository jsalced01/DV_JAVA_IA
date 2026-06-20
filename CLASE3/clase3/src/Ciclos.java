import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Plato #" + i + " impreso en el recibo");
        }

        int mesasPorLimpiar = 3;
        while (mesasPorLimpiar > 0) {
            System.out.println("Faltan " + mesasPorLimpiar + " mesas");
            mesasPorLimpiar -= 1;
        }
        System.out.println("Todo limpio!");

        int opcion,contador=0;
        do{
            System.out.println("1. Continuar    2. Salir");
            System.out.println("Elige: ");
            opcion = read.nextInt();
            contador++;
        }while(opcion != 2);
        System.out.println("Usted ingresó "+contador+" veces");
    }
}
