package com.sandi.javaDS.list;

import org.junit.Test;

public class BinaryToDecimalLinkedList {

    @Test
    public void shouldCalculateDecimal(){

        Number number = new Number(1, null);
        Number number1 = new Number(1, number);
        Number number2 = new Number(0, number1);
        Number number3 = new Number(1, number2); // 1 -> 0 -> 0 -> 1 -> null

        int result = 0;

        Number head = number3;

        while(head != null){
            result = (result << 1) + (head.number);
            head = head.next;
        }

        System.out.println(result);

    }

}

class Number {

    int number;
    Number next;

    public Number(int number, Number next) {
        this.number = number;
        this.next = next;
    }
}