import java.util.Scanner;

public class EBill {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Meter Reading :" );
        double meterReading = input.nextDouble();
        calculateElectricityBill(meterReading);
        input.close();

    }

    //calculates electricity bill based on meter reading 
    static void calculateElectricityBill(Double Reading){
        double result = 1;
        if (Reading <= 30)
        {
            result = Reading * 1.30;

        }
        else if (Reading <= 200)
        {
            result = Reading * 2.25;

        }
        else if (Reading <= 400)
        {
            result = Reading * 3.90;

        }
        else if (Reading > 400)
        {
            result = Reading * 4.20;

        }
        System.out.println("Your electricity Bill is "+ result);
    }
    
}
