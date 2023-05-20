public class Pro11 {
        public static void main(String[] args) {

            System.out.println("Even Digit Sum of (123456789): "+getEvenDigitSum(123456789));
            System.out.println("Even Digit Sum of (252): "+getEvenDigitSum(252));
            System.out.println("Even Digit Sum of (-22)): "+getEvenDigitSum(-22));

        }

        public static int getEvenDigitSum(int number){

            int lasDigit = 0;
            int evenDigitSum = 0;


            // loop to repeat the process
            while (number != 0){

                lasDigit = number % 10;   // find last digit

                // check last digit even?
                if(lasDigit % 2 == 0){
                    evenDigitSum = evenDigitSum + lasDigit;
                }

                // remove last digit of number
                number = number/10;
            }

            if(evenDigitSum < 0){
                return -1;
            }else {
                return evenDigitSum;
            }
        }
    }

