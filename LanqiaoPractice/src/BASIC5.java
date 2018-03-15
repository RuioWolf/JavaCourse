import java.util.Scanner;

public class BASIC5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String in = sc.nextLine();
        String f = sc.nextLine();
        /* n,in,f */
        String[] ins = in.split(" ");
        for(int i = 0; i < n; ++i) {
            if(f.equals(ins[i])) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}

