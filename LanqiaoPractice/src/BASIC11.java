import java.util.Scanner;

public class BASIC11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            long i = Long.parseLong(s, 16);
            if(i > 0) {
                System.out.println(i);
            } else {
                System.out.println(-i);
        }
    }
}
