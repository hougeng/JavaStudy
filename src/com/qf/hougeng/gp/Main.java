package com.qf.hougeng.gp;

/*
     一般用在方法上,或者类上面,或者接口上,关键地方一定要加注释
     切记:代码不是写给机器执行,而是给别人看的
 */
/**
 * @Classname Main
 * @Description TODO
 * @Date 2019/11/21 9:32
 * @Created by Hougeng
 */
public class Main {
    //单行注释

    /**
     * API的文档注释,一般用户生成用户API来使用,用/ ** 来作为开始,一般文档注释和块只是不能嵌套
     * @param args
     */
    public static void main(String[] args) {
//        获取int最大值
        System.out.println( "Integer.MAX_VALUE = " + Integer.MAX_VALUE );


        int count=100_0000;

        short sum=100;
        //不能把范围大的值赋值给范围小的值
//        byte sum1=sum;
        byte sum1=10;

        //把范围小的值可以转为范围大的值,叫隐式转化
        sum=sum1;

        //把范围大的转化成范围小的,叫强转,一般不推荐使用,有可能会丢失精度或数据
        byte sum3=(byte)sum;
    }
}
