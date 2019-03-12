public class Eje19 {
    public static void main(String[] args) {
        int sumPar = 0, sumImpar = 0;
        for(int i=1; i<=100;i++) {
            if (i % 2 == 0) {
                sumPar += i;
            }
            else {
                sumImpar += i;
            }
        }
        System.out.println("Suma par: "+sumPar+", suma impar: "+sumImpar);
    }
}
