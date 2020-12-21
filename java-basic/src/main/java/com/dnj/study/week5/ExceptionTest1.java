package com.dnj.study.week5;

/**
 * @ClassName ExceptionTest1
 * @Description 异常时运行练习1
 * @Author dnj
 * @Date 2020/11/2
 **/
public class ExceptionTest1 {
    public static void main(String[] args) {
//        //1、ArithmeticException 算术异常
//        int result = 0;
//        try {
//            result = 3 / 0;
//        }catch (ArithmeticException e){
//         //   e.printStackTrace();
//           // JOptionPane.showMessageDialog(null,"除数不能为0！");
//            System.err.println("除数不能为0！" + new Date());
//            System.err.println(e.getMessage());
//        }
//
//        System.out.println(result);


//        // 2、ArrayIndexOutOfBoundException 数据索引越界异常
//        int[] a = new int[]{1,2,3,4,5};
//        try {
//            System.out.println(a[5]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.err.println("数组索引越界！");
//            System.err.println("引起的原因：" + e.getCause());
//            System.err.println("异常的详细信息：" + e.getMessage());
//            System.err.println("异常对象e：" + e.toString());
//        }


//        //3、 NumberFormatException 数字格式化异常
//        System.out.println("请输入价格：");
//        int price = 0;
//        Scanner scanner = new Scanner(System.in);
//        //从键盘读入一串字符串 "123"
//        String priceStr = scanner.nextLine();
//        //将字符串转化为整型  123
//        try {
//           price = Integer.parseInt(priceStr);
//        }catch (NumberFormatException e){
//            System.err.println("数字格式化出错！");
//            System.err.println("引起的原因：" + e.getCause());
//            System.err.println("异常的详细信息：" + e.getMessage());
//            System.err.println("异常对象e：" + e.toString());
//        }
//
//        System.out.println("price = " + price);


        //4、NPE NullPointException 空指针异常


    }
}
