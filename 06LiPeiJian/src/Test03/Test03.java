package Test03;

import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<Book> list=new ArrayList<>();
        Book b1=new Book("Java基础入门","传智播客","清华大学出版社");
        Book b2=new Book("Java学习笔记","林信良","人民邮电出版社");
        Book b3=new Book("C语言入门经典","霍顿","清华大学出版社");
        list.add(b1);
        list.add(b2);
        list.add(b3);
        for (int i = 0; i < getPublisher(list).size(); i++) {
            getPublisher(list).get(i).show();
        }
    }
    public static ArrayList<Book>  getPublisher(ArrayList<Book> list){
        ArrayList<Book> list1=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getPublisher().equals("清华大学出版社"))
            list1.add(list.get(i));
        }
        return list1;
    }
}
