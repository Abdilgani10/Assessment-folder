import java.util.Scanner;
 
public class maths {
 
    public static void main(String [] args) {
        int num1,num2,sum;
 
        Scanner input = new Scanner(System.in);
         
        System.out.print("Enter your first num: ");
        num1 = input.nextInt();
 
        System.out.print("Enter your Second number: ");
        num2 = input.nextInt();
         
        sum = num1 + num2;
        System.out.printf("The sum is %d\n", sum);
        
    }
}