
import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your DOB (DD MM YYYY) : ");
        int day = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();
        System.out.print("Enter Current date  (DD MM YYYY): ");
        int Cday = input.nextInt();
        int Cmonth = input.nextInt();
        int Cyear = input.nextInt();
        input.close();

        double answer = CalculateAge(day,month,year, Cday,Cmonth,Cyear);


        //print age in (years months days)
          if(answer / 365.0 > 18 ){
            System.out.println("You are Eligible to  vote ");
          }else {
            System.out.println("Not Eligible to vote ");
          }
          

    
    }
      //calculate age in days 
     static double CalculateAge(int day, int month , int year,int cday, int cmonth , int cyear){
        int leap = 0;
        for (int i = year ; i <= cyear; i++){
            if ( i % 4 == 0){
                leap++;
            }
          
        } 

       double AgeDays = ((cyear - year) * 365 + leap)
                   - (((month - 1) * 30.5) + (day - 1)) 
                    + ((cmonth) * 30.5 - cday);
     
      return AgeDays ;


     }



    
}
