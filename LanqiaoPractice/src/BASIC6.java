import java.util.Scanner;

public class BASIC6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] res = new int[n][n];
        for(int a = 0; a < n; ++a) {
            res[a][0]=res[a][a]=1;
            for(int b = 1; b < a; ++b) {
                res[a][b] = res[a - 1][b - 1] + res[a - 1][b];
                
            }
        }
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j <= i; ++j) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
