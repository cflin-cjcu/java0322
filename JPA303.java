public class JPA303 {
    public static void main(String[] args) { 
        for(int a=1; a<=1000;a++) {
            int sum=0;
            for(int i=1; i<a;i++) {
                if(a%i==0) {
                    // System.out.println(i);
                    sum +=i;
                }
            }
            // System.out.println(sum);
            if(sum == a) {
                System.out.println(a);
            }            
        }

    }
}
