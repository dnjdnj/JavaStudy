package com.dnj.study.frame;

/**
 * @ClassName loginService
 * @Description TODO
 * @Author dnj
 * @Date 2020/11/9
 **/
public class loginService {
    public boolean login(String account, String password){
        if("admin".equals(account) && "123456".equals(password)){
            return true;
        } else {
            return false;
        }
    }
}
