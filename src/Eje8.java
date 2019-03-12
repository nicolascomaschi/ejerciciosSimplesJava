public class Eje8 {
    public static void main(String[] args) {
        int inc = 0;
        for (int i=0;i<=100;i++){
            if (i%3 == 0){
                System.out.println(i);
                inc++;
            }
        }
        System.out.println(inc);
    }
}
