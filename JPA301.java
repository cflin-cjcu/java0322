import java.util.Scanner;

/**
 * JPA301
 */
public class JPA301 {

    public static void main(String[] args) {
        System.out.println("Input:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        for (int i=1 ; i<=n ; i++ )  {
            sum += i;
        }
        System.out.printf("1 + ... + %d = %d\n", n, sum);
    }
}