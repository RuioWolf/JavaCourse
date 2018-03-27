public class No7_1 {
    public static void main(String[] strings) {
        String r = "vxvxvxvxvxvxvvx";
        int c = 777;
        for(int i = 1; i <= 15; ++i) {
            if(r.substring(i-1, i).startsWith("v")) {
                c = c * 2;
            } else {
                c = c - 555;
            }
            if(c <= 0) {
                break;
            }
        }
        System.out.print(c);
    }
}
