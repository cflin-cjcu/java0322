import java.util.Scanner;

public class JPA304 {
    public static void main(String[] args) {
        System.out.print("Please enter meal dollars or enter -1 to stop:");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int count =0, sum =0;
        while( money != -1  ) {
            count++;
            sum += money;
            System.out.print("Please enter meal dollars or enter -1 to stop:");
            money = sc.nextInt();
        }
        System.out.println("餐點總費用:"+sum);
        System.out.printf(" %d 道餐點的平均費用為: %.2f\n", count, (double)sum/count);
    }
}
