package com.lanhuigu.jvm.loadclass;

/**
 * 非主动使用类字段演示
 *
 * @author yihonglei
 */
public class NotInitilizationThree {
    public static void main(String[] args) {
        System.out.println(ConstClass.HELLOWORD);
    }
}
