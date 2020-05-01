package com.bridgelabz.math;

public class MathUtility {
    public int add(int a,int b){
        return a+b;
    }
    public int area(int a,int b){
        return a*b;
    }
    public int wordCount(String message){
        int count=0;
        for (int i=0;i<message.length();i++){
            if(message.charAt(i)=='a'||message.charAt(i)=='A'){
                count++;
            }
        }
       return count;
    }
    public boolean primeNumberChecker(int number){
        for (int i = 2; i <number/2 ; i++) {
            if(number%i==0){
                return false;
            }


        }
        return true;
    }
}
