package com.bridgelabz.adapter;

public class Student {
    public static void main(String[] args) {
       PenAdapter pa=new PenAdapter();
        Assignment assignment=new Assignment();
        assignment.setP(pa);
        assignment.writeAssignment(" I worn out of writing Assignment ");
    }
}
