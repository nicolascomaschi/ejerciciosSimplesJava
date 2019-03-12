import javax.swing.*;

public class Eje16 {
    public static void main(String[] args) {
        int num = Integer.parseInt( JOptionPane.showInputDialog("Numero:"));
        if (num < 0){
            System.out.println("Es negativo");
        }
        else {
            System.out.println("Es positivo");
        }
    }
}
