import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1; i <= a; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = a; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}