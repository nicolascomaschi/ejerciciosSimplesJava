import javax.swing.*;

public class Eje18 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Numero:"));
        int sum = 0, inc = 0;
        for(int i=0; i<=num;i++) {
            if (i % 3 == 0) {
                sum += i;
                inc++;
            }
        }
        System.out.println("Suma: "+sum+" Total: "+inc);
    }
}
