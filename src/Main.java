import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        Print(num1);
    }

    static int Print(int a) {
        if(a <= 0) {
            return 0;
        } else {
            System.out.printf("%d ", a);
            a--;
            return Print(a);
        }
    }
}