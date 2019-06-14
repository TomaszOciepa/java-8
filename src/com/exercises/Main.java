package com.exercises;
//Zad 2 Zaimplementuj interfejs funkcyjny Runnable w dwóch wersjach –
//z wykorzystaniem Javy 8 i „po staremu”
public class Main {

    public static void main(String[] args) {

//        //1
        MyRunable r = new MyRunable();
        doSomething(r);

//        //2
        doSomething(new MyRunable());

        //3

        doSomething(new Runnable() {
            @Override
            public void run() {
                System.out.println(getClass().toString());
            }
        });

        //4
        doSomething(() -> System.out.println("test"));
    }

    public static void doSomething(Runnable r){
        r.run();
    }
}

class MyRunable implements Runnable{
    @Override
    public void run() {
        System.out.println(this.getClass().toString());
    }
}
