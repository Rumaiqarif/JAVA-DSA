import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("  Enter \n 1 for addition \n 2 for subtraction \n 3 for multiplication \n 4 for division   ");;
        int exp = input.nextInt();
        System.out.println("enter two numbers :");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        input.close();

        int result = 0;
        switch (exp) {
        case 1:
            result = number1 + number2;
            break;
        case 2:
            result = number1 - number2;
            break;    
        case 3:
            result = number1 * number2;
            break;
        case 4:
            result = number1 / number2;
            break;
            
        default:
            System.out.println("Enter valid Data ");
            break;
      }

     System.out.println("Answer : "+result);

    }
}
