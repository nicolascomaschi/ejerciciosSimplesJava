public class Eje10 {
    public static void main(String[] args) {
        int inc = 0;
        for (int i=0;i<=500;i++){
            if (i%5 == 0){
                System.out.println(i);
                inc++;
            }
        }
        System.out.println(inc);
    }
}
