public class Main {

    public static void main(String[] args) {
        int num = 123456;
        int answer = 0;

        while(num > 0)
        {
            int rem = num % 10;
            num/=10;
            answer = answer * 10 + rem;

        }
        System.out.println(answer);
    }
}