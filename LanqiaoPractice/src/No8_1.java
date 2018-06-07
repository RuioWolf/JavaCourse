import java.math.BigInteger;

public class No8_1 {
    public static void main(String[] strings) {
        BigInteger i = new BigInteger("651764141421415346185");
        int res=i.mod(BigInteger.valueOf(9)).intValue();
        String xq="ABCDEFGHI";
        System.out.println(xq.substring(res-1,res));
    }
}


//        标题：外星日历
//
//        某星系深处发现了文明遗迹。
//
//        他们的计数也是用十进制。
//        他们的文明也有日历。日历只有天数，没有年、月的概念。
//        有趣的是，他们也使用了类似“星期”的概念，
//        只不过他们的一个星期包含了9天，
//        为了方便，这里分别记为: A,B,C....H,I
//
//        从一些资料上看到，
//        他们的23日是星期E
//        他们的190日是星期A
//        他们的343251日是星期I
//
//        令人兴奋的是，他们居然也预见了“世界末日”的那天，
//        当然是一个很大很大的数字
//        651764141421415346185
//
//        请你计算一下，这遥远的一天是该文明的星期几？
//
//        你需要提交的是一个大写字母，表示该文明的星期几，
//        不要填写任何多余的内容。