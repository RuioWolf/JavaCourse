import javax.print.DocFlavor;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.util.ArrayList;


import java.util.Scanner;

public class No8_2 {
    public static void main(String[] strings) throws FileNotFoundException {
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        ArrayList<String> c = new ArrayList<>();
        
        File fa = new File("\\第8届蓝桥杯软件省赛真题Java语言C组\\2\\A.txt");
        File fb = new File("\\第8届蓝桥杯软件省赛真题Java语言C组\\2\\B.txt");
        File fc = new File("\\第8届蓝桥杯软件省赛真题Java语言C组\\2\\C.txt");
        
        Scanner sca = new Scanner(new FileInputStream(fa));
        sca.useDelimiter(",");
        String sa = null;
        while((sa = sca.next().trim()) != null && sa.length() != 0) {
            a.add(sa);
        }
        sca.close();
        
        Scanner scb = new Scanner(new FileInputStream(fb));
        scb.useDelimiter(",");
        String sb = null;
        while((sb = scb.next().trim()) != null && sb.length() != 0) {
            b.add(sb);
        }
        scb.close();
        
        Scanner scc = new Scanner(new FileInputStream(fc));
        scc.useDelimiter(",");
        String sc = null;
        while((sc = scc.next().trim()) != null && sc.length() != 0) {
            c.add(sc);
        }
        scc.close();
    
        ArrayList<String> ab = new ArrayList<>();
        ArrayList<String> ab_c = new ArrayList<>();
    
        for(String s:a
        
                ) {
            if(b.contains(s))
                ab.add(s);
        }
        
        for(String s:ab
        
                ) {
            if(!c.contains(s))
                ab_c.add(s);
        }
        System.out.print(ab_c.size());
    }
}


//标题：兴趣小组
//
//        为丰富同学们的业余文化生活，某高校学生会创办了3个兴趣小组
//        （以下称A组，B组，C组）。
//        每个小组的学生名单分别在【A.txt】,【B.txt】和【C.txt】中。
//        每个文件中存储的是学生的学号。
//
//        由于工作需要，我们现在想知道：
//        既参加了A组，又参加了B组，但是没有参加C组的同学一共有多少人？
//
//        请你统计该数字并通过浏览器提交答案。
//
//        注意：答案是一个整数，不要提交任何多余的内容。
//
//        --------------------
//
//        笨笨有话说：
//        哇塞！数字好多啊！一眼望过去就能发现相同的，好像没什么指望。
//        不过，可以排序啊，要是每个文件都是有序的，那就好多了。
//
//        歪歪有话说：
//        排什么序啊，这么几行数字对计算机不是太轻松了吗？
//        我看着需求怎么和中学学过的集合很像啊.....

