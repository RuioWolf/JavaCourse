import java.util.Arrays;
import java.util.Scanner;

public class BASIC13 {
    public static void main(String[] strings) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int[] s = new int[n];
        for(int i=0;i<n;++i) {
            s[i]=sc.nextInt();
        }
        Arrays.sort(s);
        for(int i=0;i<n;++i) {
            System.out.print(s[i]+" ");
        }
    }
}
