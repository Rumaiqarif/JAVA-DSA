import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("HCF and LCM"); 
        System.out.print("Enter two numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        input.close();
        int Hcf = findHcf(num1, num2);
        int Lcm = findLcm(num1, num2,Hcf);
        System.out.println("Hcf : " + Hcf + "\n Lcm : "+Lcm);
        
    }

 //calculate Hcf 

    static int findHcf(int num1, int num2){
        while(num2 != 0){
        int temp = num2;
        num2 = num1 % num2;
        num1= temp ;
    }
    return num1;
}
//calculate Lcm
static int findLcm(int num1, int num2,int Hcf){
  
return (num1 * num2)/Hcf ;
}
    
}
