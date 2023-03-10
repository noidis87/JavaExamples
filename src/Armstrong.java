import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        num = sc.nextInt();

        int actualNum = num;
        double result = 0;

        while (actualNum !=0){
            int n = actualNum % 10;
            result = result + Math.pow(n,3);
            actualNum = actualNum/10;
        }

        if (result == num)
            System.out.println(num + " Is an Armstrong number");
        else
            System.out.println(num + " Is not an Armstrong number");

    }
}
