package encapsulation26;

public class Testencapsulation {
        public static void main(String[] args) {
            Encapsulate obj = new Encapsulate();
            obj.setName("Mahesh");
            obj.setAge(27);
            obj.setRollNo(07);

            System.out.println("CodeBusters Nam:        "+obj.getName());
            System.out.println("CodeBusters Age:        "+obj.getAge());
            System.out.println("CodeBusters Roll no:    "+obj.getRollNo());
        }
    }

