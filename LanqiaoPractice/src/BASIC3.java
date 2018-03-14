import java.util.Scanner;

public class BASIC3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String zm = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String out = zm;
        for(int h = 1; h <= n; ++h) {
            out = out.substring(0, m);
            if(h != 1)
                out = String.valueOf(zm.charAt(h - 1)) + out;
            System.out.println(out.substring(0, m));
        }
    }
}
