package Test02;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入身份证号码：");
        String s=scan.next();
        System.out.println("身份证长度为："+s.length());
        if(s.length()==16||s.length()==18) {
            boolean flag=true;
            for (int i = 0; i < s.length()-1; i++) {
                if(!(s.charAt(i)>='0'&&s.charAt(i)<='9')) {
                    System.out.println("内容不符合身份证号标准");
                    flag=false;
                }
            }
            if(flag) {
                String s1 = s.substring(6, 14);
                System.out.println("截取的生日应为：" + s1);
            }
        }
        else
            System.out.println("长度不符合身份证号标准");

    }
}
