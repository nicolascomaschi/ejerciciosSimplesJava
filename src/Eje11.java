import javax.swing.JOptionPane;

public class Eje11 {
    public static void main(String[] args) {
        int num = Integer.parseInt( JOptionPane.showInputDialog("Numero:"));
        int inc = 0, sum = 0;
        for (int i = 0; i <= num; i++){
            if (i%2 == 0){
                System.out.println(i);
                inc++;
                sum += i;
            }
        }
        System.out.println("Suma: "+sum+", Total: "+inc);

    }
}
