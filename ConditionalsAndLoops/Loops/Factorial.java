import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter  a number : ");
    int  number = input.nextInt();
    input.close();
    Fact(number);

 
}
//calculates  factorial of a given number 
 static void Fact(int num)
 {
    int result = 1 ;
    for(int i = 1 ; i<=num ; i++)
    {
    result *= i;

    }
System.out.println("factorial of " + num + " is " + result);

 }
}