package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(SumOdd.isOdd(-11));
        System.out.println(SumOdd.isOdd(11));
        System.out.println(SumOdd.sumOdd(1, 100));
        System.out.println(SumOdd.sumOdd(-1, 100));
        System.out.println(SumOdd.sumOdd(100, 100));
        System.out.println(SumOdd.sumOdd(13, 13));
        System.out.println(SumOdd.sumOdd(100, -100));
        System.out.println(SumOdd.sumOdd(100, 1000));
    }
}