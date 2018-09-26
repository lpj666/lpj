package Test01;

import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
      String[] arr={"17","12","13","12","18","14","13","17"};
        Random ran=new Random();
        int num=ran.nextInt(10)+10;
        if(getIndex(arr,num)!=-1)
            System.out.println("随机生成的数为:"+num+"，在数组中最后出现的位置为："+getIndex(arr,num));
        else
            System.out.println("随机生成的数为:"+num+"，在数组中不存在");
    }
    public static int getIndex(String[] arr,int num){
        String n=num+"";
        for (int i = 0; i < arr.length; i++) {
           if(arr[i].equals(n))
               return i;
        }
        return -1;
    }
}
