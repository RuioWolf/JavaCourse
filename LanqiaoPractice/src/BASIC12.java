import java.util.Scanner;

public class BASIC12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=Integer.parseInt(sc.nextLine());
        String[] s = new String[i];
        for(int c=1;c<=i;++c) {
            s[c-1]=sc.nextLine();
        }
    }
}
