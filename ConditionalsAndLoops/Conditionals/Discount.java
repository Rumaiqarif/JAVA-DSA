import java.util.Scanner;

public class Discount {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter Selling : ");
        double Sprice = input.nextDouble();
        System.out.print(" Enter list price   : ");
        double  Lprice = input.nextDouble();
        double answer = CalDiscount(Sprice, Lprice);
        System.out.println("Discount : "+ answer+"%");
        input.close();

    }
    static double CalDiscount(double priceS , double priceL){
      double result = (priceS/priceL)*100;
      double Discount = 100 - result;

        return Discount;
    }
    
}
