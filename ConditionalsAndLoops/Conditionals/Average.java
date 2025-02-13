import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = input.nextInt();
        System.out.print("Enter numbers : ");
        int[] numbers = new int[n];
        int sum = 0;

        //store values in  and calculte average
        for(int i = 0 ; i<n;i++)
        {
            numbers[i] = input.nextInt();
            sum = sum + numbers[i];

        }

        System.out.println("Average : " + sum/n);
        input.close();
        

        
    
    
}
   
}