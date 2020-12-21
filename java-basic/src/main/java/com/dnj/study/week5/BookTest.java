//package com.dnj.study.week5;
//
///**
// * @ClassName BookTest
// * @Description TODO
// * @Author dnj
// * @Date 2020/11/2
// **/
//public class BookTest {
//    public static void main(String[] args) {
//        Book book0 = new Book("1234567890123","JAVA教程",80);
//        Book book1 = new Book("123456789012a","JAVA基础教程",80);
//        Book book2 = new Book("1234567890123","JAVA暴力破解法",90);
//        Book book3 = new Book("1234567890123","JAVA高级应用",110);
//
//        BookService bk = new BookServiceImpl();
//        boolean result = false;
//        for(int i = 0; i<4 ; i++){
//            System.out.println("book["+i+"]" + str[i].getName());
//
//            try {
//                result = bk.checkBook(str[i]);
//            } catch (BookException e) {
//                System.err.println(e.showBook());
//                System.err.println("*************");
//            }finally {
//                System.out.println("检查结束");
//            }
//
//            System.out.println(result);
//
//            System.out.println("******************");
//        }
//
//
//    }
//}
