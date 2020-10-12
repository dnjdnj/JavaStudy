package com.dnj.study.week2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName Book2
 * @Description TODO
 * @Author dnj
 * @Date 2020/10/12
 **/
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Book2 {
    private String name;
    private Integer price;
    private Date publishDate;

//    public Book2(String name, Integer price, Date publishDate) {
//        this.name = name;
//        this.price = price;
//        this.publishDate = publishDate;
//    }

    public String formatDate(Date date){
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
        return ft.format(date);
    }
    @Override
    public String toString() {
        return "《" + name + "》, 单价：" + price + "￥, 出版日期：" + formatDate(publishDate);
    }

    public static void main(String[] args) {
        Book2 book = new Book2("java",122,new Date());
        System.out.println(book);
    }
}
