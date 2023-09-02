package com.util;

public class checkAddition {
    
    public int Addition(int a, int b){

        return(a+b);
    }
    public static void main(String[] args) {
        
        checkAddition ca = new checkAddition();
        int sum=ca.Addition(11,22);
        System.out.println(sum);
    }
}
