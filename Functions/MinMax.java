import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = input.nextInt();
        System.out.print("Enter numbers : ");
        int[] numbers = new int[n];
     
        //store values in  array
        for(int i = 0 ; i<n;i++)
        {
            numbers[i] = input.nextInt();

        }
        input.close();
        
        int maximum = GetMax(numbers ,n);
        System.out.println("maximim number  : " + maximum);
        int minimum = GetMin(numbers ,n);
        System.out.println("minimum  number : " + minimum);


       
    
    
}

//get maximum element of the array
static int GetMax(int[] numbers,int size ){
    int Max = 0;
   

    for(int i= 0; i < size ; i++)
    {
     if (numbers[i] > Max ) {
        Max = numbers[i];
     
    }
   
}
return Max;
   
}

//get minimum element of the array
static int GetMin(int[] numbers,int size ){
    int Min = numbers[0];

    for(int i= 0; i < size ; i++)
    {
    if(numbers[i] < Min  ) {
        Min = numbers[i];
     }
    
}
return Min;
   
}
}