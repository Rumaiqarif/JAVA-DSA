import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers  : ");
        int number1  = input.nextInt();
        int number2  = input.nextInt();
        int number3  = input.nextInt();
        input.close();
        if(number1 > number2)
        {
            if(number1 > number3)
            {
                System.out.println(number1 +" is larger number");

            }
            else
            {
                System.out.println(number3 +" is larger number");
            }
        }else
        {
               if(number2 > number3 )
               {
               System.out.println(number2 +" is larger number");
               }else
                   {
                    System.out.println(number3 +" is larger number");

                   }
        }
        
    }
    
}
