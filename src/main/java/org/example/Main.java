package org.example;

public class Main {
    public static void main(String[] args) {

        MyInterface anonObject = new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Main :) :)");
            }

            @Override
            public void sayGoodBye() {
                System.out.println("Good bye for now!");
            }
        };

        anonObject.sayHello();
        anonObject.sayGoodBye();
    }
}