public class JPA302 {
    public static void main(String[] args) {
        int count =0;
        for (int i=1; i<=3 ; i++ )  {
            for( int j=1 ; j<=9  ; j++) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
