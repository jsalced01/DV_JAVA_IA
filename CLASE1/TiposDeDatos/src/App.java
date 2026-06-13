import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        int edad;
        float promedio;
        double salario;
        char sexo;
        //boolean estado;
        String nombres;

        Byte b = 127;
        
        //Lectura por consola
        edad = read.nextInt();

        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad:"));
        JOptionPane.showMessageDialog(null, edad);

        int respuesta = JOptionPane.showConfirmDialog(null, "¿Su estado es?", "Confirmación", JOptionPane.YES_NO_OPTION);
        
        // Convertir el resultado a boolean mediante una comparación
        boolean estado = (respuesta == JOptionPane.YES_OPTION);
        
        JOptionPane.showMessageDialog(null, estado);

    }
}