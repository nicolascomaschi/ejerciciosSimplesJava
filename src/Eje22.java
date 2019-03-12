import javax.swing.*;

public class Eje22 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2:"));
        int max = 0, min = 0;
        for(int i = 0;i < 3; i++) {
            if(num1 < num2){
                max = num2;
                min = num1;
            }
            else {
                min = num2;
                max = num1;
            }
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Numero:"));
        }
        System.out.println("Max: "+(max+1)+". Min: "+min);
    }
}
