import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        input.close();
        if(isPrime(number)){
            System.out.println(number + " is  Prime");
        }else{
            System.out.println(number + " is not  Prime");
        }
  
    }


    static boolean isPrime(int num){
        boolean result   = true;
        for(int i = 2 ; i < num ; i++){
            if(num % i == 0 )
            {
                result =  false;
            }
            
        }
        return result;
    }
    
}
