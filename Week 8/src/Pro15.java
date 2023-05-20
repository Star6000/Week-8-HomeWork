public class Pro15 {
    public static void main(String[] args) {
        new Pro15().nestedLoop();
    }

    public void nestedLoop(){
        for(int i=1;i<=5;i++){
            for(int h=1;h<=i;h++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

