package com.dnj.study.week4;

/**
 * @ClassName BaseEmployee
 * @Description 基础的员工抽象类
 * @Author dnj
 * @Date 2020/10/26
 **/
public abstract class BaseEmployee {
    public void print(){
        System.out.println("This is an abstract class.");
    }

    /**
     *  发工资
     *
     * @return int
     */
    public abstract int getSalary();
}
