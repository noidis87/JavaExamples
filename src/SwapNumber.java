import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter other number: ");
        int num2 = sc.nextInt();

       num1 = num1 + num2;
       num2 = num1 - num2;
       num1 = num1 - num2;

       System.out.println("Number 1: "+ num1);
       System.out.println("Number 2: "+ num2);
    }
}
