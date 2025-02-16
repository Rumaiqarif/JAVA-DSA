import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        
        //get the marks using input scanner
     Scanner input = new Scanner(System.in);
     System.out.println(" Enter your  Marks out of 100  ");
     System.out.print("Engilsh : ");
     int Engilsh = input.nextInt();
     System.out.print("science : ");
     int Science = input.nextInt();
     System.out.print("Math : ");
     int Math = input.nextInt();
     System.out.print("Social Science  : ");
     int SocialScience = input.nextInt();
     System.out.print("Urdu  : ");
     int Urdu = input.nextInt();
     input.close();


     // function call 
     String GEnglish  = GetGrades(Engilsh);
     String GScience  = GetGrades(Science);
     String GMath  = GetGrades(Math);
     String GSocailScience  = GetGrades(SocialScience);
     String GUrdu  = GetGrades(Urdu);
     

    //print grades 
    System.out.println("Subject  " + "Grades ");
    System.out.println("English " + GEnglish + "\t Science " + GScience + "\t Math " + GMath + "\t Social Science "+ GSocailScience + "\t Urdu  " + GUrdu);

  
    }


    //get grades 
    static String GetGrades(int Marks){ 
        String Grade = "";
        if(Marks > 90 && Marks <= 100){
            
           Grade = "AA";
        }
        else if (Marks > 80 && Marks <= 90){
            
            Grade = "AB";
         }
         else if (Marks > 70 && Marks <= 80){
            
            Grade = "BB";
         }
         else if (Marks > 60 && Marks <= 70){
            
            Grade = "BC";
         }
         else if (Marks > 50 && Marks <= 60){
            
            Grade = "CD";
         }
         else if (Marks > 40 && Marks <= 50){
            
            Grade = "DD";

         }
         else{
            Grade = "Fail";
         }
        return Grade;
    }
    
}
