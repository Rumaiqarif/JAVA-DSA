import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = input.nextInt();
        input.close();
        int answer = factorial(number); 
        System.out.println("Factorail of " + number + " is "+ answer);

    }

 // calcuatefactorail of a given number 
    static int factorial(int num){
        int fact = 1;
        for(int i = 1 ; i <= num ; i++){
            fact = fact * i;

        }
        return fact;
    }

    
}
