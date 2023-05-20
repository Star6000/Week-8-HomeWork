import java.util.Scanner;

public class Pro6 {
        public static void main(String[] args) {
            new Pro6().patten();
        }

        public void patten(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any numeric number: ");
            int num = sc.nextInt();

            for(int i=1;i<=num;i++)           // outer loop
            {
                for(int h=1;h<=i;h++)          // Inner loop: execute until value of current situation number of i
                {
                    System.out.print(h
                    );
                }
                System.out.println();
            }
        }
    }

