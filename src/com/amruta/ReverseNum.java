package com.amruta;

public class ReverseNum {
    public static void main(String[] args) {
        int num = 4536972;
        int ans = 0;
        while(num > 0){
            int rem = num % 10;
            num /= 10;
            ans = ans * 10 + rem;


        }
        System.out.println(ans);
    }
}
