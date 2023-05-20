package week8;

public class Pro13 {
    public static void main(String[] args) {
        System.out.println("1. Ouput of hasSharedDigit(12,23) :" +hasSharedDigit(12,23));
        System.out.println("2. Ouput of hasSharedDigit(9, 99) :" +hasSharedDigit(9, 99));
        System.out.println("3. Ouput of hasSharedDigit(15,55) :" +hasSharedDigit(15,55));
        System.out.println("4. Ouput of hasSharedDigit(16,23) :" +hasSharedDigit(16,23));
    }

    public static boolean hasSharedDigit(int firstNum, int secondNum){
        if((firstNum >= 10 && firstNum <=99) && (secondNum >= 10 && secondNum <= 99)){

            // getting the last number using (num % 10)
            int num1 = firstNum % 10;  // 12 : 2
            int num2 = secondNum % 10; // 23 : 3

            // getting the first number using (num / 10)
            int num3 = firstNum / 10;  // 12 : 1
            int num4 = secondNum / 10; // 23 : 2


            return( (num3 == num4) || (num3 == num2) ||
                    (num1 == num4) || (num1 == num2)  );

        }else {
            return false;
        }

    }
}

