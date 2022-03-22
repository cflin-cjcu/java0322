import java.util.Scanner;

public class JPA106 {
    private static int m;

    public static void main(String[] args) {
        while(m!=999) {
            test();
        }
    }

    private static void test() {
        System.out.println("Input:");
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        int n = sc.nextInt();
        if (m!=999) {
            // m 的 n 次方
            int count=0;
            int ans = 1;
            while (count < n ) {
                ans *= m;
                count ++;
            }
            System.out.println(ans);
        }
    }
}
