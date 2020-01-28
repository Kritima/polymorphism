package com.lambton;

public class polyexample {

    public static void main(String[] args) {

        Arithmetic Obj = new Arithmetic();
        System.out.println(Obj .add(10,10));
        System.out.println(Obj .add(10.5f, 20.5f));
        System.out.println(Obj.add("kri","tima"));
        System.out.println(Obj.add("Kritima",5));
        System.out.println(Obj.add(10,20,30));
        System.out.println(Obj.add(10,20,15.5f));
        System.out.println(Obj.add(10.5f,10));
        System.out.println(Obj.add(10.5f,5,5));
        System.out.println(Obj.add("gorsey",50,2.0f));
        System.out.println(Obj.add(10,20.00f));
        System.out.println(Obj.add(3,3.0f));


    }
}
