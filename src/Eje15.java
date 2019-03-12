import javax.swing.*;

public class Eje15 {
    public static void main(String[] args) {
        int num = Integer.parseInt( JOptionPane.showInputDialog("Numero:"));
        if (num < 100) {
            for (int i = 100; num < i; num++) {
                int sum = ((i*i) + ((i + 4)*(1+4)));
                System.out.println(sum+" "+num);
            }
        }
        else {
            System.out.println("Ingrese un numero menor a 100");
        }
    }
}
