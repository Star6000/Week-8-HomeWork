package week8;

import java.util.Scanner;

public class
Pr1 {

        Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            Pr1 redingNumber = new Pr1();
            redingNumber.sumOfNumber();
        }

        public void sumOfNumber(){
            Scanner scanner = new Scanner(System.in);

            int count = 1;
            int sum = 0;

            while(count <= 10) {
                System.out.print("Enter number #" + count +" ");

                boolean validateNumber = scanner.hasNextInt();
                if(validateNumber) {
                    int number = scanner.nextInt();
                    sum = sum + number;
                    count++;
                } else {
                    System.out.println("Invalid number");
                }
                // Always return new userInput
                scanner.nextLine();
            }

            System.out.println("Sum of all numbers = " + sum);
            scanner.close();
        }
    }


