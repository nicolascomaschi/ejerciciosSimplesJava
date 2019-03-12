import javax.swing.JOptionPane;

public class Eje7 {
    public static void main(String[] args) {
        int num = Integer.parseInt( JOptionPane.showInputDialog("Numero:"));
        int i = 0;
        while (i <= num){
            System.out.println(i);
            i++;
        }

    }
}
