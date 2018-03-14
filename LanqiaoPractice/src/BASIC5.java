import java.util.Arrays;
import java.util.Scanner;

public class BASIC5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String in = sc.nextLine();
        int f = Integer.parseInt(sc.nextLine());
        String[] ins = in.split(" ");
        int[] ini = new int[n];
        for(int i = 0; i < n; ++i) {
            ini[i] = Integer.parseInt(ins[i]);
        }
//        int pos = Arrays.binarySearch(ini, f);
//        System.out.println(pos+1);
    }
}

