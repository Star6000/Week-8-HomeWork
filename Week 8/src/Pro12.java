import java.util.Scanner;

public class Pro12 {
        public static void main(String[] args) {
            System.out.println("Enter Any number and Check is prime or not: ");
            Scanner sc  = new Scanner(System.in);
            int number = sc.nextInt();

            if(isPrime(number)){
                System.out.println(number +" is a prime number");
            }else {
                System.out.println(number +" is not a prime number");
            }
        }

        public static boolean isPrime(int number){
            if(number <= 1){
                return false;
            }

            for(int i=2;i<Math.sqrt(number);i++){
                if(number%2==0){
                    return false;
                }
            }
            return true;
        }
    }

