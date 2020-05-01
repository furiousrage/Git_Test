package com.bridgelabz.adapter;

public class PenAdapter implements Pen{
    Pilotpen pp = new Pilotpen();
    @Override
    public void write(String str) {
        pp.mark(str);
    }
}
