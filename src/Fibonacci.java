import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int enterNum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        enterNum = sc.nextInt();

        int[] num = new int[enterNum];
        num[0] = 0;
        num[1] = 1;
        for (int i = 2; i < enterNum; i++) {
            num[i] = num[i - 1] + num[i - 2];
        }

        System.out.println("Fibonacci series: ");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
