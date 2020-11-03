package com.xiaojie.test;

import java.util.UUID;

/**
 * @Author XuLeJun
 * @Date 2020/7/2 19:43
 */

public class TestDemo {

    public static void main(String[] args) {
        String  id = UUID.randomUUID().toString().replace("-", "");
        System.out.println(id);
    }
}
