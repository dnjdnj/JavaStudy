package com.dnj.study.week4;

/**
 * @ClassName MarketEmployee
 * @Description 市场部员工类
 * @Author dnj
 * @Date 2020/10/26
 **/
public class MarketEmployee extends BaseEmployee {

    private String id;
    private static final String ADMIN = "admin";
    private static final int HIGH_SALARY = 3000;
    private static final int LOWER_SALARY = 1000;

    public MarketEmployee (String id){
        this.id = id;
    }
    public MarketEmployee(){
    }
    @Override
    public void print() {
        super.print();
        System.out.println("This is a MarketEmployee");
    }
    @Override
    public int getSalary() {
        if(ADMIN.equals(this.id)){
            return HIGH_SALARY;
        }else{
            return LOWER_SALARY;
        }
    }
}
