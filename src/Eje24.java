import javax.swing.*;

public class Eje24 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Numero:"));
        while (num != 0){
            if (num < 10){
                System.out.println("El numero "+num+" es menor a 10");
            } else if(num > 10) {
                System.out.println("El numero "+num+" es mayor a 10");
            } else {
                System.out.println("El numero es igual a 10");
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Numero:"));
        }
    }
}
