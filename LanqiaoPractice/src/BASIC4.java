import java.util.Scanner;

public class BASIC4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String in = sc.nextLine();
        String[] ins = in.split(" ");
        int[] ini = new int[n];
        for(int i = 0; i < n; ++i) {
            ini[i] = Integer.parseInt(ins[i]);
        }
        int max = ini[0], min = ini[0], sum = 0;
        for(int i = 0; i < ini.length; ++i) {
            if(max < ini[i]) max = ini[i];
            if(min > ini[i]) min = ini[i];
            sum = sum + ini[i];
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }
}
