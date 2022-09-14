import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a[] = {"a", "b", "c", "d", "e"};
        for(int i = 0 ; i < 5; i++) {
            a[i] = sc.nextLine();
        }
        for(int i = 4; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}