package org.example;

public class Main {
    public static void main(String[] args) {
        // Создание животный
        Dog dogBobik = new Dog("Бобик");
        Cat catAlis = new Cat("Алиса");
        Cat catSimon = new Cat("Симон");
        Dog dogJack = new Dog("Джэк");
        Dog dogBenia = new Dog("Беня"); // просто для проверки подсчета


        // Миска с едой
        Feed feed = new Feed(20);

        // Коты кушают
        catAlis.eat(10, feed);   // Алиса ест
        catSimon.eat(20, feed);    // Симон ест
        catAlis.eat(5, feed);    // Алиса есть еще

        // Проверка сытости
        System.out.println(catAlis.getName() + " наелся: " + catAlis.isFull());
        System.out.println(catSimon.getName() + " наелся: " + catSimon.isFull());

        // Бег и плавание
        dogBobik.run(478);    // Бобик бежит
        dogJack.swim(7);      // Джэк плавает
        dogJack.run(1000);   //Джэк бежит
        catAlis.run(199);   // Алиса бежит
        catAlis.swim(100);    // Алиса(коты не плавают)

        // Всего животных
        System.out.println("Всего животных: " + Animal.getAnimalCount());
    }
}