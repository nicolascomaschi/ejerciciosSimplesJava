import javax.swing.*;

public class Eje17 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Numero:"));
        if (num % 2 == 0) {
            System.out.println("Es Par");
        } else {
            System.out.println("Es Impar");
        }
    }
}