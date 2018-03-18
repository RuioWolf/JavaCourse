public class BASIC7 {
    public static void main(String[] args) {
        int[] sl=new int[9];
        for(int i=1;i<=9;++i) {
            sl[i-1]=i*i*i;
        }
        for(int j=1;j<=9;++j) {
            for(int k=0;k<=9;++k) {
                for(int l=0;l<=9;++l) {
                    int sum=(j*j*j)+(k*k*k)+(l*l*l);
                    if(sum>=100&&sum<1000&&Integer.parseInt(String.valueOf(j)+String.valueOf(k)+String.valueOf(l))==sum){
                        System.out.println(sum);
                    }
                }
            }
        }
    }
}
