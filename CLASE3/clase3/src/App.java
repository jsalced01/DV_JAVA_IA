import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Cuantas personas en la mesa?");
        int personas = read.nextInt();
        read.nextLine();
        System.out.println("Nombre del cliente?");
        String name = read.nextLine();
        System.out.println("Nombre del cliente "+name+" mesa de "+personas+" personas");

        //! 
        double subtotal = 20000;
        boolean tieneCupon = true;
        boolean aplicaDescuento = subtotal > 100000 && tieneCupon;
        System.out.println("Aplica descuento? " + aplicaDescuento);
        System.out.println(subtotal > 100000 && tieneCupon?true:false);

        int unidades = 5;
        double comoDecimal = unidades;
        System.out.println("Implicita: " + comoDecimal);   
        double precio = 19990.75;
        int precioRecortado = (int) precio;
        System.out.println("Casting: " + precioRecortado);
    }
}
