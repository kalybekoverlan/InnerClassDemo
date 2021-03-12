package com.erik;

public class Outer {
    private int outer_x=123;

    public void testinner(){
        Inner inner=new Inner();
        inner.show();
        inner.show_y();
    }

    class Inner{
        public int inner_x =100;
        public void show(){
            System.out.println("OUTRER X : "+outer_x);
        }
        public void show_y(){
            System.out.println("INNER X : "+ inner_x);
        }

    }
}
