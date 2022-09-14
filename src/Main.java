import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a;
        a = sc.nextLine();
        String[] ap = a.split("\\s");
        for(int i = 0; i < ap.length; i++) {
            if(i * 2 < ap.length) {
                System.out.println(ap[i * 2]);
            }
        }
    }
}