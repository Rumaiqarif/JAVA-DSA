import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :");
        int number = input.nextInt();
        if(CheckEvenOdd(number)){
            System.out.println(number+" is Even number ");
        }else{
            System.out.println(number +" is Odd number");
        }
        input.close();
   
    }

    //check wheather wheather the number is even or odd
    static boolean CheckEvenOdd(int num){
        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }


    }
    
}
