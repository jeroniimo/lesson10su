package org.example;

public class Cat extends Animal {
    private static final int RUN_LIMIT = 200; // Максимальная дистанция для бега
    private static final int SWIM_LIMIT = 0;   // Коты не умеют плавать
    private boolean isFull; // Состояние сытости

    public Cat(String name) {
        super(name);
        isFull = false; //Стоковый голод
    }

    @Override
    public void run(int distance) {
        if (distance <= RUN_LIMIT) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать, слишком далеко " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать, лапки");
    }

    public void eat(int amount, Feed feed) {
        if (feed.getFoodAmount() >= amount) {
            feed.decreaseFood(amount);
            isFull = true; // сыт
            System.out.println(name + " покушал " + amount + " пачек корма.");
        } else {
            System.out.println(name + " мало еды в миске.");
        }
    }

    public boolean isFull() {
        return isFull; // Проверки сытости
    }
}
