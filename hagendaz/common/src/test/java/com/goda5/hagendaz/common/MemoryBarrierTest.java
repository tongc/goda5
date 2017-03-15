package com.goda5.hagendaz.common;

public class MemoryBarrierTest {
    static String test1 = "abc";
    String 测试 = "abcd";
    static volatile Integer test = 5;

    public static void main(String[] args) {
        test = 6;
    }
}
