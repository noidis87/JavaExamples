import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        num = sc.nextInt();


        int result = 0;

        while (num !=0){
            int n = num % 10;
            result = result + n;
            num = num/10;
        }

        System.out.println(result);

    }
}
