import java.util.Scanner;

public class CheckAlp {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Alphabit : ");
        char alphabit = input.next().trim().charAt(0);
        alphabit = Character.toLowerCase(alphabit);
        input.close();
        
        if(Character.isLetter(alphabit)) {
            if(alphabit == 'a' || alphabit =='e' ||alphabit == 'i' || alphabit =='o' ||alphabit =='u'){
                System.out.println("vowel");
            }
            else{
                System.out.println("Consonant");
            }

        }
        else{
            System.out.println("invalid alphabit");
        }


    }
    
}
