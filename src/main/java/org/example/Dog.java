package org.example;

public class Dog extends Animal {
    private static final int RUN_LIMIT = 500; // Максимум бега
    private static final int SWIM_LIMIT = 10;  // Максимум плавания

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance <= RUN_LIMIT) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не смог пробежать, устал " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= SWIM_LIMIT) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
    }
}
