package com.dnj.study.week5;

import java.util.regex.Pattern;

/**
 * @ClassName BookServiceImpl
 * @Description TODO
 * @Author dnj
 * @Date 2020/11/2
 **/
public class BookServiceImpl implements BookService {

    @Override
    public boolean checkBook(Book book) throws BookException {
        Pattern pattern = Pattern.compile("[0-9]*");
        String Isbn = book.getISBN();
        String name = book.getName();
        boolean flag = false;
        if(Isbn.length() != 13 || !pattern.matcher(Isbn).matches()){
            throw  new BookException(name + "ISBN长度不为13或格式错误");
        }else if(book.getName().contains("暴力")||book.getName().contains("恐怖")){
            throw  new BookException(name + "书名含有不规范词语");
        }else if(book.getPrice() > 100){
            throw  new BookException(name + "价格超过100");
        }else{
            flag = true;
        }

        return flag;
    }
}
