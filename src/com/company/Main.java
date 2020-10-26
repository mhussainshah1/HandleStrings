package com.company;

public class Main {
    public static void main(String[] args) {
        StringBuilder s;
        Main obj = new Main();
        obj.m1();
    }
    public void m1() {
        int x = 20;
        m2(10);
    }
    void m2(int b) {
        boolean c;
        m3();
    }
    void m3() {
        Account ref = new Account();
    }
}

class Account {
    int p = 0;
    int q = 0;
}