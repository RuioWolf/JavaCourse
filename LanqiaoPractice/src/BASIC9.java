import java.util.Scanner;

public class BASIC9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j = 1; j <= 9; ++j) {
            for(int k = 0; k <= 9; ++k) {
                for(int l = 0; l <= 9; ++l) {
                    if(n == (2 * j) + (2 * k) + l) {
                        System.out.println(String.valueOf(j) + String.valueOf(k) + String.valueOf(l) + String.valueOf(k) + String.valueOf(j));
                    }
                }
            }
        }
        for(int j = 1; j <= 9; ++j) {
            for(int k = 0; k <= 9; ++k) {
                for(int l = 0; l <= 9; ++l) {
                    if(n == (2 * j) + (2 * k) + (2 * l)) {
                        System.out.println(String.valueOf(j) + String.valueOf(k) + String.valueOf(l) + String.valueOf(l) + String.valueOf(k) + String.valueOf(j));
                    }
                }
            }
        }
    }
}
