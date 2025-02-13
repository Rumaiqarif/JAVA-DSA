import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
         Scanner input = new Scanner( System.in);
         System.out.print("Enter number : ");
         int number = input.nextInt();
         int sum = GetSum(number);
         System.out.println("sum "+ sum);
         input.close();


    }
    static int GetSum(int num){
        int result = 0;
        while (num != 0) {
            int temp = num % 10 ;
            result = result + temp;
            num = num/10;
            


        }
        return result;

    }
    
}
