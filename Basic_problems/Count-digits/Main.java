import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = input.nextInt();
        System.out.println("Enter Digit :");
        int Digit = input.nextInt();
        input.close();
        int count = 0; 
        while(number > 0){
            int rem = number % 10;
            if(rem==Digit){
                count++;
            }
            number/=10;

        }
        System.out.println("The digit "+ Digit +" is @"+ count+" times in above number");
    }
}
