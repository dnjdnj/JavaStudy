package com.dnj.study.week5;

/**
 * @ClassName BookService
 * @Description TODO
 * @Author dnj
 * @Date 2020/11/2
 **/
public interface BookService {
    /**
     * 图书服务接口
     * @param book
     * @return
     * @throws BookException
     */
    boolean checkBook(Book book) throws BookException;
}
