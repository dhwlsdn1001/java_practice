import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(true) {
            sum += i;
            if(sum >= a) {
                break;
            }
            i += 2;
        }
        System.out.printf("%d %d", (i + 1) / 2, sum);
    }
}