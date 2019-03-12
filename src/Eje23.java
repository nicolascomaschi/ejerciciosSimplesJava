import javax.swing.*;

public class Eje23 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2:"));
        int cont = 0, par = 0, impar = 0;
        if (num1 < num2) {
            for (int i = 1; i < (num2-1) ; i++){
                System.out.println(num1 + i);
                cont = i;
                if ((num1 + i)%2 == 0){
                    par++;
                }
                else {
                    impar += i;
                }
            }
            System.out.println("Cantidad de numeros: "+cont);
            System.out.println("Cantidad de pares: "+par);
            System.out.println("Suma de impares: "+impar);
        }
    }
}
