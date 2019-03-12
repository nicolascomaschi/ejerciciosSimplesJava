import javax.swing.*;

public class Eje13 {
    public static void main(String[] args) {
        int num = Integer.parseInt( JOptionPane.showInputDialog("Numero:"));
        if (num < 500) {
            for (int i = 500; num < i; num++) {
                int sum = (i + (i + 8));
                System.out.println(sum+" "+num);
            }
        }
        else {
            System.out.println("Ingrese un numero menor a 500");
        }
    }
}
