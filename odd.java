package whileloop;

public class odd {


    public static void main(String[] args) {
        int a = 1;
        for (a = 1; a <= 50; a++) {
            if (a % 2 == 1) {
                System.out.println(a);
            }
        }
    }
}
