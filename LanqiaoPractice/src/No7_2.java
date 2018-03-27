public class No7_2 {
    public static void main(String[] strings) {
        int s=0;
        for(int i=1;i<=100;++i) {
            int t=0;
            for(int j=1;j<=i;++j) {
                t+=j;
            }
            s+=t;
        }
        System.out.print(s);
    }
}
