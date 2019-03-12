public class Eje21 {
    public static void main(String[] args) {
        int sum = 0, inc = 0;
        for(int i=0; i<=100;i++) {
            if (i % 3 == 0 && i%2 == 0) {
                sum += i;
                inc++;
            }
        }
        System.out.println("Suma: "+sum+" Total: "+inc);
    }
}
