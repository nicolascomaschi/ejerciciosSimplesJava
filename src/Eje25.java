import javax.swing.*;

public class Eje25 {
    public static void main(String[] args) {
        int num;
        for (int i = 0; i < 100; i++){
            if(i%2 != 0) {
                num = Integer.parseInt(JOptionPane.showInputDialog("Numero:"));
            }
        }
    }
}
