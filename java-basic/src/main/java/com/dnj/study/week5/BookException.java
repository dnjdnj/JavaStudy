package com.dnj.study.week5;

/**
 * @ClassName BookException
 * @Description TODO
 * @Author dnj
 * @Date 2020/11/2
 **/
public class BookException  extends Exception{
    private String msg;
    private String isbn;
    private String name;
    private int price;


    public BookException(){
        super();
    }

    public BookException(String msg){
        super();
        this.msg = msg;
    }




    public String showBook(){
        return this.msg;
    }
}
