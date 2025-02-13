import java.util.Scanner;

public class ArmStrong {

    public static void main(String[] args) {
          Scanner input = new Scanner( System.in);
          System.out.println("Enter Number :");
          int num = input.nextInt();
          
    
          if(isArmStrong(num)){
            System.out.println(num + "Arm strong number");
          }
          else{
            System.out.println(num + " is not an Arm strong number");
          }
          input.close();
     

        
    }
//check for ArmStrong Number
   public static boolean isArmStrong(int number){
        int originalNumber = number;
        int sum = 0;
        int digits = countDigits(number);

        while( number > 0){
            int lastDigit = number % 10 ;
            sum += Math.pow(lastDigit,digits);
            number /= 10;

        }
        return sum == originalNumber;

    }

// count number of Digits 
    public static int countDigits(int number){
       return String.valueOf(number).length();
    }

}